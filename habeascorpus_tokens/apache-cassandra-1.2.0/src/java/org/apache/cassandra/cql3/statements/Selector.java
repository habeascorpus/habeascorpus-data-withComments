/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Selector	TokenNameIdentifier	 Selector
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Function	TokenNameIdentifier	 Function
{	TokenNameLBRACE	
WRITE_TIME	TokenNameIdentifier	 WRITE  TIME
,	TokenNameCOMMA	
TTL	TokenNameIdentifier	 TTL
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WRITE_TIME	TokenNameIdentifier	 WRITE  TIME
:	TokenNameCOLON	
return	TokenNamereturn	
"writetime"	TokenNameStringLiteral	writetime
;	TokenNameSEMICOLON	
case	TokenNamecase	
TTL	TokenNameIdentifier	 TTL
:	TokenNameCOLON	
return	TokenNamereturn	
"ttl"	TokenNameStringLiteral	ttl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFunction	TokenNameIdentifier	 has Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasKey	TokenNameIdentifier	 has Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WithFunction	TokenNameIdentifier	 With Function
extends	TokenNameextends	
Selector	TokenNameIdentifier	 Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WithFunction	TokenNameIdentifier	 With Function
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFunction	TokenNameIdentifier	 has Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
WithFunction	TokenNameIdentifier	 With Function
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Selector	TokenNameIdentifier	 Selector
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WithFunction	TokenNameIdentifier	 With Function
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
function	TokenNameIdentifier	 function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
function	TokenNameIdentifier	 function
(	TokenNameLPAREN	
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
function	TokenNameIdentifier	 function
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WithKey	TokenNameIdentifier	 With Key
extends	TokenNameextends	
Selector	TokenNameIdentifier	 Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WithKey	TokenNameIdentifier	 With Key
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasKey	TokenNameIdentifier	 has Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
WithKey	TokenNameIdentifier	 With Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
WithKey	TokenNameIdentifier	 With Key
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WithKey	TokenNameIdentifier	 With Key
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
key	TokenNameIdentifier	 key
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
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

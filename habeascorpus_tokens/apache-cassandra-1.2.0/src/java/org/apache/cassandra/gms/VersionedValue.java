/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterables	TokenNameIdentifier	 Iterables
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
ISO_8859_1	TokenNameIdentifier	 ISO 8859 1
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
IPartitioner	TokenNameIdentifier	 I Partitioner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * This abstraction represents the state associated with a particular node which an * application wants to make available to the rest of the nodes in the cluster. * Whenever a piece of state needs to be disseminated to the rest of cluster wrap * the state in an instance of <i>ApplicationState</i> and add it to the Gossiper. * * e.g. if we want to disseminate load information for node A do the following: * * ApplicationState loadState = new ApplicationState(<string representation of load>); * Gossiper.instance.addApplicationState("LOAD STATE", loadState); */	TokenNameCOMMENT_JAVADOC	 This abstraction represents the state associated with a particular node which an application wants to make available to the rest of the nodes in the cluster. Whenever a piece of state needs to be disseminated to the rest of cluster wrap the state in an instance of <i>ApplicationState</i> and add it to the Gossiper. * e.g. if we want to disseminate load information for node A do the following: * ApplicationState loadState = new ApplicationState(<string representation of load>); Gossiper.instance.addApplicationState("LOAD STATE", loadState); 
public	TokenNamepublic	
class	TokenNameclass	
VersionedValue	TokenNameIdentifier	 Versioned Value
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
VersionedValueSerializer	TokenNameIdentifier	 Versioned Value Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this must be a char that cannot be present in any token 	TokenNameCOMMENT_LINE	this must be a char that cannot be present in any token 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
DELIMITER	TokenNameIdentifier	 DELIMITER
=	TokenNameEQUAL	
','	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DELIMITER_STR	TokenNameIdentifier	 DELIMITER  STR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DELIMITER	TokenNameIdentifier	 DELIMITER
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// values for ApplicationState.STATUS 	TokenNameCOMMENT_LINE	values for ApplicationState.STATUS 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_BOOTSTRAPPING	TokenNameIdentifier	 STATUS  BOOTSTRAPPING
=	TokenNameEQUAL	
"BOOT"	TokenNameStringLiteral	BOOT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_NORMAL	TokenNameIdentifier	 STATUS  NORMAL
=	TokenNameEQUAL	
"NORMAL"	TokenNameStringLiteral	NORMAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_LEAVING	TokenNameIdentifier	 STATUS  LEAVING
=	TokenNameEQUAL	
"LEAVING"	TokenNameStringLiteral	LEAVING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_LEFT	TokenNameIdentifier	 STATUS  LEFT
=	TokenNameEQUAL	
"LEFT"	TokenNameStringLiteral	LEFT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_MOVING	TokenNameIdentifier	 STATUS  MOVING
=	TokenNameEQUAL	
"MOVING"	TokenNameStringLiteral	MOVING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
STATUS_RELOCATING	TokenNameIdentifier	 STATUS  RELOCATING
=	TokenNameEQUAL	
"RELOCATING"	TokenNameStringLiteral	RELOCATING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
REMOVING_TOKEN	TokenNameIdentifier	 REMOVING  TOKEN
=	TokenNameEQUAL	
"removing"	TokenNameStringLiteral	removing
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
REMOVED_TOKEN	TokenNameIdentifier	 REMOVED  TOKEN
=	TokenNameEQUAL	
"removed"	TokenNameStringLiteral	removed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
HIBERNATE	TokenNameIdentifier	 HIBERNATE
=	TokenNameEQUAL	
"hibernate"	TokenNameStringLiteral	hibernate
;	TokenNameSEMICOLON	
// values for ApplicationState.REMOVAL_COORDINATOR 	TokenNameCOMMENT_LINE	values for ApplicationState.REMOVAL_COORDINATOR 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
REMOVAL_COORDINATOR	TokenNameIdentifier	 REMOVAL  COORDINATOR
=	TokenNameEQUAL	
"REMOVER"	TokenNameStringLiteral	REMOVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
VersionGenerator	TokenNameIdentifier	 Version Generator
.	TokenNameDOT	
getNextVersion	TokenNameIdentifier	 get Next Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
version	TokenNameIdentifier	 version
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
"Value("	TokenNameStringLiteral	Value(
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
VersionedValueFactory	TokenNameIdentifier	 Versioned Value Factory
{	TokenNameLBRACE	
final	TokenNamefinal	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
VersionedValueFactory	TokenNameIdentifier	 Versioned Value Factory
(	TokenNameLPAREN	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
bootstrapping	TokenNameIdentifier	 bootstrapping
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_BOOTSTRAPPING	TokenNameIdentifier	 STATUS  BOOTSTRAPPING
,	TokenNameCOMMA	
makeTokenString	TokenNameIdentifier	 make Token String
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
normal	TokenNameIdentifier	 normal
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_NORMAL	TokenNameIdentifier	 STATUS  NORMAL
,	TokenNameCOMMA	
makeTokenString	TokenNameIdentifier	 make Token String
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
makeTokenString	TokenNameIdentifier	 make Token String
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Iterables	TokenNameIdentifier	 Iterables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
double	TokenNamedouble	
load	TokenNameIdentifier	 load
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
newVersion	TokenNameIdentifier	 new Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
newVersion	TokenNameIdentifier	 new Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
leaving	TokenNameIdentifier	 leaving
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_LEAVING	TokenNameIdentifier	 STATUS  LEAVING
,	TokenNameCOMMA	
makeTokenString	TokenNameIdentifier	 make Token String
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
left	TokenNameIdentifier	 left
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
long	TokenNamelong	
expireTime	TokenNameIdentifier	 expire Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_LEFT	TokenNameIdentifier	 STATUS  LEFT
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
expireTime	TokenNameIdentifier	 expire Time
)	TokenNameRPAREN	
,	TokenNameCOMMA	
makeTokenString	TokenNameIdentifier	 make Token String
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
moving	TokenNameIdentifier	 moving
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_MOVING	TokenNameIdentifier	 STATUS  MOVING
+	TokenNamePLUS	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
relocating	TokenNameIdentifier	 relocating
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
srcTokens	TokenNameIdentifier	 src Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
STATUS_RELOCATING	TokenNameIdentifier	 STATUS  RELOCATING
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
srcTokens	TokenNameIdentifier	 src Tokens
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
hostId	TokenNameIdentifier	 host Id
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
hostId	TokenNameIdentifier	 host Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
hostId	TokenNameIdentifier	 host Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bos	TokenNameIdentifier	 bos
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
dos	TokenNameIdentifier	 dos
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
TokenSerializer	TokenNameIdentifier	 Token Serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ISO_8859_1	TokenNameIdentifier	 ISO 8859 1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
removingNonlocal	TokenNameIdentifier	 removing Nonlocal
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
hostId	TokenNameIdentifier	 host Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
REMOVING_TOKEN	TokenNameIdentifier	 REMOVING  TOKEN
,	TokenNameCOMMA	
hostId	TokenNameIdentifier	 host Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
removedNonlocal	TokenNameIdentifier	 removed Nonlocal
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
hostId	TokenNameIdentifier	 host Id
,	TokenNameCOMMA	
long	TokenNamelong	
expireTime	TokenNameIdentifier	 expire Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
REMOVED_TOKEN	TokenNameIdentifier	 REMOVED  TOKEN
,	TokenNameCOMMA	
hostId	TokenNameIdentifier	 host Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
expireTime	TokenNameIdentifier	 expire Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
removalCoordinator	TokenNameIdentifier	 removal Coordinator
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
hostId	TokenNameIdentifier	 host Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
REMOVAL_COORDINATOR	TokenNameIdentifier	 REMOVAL  COORDINATOR
,	TokenNameCOMMA	
hostId	TokenNameIdentifier	 host Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
hibernate	TokenNameIdentifier	 hibernate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
HIBERNATE	TokenNameIdentifier	 HIBERNATE
+	TokenNamePLUS	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
datacenter	TokenNameIdentifier	 datacenter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dcId	TokenNameIdentifier	 dc Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
dcId	TokenNameIdentifier	 dc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
rack	TokenNameIdentifier	 rack
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rackId	TokenNameIdentifier	 rack Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
rackId	TokenNameIdentifier	 rack Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
rpcaddress	TokenNameIdentifier	 rpcaddress
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
releaseVersion	TokenNameIdentifier	 release Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getReleaseVersionString	TokenNameIdentifier	 get Release Version String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
networkVersion	TokenNameIdentifier	 network Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
internalIP	TokenNameIdentifier	 internal IP
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
private_ip	TokenNameIdentifier	 private ip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
private_ip	TokenNameIdentifier	 private ip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
severity	TokenNameIdentifier	 severity
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
VersionedValueSerializer	TokenNameIdentifier	 Versioned Value Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
outValue	TokenNameIdentifier	 out Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outValue	TokenNameIdentifier	 out Value
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
outValue	TokenNameIdentifier	 out Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pieces	TokenNameIdentifier	 pieces
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
DELIMITER_STR	TokenNameIdentifier	 DELIMITER  STR
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STATUS_NORMAL	TokenNameIdentifier	 STATUS  NORMAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STATUS_BOOTSTRAPPING	TokenNameIdentifier	 STATUS  BOOTSTRAPPING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
pieces	TokenNameIdentifier	 pieces
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
outValue	TokenNameIdentifier	 out Value
=	TokenNameEQUAL	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STATUS_LEFT	TokenNameIdentifier	 STATUS  LEFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
pieces	TokenNameIdentifier	 pieces
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// three component 'left' was adopted starting from Cassandra 1.0 	TokenNameCOMMENT_LINE	three component 'left' was adopted starting from Cassandra 1.0 
// previous versions have '<type>:<token>' format 	TokenNameCOMMENT_LINE	previous versions have '<type>:<token>' format 
outValue	TokenNameIdentifier	 out Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_10	TokenNameIdentifier	 VERSION 10
)	TokenNameRPAREN	
?	TokenNameQUESTION	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
versionString	TokenNameIdentifier	 version String
(	TokenNameLPAREN	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVAL_COORDINATOR	TokenNameIdentifier	 REMOVAL  COORDINATOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVING_TOKEN	TokenNameIdentifier	 REMOVING  TOKEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVED_TOKEN	TokenNameIdentifier	 REMOVED  TOKEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unable to serialize %s(%s...) for nodes older than 1.2"	TokenNameStringLiteral	Unable to serialize %s(%s...) for nodes older than 1.2
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
outValue	TokenNameIdentifier	 out Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valVersion	TokenNameIdentifier	 val Version
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
valVersion	TokenNameIdentifier	 val Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
outValue	TokenNameIdentifier	 out Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

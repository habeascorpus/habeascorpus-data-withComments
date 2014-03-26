/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
cvslib	TokenNameIdentifier	 cvslib
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
AbstractCvsTask	TokenNameIdentifier	 Abstract Cvs Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * this task allows to find out the client and the server version of a * CVS installation * * example usage : * &lt;cvsversion * cvsRoot=&quot;:pserver:anoncvs@cvs.apache.org:/home/cvspublic&quot; * passfile=&quot;c:/programme/cygwin/home/antoine/.cvspass&quot; * clientversionproperty=&quot;apacheclient&quot; * serverversionproperty=&quot;apacheserver&quot; /&gt; * * the task can be used also in the API by calling its execute method, * then calling getServerVersion and/or getClientVersion * * @ant.task category="scm" * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 this task allows to find out the client and the server version of a CVS installation * example usage : &lt;cvsversion cvsRoot=&quot;:pserver:anoncvs@cvs.apache.org:/home/cvspublic&quot; passfile=&quot;c:/programme/cygwin/home/antoine/.cvspass&quot; clientversionproperty=&quot;apacheclient&quot; serverversionproperty=&quot;apacheserver&quot; /&gt; * the task can be used also in the API by calling its execute method, then calling getServerVersion and/or getClientVersion * @ant.task category="scm" @since ant 1.6.1 
public	TokenNamepublic	
class	TokenNameclass	
CvsVersion	TokenNameIdentifier	 Cvs Version
extends	TokenNameextends	
AbstractCvsTask	TokenNameIdentifier	 Abstract Cvs Task
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
VERSION_1_11_2	TokenNameIdentifier	 VERSION 1 11 2
=	TokenNameEQUAL	
11102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
clientVersion	TokenNameIdentifier	 client Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
serverVersion	TokenNameIdentifier	 server Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
clientVersionProperty	TokenNameIdentifier	 client Version Property
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
serverVersionProperty	TokenNameIdentifier	 server Version Property
;	TokenNameSEMICOLON	
/** * Get the CVS client version * @return CVS client version */	TokenNameCOMMENT_JAVADOC	 Get the CVS client version @return CVS client version 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClientVersion	TokenNameIdentifier	 get Client Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientVersion	TokenNameIdentifier	 client Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the CVS server version * @return CVS server version */	TokenNameCOMMENT_JAVADOC	 Get the CVS server version @return CVS server version 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getServerVersion	TokenNameIdentifier	 get Server Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serverVersion	TokenNameIdentifier	 server Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a property where to store the CVS client version * @param clientVersionProperty property for CVS client version */	TokenNameCOMMENT_JAVADOC	 Set a property where to store the CVS client version @param clientVersionProperty property for CVS client version 
public	TokenNamepublic	
void	TokenNamevoid	
setClientVersionProperty	TokenNameIdentifier	 set Client Version Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clientVersionProperty	TokenNameIdentifier	 client Version Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clientVersionProperty	TokenNameIdentifier	 client Version Property
=	TokenNameEQUAL	
clientVersionProperty	TokenNameIdentifier	 client Version Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a property where to store the CVS server version * @param serverVersionProperty property for CVS server version */	TokenNameCOMMENT_JAVADOC	 Set a property where to store the CVS server version @param serverVersionProperty property for CVS server version 
public	TokenNamepublic	
void	TokenNamevoid	
setServerVersionProperty	TokenNameIdentifier	 set Server Version Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverVersionProperty	TokenNameIdentifier	 server Version Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
serverVersionProperty	TokenNameIdentifier	 server Version Property
=	TokenNameEQUAL	
serverVersionProperty	TokenNameIdentifier	 server Version Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out if the server version supports log with S option * @return boolean indicating if the server version supports log with S option */	TokenNameCOMMENT_JAVADOC	 Find out if the server version supports log with S option @return boolean indicating if the server version supports log with S option 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsCvsLogWithSOption	TokenNameIdentifier	 supports Cvs Log With S Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverVersion	TokenNameIdentifier	 server Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
serverVersion	TokenNameIdentifier	 server Version
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
*	TokenNameMULTIPLY	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
;	TokenNameSEMICOLON	
long	TokenNamelong	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
*	TokenNameMULTIPLY	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
counter	TokenNameIdentifier	 counter
/	TokenNameDIVIDE	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>=	TokenNameGREATER_EQUAL	
VERSION_1_11_2	TokenNameIdentifier	 VERSION 1 11 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the execute method running CvsVersion */	TokenNameCOMMENT_JAVADOC	 the execute method running CvsVersion 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
berr	TokenNameIdentifier	 berr
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setErrorStream	TokenNameIdentifier	 set Error Stream
(	TokenNameLPAREN	
berr	TokenNameIdentifier	 berr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
bos	TokenNameIdentifier	 bos
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Received version response ""	TokenNameStringLiteral	Received version response "
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cachedVersion	TokenNameIdentifier	 cached Version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
haveReadAhead	TokenNameIdentifier	 have Read Ahead
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
haveReadAhead	TokenNameIdentifier	 have Read Ahead
||	TokenNameOR_OR	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentToken	TokenNameIdentifier	 current Token
=	TokenNameEQUAL	
haveReadAhead	TokenNameIdentifier	 have Read Ahead
?	TokenNameQUESTION	
cachedVersion	TokenNameIdentifier	 cached Version
:	TokenNameCOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveReadAhead	TokenNameIdentifier	 have Read Ahead
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Client:"	TokenNameStringLiteral	Client:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Server:"	TokenNameStringLiteral	Server:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"(CVS"	TokenNameStringLiteral	(CVS
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
currentToken	TokenNameIdentifier	 current Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
client	TokenNameIdentifier	 client
&&	TokenNameAND_AND	
!	TokenNameNOT	
server	TokenNameIdentifier	 server
&&	TokenNameAND_AND	
cvs	TokenNameIdentifier	 cvs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cachedVersion	TokenNameIdentifier	 cached Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cachedVersion	TokenNameIdentifier	 cached Version
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveReadAhead	TokenNameIdentifier	 have Read Ahead
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
&&	TokenNameAND_AND	
cvs	TokenNameIdentifier	 cvs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientVersion	TokenNameIdentifier	 client Version
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
cvs	TokenNameIdentifier	 cvs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
&&	TokenNameAND_AND	
cvs	TokenNameIdentifier	 cvs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serverVersion	TokenNameIdentifier	 server Version
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
cvs	TokenNameIdentifier	 cvs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentToken	TokenNameIdentifier	 current Token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"(client/server)"	TokenNameStringLiteral	(client/server)
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cvs	TokenNameIdentifier	 cvs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cachedVersion	TokenNameIdentifier	 cached Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
client	TokenNameIdentifier	 client
&&	TokenNameAND_AND	
!	TokenNameNOT	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
{	TokenNameLBRACE	
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
clientVersion	TokenNameIdentifier	 client Version
=	TokenNameEQUAL	
serverVersion	TokenNameIdentifier	 server Version
=	TokenNameEQUAL	
cachedVersion	TokenNameIdentifier	 cached Version
+	TokenNamePLUS	
cvs	TokenNameIdentifier	 cvs
;	TokenNameSEMICOLON	
cachedVersion	TokenNameIdentifier	 cached Version
=	TokenNameEQUAL	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientVersionProperty	TokenNameIdentifier	 client Version Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
clientVersionProperty	TokenNameIdentifier	 client Version Property
,	TokenNameCOMMA	
clientVersion	TokenNameIdentifier	 client Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverVersionProperty	TokenNameIdentifier	 server Version Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
serverVersionProperty	TokenNameIdentifier	 server Version Property
,	TokenNameCOMMA	
serverVersion	TokenNameIdentifier	 server Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

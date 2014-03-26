package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** Wraps a Reader, and can throw random or fixed * exceptions, and spoon feed read chars. */	TokenNameCOMMENT_JAVADOC	 Wraps a Reader, and can throw random or fixed exceptions, and spoon feed read chars. 
public	TokenNamepublic	
class	TokenNameclass	
MockReaderWrapper	TokenNameIdentifier	 Mock Reader Wrapper
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
excAtChar	TokenNameIdentifier	 exc At Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
readSoFar	TokenNameIdentifier	 read So Far
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
throwExcNext	TokenNameIdentifier	 throw Exc Next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockReaderWrapper	TokenNameIdentifier	 Mock Reader Wrapper
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Throw an exception after reading this many chars. */	TokenNameCOMMENT_JAVADOC	 Throw an exception after reading this many chars. 
public	TokenNamepublic	
void	TokenNamevoid	
throwExcAfterChar	TokenNameIdentifier	 throw Exc After Char
(	TokenNameLPAREN	
int	TokenNameint	
charUpto	TokenNameIdentifier	 char Upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excAtChar	TokenNameIdentifier	 exc At Char
=	TokenNameEQUAL	
charUpto	TokenNameIdentifier	 char Upto
;	TokenNameSEMICOLON	
// You should only call this on init!: 	TokenNameCOMMENT_LINE	You should only call this on init!: 
assert	TokenNameassert	
readSoFar	TokenNameIdentifier	 read So Far
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
throwExcNext	TokenNameIdentifier	 throw Exc Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwExcNext	TokenNameIdentifier	 throw Exc Next
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
throwExcNext	TokenNameIdentifier	 throw Exc Next
||	TokenNameOR_OR	
(	TokenNameLPAREN	
excAtChar	TokenNameIdentifier	 exc At Char
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
readSoFar	TokenNameIdentifier	 read So Far
>=	TokenNameGREATER_EQUAL	
excAtChar	TokenNameIdentifier	 exc At Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"fake exception now!"	TokenNameStringLiteral	fake exception now!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
realLen	TokenNameIdentifier	 real Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realLen	TokenNameIdentifier	 real Len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Spoon-feed: intentionally maybe return less than 	TokenNameCOMMENT_LINE	Spoon-feed: intentionally maybe return less than 
// the consumer asked for 	TokenNameCOMMENT_LINE	the consumer asked for 
realLen	TokenNameIdentifier	 real Len
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excAtChar	TokenNameIdentifier	 exc At Char
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
excAtChar	TokenNameIdentifier	 exc At Char
-	TokenNameMINUS	
readSoFar	TokenNameIdentifier	 read So Far
;	TokenNameSEMICOLON	
assert	TokenNameassert	
left	TokenNameIdentifier	 left
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
realLen	TokenNameIdentifier	 real Len
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
read	TokenNameIdentifier	 read
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
readSoFar	TokenNameIdentifier	 read So Far
+=	TokenNamePLUS_EQUAL	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
realLen	TokenNameIdentifier	 real Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isMyEvilException	TokenNameIdentifier	 is My Evil Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
"fake exception now!"	TokenNameStringLiteral	fake exception now!
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	

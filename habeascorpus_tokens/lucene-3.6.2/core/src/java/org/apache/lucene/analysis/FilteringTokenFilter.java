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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
/** * Abstract base class for TokenFilters that may remove tokens. * You have to implement {@link #accept} and return a boolean if the current * token should be preserved. {@link #incrementToken} uses this method * to decide if a token should be passed to the caller. */	TokenNameCOMMENT_JAVADOC	 Abstract base class for TokenFilters that may remove tokens. You have to implement {@link #accept} and return a boolean if the current token should be preserved. {@link #incrementToken} uses this method to decide if a token should be passed to the caller. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FilteringTokenFilter	TokenNameIdentifier	 Filtering Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
;	TokenNameSEMICOLON	
// no init needed, as ctor enforces setting value! 	TokenNameCOMMENT_LINE	no init needed, as ctor enforces setting value! 
private	TokenNameprivate	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// only used when not preserving gaps 	TokenNameCOMMENT_LINE	only used when not preserving gaps 
public	TokenNamepublic	
FilteringTokenFilter	TokenNameIdentifier	 Filtering Token Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
=	TokenNameEQUAL	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override this method and return if the current input token should be returned by {@link #incrementToken}. */	TokenNameCOMMENT_JAVADOC	 Override this method and return if the current input token should be returned by {@link #incrementToken}. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
skippedPositions	TokenNameIdentifier	 skipped Positions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skippedPositions	TokenNameIdentifier	 skipped Positions
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
skippedPositions	TokenNameIdentifier	 skipped Positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skippedPositions	TokenNameIdentifier	 skipped Positions
+=	TokenNamePLUS_EQUAL	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first token having posinc=0 is illegal. 	TokenNameCOMMENT_LINE	first token having posinc=0 is illegal. 
if	TokenNameif	
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// reached EOS -- return false 	TokenNameCOMMENT_LINE	reached EOS -- return false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #setEnablePositionIncrements(boolean) */	TokenNameCOMMENT_JAVADOC	 @see #setEnablePositionIncrements(boolean) 
public	TokenNamepublic	
boolean	TokenNameboolean	
getEnablePositionIncrements	TokenNameIdentifier	 get Enable Position Increments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If <code>true</code>, this TokenFilter will preserve * positions of the incoming tokens (ie, accumulate and * set position increments of the removed tokens). * Generally, <code>true</code> is best as it does not * lose information (positions of the original tokens) * during indexing. * * <p> When set, when a token is stopped * (omitted), the position increment of the following * token is incremented. * * <p> <b>NOTE</b>: be sure to also * set {@link QueryParser#setEnablePositionIncrements} if * you use QueryParser to create queries. */	TokenNameCOMMENT_JAVADOC	 If <code>true</code>, this TokenFilter will preserve positions of the incoming tokens (ie, accumulate and set position increments of the removed tokens). Generally, <code>true</code> is best as it does not lose information (positions of the original tokens) during indexing. * <p> When set, when a token is stopped (omitted), the position increment of the following token is incremented. * <p> <b>NOTE</b>: be sure to also set {@link QueryParser#setEnablePositionIncrements} if you use QueryParser to create queries. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnablePositionIncrements	TokenNameIdentifier	 set Enable Position Increments
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enable	TokenNameIdentifier	 enable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
=	TokenNameEQUAL	
enable	TokenNameIdentifier	 enable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

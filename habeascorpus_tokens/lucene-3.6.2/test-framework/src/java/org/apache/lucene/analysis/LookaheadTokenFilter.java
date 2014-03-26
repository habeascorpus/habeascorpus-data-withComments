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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
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
AttributeSource	TokenNameIdentifier	 Attribute Source
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
RollingBuffer	TokenNameIdentifier	 Rolling Buffer
;	TokenNameSEMICOLON	
// TODO: cut SynFilter over to this 	TokenNameCOMMENT_LINE	TODO: cut SynFilter over to this 
// TODO: somehow add "nuke this input token" capability... 	TokenNameCOMMENT_LINE	TODO: somehow add "nuke this input token" capability... 
/** An abstract TokenFilter to make it easier to build graph * token filters requiring some lookahead. This class handles * the details of buffering up tokens, recording them by * position, restoring them, providing access to them, etc. */	TokenNameCOMMENT_JAVADOC	 An abstract TokenFilter to make it easier to build graph token filters requiring some lookahead. This class handles the details of buffering up tokens, recording them by position, restoring them, providing access to them, etc. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LookaheadTokenFilter	TokenNameIdentifier	 Lookahead Token Filter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
LookaheadTokenFilter	TokenNameIdentifier	 Lookahead Token Filter
.	TokenNameDOT	
Position	TokenNameIdentifier	 Position
>	TokenNameGREATER	
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
posLenAtt	TokenNameIdentifier	 pos Len Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Position of last read input token: 	TokenNameCOMMENT_LINE	Position of last read input token: 
protected	TokenNameprotected	
int	TokenNameint	
inputPos	TokenNameIdentifier	 input Pos
;	TokenNameSEMICOLON	
// Position of next possible output token to return: 	TokenNameCOMMENT_LINE	Position of next possible output token to return: 
protected	TokenNameprotected	
int	TokenNameint	
outputPos	TokenNameIdentifier	 output Pos
;	TokenNameSEMICOLON	
// True if we hit end from our input: 	TokenNameCOMMENT_LINE	True if we hit end from our input: 
protected	TokenNameprotected	
boolean	TokenNameboolean	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
tokenPending	TokenNameIdentifier	 token Pending
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
insertPending	TokenNameIdentifier	 insert Pending
;	TokenNameSEMICOLON	
/** Holds all state for a single position; subclass this * to record other state at each position. */	TokenNameCOMMENT_JAVADOC	 Holds all state for a single position; subclass this to record other state at each position. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Position	TokenNameIdentifier	 Position
implements	TokenNameimplements	
RollingBuffer	TokenNameIdentifier	 Rolling Buffer
.	TokenNameDOT	
Resettable	TokenNameIdentifier	 Resettable
{	TokenNameLBRACE	
// Buffered input tokens at this position: 	TokenNameCOMMENT_LINE	Buffered input tokens at this position: 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
inputTokens	TokenNameIdentifier	 input Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Next buffered token to be returned to consumer: 	TokenNameCOMMENT_LINE	Next buffered token to be returned to consumer: 
public	TokenNamepublic	
int	TokenNameint	
nextRead	TokenNameIdentifier	 next Read
;	TokenNameSEMICOLON	
// Any token leaving from this position should have this startOffset: 	TokenNameCOMMENT_LINE	Any token leaving from this position should have this startOffset: 
public	TokenNamepublic	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Any token arriving to this position should have this endOffset: 	TokenNameCOMMENT_LINE	Any token arriving to this position should have this endOffset: 
public	TokenNamepublic	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputTokens	TokenNameIdentifier	 input Tokens
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextRead	TokenNameIdentifier	 next Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputTokens	TokenNameIdentifier	 input Tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
nextState	TokenNameIdentifier	 next State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
nextRead	TokenNameIdentifier	 next Read
<	TokenNameLESS	
inputTokens	TokenNameIdentifier	 input Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inputTokens	TokenNameIdentifier	 input Tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
nextRead	TokenNameIdentifier	 next Read
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
LookaheadTokenFilter	TokenNameIdentifier	 Lookahead Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Call this only from within afterPosition, to insert a new * token. After calling this you should set any * necessary token you need. */	TokenNameCOMMENT_JAVADOC	 Call this only from within afterPosition, to insert a new token. After calling this you should set any necessary token you need. 
protected	TokenNameprotected	
void	TokenNamevoid	
insertToken	TokenNameIdentifier	 insert Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
insertPending	TokenNameIdentifier	 insert Pending
;	TokenNameSEMICOLON	
insertPending	TokenNameIdentifier	 insert Pending
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This is called when all input tokens leaving a given * position have been returned. Override this and * call createToken and then set whichever token's * attributes you want, if you want to inject * a token starting from this position. */	TokenNameCOMMENT_JAVADOC	 This is called when all input tokens leaving a given position have been returned. Override this and call createToken and then set whichever token's attributes you want, if you want to inject a token starting from this position. 
protected	TokenNameprotected	
void	TokenNamevoid	
afterPosition	TokenNameIdentifier	 after Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
newPosition	TokenNameIdentifier	 new Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
RollingBuffer	TokenNameIdentifier	 Rolling Buffer
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
RollingBuffer	TokenNameIdentifier	 Rolling Buffer
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
T	TokenNameIdentifier	 T
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newPosition	TokenNameIdentifier	 new Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Returns true if there is a new token. */	TokenNameCOMMENT_JAVADOC	 Returns true if there is a new token. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
peekToken	TokenNameIdentifier	 peek Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"LTF.peekToken inputPos="	TokenNameStringLiteral	LTF.peekToken inputPos=
+	TokenNamePLUS	
inputPos	TokenNameIdentifier	 input Pos
+	TokenNamePLUS	
" outputPos="	TokenNameStringLiteral	 outputPos=
+	TokenNamePLUS	
outputPos	TokenNameIdentifier	 output Pos
+	TokenNamePLUS	
" tokenPending="	TokenNameStringLiteral	 tokenPending=
+	TokenNamePLUS	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inputPos	TokenNameIdentifier	 input Pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
outputPos	TokenNameIdentifier	 output Pos
<=	TokenNameLESS_EQUAL	
inputPos	TokenNameIdentifier	 input Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
gotToken	TokenNameIdentifier	 got Token
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" input.incrToken() returned "	TokenNameStringLiteral	 input.incrToken() returned 
+	TokenNamePLUS	
gotToken	TokenNameIdentifier	 got Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gotToken	TokenNameIdentifier	 got Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputPos	TokenNameIdentifier	 input Pos
+=	TokenNamePLUS_EQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inputPos	TokenNameIdentifier	 input Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" now inputPos="	TokenNameStringLiteral	 now inputPos=
+	TokenNamePLUS	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
startPosData	TokenNameIdentifier	 start Pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
endPosData	TokenNameIdentifier	 end Pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
+	TokenNamePLUS	
posLenAtt	TokenNameIdentifier	 pos Len Att
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startPosData	TokenNameIdentifier	 start Pos Data
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startPosData	TokenNameIdentifier	 start Pos Data
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Make sure our input isn't messing up offsets: 	TokenNameCOMMENT_LINE	Make sure our input isn't messing up offsets: 
assert	TokenNameassert	
startPosData	TokenNameIdentifier	 start Pos Data
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
==	TokenNameEQUAL_EQUAL	
startOffset	TokenNameIdentifier	 start Offset
:	TokenNameCOLON	
"prev startOffset="	TokenNameStringLiteral	prev startOffset=
+	TokenNamePLUS	
startPosData	TokenNameIdentifier	 start Pos Data
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
" vs new startOffset="	TokenNameStringLiteral	 vs new startOffset=
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
" inputPos="	TokenNameStringLiteral	 inputPos=
+	TokenNamePLUS	
inputPos	TokenNameIdentifier	 input Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Make sure our input isn't messing up offsets: 	TokenNameCOMMENT_LINE	Make sure our input isn't messing up offsets: 
assert	TokenNameassert	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
:	TokenNameCOLON	
"prev endOffset="	TokenNameStringLiteral	prev endOffset=
+	TokenNamePLUS	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
+	TokenNamePLUS	
" vs new endOffset="	TokenNameStringLiteral	 vs new endOffset=
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
+	TokenNamePLUS	
" inputPos="	TokenNameStringLiteral	 inputPos=
+	TokenNamePLUS	
inputPos	TokenNameIdentifier	 input Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
gotToken	TokenNameIdentifier	 got Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Call this when you are done looking ahead; it will set * the next token to return. Return the boolean back to * the caller. */	TokenNameCOMMENT_JAVADOC	 Call this when you are done looking ahead; it will set the next token to return. Return the boolean back to the caller. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println(" nextToken: tokenPending=" + tokenPending); 	TokenNameCOMMENT_LINE	System.out.println(" nextToken: tokenPending=" + tokenPending); 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"LTF.nextToken inputPos="	TokenNameStringLiteral	LTF.nextToken inputPos=
+	TokenNamePLUS	
inputPos	TokenNameIdentifier	 input Pos
+	TokenNamePLUS	
" outputPos="	TokenNameStringLiteral	 outputPos=
+	TokenNamePLUS	
outputPos	TokenNameIdentifier	 output Pos
+	TokenNamePLUS	
" tokenPending="	TokenNameStringLiteral	 tokenPending=
+	TokenNamePLUS	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Position	TokenNameIdentifier	 Position
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// While loop here in case we have to 	TokenNameCOMMENT_LINE	While loop here in case we have to 
// skip over a hole from the input: 	TokenNameCOMMENT_LINE	skip over a hole from the input: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" check buffer @ outputPos=" + 	TokenNameCOMMENT_LINE	System.out.println(" check buffer @ outputPos=" + 
//outputPos + " inputPos=" + inputPos + " nextRead=" + 	TokenNameCOMMENT_LINE	outputPos + " inputPos=" + inputPos + " nextRead=" + 
//posData.nextRead + " vs size=" + 	TokenNameCOMMENT_LINE	posData.nextRead + " vs size=" + 
//posData.inputTokens.size()); 	TokenNameCOMMENT_LINE	posData.inputTokens.size()); 
// See if we have a previously buffered token to 	TokenNameCOMMENT_LINE	See if we have a previously buffered token to 
// return at the current position: 	TokenNameCOMMENT_LINE	return at the current position: 
if	TokenNameif	
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
nextRead	TokenNameIdentifier	 next Read
<	TokenNameLESS	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
inputTokens	TokenNameIdentifier	 input Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" return previously buffered token"	TokenNameStringLiteral	 return previously buffered token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This position has buffered tokens to serve up: 	TokenNameCOMMENT_LINE	This position has buffered tokens to serve up: 
if	TokenNameif	
(	TokenNameLPAREN	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
nextState	TokenNameIdentifier	 next State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" return!"); 	TokenNameCOMMENT_LINE	System.out.println(" return!"); 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputPos	TokenNameIdentifier	 input Pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
outputPos	TokenNameIdentifier	 output Pos
==	TokenNameEQUAL_EQUAL	
inputPos	TokenNameIdentifier	 input Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No more buffered tokens: 	TokenNameCOMMENT_LINE	No more buffered tokens: 
// We may still get input tokens at this position 	TokenNameCOMMENT_LINE	We may still get input tokens at this position 
//System.out.println(" break buffer"); 	TokenNameCOMMENT_LINE	System.out.println(" break buffer"); 
if	TokenNameif	
(	TokenNameLPAREN	
tokenPending	TokenNameIdentifier	 token Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fast path: just return token we had just incr'd, 	TokenNameCOMMENT_LINE	Fast path: just return token we had just incr'd, 
// without having captured/restored its state: 	TokenNameCOMMENT_LINE	without having captured/restored its state: 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" pass-through: return pending token"	TokenNameStringLiteral	 pass-through: return pending token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
peekToken	TokenNameIdentifier	 peek Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" END"	TokenNameStringLiteral	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This position had at least one token leaving 	TokenNameCOMMENT_LINE	This position had at least one token leaving 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" call afterPosition"	TokenNameStringLiteral	 call afterPosition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
afterPosition	TokenNameIdentifier	 after Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insertPending	TokenNameIdentifier	 insert Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Subclass inserted a token at this same 	TokenNameCOMMENT_LINE	Subclass inserted a token at this same 
// position: 	TokenNameCOMMENT_LINE	position: 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" return inserted token"	TokenNameStringLiteral	 return inserted token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
insertedTokenConsistent	TokenNameIdentifier	 inserted Token Consistent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertPending	TokenNameIdentifier	 insert Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Done with this position; move on: 	TokenNameCOMMENT_LINE	Done with this position; move on: 
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" next position: outputPos="	TokenNameStringLiteral	 next position: outputPos=
+	TokenNamePLUS	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
freeBefore	TokenNameIdentifier	 free Before
(	TokenNameLPAREN	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If subclass inserted a token, make sure it had in fact 	TokenNameCOMMENT_LINE	If subclass inserted a token, make sure it had in fact 
// looked ahead enough: 	TokenNameCOMMENT_LINE	looked ahead enough: 
private	TokenNameprivate	
boolean	TokenNameboolean	
insertedTokenConsistent	TokenNameIdentifier	 inserted Token Consistent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
posLen	TokenNameIdentifier	 pos Len
=	TokenNameEQUAL	
posLenAtt	TokenNameIdentifier	 pos Len Att
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
endPosData	TokenNameIdentifier	 end Pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outputPos	TokenNameIdentifier	 output Pos
+	TokenNamePLUS	
posLen	TokenNameIdentifier	 pos Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: end()? 	TokenNameCOMMENT_LINE	TODO: end()? 
// TODO: close()? 	TokenNameCOMMENT_LINE	TODO: close()? 
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
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputPos	TokenNameIdentifier	 input Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
outputPos	TokenNameIdentifier	 output Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tokenPending	TokenNameIdentifier	 token Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NumericUtils	TokenNameIdentifier	 Numeric Utils
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNumericTokenStream	TokenNameIdentifier	 Test Numeric Token Stream
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
lvalue	TokenNameIdentifier	 lvalue
=	TokenNameEQUAL	
4573245871874382L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
123456	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testLongStream	TokenNameIdentifier	 test Long Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLongValue	TokenNameIdentifier	 set Long Value
(	TokenNameLPAREN	
lvalue	TokenNameIdentifier	 lvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use getAttribute to test if attributes really exist, if not an IAE will be throwed 	TokenNameCOMMENT_LINE	use getAttribute to test if attributes really exist, if not an IAE will be throwed 
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
+=	TokenNamePLUS_EQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"New token is available"	TokenNameStringLiteral	New token is available
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Term is correctly encoded"	TokenNameStringLiteral	Term is correctly encoded
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
lvalue	TokenNameIdentifier	 lvalue
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Type correct"	TokenNameStringLiteral	Type correct
,	TokenNameCOMMA	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
.	TokenNameDOT	
TOKEN_TYPE_FULL_PREC	TokenNameIdentifier	 TOKEN  TYPE  FULL  PREC
:	TokenNameCOLON	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
.	TokenNameDOT	
TOKEN_TYPE_LOWER_PREC	TokenNameIdentifier	 TOKEN  TYPE  LOWER  PREC
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"No more tokens available"	TokenNameStringLiteral	No more tokens available
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIntStream	TokenNameIdentifier	 test Int Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use getAttribute to test if attributes really exist, if not an IAE will be throwed 	TokenNameCOMMENT_LINE	use getAttribute to test if attributes really exist, if not an IAE will be throwed 
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
+=	TokenNamePLUS_EQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"New token is available"	TokenNameStringLiteral	New token is available
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Term is correctly encoded"	TokenNameStringLiteral	Term is correctly encoded
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Type correct"	TokenNameStringLiteral	Type correct
,	TokenNameCOMMA	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
.	TokenNameDOT	
TOKEN_TYPE_FULL_PREC	TokenNameIdentifier	 TOKEN  TYPE  FULL  PREC
:	TokenNameCOLON	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
.	TokenNameDOT	
TOKEN_TYPE_LOWER_PREC	TokenNameIdentifier	 TOKEN  TYPE  LOWER  PREC
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"No more tokens available"	TokenNameStringLiteral	No more tokens available
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNotInitialized	TokenNameIdentifier	 test Not Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reset() should not succeed."	TokenNameStringLiteral	reset() should not succeed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"incrementToken() should not succeed."	TokenNameStringLiteral	incrementToken() should not succeed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

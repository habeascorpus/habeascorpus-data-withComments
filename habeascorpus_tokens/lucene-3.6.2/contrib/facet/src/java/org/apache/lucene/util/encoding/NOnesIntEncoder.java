package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A variation of {@link FourFlagsIntEncoder} which translates the data as * follows: * <ul> * <li>Values &ge; 2 are trnalsated to <code>value+1</code> (2 &rArr; 3, 3 * &rArr; 4 and so forth). * <li>Any <code>N</code> occurrences of 1 are encoded as a single 2. * <li>Otherwise, each 1 is encoded as 1. * </ul> * <p> * Encoding examples: * <ul> * <li>N = 4: the data 1,1,1,1,1 is translated to: 2, 1 * <li>N = 3: the data 1,2,3,4,1,1,1,1,5 is translated to 1,3,4,5,2,1,6 * </ul> * <b>NOTE:</b> this encoder does not support values &le; 0 and * {@link Integer#MAX_VALUE}. 0 is not supported because it's not supported by * {@link FourFlagsIntEncoder} and {@link Integer#MAX_VALUE} because this * encoder translates N to N+1, which will cause an overflow and * {@link Integer#MAX_VALUE} will become a negative number, which is not * supported as well.<br> * This does not mean you cannot encode {@link Integer#MAX_VALUE}. If it is not * the first value to encode, and you wrap this encoder with * {@link DGapIntEncoder}, then the value that will be sent to this encoder will * be <code>MAX_VAL - prev</code>. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A variation of {@link FourFlagsIntEncoder} which translates the data as follows: <ul> <li>Values &ge; 2 are trnalsated to <code>value+1</code> (2 &rArr; 3, 3 &rArr; 4 and so forth). <li>Any <code>N</code> occurrences of 1 are encoded as a single 2. <li>Otherwise, each 1 is encoded as 1. </ul> <p> Encoding examples: <ul> <li>N = 4: the data 1,1,1,1,1 is translated to: 2, 1 <li>N = 3: the data 1,2,3,4,1,1,1,1,5 is translated to 1,3,4,5,2,1,6 </ul> <b>NOTE:</b> this encoder does not support values &le; 0 and {@link Integer#MAX_VALUE}. 0 is not supported because it's not supported by {@link FourFlagsIntEncoder} and {@link Integer#MAX_VALUE} because this encoder translates N to N+1, which will cause an overflow and {@link Integer#MAX_VALUE} will become a negative number, which is not supported as well.<br> This does not mean you cannot encode {@link Integer#MAX_VALUE}. If it is not the first value to encode, and you wrap this encoder with {@link DGapIntEncoder}, then the value that will be sent to this encoder will be <code>MAX_VAL - prev</code>. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
NOnesIntEncoder	TokenNameIdentifier	 N Ones Int Encoder
extends	TokenNameextends	
FourFlagsIntEncoder	TokenNameIdentifier	 Four Flags Int Encoder
{	TokenNameLBRACE	
/** Number of consecutive '1's to be translated into single target value '2'. */	TokenNameCOMMENT_JAVADOC	 Number of consecutive '1's to be translated into single target value '2'. 
private	TokenNameprivate	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
/** Counts the number of consecutive ones seen. */	TokenNameCOMMENT_JAVADOC	 Counts the number of consecutive ones seen. 
private	TokenNameprivate	
int	TokenNameint	
onesCounter	TokenNameIdentifier	 ones Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructs an encoder with a given value of N (N: Number of consecutive * '1's to be translated into single target value '2'). */	TokenNameCOMMENT_JAVADOC	 Constructs an encoder with a given value of N (N: Number of consecutive '1's to be translated into single target value '2'). 
public	TokenNamepublic	
NOnesIntEncoder	TokenNameIdentifier	 N Ones Int Encoder
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
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
// We might have ones in our buffer, encode them as neccesary. 	TokenNameCOMMENT_LINE	We might have ones in our buffer, encode them as neccesary. 
while	TokenNamewhile	
(	TokenNameLPAREN	
onesCounter	TokenNameIdentifier	 ones Counter
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Increment the number of consecutive ones seen so far 	TokenNameCOMMENT_LINE	Increment the number of consecutive ones seen so far 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
onesCounter	TokenNameIdentifier	 ones Counter
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
onesCounter	TokenNameIdentifier	 ones Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If it's not one - there might have been ones we had to encode prior to 	TokenNameCOMMENT_LINE	If it's not one - there might have been ones we had to encode prior to 
// this value 	TokenNameCOMMENT_LINE	this value 
while	TokenNamewhile	
(	TokenNameLPAREN	
onesCounter	TokenNameIdentifier	 ones Counter
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
onesCounter	TokenNameIdentifier	 ones Counter
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// encode value + 1 --> the translation. 	TokenNameCOMMENT_LINE	encode value + 1 --> the translation. 
super	TokenNamesuper	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IntDecoder	TokenNameIdentifier	 Int Decoder
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NOnesIntDecoder	TokenNameIdentifier	 N Ones Int Decoder
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
onesCounter	TokenNameIdentifier	 ones Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
"NOnes ("	TokenNameStringLiteral	NOnes (
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
") ("	TokenNameStringLiteral	) (
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

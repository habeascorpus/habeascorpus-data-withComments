/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
WordType	TokenNameIdentifier	 Word Type
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * SmartChineseAnalyzer internal token * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 SmartChineseAnalyzer internal token @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SegToken	TokenNameIdentifier	 Seg Token
{	TokenNameLBRACE	
/** * Character array containing token text */	TokenNameCOMMENT_JAVADOC	 Character array containing token text 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
;	TokenNameSEMICOLON	
/** * start offset into original sentence */	TokenNameCOMMENT_JAVADOC	 start offset into original sentence 
public	TokenNamepublic	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
/** * end offset into original sentence */	TokenNameCOMMENT_JAVADOC	 end offset into original sentence 
public	TokenNamepublic	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
/** * {@link WordType} of the text */	TokenNameCOMMENT_JAVADOC	 {@link WordType} of the text 
public	TokenNamepublic	
int	TokenNameint	
wordType	TokenNameIdentifier	 word Type
;	TokenNameSEMICOLON	
/** * word frequency */	TokenNameCOMMENT_JAVADOC	 word frequency 
public	TokenNamepublic	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
/** * during segmentation, this is used to store the index of the token in the token list table */	TokenNameCOMMENT_JAVADOC	 during segmentation, this is used to store the index of the token in the token list table 
public	TokenNamepublic	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Create a new SegToken from a character array. * * @param idArray character array containing text * @param start start offset of SegToken in original sentence * @param end end offset of SegToken in original sentence * @param wordType {@link WordType} of the text * @param weight word frequency */	TokenNameCOMMENT_JAVADOC	 Create a new SegToken from a character array. * @param idArray character array containing text @param start start offset of SegToken in original sentence @param end end offset of SegToken in original sentence @param wordType {@link WordType} of the text @param weight word frequency 
public	TokenNamepublic	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idArray	TokenNameIdentifier	 id Array
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
wordType	TokenNameIdentifier	 word Type
,	TokenNameCOMMA	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
idArray	TokenNameIdentifier	 id Array
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wordType	TokenNameIdentifier	 word Type
=	TokenNameEQUAL	
wordType	TokenNameIdentifier	 word Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#hashCode() */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#hashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
wordType	TokenNameIdentifier	 word Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#equals(java.lang.Object) */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#equals(java.lang.Object) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SegToken	TokenNameIdentifier	 Seg Token
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wordType	TokenNameIdentifier	 word Type
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wordType	TokenNameIdentifier	 word Type
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

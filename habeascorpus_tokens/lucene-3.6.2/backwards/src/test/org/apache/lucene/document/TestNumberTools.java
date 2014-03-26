package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNumberTools	TokenNameIdentifier	 Test Number Tools
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNearZero	TokenNameIdentifier	 test Near Zero
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
-	TokenNameMINUS	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subtestTwoLongs	TokenNameIdentifier	 subtest Two Longs
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMax	TokenNameIdentifier	 test Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure the constants convert to their equivalents 	TokenNameCOMMENT_LINE	make sure the constants convert to their equivalents 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
stringToLong	TokenNameIdentifier	 string To Long
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
MAX_STRING_VALUE	TokenNameIdentifier	 MAX  STRING  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
MAX_STRING_VALUE	TokenNameIdentifier	 MAX  STRING  VALUE
,	TokenNameCOMMA	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
longToString	TokenNameIdentifier	 long To String
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test near MAX, too 	TokenNameCOMMENT_LINE	test near MAX, too 
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subtestTwoLongs	TokenNameIdentifier	 subtest Two Longs
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMin	TokenNameIdentifier	 test Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure the constants convert to their equivelents 	TokenNameCOMMENT_LINE	make sure the constants convert to their equivelents 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
stringToLong	TokenNameIdentifier	 string To Long
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
,	TokenNameCOMMA	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
longToString	TokenNameIdentifier	 long To String
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test near MIN, too 	TokenNameCOMMENT_LINE	test near MIN, too 
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subtestTwoLongs	TokenNameIdentifier	 subtest Two Longs
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
subtestTwoLongs	TokenNameIdentifier	 subtest Two Longs
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
long	TokenNamelong	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// convert to strings 	TokenNameCOMMENT_LINE	convert to strings 
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
longToString	TokenNameIdentifier	 long To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
longToString	TokenNameIdentifier	 long To String
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// are they the right length? 	TokenNameCOMMENT_LINE	are they the right length? 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// are they the right order? 	TokenNameCOMMENT_LINE	are they the right order? 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// can we convert them back to longs? 	TokenNameCOMMENT_LINE	can we convert them back to longs? 
long	TokenNamelong	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
stringToLong	TokenNameIdentifier	 string To Long
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
j2	TokenNameIdentifier	 j2
=	TokenNameEQUAL	
NumberTools	TokenNameIdentifier	 Number Tools
.	TokenNameDOT	
stringToLong	TokenNameIdentifier	 string To Long
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
j2	TokenNameIdentifier	 j2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

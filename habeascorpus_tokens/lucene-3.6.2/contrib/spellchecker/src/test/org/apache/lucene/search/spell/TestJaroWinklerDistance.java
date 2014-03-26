package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
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
TestJaroWinklerDistance	TokenNameIdentifier	 Test Jaro Winkler Distance
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
StringDistance	TokenNameIdentifier	 String Distance
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
new	TokenNamenew	
JaroWinklerDistance	TokenNameIdentifier	 Jaro Winkler Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDistance	TokenNameIdentifier	 test Get Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
,	TokenNameCOMMA	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"martha"	TokenNameStringLiteral	martha
,	TokenNameCOMMA	
"marhta"	TokenNameStringLiteral	marhta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0.961	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0.962	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"jones"	TokenNameStringLiteral	jones
,	TokenNameCOMMA	
"johnson"	TokenNameStringLiteral	johnson
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0.832	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0.833	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"abcvwxyz"	TokenNameStringLiteral	abcvwxyz
,	TokenNameCOMMA	
"cabvwxyz"	TokenNameStringLiteral	cabvwxyz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0.958	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0.959	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"dwayne"	TokenNameStringLiteral	dwayne
,	TokenNameCOMMA	
"duane"	TokenNameStringLiteral	duane
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0.84	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0.841	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"dixon"	TokenNameStringLiteral	dixon
,	TokenNameCOMMA	
"dicksonx"	TokenNameStringLiteral	dicksonx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0.813	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0.814	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"fvie"	TokenNameStringLiteral	fvie
,	TokenNameCOMMA	
"ten"	TokenNameStringLiteral	ten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"zac ephron"	TokenNameStringLiteral	zac ephron
,	TokenNameCOMMA	
"zac efron"	TokenNameStringLiteral	zac efron
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"zac ephron"	TokenNameStringLiteral	zac ephron
,	TokenNameCOMMA	
"kai ephron"	TokenNameStringLiteral	kai ephron
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
>	TokenNameGREATER	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"brittney spears"	TokenNameStringLiteral	brittney spears
,	TokenNameCOMMA	
"britney spears"	TokenNameStringLiteral	britney spears
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"brittney spears"	TokenNameStringLiteral	brittney spears
,	TokenNameCOMMA	
"brittney startzman"	TokenNameStringLiteral	brittney startzman
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
>	TokenNameGREATER	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

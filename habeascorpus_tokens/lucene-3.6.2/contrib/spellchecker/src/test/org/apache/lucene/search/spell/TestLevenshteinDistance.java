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
TestLevenshteinDistance	TokenNameIdentifier	 Test Levenshtein Distance
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
StringDistance	TokenNameIdentifier	 String Distance
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
new	TokenNamenew	
LevensteinDistance	TokenNameIdentifier	 Levenstein Distance
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.6666	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.4285	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.75	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.666	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
"ten"	TokenNameStringLiteral	ten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
,	TokenNameCOMMA	
d2	TokenNameIdentifier	 d2
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
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
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

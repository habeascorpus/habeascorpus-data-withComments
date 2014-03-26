package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ArrivalWindowTest	TokenNameIdentifier	 Arrival Window Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrivalWindow	TokenNameIdentifier	 Arrival Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
new	TokenNamenew	
ArrivalWindow	TokenNameIdentifier	 Arrival Window
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//base readings 	TokenNameCOMMENT_LINE	base readings 
window	TokenNameIdentifier	 window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
111	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
222	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
333	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
444	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
555	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//all good 	TokenNameCOMMENT_LINE	all good 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.4342	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
phi	TokenNameIdentifier	 phi
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//oh noes, a much higher timestamp, something went wrong! 	TokenNameCOMMENT_LINE	oh noes, a much higher timestamp, something went wrong! 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
9.566	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
phi	TokenNameIdentifier	 phi
(	TokenNameLPAREN	
3000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

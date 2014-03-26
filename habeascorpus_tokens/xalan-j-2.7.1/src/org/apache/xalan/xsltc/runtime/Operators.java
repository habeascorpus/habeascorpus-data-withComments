/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Operators.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Operators.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Operators	TokenNameIdentifier	 Operators
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EQ	TokenNameIdentifier	 EQ
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NE	TokenNameIdentifier	 NE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GT	TokenNameIdentifier	 GT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LT	TokenNameIdentifier	 LT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GE	TokenNameIdentifier	 GE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LE	TokenNameIdentifier	 LE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
,	TokenNameCOMMA	
"!="	TokenNameStringLiteral	!=
,	TokenNameCOMMA	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
"<"	TokenNameStringLiteral	<
,	TokenNameCOMMA	
">="	TokenNameStringLiteral	>=
,	TokenNameCOMMA	
"<="	TokenNameStringLiteral	<=
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getOpNames	TokenNameIdentifier	 get Op Names
(	TokenNameLPAREN	
int	TokenNameint	
operator	TokenNameIdentifier	 operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
operator	TokenNameIdentifier	 operator
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Swap operator array 	TokenNameCOMMENT_LINE	Swap operator array 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
swapOpArray	TokenNameIdentifier	 swap Op Array
=	TokenNameEQUAL	
{	TokenNameLBRACE	
EQ	TokenNameIdentifier	 EQ
,	TokenNameCOMMA	
// EQ 	TokenNameCOMMENT_LINE	EQ 
NE	TokenNameIdentifier	 NE
,	TokenNameCOMMA	
// NE 	TokenNameCOMMENT_LINE	NE 
LT	TokenNameIdentifier	 LT
,	TokenNameCOMMA	
// GT 	TokenNameCOMMENT_LINE	GT 
GT	TokenNameIdentifier	 GT
,	TokenNameCOMMA	
// LT 	TokenNameCOMMENT_LINE	LT 
LE	TokenNameIdentifier	 LE
,	TokenNameCOMMA	
// GE 	TokenNameCOMMENT_LINE	GE 
GE	TokenNameIdentifier	 GE
// LE 	TokenNameCOMMENT_LINE	LE 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
swapOp	TokenNameIdentifier	 swap Op
(	TokenNameLPAREN	
int	TokenNameint	
operator	TokenNameIdentifier	 operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
swapOpArray	TokenNameIdentifier	 swap Op Array
[	TokenNameLBRACKET	
operator	TokenNameIdentifier	 operator
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

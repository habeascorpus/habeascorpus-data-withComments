/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
OperationType	TokenNameIdentifier	 Operation Type
{	TokenNameLBRACE	
PLUS	TokenNameIdentifier	 PLUS
,	TokenNameCOMMA	
MINUS	TokenNameIdentifier	 MINUS
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
// unary operation 	TokenNameCOMMENT_LINE	unary operation 
public	TokenNamepublic	
Operation	TokenNameIdentifier	 Operation
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// binary operation 	TokenNameCOMMENT_LINE	binary operation 
public	TokenNamepublic	
Operation	TokenNameIdentifier	 Operation
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isUnary	TokenNameIdentifier	 is Unary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isUnary	TokenNameIdentifier	 is Unary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"UnaryOperation(%s)"	TokenNameStringLiteral	UnaryOperation(%s)
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"BinaryOperation(%s, %s, %s)"	TokenNameStringLiteral	BinaryOperation(%s, %s, %s)
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

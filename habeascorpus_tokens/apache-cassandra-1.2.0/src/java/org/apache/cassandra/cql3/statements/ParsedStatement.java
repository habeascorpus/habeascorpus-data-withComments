/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
boundTerms	TokenNameIdentifier	 bound Terms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getBoundsTerms	TokenNameIdentifier	 get Bounds Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
boundTerms	TokenNameIdentifier	 bound Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used by the parser and preparable statement 	TokenNameCOMMENT_LINE	Used by the parser and preparable statement 
public	TokenNamepublic	
void	TokenNamevoid	
setBoundTerms	TokenNameIdentifier	 set Bound Terms
(	TokenNameLPAREN	
int	TokenNameint	
boundTerms	TokenNameIdentifier	 bound Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
boundTerms	TokenNameIdentifier	 bound Terms
=	TokenNameEQUAL	
boundTerms	TokenNameIdentifier	 bound Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
Prepared	TokenNameIdentifier	 Prepared
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Prepared	TokenNameIdentifier	 Prepared
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
CQLStatement	TokenNameIdentifier	 CQL Statement
statement	TokenNameIdentifier	 statement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
boundNames	TokenNameIdentifier	 bound Names
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Prepared	TokenNameIdentifier	 Prepared
(	TokenNameLPAREN	
CQLStatement	TokenNameIdentifier	 CQL Statement
statement	TokenNameIdentifier	 statement
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
boundNames	TokenNameIdentifier	 bound Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
statement	TokenNameIdentifier	 statement
=	TokenNameEQUAL	
statement	TokenNameIdentifier	 statement
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
boundNames	TokenNameIdentifier	 bound Names
=	TokenNameEQUAL	
boundNames	TokenNameIdentifier	 bound Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Prepared	TokenNameIdentifier	 Prepared
(	TokenNameLPAREN	
CQLStatement	TokenNameIdentifier	 CQL Statement
statement	TokenNameIdentifier	 statement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

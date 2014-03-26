package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
// provide a 	TokenNameCOMMENT_LINE	provide a 
// - the exception 	TokenNameCOMMENT_LINE	- the exception 
// - useful message 	TokenNameCOMMENT_LINE	- useful message 
// - useful reference to a solution, or set of solutions 	TokenNameCOMMENT_LINE	- useful reference to a solution, or set of solutions 
// - the configuration gleaned for examination 	TokenNameCOMMENT_LINE	- the configuration gleaned for examination 
// - plugin repositories 	TokenNameCOMMENT_LINE	- plugin repositories 
public	TokenNamepublic	
class	TokenNameclass	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
{	TokenNameLBRACE	
private	TokenNameprivate	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
reference	TokenNameIdentifier	 reference
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
reference	TokenNameIdentifier	 reference
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
reference	TokenNameIdentifier	 reference
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reference	TokenNameIdentifier	 reference
=	TokenNameEQUAL	
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
reference	TokenNameIdentifier	 reference
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
children	TokenNameIdentifier	 children
:	TokenNameCOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reference	TokenNameIdentifier	 reference
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
>	TokenNameGREATER	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

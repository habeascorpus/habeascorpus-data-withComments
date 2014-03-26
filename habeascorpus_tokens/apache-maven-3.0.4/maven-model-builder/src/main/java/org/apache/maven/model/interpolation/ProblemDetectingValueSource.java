package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
.	TokenNameDOT	
ValueSource	TokenNameIdentifier	 Value Source
;	TokenNameSEMICOLON	
/** * Wraps another value source and intercepts interpolated expressions, checking for problems. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Wraps another value source and intercepts interpolated expressions, checking for problems. * @author Benjamin Bentmann 
class	TokenNameclass	
ProblemDetectingValueSource	TokenNameIdentifier	 Problem Detecting Value Source
implements	TokenNameimplements	
ValueSource	TokenNameIdentifier	 Value Source
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ValueSource	TokenNameIdentifier	 Value Source
valueSource	TokenNameIdentifier	 value Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bannedPrefix	TokenNameIdentifier	 banned Prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
newPrefix	TokenNameIdentifier	 new Prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProblemDetectingValueSource	TokenNameIdentifier	 Problem Detecting Value Source
(	TokenNameLPAREN	
ValueSource	TokenNameIdentifier	 Value Source
valueSource	TokenNameIdentifier	 value Source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
bannedPrefix	TokenNameIdentifier	 banned Prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newPrefix	TokenNameIdentifier	 new Prefix
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
valueSource	TokenNameIdentifier	 value Source
=	TokenNameEQUAL	
valueSource	TokenNameIdentifier	 value Source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bannedPrefix	TokenNameIdentifier	 banned Prefix
=	TokenNameEQUAL	
bannedPrefix	TokenNameIdentifier	 banned Prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newPrefix	TokenNameIdentifier	 new Prefix
=	TokenNameEQUAL	
newPrefix	TokenNameIdentifier	 new Prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
valueSource	TokenNameIdentifier	 value Source
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
bannedPrefix	TokenNameIdentifier	 banned Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The expression ${"	TokenNameStringLiteral	The expression ${
+	TokenNamePLUS	
expression	TokenNameIdentifier	 expression
+	TokenNamePLUS	
"} is deprecated."	TokenNameStringLiteral	} is deprecated.
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newPrefix	TokenNameIdentifier	 new Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
newPrefix	TokenNameIdentifier	 new Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" Please use ${"	TokenNameStringLiteral	 Please use ${
+	TokenNamePLUS	
newPrefix	TokenNameIdentifier	 new Prefix
+	TokenNamePLUS	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
bannedPrefix	TokenNameIdentifier	 banned Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"} instead."	TokenNameStringLiteral	} instead.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getFeedback	TokenNameIdentifier	 get Feedback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
valueSource	TokenNameIdentifier	 value Source
.	TokenNameDOT	
getFeedback	TokenNameIdentifier	 get Feedback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clearFeedback	TokenNameIdentifier	 clear Feedback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valueSource	TokenNameIdentifier	 value Source
.	TokenNameDOT	
clearFeedback	TokenNameIdentifier	 clear Feedback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

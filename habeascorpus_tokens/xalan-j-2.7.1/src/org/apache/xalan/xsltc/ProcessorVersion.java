/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorVersion.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorVersion.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
;	TokenNameSEMICOLON	
/** * Admin class that assigns a version number to the XSLTC software. * The version number is made up from three fields as in: * MAJOR.MINOR[.DELTA]. Fields are incremented based on the following: * DELTA field: changes for each bug fix, developer fixing the bug should * increment this field. * MINOR field: API changes or a milestone culminating from several * bug fixes. DELTA field goes to zero and MINOR is * incremented such as: {1.0,1.0.1,1.0.2,1.0.3,...1.0.18,1.1} * MAJOR field: milestone culminating in fundamental API changes or * architectural changes. MINOR field goes to zero * and MAJOR is incremented such as: {...,1.1.14,1.2,2.0} * Stability of a release follows: X.0 > X.X > X.X.X * @author G. Todd Miller */	TokenNameCOMMENT_JAVADOC	 Admin class that assigns a version number to the XSLTC software. The version number is made up from three fields as in: MAJOR.MINOR[.DELTA]. Fields are incremented based on the following: DELTA field: changes for each bug fix, developer fixing the bug should increment this field. MINOR field: API changes or a milestone culminating from several bug fixes. DELTA field goes to zero and MINOR is incremented such as: {1.0,1.0.1,1.0.2,1.0.3,...1.0.18,1.1} MAJOR field: milestone culminating in fundamental API changes or architectural changes. MINOR field goes to zero and MAJOR is incremented such as: {...,1.1.14,1.2,2.0} Stability of a release follows: X.0 > X.X > X.X.X @author G. Todd Miller 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorVersion	TokenNameIdentifier	 Processor Version
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
MAJOR	TokenNameIdentifier	 MAJOR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
MINOR	TokenNameIdentifier	 MINOR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
DELTA	TokenNameIdentifier	 DELTA
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"XSLTC version "	TokenNameStringLiteral	XSLTC version 
+	TokenNamePLUS	
MAJOR	TokenNameIdentifier	 MAJOR
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
MINOR	TokenNameIdentifier	 MINOR
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DELTA	TokenNameIdentifier	 DELTA
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
DELTA	TokenNameIdentifier	 DELTA
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

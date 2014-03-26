package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
;	TokenNameSEMICOLON	
/** * Check large and special graphs. */	TokenNameCOMMENT_JAVADOC	 Check large and special graphs. 
public	TokenNamepublic	
class	TokenNameclass	
TestRamUsageEstimatorOnWildAnimals	TokenNameIdentifier	 Test Ram Usage Estimator On Wild Animals
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ListElement	TokenNameIdentifier	 List Element
{	TokenNameLBRACE	
ListElement	TokenNameIdentifier	 List Element
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverflowMaxChainLength	TokenNameIdentifier	 test Overflow Max Chain Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
UPPERLIMIT	TokenNameIdentifier	 UPPERLIMIT
=	TokenNameEQUAL	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
UPPERLIMIT	TokenNameIdentifier	 UPPERLIMIT
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ListElement	TokenNameIdentifier	 List Element
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
new	TokenNamenew	
ListElement	TokenNameIdentifier	 List Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListElement	TokenNameIdentifier	 List Element
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
ListElement	TokenNameIdentifier	 List Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cause SOE or pass. 	TokenNameCOMMENT_LINE	cause SOE or pass. 
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StackOverflowError	TokenNameIdentifier	 Stack Overflow Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
UPPERLIMIT	TokenNameIdentifier	 UPPERLIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Max object chain length till stack overflow: "	TokenNameStringLiteral	Max object chain length till stack overflow: 
+	TokenNamePLUS	
lower	TokenNameIdentifier	 lower
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

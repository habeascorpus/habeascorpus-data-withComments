/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
/** * Implementation of a PureRandomNumber generator. Use this class cautiously. Not * for general purpose use. Currently this is used by the Gossiper to choose a random * endpoint to Gossip to. */	TokenNameCOMMENT_JAVADOC	 Implementation of a PureRandomNumber generator. Use this class cautiously. Not for general purpose use. Currently this is used by the Gossiper to choose a random endpoint to Gossip to. 
class	TokenNameclass	
PureRandom	TokenNameIdentifier	 Pure Random
extends	TokenNameextends	
Random	TokenNameIdentifier	 Random
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastUb	TokenNameIdentifier	 last Ub
;	TokenNameSEMICOLON	
PureRandom	TokenNameIdentifier	 Pure Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
int	TokenNameint	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"ub must be positive"	TokenNameStringLiteral	ub must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastUb	TokenNameIdentifier	 last Ub
!=	TokenNameNOT_EQUAL	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastUb	TokenNameIdentifier	 last Ub
=	TokenNameEQUAL	
ub	TokenNameIdentifier	 ub
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
pr	TokenNameIdentifier	 pr
=	TokenNameEQUAL	
new	TokenNamenew	
PureRandom	TokenNameIdentifier	 Pure Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ubs	TokenNameIdentifier	 ubs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ub	TokenNameIdentifier	 ub
:	TokenNameCOLON	
ubs	TokenNameIdentifier	 ubs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"UB: "	TokenNameStringLiteral	UB: 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
junk	TokenNameIdentifier	 junk
=	TokenNameEQUAL	
pr	TokenNameIdentifier	 pr
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do something with junk so JVM doesn't optimize away 	TokenNameCOMMENT_LINE	Do something with junk so JVM doesn't optimize away 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
junk	TokenNameIdentifier	 junk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

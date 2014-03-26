package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
class	TokenNameclass	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
{	TokenNameLBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTES_PER_POSTING	TokenNameIdentifier	 BYTES  PER  POSTING
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textStarts	TokenNameIdentifier	 text Starts
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intStarts	TokenNameIdentifier	 int Starts
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
byteStarts	TokenNameIdentifier	 byte Starts
;	TokenNameSEMICOLON	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
textStarts	TokenNameIdentifier	 text Starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intStarts	TokenNameIdentifier	 int Starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byteStarts	TokenNameIdentifier	 byte Starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BYTES_PER_POSTING	TokenNameIdentifier	 BYTES  PER  POSTING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
toArray	TokenNameIdentifier	 to Array
,	TokenNameCOMMA	
int	TokenNameint	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
textStarts	TokenNameIdentifier	 text Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
intStarts	TokenNameIdentifier	 int Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
byteStarts	TokenNameIdentifier	 byte Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
.	TokenNameDOT	
byteStarts	TokenNameIdentifier	 byte Starts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

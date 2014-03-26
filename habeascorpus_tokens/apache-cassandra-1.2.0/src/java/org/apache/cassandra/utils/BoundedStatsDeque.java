/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
LinkedBlockingDeque	TokenNameIdentifier	 Linked Blocking Deque
;	TokenNameSEMICOLON	
/** * bounded threadsafe deque */	TokenNameCOMMENT_JAVADOC	 bounded threadsafe deque 
public	TokenNamepublic	
class	TokenNameclass	
BoundedStatsDeque	TokenNameIdentifier	 Bounded Stats Deque
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
LinkedBlockingDeque	TokenNameIdentifier	 Linked Blocking Deque
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
deque	TokenNameIdentifier	 deque
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BoundedStatsDeque	TokenNameIdentifier	 Bounded Stats Deque
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deque	TokenNameIdentifier	 deque
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedBlockingDeque	TokenNameIdentifier	 Linked Blocking Deque
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
double	TokenNamedouble	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
offer	TokenNameIdentifier	 offer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// oops, clear() beat us to it 	TokenNameCOMMENT_LINE	oops, clear() beat us to it 
}	TokenNameRBRACE	
deque	TokenNameIdentifier	 deque
.	TokenNameDOT	
offer	TokenNameIdentifier	 offer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0d	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
interval	TokenNameIdentifier	 interval
:	TokenNameCOLON	
deque	TokenNameIdentifier	 deque
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
interval	TokenNameIdentifier	 interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

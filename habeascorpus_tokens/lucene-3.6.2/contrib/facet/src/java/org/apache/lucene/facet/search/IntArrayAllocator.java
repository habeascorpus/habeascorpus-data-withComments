package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An IntArrayAllocator is an object which manages counter array objects * of a certain length. These counter arrays are needed temporarily during * faceted search (see {@link FacetsAccumulator} and can be reused across searches * instead of being allocated afresh on every search. * <P> * An IntArrayAllocator is thread-safe. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An IntArrayAllocator is an object which manages counter array objects of a certain length. These counter arrays are needed temporarily during faceted search (see {@link FacetsAccumulator} and can be reused across searches instead of being allocated afresh on every search. <P> An IntArrayAllocator is thread-safe. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IntArrayAllocator	TokenNameIdentifier	 Int Array Allocator
extends	TokenNameextends	
TemporaryObjectAllocator	TokenNameIdentifier	 Temporary Object Allocator
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
{	TokenNameLBRACE	
// An IntArrayAllocater deals with integer arrays of a fixed length. 	TokenNameCOMMENT_LINE	An IntArrayAllocater deals with integer arrays of a fixed length. 
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * Construct an allocator for counter arrays of length <CODE>length</CODE>, * keeping around a pool of up to <CODE>maxArrays</CODE> old arrays. * <P> * Note that the pool size only restricts the number of arrays that hang * around when not needed, but <I>not</I> the maximum number of arrays * that are allocated when actually is use: If a number of concurrent * threads ask for an allocation, all of them will get a counter array, * even if their number is greater than maxArrays. If an application wants * to limit the number of concurrent threads making allocations, it needs * to do so on its own - for example by blocking new threads until the * existing ones have finished. * <P> * In particular, when maxArrays=0, this object behaves as a trivial * allocator, always allocating a new array and never reusing an old one. */	TokenNameCOMMENT_JAVADOC	 Construct an allocator for counter arrays of length <CODE>length</CODE>, keeping around a pool of up to <CODE>maxArrays</CODE> old arrays. <P> Note that the pool size only restricts the number of arrays that hang around when not needed, but <I>not</I> the maximum number of arrays that are allocated when actually is use: If a number of concurrent threads ask for an allocation, all of them will get a counter array, even if their number is greater than maxArrays. If an application wants to limit the number of concurrent threads making allocations, it needs to do so on its own - for example by blocking new threads until the existing ones have finished. <P> In particular, when maxArrays=0, this object behaves as a trivial allocator, always allocating a new array and never reusing an old one. 
public	TokenNamepublic	
IntArrayAllocator	TokenNameIdentifier	 Int Array Allocator
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
int	TokenNameint	
maxArrays	TokenNameIdentifier	 max Arrays
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxArrays	TokenNameIdentifier	 max Arrays
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

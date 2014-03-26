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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Provider of arrays used for facet operations such as counting. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Provider of arrays used for facet operations such as counting. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetArrays	TokenNameIdentifier	 Facet Arrays
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intArray	TokenNameIdentifier	 int Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
floatArray	TokenNameIdentifier	 float Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IntArrayAllocator	TokenNameIdentifier	 Int Array Allocator
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FloatArrayAllocator	TokenNameIdentifier	 Float Array Allocator
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
arraysLength	TokenNameIdentifier	 arrays Length
;	TokenNameSEMICOLON	
/** * Create a FacetArrays with certain array allocators. * @param intArrayAllocator allocator for int arrays. * @param floatArrayAllocator allocator for float arrays. */	TokenNameCOMMENT_JAVADOC	 Create a FacetArrays with certain array allocators. @param intArrayAllocator allocator for int arrays. @param floatArrayAllocator allocator for float arrays. 
public	TokenNamepublic	
FacetArrays	TokenNameIdentifier	 Facet Arrays
(	TokenNameLPAREN	
IntArrayAllocator	TokenNameIdentifier	 Int Array Allocator
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
,	TokenNameCOMMA	
FloatArrayAllocator	TokenNameIdentifier	 Float Array Allocator
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
=	TokenNameEQUAL	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
=	TokenNameEQUAL	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Notify allocators that they can free arrays allocated * on behalf of this FacetArrays object. */	TokenNameCOMMENT_JAVADOC	 Notify allocators that they can free arrays allocated on behalf of this FacetArrays object. 
public	TokenNamepublic	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should give up handle to the array now 	TokenNameCOMMENT_LINE	Should give up handle to the array now 
// that it is freed. 	TokenNameCOMMENT_LINE	that it is freed. 
intArray	TokenNameIdentifier	 int Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
floatArray	TokenNameIdentifier	 float Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should give up handle to the array now 	TokenNameCOMMENT_LINE	Should give up handle to the array now 
// that it is freed. 	TokenNameCOMMENT_LINE	that it is freed. 
floatArray	TokenNameIdentifier	 float Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arraysLength	TokenNameIdentifier	 arrays Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain an int array, e.g. for facet counting. */	TokenNameCOMMENT_JAVADOC	 Obtain an int array, e.g. for facet counting. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIntArray	TokenNameIdentifier	 get Int Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intArray	TokenNameIdentifier	 int Array
=	TokenNameEQUAL	
intArrayAllocator	TokenNameIdentifier	 int Array Allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arraysLength	TokenNameIdentifier	 arrays Length
=	TokenNameEQUAL	
intArray	TokenNameIdentifier	 int Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
intArray	TokenNameIdentifier	 int Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Obtain a float array, e.g. for evaluating facet association values. */	TokenNameCOMMENT_JAVADOC	 Obtain a float array, e.g. for evaluating facet association values. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFloatArray	TokenNameIdentifier	 get Float Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
floatArray	TokenNameIdentifier	 float Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
floatArray	TokenNameIdentifier	 float Array
=	TokenNameEQUAL	
floatArrayAllocator	TokenNameIdentifier	 float Array Allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arraysLength	TokenNameIdentifier	 arrays Length
=	TokenNameEQUAL	
floatArray	TokenNameIdentifier	 float Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
floatArray	TokenNameIdentifier	 float Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the arrays length */	TokenNameCOMMENT_JAVADOC	 Return the arrays length 
public	TokenNamepublic	
int	TokenNameint	
getArraysLength	TokenNameIdentifier	 get Arrays Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arraysLength	TokenNameIdentifier	 arrays Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

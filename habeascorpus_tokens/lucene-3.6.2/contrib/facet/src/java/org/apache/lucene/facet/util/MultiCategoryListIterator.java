package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Iterates over multiple {@link CategoryListIterator}s, consuming the provided * iterators in order. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Iterates over multiple {@link CategoryListIterator}s, consuming the provided iterators in order. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
MultiCategoryListIterator	TokenNameIdentifier	 Multi Category List Iterator
implements	TokenNameimplements	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
iterators	TokenNameIdentifier	 iterators
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
>	TokenNameGREATER	
validIterators	TokenNameIdentifier	 valid Iterators
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
>	TokenNameGREATER	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
;	TokenNameSEMICOLON	
/** Receives the iterators to iterate on */	TokenNameCOMMENT_JAVADOC	 Receives the iterators to iterate on 
public	TokenNamepublic	
MultiCategoryListIterator	TokenNameIdentifier	 Multi Category List Iterator
(	TokenNameLPAREN	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
...	TokenNameELLIPSIS	
iterators	TokenNameIdentifier	 iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
=	TokenNameEQUAL	
iterators	TokenNameIdentifier	 iterators
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
validIterators	TokenNameIdentifier	 valid Iterators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fails if all given iterators fail to init */	TokenNameCOMMENT_JAVADOC	 Fails if all given iterators fail to init 
public	TokenNamepublic	
boolean	TokenNameboolean	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
cli	TokenNameIdentifier	 cli
:	TokenNameCOLON	
iterators	TokenNameIdentifier	 iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validIterators	TokenNameIdentifier	 valid Iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
validIterators	TokenNameIdentifier	 valid Iterators
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a value larger than {@link Integer#MAX_VALUE} only if all * iterators are exhausted */	TokenNameCOMMENT_JAVADOC	 Return a value larger than {@link Integer#MAX_VALUE} only if all iterators are exhausted 
public	TokenNamepublic	
long	TokenNamelong	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0x100000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fails only if skipTo on all the provided iterators returned {@code false} */	TokenNameCOMMENT_JAVADOC	 Fails only if skipTo on all the provided iterators returned {@code false} 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
cli	TokenNameIdentifier	 cli
:	TokenNameCOLON	
validIterators	TokenNameIdentifier	 valid Iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
perDocValidIterators	TokenNameIdentifier	 per Doc Valid Iterators
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

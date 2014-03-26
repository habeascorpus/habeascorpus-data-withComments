package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Abstract decorator class for a DocIdSet implementation * that provides on-demand filtering/validation * mechanism on a given DocIdSet. * * <p/> * * Technically, this same functionality could be achieved * with ChainedFilter (under contrib/misc), however the * benefit of this class is it never materializes the full * bitset for the filter. Instead, the {@link #match} * method is invoked on-demand, per docID visited during * searching. If you know few docIDs will be visited, and * the logic behind {@link #match} is relatively costly, * this may be a better way to filter than ChainedFilter. * * @see DocIdSet */	TokenNameCOMMENT_JAVADOC	 Abstract decorator class for a DocIdSet implementation that provides on-demand filtering/validation mechanism on a given DocIdSet. * <p/> * Technically, this same functionality could be achieved with ChainedFilter (under contrib/misc), however the benefit of this class is it never materializes the full bitset for the filter. Instead, the {@link #match} method is invoked on-demand, per docID visited during searching. If you know few docIDs will be visited, and the logic behind {@link #match} is relatively costly, this may be a better way to filter than ChainedFilter. * @see DocIdSet 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
extends	TokenNameextends	
DocIdSet	TokenNameIdentifier	 Doc Id Set
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
_innerSet	TokenNameIdentifier	 inner Set
;	TokenNameSEMICOLON	
/** * Constructor. * @param innerSet Underlying DocIdSet */	TokenNameCOMMENT_JAVADOC	 Constructor. @param innerSet Underlying DocIdSet 
public	TokenNamepublic	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
(	TokenNameLPAREN	
DocIdSet	TokenNameIdentifier	 Doc Id Set
innerSet	TokenNameIdentifier	 inner Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_innerSet	TokenNameIdentifier	 inner Set
=	TokenNameEQUAL	
innerSet	TokenNameIdentifier	 inner Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This DocIdSet implementation is cacheable if the inner set is cacheable. */	TokenNameCOMMENT_JAVADOC	 This DocIdSet implementation is cacheable if the inner set is cacheable. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_innerSet	TokenNameIdentifier	 inner Set
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validation method to determine whether a docid should be in the result set. * @param docid docid to be tested * @return true if input docid should be in the result set, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Validation method to determine whether a docid should be in the result set. @param docid docid to be tested @return true if input docid should be in the result set, false otherwise. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Implementation of the contract to build a DocIdSetIterator. * @see DocIdSetIterator * @see FilteredDocIdSetIterator */	TokenNameCOMMENT_JAVADOC	 Implementation of the contract to build a DocIdSetIterator. @see DocIdSetIterator @see FilteredDocIdSetIterator 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
_innerSet	TokenNameIdentifier	 inner Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FilteredDocIdSetIterator	TokenNameIdentifier	 Filtered Doc Id Set Iterator
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

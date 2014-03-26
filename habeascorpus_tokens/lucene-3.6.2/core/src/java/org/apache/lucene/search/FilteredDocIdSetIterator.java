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
/** * Abstract decorator class of a DocIdSetIterator * implementation that provides on-demand filter/validation * mechanism on an underlying DocIdSetIterator. See {@link * FilteredDocIdSet}. */	TokenNameCOMMENT_JAVADOC	 Abstract decorator class of a DocIdSetIterator implementation that provides on-demand filter/validation mechanism on an underlying DocIdSetIterator. See {@link FilteredDocIdSet}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FilteredDocIdSetIterator	TokenNameIdentifier	 Filtered Doc Id Set Iterator
extends	TokenNameextends	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
{	TokenNameLBRACE	
protected	TokenNameprotected	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
_innerIter	TokenNameIdentifier	 inner Iter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
/** * Constructor. * @param innerIter Underlying DocIdSetIterator. */	TokenNameCOMMENT_JAVADOC	 Constructor. @param innerIter Underlying DocIdSetIterator. 
public	TokenNamepublic	
FilteredDocIdSetIterator	TokenNameIdentifier	 Filtered Doc Id Set Iterator
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
innerIter	TokenNameIdentifier	 inner Iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
innerIter	TokenNameIdentifier	 inner Iter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"null iterator"	TokenNameStringLiteral	null iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_innerIter	TokenNameIdentifier	 inner Iter
=	TokenNameEQUAL	
innerIter	TokenNameIdentifier	 inner Iter
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validation method to determine whether a docid should be in the result set. * @param doc docid to be tested * @return true if input docid should be in the result set, false otherwise. * @see #FilteredDocIdSetIterator(DocIdSetIterator) */	TokenNameCOMMENT_JAVADOC	 Validation method to determine whether a docid should be in the result set. @param doc docid to be tested @return true if input docid should be in the result set, false otherwise. @see #FilteredDocIdSetIterator(DocIdSetIterator) 
abstract	TokenNameabstract	
protected	TokenNameprotected	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
_innerIter	TokenNameIdentifier	 inner Iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
_innerIter	TokenNameIdentifier	 inner Iter
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
_innerIter	TokenNameIdentifier	 inner Iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

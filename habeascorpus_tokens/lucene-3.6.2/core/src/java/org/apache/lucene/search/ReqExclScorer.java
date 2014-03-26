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
/** A Scorer for queries with a required subscorer * and an excluding (prohibited) sub DocIdSetIterator. * <br> * This <code>Scorer</code> implements {@link Scorer#skipTo(int)}, * and it uses the skipTo() on the given scorers. */	TokenNameCOMMENT_JAVADOC	 A Scorer for queries with a required subscorer and an excluding (prohibited) sub DocIdSetIterator. <br> This <code>Scorer</code> implements {@link Scorer#skipTo(int)}, and it uses the skipTo() on the given scorers. 
class	TokenNameclass	
ReqExclScorer	TokenNameIdentifier	 Req Excl Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
reqScorer	TokenNameIdentifier	 req Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
exclDisi	TokenNameIdentifier	 excl Disi
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Construct a <code>ReqExclScorer</code>. * @param reqScorer The scorer that must match, except where * @param exclDisi indicates exclusion. */	TokenNameCOMMENT_JAVADOC	 Construct a <code>ReqExclScorer</code>. @param reqScorer The scorer that must match, except where @param exclDisi indicates exclusion. 
public	TokenNamepublic	
ReqExclScorer	TokenNameIdentifier	 Req Excl Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
reqScorer	TokenNameIdentifier	 req Scorer
,	TokenNameCOMMA	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
exclDisi	TokenNameIdentifier	 excl Disi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reqScorer	TokenNameIdentifier	 req Scorer
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exclDisi	TokenNameIdentifier	 excl Disi
=	TokenNameEQUAL	
exclDisi	TokenNameIdentifier	 excl Disi
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
if	TokenNameif	
(	TokenNameLPAREN	
reqScorer	TokenNameIdentifier	 req Scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reqScorer	TokenNameIdentifier	 req Scorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// exhausted, nothing left 	TokenNameCOMMENT_LINE	exhausted, nothing left 
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exclDisi	TokenNameIdentifier	 excl Disi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
toNonExcluded	TokenNameIdentifier	 to Non Excluded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Advance to non excluded doc. * <br>On entry: * <ul> * <li>reqScorer != null, * <li>exclScorer != null, * <li>reqScorer was advanced once via next() or skipTo() * and reqScorer.doc() may still be excluded. * </ul> * Advances reqScorer a non excluded required doc, if any. * @return true iff there is a non excluded required doc. */	TokenNameCOMMENT_JAVADOC	 Advance to non excluded doc. <br>On entry: <ul> <li>reqScorer != null, <li>exclScorer != null, <li>reqScorer was advanced once via next() or skipTo() and reqScorer.doc() may still be excluded. </ul> Advances reqScorer a non excluded required doc, if any. @return true iff there is a non excluded required doc. 
private	TokenNameprivate	
int	TokenNameint	
toNonExcluded	TokenNameIdentifier	 to Non Excluded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
exclDoc	TokenNameIdentifier	 excl Doc
=	TokenNameEQUAL	
exclDisi	TokenNameIdentifier	 excl Disi
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
reqDoc	TokenNameIdentifier	 req Doc
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may be excluded 	TokenNameCOMMENT_LINE	may be excluded 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reqDoc	TokenNameIdentifier	 req Doc
<	TokenNameLESS	
exclDoc	TokenNameIdentifier	 excl Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reqDoc	TokenNameIdentifier	 req Doc
;	TokenNameSEMICOLON	
// reqScorer advanced to before exclScorer, ie. not excluded 	TokenNameCOMMENT_LINE	reqScorer advanced to before exclScorer, ie. not excluded 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
reqDoc	TokenNameIdentifier	 req Doc
>	TokenNameGREATER	
exclDoc	TokenNameIdentifier	 excl Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exclDoc	TokenNameIdentifier	 excl Doc
=	TokenNameEQUAL	
exclDisi	TokenNameIdentifier	 excl Disi
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
reqDoc	TokenNameIdentifier	 req Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exclDoc	TokenNameIdentifier	 excl Doc
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exclDisi	TokenNameIdentifier	 excl Disi
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// exhausted, no more exclusions 	TokenNameCOMMENT_LINE	exhausted, no more exclusions 
return	TokenNamereturn	
reqDoc	TokenNameIdentifier	 req Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exclDoc	TokenNameIdentifier	 excl Doc
>	TokenNameGREATER	
reqDoc	TokenNameIdentifier	 req Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reqDoc	TokenNameIdentifier	 req Doc
;	TokenNameSEMICOLON	
// not excluded 	TokenNameCOMMENT_LINE	not excluded 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
reqDoc	TokenNameIdentifier	 req Doc
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reqScorer	TokenNameIdentifier	 req Scorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// exhausted, nothing left 	TokenNameCOMMENT_LINE	exhausted, nothing left 
return	TokenNamereturn	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** Returns the score of the current document matching the query. * Initially invalid, until {@link #nextDoc()} is called the first time. * @return The score of the required scorer. */	TokenNameCOMMENT_JAVADOC	 Returns the score of the current document matching the query. Initially invalid, until {@link #nextDoc()} is called the first time. @return The score of the required scorer. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reqScorer may be null when next() or skipTo() already return false 	TokenNameCOMMENT_LINE	reqScorer may be null when next() or skipTo() already return false 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
reqScorer	TokenNameIdentifier	 req Scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exclDisi	TokenNameIdentifier	 excl Disi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reqScorer	TokenNameIdentifier	 req Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reqScorer	TokenNameIdentifier	 req Scorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
toNonExcluded	TokenNameIdentifier	 to Non Excluded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

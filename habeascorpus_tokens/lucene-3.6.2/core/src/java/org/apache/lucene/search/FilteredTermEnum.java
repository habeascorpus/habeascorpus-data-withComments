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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermEnum	TokenNameIdentifier	 Term Enum
;	TokenNameSEMICOLON	
/** Abstract class for enumerating a subset of all terms. <p>Term enumerations are always ordered by Term.compareTo(). Each term in the enumeration is greater than all that precede it. */	TokenNameCOMMENT_JAVADOC	 Abstract class for enumerating a subset of all terms. <p>Term enumerations are always ordered by Term.compareTo(). Each term in the enumeration is greater than all that precede it. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
extends	TokenNameextends	
TermEnum	TokenNameIdentifier	 Term Enum
{	TokenNameLBRACE	
/** the current term */	TokenNameCOMMENT_JAVADOC	 the current term 
protected	TokenNameprotected	
Term	TokenNameIdentifier	 Term
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the delegate enum - to set this member use {@link #setEnum} */	TokenNameCOMMENT_JAVADOC	 the delegate enum - to set this member use {@link #setEnum} 
protected	TokenNameprotected	
TermEnum	TokenNameIdentifier	 Term Enum
actualEnum	TokenNameIdentifier	 actual Enum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Equality compare on the term */	TokenNameCOMMENT_JAVADOC	 Equality compare on the term 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Equality measure on the term */	TokenNameCOMMENT_JAVADOC	 Equality measure on the term 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indicates the end of the enumeration has been reached */	TokenNameCOMMENT_JAVADOC	 Indicates the end of the enumeration has been reached 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * use this method to set the actual TermEnum (e.g. in ctor), * it will be automatically positioned on the first matching term. */	TokenNameCOMMENT_JAVADOC	 use this method to set the actual TermEnum (e.g. in ctor), it will be automatically positioned on the first matching term. 
protected	TokenNameprotected	
void	TokenNamevoid	
setEnum	TokenNameIdentifier	 set Enum
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
actualEnum	TokenNameIdentifier	 actual Enum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
actualEnum	TokenNameIdentifier	 actual Enum
=	TokenNameEQUAL	
actualEnum	TokenNameIdentifier	 actual Enum
;	TokenNameSEMICOLON	
// Find the first term that matches 	TokenNameCOMMENT_LINE	Find the first term that matches 
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
else	TokenNameelse	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the docFreq of the current Term in the enumeration. * Returns -1 if no Term matches or all terms have been enumerated. */	TokenNameCOMMENT_JAVADOC	 Returns the docFreq of the current Term in the enumeration. Returns -1 if no Term matches or all terms have been enumerated. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
actualEnum	TokenNameIdentifier	 actual Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Increments the enumeration to the next element. True if one exists. */	TokenNameCOMMENT_JAVADOC	 Increments the enumeration to the next element. True if one exists. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// the actual enumerator is not initialized! 	TokenNameCOMMENT_LINE	the actual enumerator is not initialized! 
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current Term in the enumeration. * Returns null if no Term matches or all terms have been enumerated. */	TokenNameCOMMENT_JAVADOC	 Returns the current Term in the enumeration. Returns null if no Term matches or all terms have been enumerated. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentTerm	TokenNameIdentifier	 current Term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Closes the enumeration to further activity, freeing resources. */	TokenNameCOMMENT_JAVADOC	 Closes the enumeration to further activity, freeing resources. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
actualEnum	TokenNameIdentifier	 actual Enum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

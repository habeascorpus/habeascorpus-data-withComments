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
IndexReader	TokenNameIdentifier	 Index Reader
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
/** Subclass of FilteredTermEnum for enumerating all terms that are similar * to the specified filter term. * * <p>Term enumerations are always ordered by Term.compareTo(). Each term in * the enumeration is greater than all that precede it. */	TokenNameCOMMENT_JAVADOC	 Subclass of FilteredTermEnum for enumerating all terms that are similar to the specified filter term. * <p>Term enumerations are always ordered by Term.compareTo(). Each term in the enumeration is greater than all that precede it. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
extends	TokenNameextends	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
{	TokenNameLBRACE	
/* Allows us save time required to create a new array * every time similarity is called. */	TokenNameCOMMENT_BLOCK	 Allows us save time required to create a new array every time similarity is called. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
scale_factor	TokenNameIdentifier	 scale factor
;	TokenNameSEMICOLON	
/** * Creates a FuzzyTermEnum with an empty prefix and a minSimilarity of 0.5f. * <p> * After calling the constructor the enumeration is already pointing to the first * valid term if such a term exists. * * @param reader * @param term * @throws IOException * @see #FuzzyTermEnum(IndexReader, Term, float, int) */	TokenNameCOMMENT_JAVADOC	 Creates a FuzzyTermEnum with an empty prefix and a minSimilarity of 0.5f. <p> After calling the constructor the enumeration is already pointing to the first valid term if such a term exists. * @param reader @param term @throws IOException @see #FuzzyTermEnum(IndexReader, Term, float, int) 
public	TokenNamepublic	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
.	TokenNameDOT	
defaultMinSimilarity	TokenNameIdentifier	 default Min Similarity
,	TokenNameCOMMA	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
.	TokenNameDOT	
defaultPrefixLength	TokenNameIdentifier	 default Prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a FuzzyTermEnum with an empty prefix. * <p> * After calling the constructor the enumeration is already pointing to the first * valid term if such a term exists. * * @param reader * @param term * @param minSimilarity * @throws IOException * @see #FuzzyTermEnum(IndexReader, Term, float, int) */	TokenNameCOMMENT_JAVADOC	 Creates a FuzzyTermEnum with an empty prefix. <p> After calling the constructor the enumeration is already pointing to the first valid term if such a term exists. * @param reader @param term @param minSimilarity @throws IOException @see #FuzzyTermEnum(IndexReader, Term, float, int) 
public	TokenNamepublic	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
minSimilarity	TokenNameIdentifier	 min Similarity
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
minSimilarity	TokenNameIdentifier	 min Similarity
,	TokenNameCOMMA	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
.	TokenNameDOT	
defaultPrefixLength	TokenNameIdentifier	 default Prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for enumeration of all terms from specified <code>reader</code> which share a prefix of * length <code>prefixLength</code> with <code>term</code> and which have a fuzzy similarity &gt; * <code>minSimilarity</code>. * <p> * After calling the constructor the enumeration is already pointing to the first * valid term if such a term exists. * * @param reader Delivers terms. * @param term Pattern term. * @param minSimilarity Minimum required similarity for terms from the reader. Default value is 0.5f. * @param prefixLength Length of required common prefix. Default value is 0. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Constructor for enumeration of all terms from specified <code>reader</code> which share a prefix of length <code>prefixLength</code> with <code>term</code> and which have a fuzzy similarity &gt; <code>minSimilarity</code>. <p> After calling the constructor the enumeration is already pointing to the first valid term if such a term exists. * @param reader Delivers terms. @param term Pattern term. @param minSimilarity Minimum required similarity for terms from the reader. Default value is 0.5f. @param prefixLength Length of required common prefix. Default value is 0. @throws IOException 
public	TokenNamepublic	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
minSimilarity	TokenNameIdentifier	 min Similarity
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minSimilarity	TokenNameIdentifier	 min Similarity
>=	TokenNameGREATER_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minimumSimilarity cannot be greater than or equal to 1"	TokenNameStringLiteral	minimumSimilarity cannot be greater than or equal to 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minSimilarity	TokenNameIdentifier	 min Similarity
<	TokenNameLESS	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minimumSimilarity cannot be less than 0"	TokenNameStringLiteral	minimumSimilarity cannot be less than 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"prefixLength cannot be less than 0"	TokenNameStringLiteral	prefixLength cannot be less than 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
=	TokenNameEQUAL	
minSimilarity	TokenNameIdentifier	 min Similarity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scale_factor	TokenNameIdentifier	 scale factor
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//The prefix could be longer than the word. 	TokenNameCOMMENT_LINE	The prefix could be longer than the word. 
//It's kind of silly though. It means we must match the entire word. 	TokenNameCOMMENT_LINE	It's kind of silly though. It means we must match the entire word. 
final	TokenNamefinal	
int	TokenNameint	
fullSearchTermLength	TokenNameIdentifier	 full Search Term Length
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
realPrefixLength	TokenNameIdentifier	 real Prefix Length
=	TokenNameEQUAL	
prefixLength	TokenNameIdentifier	 prefix Length
>	TokenNameGREATER	
fullSearchTermLength	TokenNameIdentifier	 full Search Term Length
?	TokenNameQUESTION	
fullSearchTermLength	TokenNameIdentifier	 full Search Term Length
:	TokenNameCOLON	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
realPrefixLength	TokenNameIdentifier	 real Prefix Length
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
realPrefixLength	TokenNameIdentifier	 real Prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
setEnum	TokenNameIdentifier	 set Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The termCompare method in FuzzyTermEnum uses Levenshtein distance to * calculate the distance between the given term and the comparing term. */	TokenNameCOMMENT_JAVADOC	 The termCompare method in FuzzyTermEnum uses Levenshtein distance to calculate the distance between the given term and the comparing term. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
>	TokenNameGREATER	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
-	TokenNameMINUS	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scale_factor	TokenNameIdentifier	 scale factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endEnum	TokenNameIdentifier	 end Enum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/****************************** * Compute Levenshtein distance ******************************/	TokenNameCOMMENT_JAVADOC	**************************** Compute Levenshtein distance *****************************
/** * <p>Similarity returns a number that is 1.0f or less (including negative numbers) * based on how similar the Term is compared to a target term. It returns * exactly 0.0f when * <pre> * editDistance &gt; maximumEditDistance</pre> * Otherwise it returns: * <pre> * 1 - (editDistance / length)</pre> * where length is the length of the shortest term (text or target) including a * prefix that are identical and editDistance is the Levenshtein distance for * the two words.</p> * * <p>Embedded within this algorithm is a fail-fast Levenshtein distance * algorithm. The fail-fast algorithm differs from the standard Levenshtein * distance algorithm in that it is aborted if it is discovered that the * minimum distance between the words is greater than some threshold. * * <p>To calculate the maximum distance threshold we use the following formula: * <pre> * (1 - minimumSimilarity) * length</pre> * where length is the shortest term including any prefix that is not part of the * similarity comparison. This formula was derived by solving for what maximum value * of distance returns false for the following statements: * <pre> * similarity = 1 - ((float)distance / (float) (prefixLength + Math.min(textlen, targetlen))); * return (similarity > minimumSimilarity);</pre> * where distance is the Levenshtein distance for the two words. * </p> * <p>Levenshtein distance (also known as edit distance) is a measure of similarity * between two strings where the distance is measured as the number of character * deletions, insertions or substitutions required to transform one string to * the other string. * @param target the target word or phrase * @return the similarity, 0.0 or less indicates that it matches less than the required * threshold and 1.0 indicates that the text and target are identical */	TokenNameCOMMENT_JAVADOC	 <p>Similarity returns a number that is 1.0f or less (including negative numbers) based on how similar the Term is compared to a target term. It returns exactly 0.0f when <pre> editDistance &gt; maximumEditDistance</pre> Otherwise it returns: <pre> 1 - (editDistance / length)</pre> where length is the length of the shortest term (text or target) including a prefix that are identical and editDistance is the Levenshtein distance for the two words.</p> * <p>Embedded within this algorithm is a fail-fast Levenshtein distance algorithm. The fail-fast algorithm differs from the standard Levenshtein distance algorithm in that it is aborted if it is discovered that the minimum distance between the words is greater than some threshold. * <p>To calculate the maximum distance threshold we use the following formula: <pre> (1 - minimumSimilarity) length</pre> where length is the shortest term including any prefix that is not part of the similarity comparison. This formula was derived by solving for what maximum value of distance returns false for the following statements: <pre> similarity = 1 - ((float)distance / (float) (prefixLength + Math.min(textlen, targetlen))); return (similarity > minimumSimilarity);</pre> where distance is the Levenshtein distance for the two words. </p> <p>Levenshtein distance (also known as edit distance) is a measure of similarity between two strings where the distance is measured as the number of character deletions, insertions or substitutions required to transform one string to the other string. @param target the target word or phrase @return the similarity, 0.0 or less indicates that it matches less than the required threshold and 1.0 indicates that the text and target are identical 
private	TokenNameprivate	
float	TokenNamefloat	
similarity	TokenNameIdentifier	 similarity
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we don't have anything to compare. That means if we just add 	TokenNameCOMMENT_LINE	we don't have anything to compare. That means if we just add 
//the letters for m we get the new word 	TokenNameCOMMENT_LINE	the letters for m we get the new word 
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
/	TokenNameDIVIDE	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDistance	TokenNameIdentifier	 max Distance
=	TokenNameEQUAL	
calculateMaxDistance	TokenNameIdentifier	 calculate Max Distance
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxDistance	TokenNameIdentifier	 max Distance
<	TokenNameLESS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//just adding the characters of m to n or vice-versa results in 	TokenNameCOMMENT_LINE	just adding the characters of m to n or vice-versa results in 
//too many edits 	TokenNameCOMMENT_LINE	too many edits 
//for example "pre" length is 3 and "prefixes" length is 8. We can see that 	TokenNameCOMMENT_LINE	for example "pre" length is 3 and "prefixes" length is 8. We can see that 
//given this optimal circumstance, the edit distance cannot be less than 5. 	TokenNameCOMMENT_LINE	given this optimal circumstance, the edit distance cannot be less than 5. 
//which is 8-3 or more precisely Math.abs(3-8). 	TokenNameCOMMENT_LINE	which is 8-3 or more precisely Math.abs(3-8). 
//if our maximum edit distance is 4, then we can discard this word 	TokenNameCOMMENT_LINE	if our maximum edit distance is 4, then we can discard this word 
//without looking at it. 	TokenNameCOMMENT_LINE	without looking at it. 
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init matrix d 	TokenNameCOMMENT_LINE	init matrix d 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// start computing edit distance 	TokenNameCOMMENT_LINE	start computing edit distance 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterates through target 	TokenNameCOMMENT_LINE	iterates through target 
int	TokenNameint	
bestPossibleEditDistance	TokenNameIdentifier	 best Possible Edit Distance
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
t_j	TokenNameIdentifier	 t j
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jth character of t 	TokenNameCOMMENT_LINE	jth character of t 
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterates through text 	TokenNameCOMMENT_LINE	iterates through text 
// minimum of cell to the left+1, to the top+1, diagonally left and up +(0|1) 	TokenNameCOMMENT_LINE	minimum of cell to the left+1, to the top+1, diagonally left and up +(0|1) 
if	TokenNameif	
(	TokenNameLPAREN	
t_j	TokenNameIdentifier	 t j
!=	TokenNameNOT_EQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bestPossibleEditDistance	TokenNameIdentifier	 best Possible Edit Distance
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
bestPossibleEditDistance	TokenNameIdentifier	 best Possible Edit Distance
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//After calculating row i, the best possible edit distance 	TokenNameCOMMENT_LINE	After calculating row i, the best possible edit distance 
//can be found by found by finding the smallest value in a given column. 	TokenNameCOMMENT_LINE	can be found by found by finding the smallest value in a given column. 
//If the bestPossibleEditDistance is greater than the max distance, abort. 	TokenNameCOMMENT_LINE	If the bestPossibleEditDistance is greater than the max distance, abort. 
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
maxDistance	TokenNameIdentifier	 max Distance
&&	TokenNameAND_AND	
bestPossibleEditDistance	TokenNameIdentifier	 best Possible Edit Distance
>	TokenNameGREATER	
maxDistance	TokenNameIdentifier	 max Distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//equal is okay, but not greater 	TokenNameCOMMENT_LINE	equal is okay, but not greater 
//the closest the target can be to the text is just too far away. 	TokenNameCOMMENT_LINE	the closest the target can be to the text is just too far away. 
//this target is leaving the party early. 	TokenNameCOMMENT_LINE	this target is leaving the party early. 
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// copy current distance counts to 'previous row' distance counts: swap p and d 	TokenNameCOMMENT_LINE	copy current distance counts to 'previous row' distance counts: swap p and d 
int	TokenNameint	
_d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
_d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// our last action in the above loop was to switch d and p, so p now 	TokenNameCOMMENT_LINE	our last action in the above loop was to switch d and p, so p now 
// actually has the most recent cost counts 	TokenNameCOMMENT_LINE	actually has the most recent cost counts 
// this will return less than 0.0 when the edit distance is 	TokenNameCOMMENT_LINE	this will return less than 0.0 when the edit distance is 
// greater than the number of characters in the shorter word. 	TokenNameCOMMENT_LINE	greater than the number of characters in the shorter word. 
// but this was the formula that was previously used in FuzzyTermEnum, 	TokenNameCOMMENT_LINE	but this was the formula that was previously used in FuzzyTermEnum, 
// so it has not been changed (even though minimumSimilarity must be 	TokenNameCOMMENT_LINE	so it has not been changed (even though minimumSimilarity must be 
// greater than 0.0) 	TokenNameCOMMENT_LINE	greater than 0.0) 
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The max Distance is the maximum Levenshtein distance for the text * compared to some other value that results in score that is * better than the minimum similarity. * @param m the length of the "other value" * @return the maximum levenshtein distance that we care about */	TokenNameCOMMENT_JAVADOC	 The max Distance is the maximum Levenshtein distance for the text compared to some other value that results in score that is better than the minimum similarity. @param m the length of the "other value" @return the maximum levenshtein distance that we care about 
private	TokenNameprivate	
int	TokenNameint	
calculateMaxDistance	TokenNameIdentifier	 calculate Max Distance
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
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
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//call super.close() and let the garbage collector do its work. 	TokenNameCOMMENT_LINE	call super.close() and let the garbage collector do its work. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

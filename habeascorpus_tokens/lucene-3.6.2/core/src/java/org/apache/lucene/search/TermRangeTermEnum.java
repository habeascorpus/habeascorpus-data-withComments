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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringHelper	TokenNameIdentifier	 String Helper
;	TokenNameSEMICOLON	
/** * Subclass of FilteredTermEnum for enumerating all terms that match the * specified range parameters. * <p> * Term enumerations are always ordered by Term.compareTo(). Each term in * the enumeration is greater than all that precede it. * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 Subclass of FilteredTermEnum for enumerating all terms that match the specified range parameters. <p> Term enumerations are always ordered by Term.compareTo(). Each term in the enumeration is greater than all that precede it. @since 2.9 
public	TokenNamepublic	
class	TokenNameclass	
TermRangeTermEnum	TokenNameIdentifier	 Term Range Term Enum
extends	TokenNameextends	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
{	TokenNameLBRACE	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
upperTermText	TokenNameIdentifier	 upper Term Text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lowerTermText	TokenNameIdentifier	 lower Term Text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
/** * Enumerates all terms greater/equal than <code>lowerTerm</code> * but less/equal than <code>upperTerm</code>. * * If an endpoint is null, it is said to be "open". Either or both * endpoints may be open. Open endpoints may not be exclusive * (you can't select all but the first or last term without * explicitly specifying the term to exclude.) * * @param reader * @param field * An interned field that holds both lower and upper terms. * @param lowerTermText * The term text at the lower end of the range * @param upperTermText * The term text at the upper end of the range * @param includeLower * If true, the <code>lowerTerm</code> is included in the range. * @param includeUpper * If true, the <code>upperTerm</code> is included in the range. * @param collator * The collator to use to collate index Terms, to determine their * membership in the range bounded by <code>lowerTerm</code> and * <code>upperTerm</code>. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Enumerates all terms greater/equal than <code>lowerTerm</code> but less/equal than <code>upperTerm</code>. * If an endpoint is null, it is said to be "open". Either or both endpoints may be open. Open endpoints may not be exclusive (you can't select all but the first or last term without explicitly specifying the term to exclude.) * @param reader @param field An interned field that holds both lower and upper terms. @param lowerTermText The term text at the lower end of the range @param upperTermText The term text at the upper end of the range @param includeLower If true, the <code>lowerTerm</code> is included in the range. @param includeUpper If true, the <code>upperTerm</code> is included in the range. @param collator The collator to use to collate index Terms, to determine their membership in the range bounded by <code>lowerTerm</code> and <code>upperTerm</code>. * @throws IOException 
public	TokenNamepublic	
TermRangeTermEnum	TokenNameIdentifier	 Term Range Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerTermText	TokenNameIdentifier	 lower Term Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperTermText	TokenNameIdentifier	 upper Term Text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
,	TokenNameCOMMA	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
upperTermText	TokenNameIdentifier	 upper Term Text
=	TokenNameEQUAL	
upperTermText	TokenNameIdentifier	 upper Term Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lowerTermText	TokenNameIdentifier	 lower Term Text
=	TokenNameEQUAL	
lowerTermText	TokenNameIdentifier	 lower Term Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
=	TokenNameEQUAL	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
=	TokenNameEQUAL	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do a little bit of normalization... 	TokenNameCOMMENT_LINE	do a little bit of normalization... 
// open ended range queries should always be inclusive. 	TokenNameCOMMENT_LINE	open ended range queries should always be inclusive. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lowerTermText	TokenNameIdentifier	 lower Term Text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lowerTermText	TokenNameIdentifier	 lower Term Text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
upperTermText	TokenNameIdentifier	 upper Term Text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
startTermText	TokenNameIdentifier	 start Term Text
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
lowerTermText	TokenNameIdentifier	 lower Term Text
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
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
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
startTermText	TokenNameIdentifier	 start Term Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endEnum	TokenNameIdentifier	 end Enum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use Unicode code point ordering 	TokenNameCOMMENT_LINE	Use Unicode code point ordering 
boolean	TokenNameboolean	
checkLower	TokenNameIdentifier	 check Lower
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeLower	TokenNameIdentifier	 include Lower
)	TokenNameRPAREN	
// make adjustments to set to exclusive 	TokenNameCOMMENT_LINE	make adjustments to set to exclusive 
checkLower	TokenNameIdentifier	 check Lower
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// interned comparison 	TokenNameCOMMENT_LINE	interned comparison 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkLower	TokenNameIdentifier	 check Lower
||	TokenNameOR_OR	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
lowerTermText	TokenNameIdentifier	 lower Term Text
||	TokenNameOR_OR	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
lowerTermText	TokenNameIdentifier	 lower Term Text
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkLower	TokenNameIdentifier	 check Lower
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperTermText	TokenNameIdentifier	 upper Term Text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
=	TokenNameEQUAL	
upperTermText	TokenNameIdentifier	 upper Term Text
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if beyond the upper term, or is exclusive and this is equal to * the upper term, break out */	TokenNameCOMMENT_BLOCK	 if beyond the upper term, or is exclusive and this is equal to the upper term, break out 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
compare	TokenNameIdentifier	 compare
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// break 	TokenNameCOMMENT_LINE	break 
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// interned comparison 	TokenNameCOMMENT_LINE	interned comparison 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lowerTermText	TokenNameIdentifier	 lower Term Text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerTermText	TokenNameIdentifier	 lower Term Text
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerTermText	TokenNameIdentifier	 lower Term Text
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
upperTermText	TokenNameIdentifier	 upper Term Text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upperTermText	TokenNameIdentifier	 upper Term Text
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upperTermText	TokenNameIdentifier	 upper Term Text
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	

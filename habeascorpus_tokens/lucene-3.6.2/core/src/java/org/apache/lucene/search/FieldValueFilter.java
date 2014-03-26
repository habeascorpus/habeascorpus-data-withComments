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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Bits	TokenNameIdentifier	 Bits
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
Bits	TokenNameIdentifier	 Bits
.	TokenNameDOT	
MatchAllBits	TokenNameIdentifier	 Match All Bits
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
Bits	TokenNameIdentifier	 Bits
.	TokenNameDOT	
MatchNoBits	TokenNameIdentifier	 Match No Bits
;	TokenNameSEMICOLON	
/** * A {@link Filter} that accepts all documents that have one or more values in a * given field. This {@link Filter} request {@link Bits} from the * {@link FieldCache} and build the bits if not present. */	TokenNameCOMMENT_JAVADOC	 A {@link Filter} that accepts all documents that have one or more values in a given field. This {@link Filter} request {@link Bits} from the {@link FieldCache} and build the bits if not present. 
public	TokenNamepublic	
class	TokenNameclass	
FieldValueFilter	TokenNameIdentifier	 Field Value Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
negate	TokenNameIdentifier	 negate
;	TokenNameSEMICOLON	
/** * Creates a new {@link FieldValueFilter} * * @param field * the field to filter */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link FieldValueFilter} * @param field the field to filter 
public	TokenNamepublic	
FieldValueFilter	TokenNameIdentifier	 Field Value Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link FieldValueFilter} * * @param field * the field to filter * @param negate * iff <code>true</code> all documents with no value in the given * field are accepted. * */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link FieldValueFilter} * @param field the field to filter @param negate iff <code>true</code> all documents with no value in the given field are accepted. 
public	TokenNamepublic	
FieldValueFilter	TokenNameIdentifier	 Field Value Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
boolean	TokenNameboolean	
negate	TokenNameIdentifier	 negate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the field this filter is applied on. * @return the field this filter is applied on. */	TokenNameCOMMENT_JAVADOC	 Returns the field this filter is applied on. @return the field this filter is applied on. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> iff this filter is negated, otherwise <code>false</code> * @return <code>true</code> iff this filter is negated, otherwise <code>false</code> */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> iff this filter is negated, otherwise <code>false</code> @return <code>true</code> iff this filter is negated, otherwise <code>false</code> 
public	TokenNamepublic	
boolean	TokenNameboolean	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
negate	TokenNameIdentifier	 negate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Bits	TokenNameIdentifier	 Bits
docsWithField	TokenNameIdentifier	 docs With Field
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDocsWithField	TokenNameIdentifier	 get Docs With Field
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
negate	TokenNameIdentifier	 negate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
instanceof	TokenNameinstanceof	
MatchAllBits	TokenNameIdentifier	 Match All Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
instanceof	TokenNameinstanceof	
MatchNoBits	TokenNameIdentifier	 Match No Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
instanceof	TokenNameinstanceof	
DocIdSet	TokenNameIdentifier	 Doc Id Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// UweSays: this is always the case for our current impl - but who knows 	TokenNameCOMMENT_LINE	UweSays: this is always the case for our current impl - but who knows 
// :-) 	TokenNameCOMMENT_LINE	:-) 
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocIdSet	TokenNameIdentifier	 Doc Id Set
)	TokenNameRPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
:	TokenNameCOLON	
dis	TokenNameIdentifier	 dis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
negate	TokenNameIdentifier	 negate
?	TokenNameQUESTION	
1231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
FieldValueFilter	TokenNameIdentifier	 Field Value Filter
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldValueFilter	TokenNameIdentifier	 Field Value Filter
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
negate	TokenNameIdentifier	 negate
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"FieldValueFilter [field="	TokenNameStringLiteral	FieldValueFilter [field=
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
", negate="	TokenNameStringLiteral	, negate=
+	TokenNamePLUS	
negate	TokenNameIdentifier	 negate
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

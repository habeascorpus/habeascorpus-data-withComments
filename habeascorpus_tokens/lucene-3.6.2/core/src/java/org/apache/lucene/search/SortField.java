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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
/** * Stores information about how to sort documents by terms in an individual * field. Fields must be indexed in order to sort by them. * * <p>Created: Feb 11, 2004 1:25:29 PM * * @since lucene 1.4 * @see Sort */	TokenNameCOMMENT_JAVADOC	 Stores information about how to sort documents by terms in an individual field. Fields must be indexed in order to sort by them. * <p>Created: Feb 11, 2004 1:25:29 PM * @since lucene 1.4 @see Sort 
public	TokenNamepublic	
class	TokenNameclass	
SortField	TokenNameIdentifier	 Sort Field
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Sort by document score (relevance). Sort values are Float and higher * values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort by document score (relevance). Sort values are Float and higher values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCORE	TokenNameIdentifier	 SCORE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort by document number (index order). Sort values are Integer and lower * values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort by document number (index order). Sort values are Integer and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOC	TokenNameIdentifier	 DOC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// reserved, in Lucene 2.9, there was a constant: AUTO = 2; 	TokenNameCOMMENT_LINE	reserved, in Lucene 2.9, there was a constant: AUTO = 2; 
/** Sort using term values as Strings. Sort values are String and lower * values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as Strings. Sort values are String and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Integers. Sort values are Integer and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Integers. Sort values are Integer and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INT	TokenNameIdentifier	 INT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Floats. Sort values are Float and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Floats. Sort values are Float and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Longs. Sort values are Long and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Longs. Sort values are Long and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LONG	TokenNameIdentifier	 LONG
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Doubles. Sort values are Double and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Doubles. Sort values are Double and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOUBLE	TokenNameIdentifier	 DOUBLE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Shorts. Sort values are Short and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Shorts. Sort values are Short and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHORT	TokenNameIdentifier	 SHORT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using a custom Comparator. Sort values are any Comparable and * sorting is done according to natural order. */	TokenNameCOMMENT_JAVADOC	 Sort using a custom Comparator. Sort values are any Comparable and sorting is done according to natural order. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CUSTOM	TokenNameIdentifier	 CUSTOM
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as encoded Bytes. Sort values are Byte and * lower values are at the front. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as encoded Bytes. Sort values are Byte and lower values are at the front. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE	TokenNameIdentifier	 BYTE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Sort using term values as Strings, but comparing by * value (using String.compareTo) for all comparisons. * This is typically slower than {@link #STRING}, which * uses ordinals to do the sorting. */	TokenNameCOMMENT_JAVADOC	 Sort using term values as Strings, but comparing by value (using String.compareTo) for all comparisons. This is typically slower than {@link #STRING}, which uses ordinals to do the sorting. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING_VAL	TokenNameIdentifier	 STRING  VAL
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// IMPLEMENTATION NOTE: the FieldCache.STRING_INDEX is in the same "namespace" 	TokenNameCOMMENT_LINE	IMPLEMENTATION NOTE: the FieldCache.STRING_INDEX is in the same "namespace" 
// as the above static int values. Any new values must not have the same value 	TokenNameCOMMENT_LINE	as the above static int values. Any new values must not have the same value 
// as FieldCache.STRING_INDEX. 	TokenNameCOMMENT_LINE	as FieldCache.STRING_INDEX. 
/** Represents sorting by document score (relevance). */	TokenNameCOMMENT_JAVADOC	 Represents sorting by document score (relevance). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Represents sorting by document number (index order). */	TokenNameCOMMENT_JAVADOC	 Represents sorting by document number (index order). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
FIELD_DOC	TokenNameIdentifier	 FIELD  DOC
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
DOC	TokenNameIdentifier	 DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// defaults to determining type dynamically 	TokenNameCOMMENT_LINE	defaults to determining type dynamically 
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
// defaults to "natural order" (no Locale) 	TokenNameCOMMENT_LINE	defaults to "natural order" (no Locale) 
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// defaults to natural order 	TokenNameCOMMENT_LINE	defaults to natural order 
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
// Used for CUSTOM sort 	TokenNameCOMMENT_LINE	Used for CUSTOM sort 
private	TokenNameprivate	
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
comparatorSource	TokenNameIdentifier	 comparator Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
/** Creates a sort by terms in the given field with the type of term * values explicitly given. * @param field Name of field to sort by. Can be <code>null</code> if * <code>type</code> is SCORE or DOC. * @param type Type of values in the terms. */	TokenNameCOMMENT_JAVADOC	 Creates a sort by terms in the given field with the type of term values explicitly given. @param field Name of field to sort by. Can be <code>null</code> if <code>type</code> is SCORE or DOC. @param type Type of values in the terms. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort, possibly in reverse, by terms in the given field with the * type of term values explicitly given. * @param field Name of field to sort by. Can be <code>null</code> if * <code>type</code> is SCORE or DOC. * @param type Type of values in the terms. * @param reverse True if natural order should be reversed. */	TokenNameCOMMENT_JAVADOC	 Creates a sort, possibly in reverse, by terms in the given field with the type of term values explicitly given. @param field Name of field to sort by. Can be <code>null</code> if <code>type</code> is SCORE or DOC. @param type Type of values in the terms. @param reverse True if natural order should be reversed. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort by terms in the given field, parsed * to numeric values using a custom {@link FieldCache.Parser}. * @param field Name of field to sort by. Must not be null. * @param parser Instance of a {@link FieldCache.Parser}, * which must subclass one of the existing numeric * parsers from {@link FieldCache}. Sort type is inferred * by testing which numeric parser the parser subclasses. * @throws IllegalArgumentException if the parser fails to * subclass an existing numeric parser, or field is null */	TokenNameCOMMENT_JAVADOC	 Creates a sort by terms in the given field, parsed to numeric values using a custom {@link FieldCache.Parser}. @param field Name of field to sort by. Must not be null. @param parser Instance of a {@link FieldCache.Parser}, which must subclass one of the existing numeric parsers from {@link FieldCache}. Sort type is inferred by testing which numeric parser the parser subclasses. @throws IllegalArgumentException if the parser fails to subclass an existing numeric parser, or field is null 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort, possibly in reverse, by terms in the given field, parsed * to numeric values using a custom {@link FieldCache.Parser}. * @param field Name of field to sort by. Must not be null. * @param parser Instance of a {@link FieldCache.Parser}, * which must subclass one of the existing numeric * parsers from {@link FieldCache}. Sort type is inferred * by testing which numeric parser the parser subclasses. * @param reverse True if natural order should be reversed. * @throws IllegalArgumentException if the parser fails to * subclass an existing numeric parser, or field is null */	TokenNameCOMMENT_JAVADOC	 Creates a sort, possibly in reverse, by terms in the given field, parsed to numeric values using a custom {@link FieldCache.Parser}. @param field Name of field to sort by. Must not be null. @param parser Instance of a {@link FieldCache.Parser}, which must subclass one of the existing numeric parsers from {@link FieldCache}. Sort type is inferred by testing which numeric parser the parser subclasses. @param reverse True if natural order should be reversed. @throws IllegalArgumentException if the parser fails to subclass an existing numeric parser, or field is null 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
IntParser	TokenNameIdentifier	 Int Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
FloatParser	TokenNameIdentifier	 Float Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ShortParser	TokenNameIdentifier	 Short Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ByteParser	TokenNameIdentifier	 Byte Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
LongParser	TokenNameIdentifier	 Long Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
LONG	TokenNameIdentifier	 LONG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DoubleParser	TokenNameIdentifier	 Double Parser
)	TokenNameRPAREN	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
DOUBLE	TokenNameIdentifier	 DOUBLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Parser instance does not subclass existing numeric parser from FieldCache (got "	TokenNameStringLiteral	Parser instance does not subclass existing numeric parser from FieldCache (got 
+	TokenNamePLUS	
parser	TokenNameIdentifier	 parser
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort by terms in the given field sorted * according to the given locale. * @param field Name of field to sort by, cannot be <code>null</code>. * @param locale Locale of values in the field. */	TokenNameCOMMENT_JAVADOC	 Creates a sort by terms in the given field sorted according to the given locale. @param field Name of field to sort by, cannot be <code>null</code>. @param locale Locale of values in the field. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort, possibly in reverse, by terms in the given field sorted * according to the given locale. * @param field Name of field to sort by, cannot be <code>null</code>. * @param locale Locale of values in the field. */	TokenNameCOMMENT_JAVADOC	 Creates a sort, possibly in reverse, by terms in the given field sorted according to the given locale. @param field Name of field to sort by, cannot be <code>null</code>. @param locale Locale of values in the field. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort with a custom comparison function. * @param field Name of field to sort by; cannot be <code>null</code>. * @param comparator Returns a comparator for sorting hits. */	TokenNameCOMMENT_JAVADOC	 Creates a sort with a custom comparison function. @param field Name of field to sort by; cannot be <code>null</code>. @param comparator Returns a comparator for sorting hits. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
CUSTOM	TokenNameIdentifier	 CUSTOM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a sort, possibly in reverse, with a custom comparison function. * @param field Name of field to sort by; cannot be <code>null</code>. * @param comparator Returns a comparator for sorting hits. * @param reverse True if natural order should be reversed. */	TokenNameCOMMENT_JAVADOC	 Creates a sort, possibly in reverse, with a custom comparison function. @param field Name of field to sort by; cannot be <code>null</code>. @param comparator Returns a comparator for sorting hits. @param reverse True if natural order should be reversed. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
CUSTOM	TokenNameIdentifier	 CUSTOM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set a default sorting value for documents which lacks one */	TokenNameCOMMENT_JAVADOC	 Set a default sorting value for documents which lacks one 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
setMissingValue	TokenNameIdentifier	 set Missing Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
BYTE	TokenNameIdentifier	 BYTE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
INT	TokenNameIdentifier	 INT
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LONG	TokenNameIdentifier	 LONG
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DOUBLE	TokenNameIdentifier	 DOUBLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Missing value only works for numeric types"	TokenNameStringLiteral	Missing value only works for numeric types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
missingValue	TokenNameIdentifier	 missing Value
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sets field & type, and ensures field is not NULL unless 	TokenNameCOMMENT_LINE	Sets field & type, and ensures field is not NULL unless 
// type is SCORE or DOC 	TokenNameCOMMENT_LINE	type is SCORE or DOC 
private	TokenNameprivate	
void	TokenNamevoid	
initFieldType	TokenNameIdentifier	 init Field Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
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
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
SCORE	TokenNameIdentifier	 SCORE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DOC	TokenNameIdentifier	 DOC
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"field can only be null when type is SCORE or DOC"	TokenNameStringLiteral	field can only be null when type is SCORE or DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the name of the field. Could return <code>null</code> * if the sort is by SCORE or DOC. * @return Name of field, possibly <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the field. Could return <code>null</code> if the sort is by SCORE or DOC. @return Name of field, possibly <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the type of contents in the field. * @return One of the constants SCORE, DOC, STRING, INT or FLOAT. */	TokenNameCOMMENT_JAVADOC	 Returns the type of contents in the field. @return One of the constants SCORE, DOC, STRING, INT or FLOAT. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the Locale by which term values are interpreted. * May return <code>null</code> if no Locale was specified. * @return Locale, or <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the Locale by which term values are interpreted. May return <code>null</code> if no Locale was specified. @return Locale, or <code>null</code>. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the instance of a {@link FieldCache} parser that fits to the given sort type. * May return <code>null</code> if no parser was specified. Sorting is using the default parser then. * @return An instance of a {@link FieldCache} parser, or <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the instance of a {@link FieldCache} parser that fits to the given sort type. May return <code>null</code> if no parser was specified. Sorting is using the default parser then. @return An instance of a {@link FieldCache} parser, or <code>null</code>. 
public	TokenNamepublic	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns whether the sort should be reversed. * @return True if natural order should be reversed. */	TokenNameCOMMENT_JAVADOC	 Returns whether the sort should be reversed. @return True if natural order should be reversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the {@link FieldComparatorSource} used for * custom sorting */	TokenNameCOMMENT_JAVADOC	 Returns the {@link FieldComparatorSource} used for custom sorting 
public	TokenNamepublic	
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
getComparatorSource	TokenNameIdentifier	 get Comparator Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparatorSource	TokenNameIdentifier	 comparator Source
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
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SCORE	TokenNameIdentifier	 SCORE
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<score>"	TokenNameStringLiteral	<score>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOC	TokenNameIdentifier	 DOC
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<doc>"	TokenNameStringLiteral	<doc>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<string: ""	TokenNameStringLiteral	<string: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STRING_VAL	TokenNameIdentifier	 STRING  VAL
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<string_val: ""	TokenNameStringLiteral	<string_val: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BYTE	TokenNameIdentifier	 BYTE
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<byte: ""	TokenNameStringLiteral	<byte: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SHORT	TokenNameIdentifier	 SHORT
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<short: ""	TokenNameStringLiteral	<short: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<int: ""	TokenNameStringLiteral	<int: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<long: ""	TokenNameStringLiteral	<long: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<float: ""	TokenNameStringLiteral	<float: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<double: ""	TokenNameStringLiteral	<double: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CUSTOM	TokenNameIdentifier	 CUSTOM
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<custom:""	TokenNameStringLiteral	<custom:"
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"": "	TokenNameStringLiteral	": 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
comparatorSource	TokenNameIdentifier	 comparator Source
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<???: ""	TokenNameStringLiteral	<???: "
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. If a * {@link FieldComparatorSource} or {@link * FieldCache.Parser} was provided, it must properly * implement equals (unless a singleton is always used). */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. If a {@link FieldComparatorSource} or {@link FieldCache.Parser} was provided, it must properly implement equals (unless a singleton is always used). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SortField	TokenNameIdentifier	 Sort Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
// field is always interned 	TokenNameCOMMENT_LINE	field is always interned 
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
comparatorSource	TokenNameIdentifier	 comparator Source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. If a * {@link FieldComparatorSource} or {@link * FieldCache.Parser} was provided, it must properly * implement hashCode (unless a singleton is always * used). */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. If a {@link FieldComparatorSource} or {@link FieldCache.Parser} was provided, it must properly implement hashCode (unless a singleton is always used). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
^	TokenNameXOR	
0x346565dd	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0xaf5998bb	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0xff5685dd	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x08150815	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparatorSource	TokenNameIdentifier	 comparator Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
comparatorSource	TokenNameIdentifier	 comparator Source
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x3aaf56ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// field must be interned after reading from stream 	TokenNameCOMMENT_LINE	field must be interned after reading from stream 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the {@link FieldComparator} to use for * sorting. * * @lucene.experimental * * @param numHits number of top hits the queue will store * @param sortPos position of this SortField within {@link * Sort}. The comparator is primary if sortPos==0, * secondary if sortPos==1, etc. Some comparators can * optimize themselves when they are the primary sort. * @return {@link FieldComparator} to use when sorting */	TokenNameCOMMENT_JAVADOC	 Returns the {@link FieldComparator} to use for sorting. * @lucene.experimental * @param numHits number of top hits the queue will store @param sortPos position of this SortField within {@link Sort}. The comparator is primary if sortPos==0, secondary if sortPos==1, etc. Some comparators can optimize themselves when they are the primary sort. @return {@link FieldComparator} to use when sorting 
public	TokenNamepublic	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
sortPos	TokenNameIdentifier	 sort Pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: it'd be nice to allow FieldCache.getStringIndex 	TokenNameCOMMENT_LINE	TODO: it'd be nice to allow FieldCache.getStringIndex 
// to optionally accept a Locale so sorting could then use 	TokenNameCOMMENT_LINE	to optionally accept a Locale so sorting could then use 
// the faster StringComparator impls 	TokenNameCOMMENT_LINE	the faster StringComparator impls 
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
StringComparatorLocale	TokenNameIdentifier	 String Comparator Locale
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
RelevanceComparator	TokenNameIdentifier	 Relevance Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOC	TokenNameIdentifier	 DOC
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
DocComparator	TokenNameIdentifier	 Doc Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
IntComparator	TokenNameIdentifier	 Int Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
FloatComparator	TokenNameIdentifier	 Float Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
LongComparator	TokenNameIdentifier	 Long Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
DoubleComparator	TokenNameIdentifier	 Double Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
ByteComparator	TokenNameIdentifier	 Byte Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
ShortComparator	TokenNameIdentifier	 Short Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
)	TokenNameRPAREN	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
CUSTOM	TokenNameIdentifier	 CUSTOM
:	TokenNameCOLON	
assert	TokenNameassert	
comparatorSource	TokenNameIdentifier	 comparator Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparatorSource	TokenNameIdentifier	 comparator Source
.	TokenNameDOT	
newComparator	TokenNameIdentifier	 new Comparator
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
sortPos	TokenNameIdentifier	 sort Pos
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
StringOrdValComparator	TokenNameIdentifier	 String Ord Val Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
sortPos	TokenNameIdentifier	 sort Pos
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING_VAL	TokenNameIdentifier	 STRING  VAL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
.	TokenNameDOT	
StringValComparator	TokenNameIdentifier	 String Val Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Illegal sort type: "	TokenNameStringLiteral	Illegal sort type: 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

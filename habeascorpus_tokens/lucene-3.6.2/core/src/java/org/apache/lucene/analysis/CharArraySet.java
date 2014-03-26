package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractSet	TokenNameIdentifier	 Abstract Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * A simple class that stores Strings as char[]'s in a * hash table. Note that this is not a general purpose * class. For example, it cannot remove items from the * set, nor does it resize its hash table to be smaller, * etc. It is designed to be quick to test if a char[] * is in the set without the necessity of converting it * to a String first. * <p>You must specify the required {@link Version} * compatibility when creating {@link CharArraySet}: * <ul> * <li> As of 3.1, supplementary characters are * properly lowercased.</li> * </ul> * Before 3.1 supplementary characters could not be * lowercased correctly due to the lack of Unicode 4 * support in JDK 1.4. To use instances of * {@link CharArraySet} with the behavior before Lucene * 3.1 pass a {@link Version} < 3.1 to the constructors. * <P> * <em>Please note:</em> This class implements {@link java.util.Set Set} but * does not behave like it should in all cases. The generic type is * {@code Set<Object>}, because you can add any object to it, * that has a string representation. The add methods will use * {@link Object#toString} and store the result using a {@code char[]} * buffer. The same behavior have the {@code contains()} methods. * The {@link #iterator()} returns an {@code Iterator<String>}. * For type safety also {@link #stringIterator()} is provided. */	TokenNameCOMMENT_JAVADOC	 A simple class that stores Strings as char[]'s in a hash table. Note that this is not a general purpose class. For example, it cannot remove items from the set, nor does it resize its hash table to be smaller, etc. It is designed to be quick to test if a char[] is in the set without the necessity of converting it to a String first. <p>You must specify the required {@link Version} compatibility when creating {@link CharArraySet}: <ul> <li> As of 3.1, supplementary characters are properly lowercased.</li> </ul> Before 3.1 supplementary characters could not be lowercased correctly due to the lack of Unicode 4 support in JDK 1.4. To use instances of {@link CharArraySet} with the behavior before Lucene 3.1 pass a {@link Version} < 3.1 to the constructors. <P> <em>Please note:</em> This class implements {@link java.util.Set Set} but does not behave like it should in all cases. The generic type is {@code Set<Object>}, because you can add any object to it, that has a string representation. The add methods will use {@link Object#toString} and store the result using a {@code char[]} buffer. The same behavior have the {@code contains()} methods. The {@link #iterator()} returns an {@code Iterator<String>}. For type safety also {@link #stringIterator()} is provided. 
public	TokenNamepublic	
class	TokenNameclass	
CharArraySet	TokenNameIdentifier	 Char Array Set
extends	TokenNameextends	
AbstractSet	TokenNameIdentifier	 Abstract Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
PLACEHOLDER	TokenNameIdentifier	 PLACEHOLDER
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
/** * Create set with enough capacity to hold startSize terms * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. * @param startSize * the initial capacity * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Create set with enough capacity to hold startSize terms * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. @param startSize the initial capacity @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. 
public	TokenNamepublic	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
int	TokenNameint	
startSize	TokenNameIdentifier	 start Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
startSize	TokenNameIdentifier	 start Size
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a set from a Collection of objects. * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. * @param c * a collection whose elements to be placed into the set * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a set from a Collection of objects. * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. @param c a collection whose elements to be placed into the set @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. 
public	TokenNamepublic	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a set with enough capacity to hold startSize terms * * @param startSize * the initial capacity * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. * @deprecated use {@link #CharArraySet(Version, int, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a set with enough capacity to hold startSize terms * @param startSize the initial capacity @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. @deprecated use {@link #CharArraySet(Version, int, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
int	TokenNameint	
startSize	TokenNameIdentifier	 start Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
startSize	TokenNameIdentifier	 start Size
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a set from a Collection of objects. * * @param c * a collection whose elements to be placed into the set * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. * @deprecated use {@link #CharArraySet(Version, Collection, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a set from a Collection of objects. * @param c a collection whose elements to be placed into the set @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. @deprecated use {@link #CharArraySet(Version, Collection, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create set from the specified map (internal only), used also by {@link CharArrayMap#keySet()} */	TokenNameCOMMENT_JAVADOC	 Create set from the specified map (internal only), used also by {@link CharArrayMap#keySet()} 
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
final	TokenNamefinal	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clears all entries in this set. This method is supported for reusing, but not {@link Set#remove}. */	TokenNameCOMMENT_JAVADOC	 Clears all entries in this set. This method is supported for reusing, but not {@link Set#remove}. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** true if the <code>len</code> chars of <code>text</code> starting at <code>off</code> * are in the set */	TokenNameCOMMENT_JAVADOC	 true if the <code>len</code> chars of <code>text</code> starting at <code>off</code> are in the set 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** true if the <code>CharSequence</code> is in the set */	TokenNameCOMMENT_JAVADOC	 true if the <code>CharSequence</code> is in the set 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
PLACEHOLDER	TokenNameIdentifier	 PLACEHOLDER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add this CharSequence into the set */	TokenNameCOMMENT_JAVADOC	 Add this CharSequence into the set 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
PLACEHOLDER	TokenNameIdentifier	 PLACEHOLDER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add this String into the set */	TokenNameCOMMENT_JAVADOC	 Add this String into the set 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
PLACEHOLDER	TokenNameIdentifier	 PLACEHOLDER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add this char[] directly to the set. * If ignoreCase is true for this Set, the text array will be directly modified. * The user should never modify this text array after calling this method. */	TokenNameCOMMENT_JAVADOC	 Add this char[] directly to the set. If ignoreCase is true for this Set, the text array will be directly modified. The user should never modify this text array after calling this method. 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
PLACEHOLDER	TokenNameIdentifier	 PLACEHOLDER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an unmodifiable {@link CharArraySet}. This allows to provide * unmodifiable views of internal sets for "read-only" use. * * @param set * a set for which the unmodifiable set is returned. * @return an new unmodifiable {@link CharArraySet}. * @throws NullPointerException * if the given set is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns an unmodifiable {@link CharArraySet}. This allows to provide unmodifiable views of internal sets for "read-only" use. * @param set a set for which the unmodifiable set is returned. @return an new unmodifiable {@link CharArraySet}. @throws NullPointerException if the given set is <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Given set is null"	TokenNameStringLiteral	Given set is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
map	TokenNameIdentifier	 map
instanceof	TokenNameinstanceof	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
)	TokenNameRPAREN	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a copy of the given set as a {@link CharArraySet}. If the given set * is a {@link CharArraySet} the ignoreCase property will be preserved. * * @param set * a set to copy * @return a copy of the given set as a {@link CharArraySet}. If the given set * is a {@link CharArraySet} the ignoreCase and matchVersion property will be * preserved. * @deprecated use {@link #copy(Version, Set)} instead. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the given set as a {@link CharArraySet}. If the given set is a {@link CharArraySet} the ignoreCase property will be preserved. * @param set a set to copy @return a copy of the given set as a {@link CharArraySet}. If the given set is a {@link CharArraySet} the ignoreCase and matchVersion property will be preserved. @deprecated use {@link #copy(Version, Set)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
;	TokenNameSEMICOLON	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a copy of the given set as a {@link CharArraySet}. If the given set * is a {@link CharArraySet} the ignoreCase property will be preserved. * <p> * <b>Note:</b> If you intend to create a copy of another {@link CharArraySet} where * the {@link Version} of the source set differs from its copy * {@link #CharArraySet(Version, Collection, boolean)} should be used instead. * The {@link #copy(Version, Set)} will preserve the {@link Version} of the * source set it is an instance of {@link CharArraySet}. * </p> * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. This argument will be ignored if the * given set is a {@link CharArraySet}. * @param set * a set to copy * @return a copy of the given set as a {@link CharArraySet}. If the given set * is a {@link CharArraySet} the ignoreCase property as well as the * matchVersion will be of the given set will be preserved. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the given set as a {@link CharArraySet}. If the given set is a {@link CharArraySet} the ignoreCase property will be preserved. <p> <b>Note:</b> If you intend to create a copy of another {@link CharArraySet} where the {@link Version} of the source set differs from its copy {@link #CharArraySet(Version, Collection, boolean)} should be used instead. The {@link #copy(Version, Set)} will preserve the {@link Version} of the source set it is an instance of {@link CharArraySet}. </p> * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. This argument will be ignored if the given set is a {@link CharArraySet}. @param set a set to copy @return a copy of the given set as a {@link CharArraySet}. If the given set is a {@link CharArraySet} the ignoreCase property as well as the matchVersion will be of the given set will be preserved. 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
instanceof	TokenNameinstanceof	
CharArraySet	TokenNameIdentifier	 Char Array Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
)	TokenNameRPAREN	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The Iterator<String> for this set. Strings are constructed on the fly, so * use <code>nextCharArray</code> for more efficient access. * @deprecated Use the standard iterator, which returns {@code char[]} instances. */	TokenNameCOMMENT_JAVADOC	 The Iterator<String> for this set. Strings are constructed on the fly, so use <code>nextCharArray</code> for more efficient access. @deprecated Use the standard iterator, which returns {@code char[]} instances. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
CharArraySetIterator	TokenNameIdentifier	 Char Array Set Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArraySetIterator	TokenNameIdentifier	 Char Array Set Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goNext	TokenNameIdentifier	 go Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
goNext	TokenNameIdentifier	 go Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** do not modify the returned char[] */	TokenNameCOMMENT_JAVADOC	 do not modify the returned char[] 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nextCharArray	TokenNameIdentifier	 next Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
goNext	TokenNameIdentifier	 go Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the next String, as a Set<String> would... * use nextCharArray() for better efficiency. */	TokenNameCOMMENT_JAVADOC	 Returns the next String, as a Set<String> would... use nextCharArray() for better efficiency. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
nextCharArray	TokenNameIdentifier	 next Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** returns an iterator of new allocated Strings (an instance of {@link CharArraySetIterator}). * @deprecated Use {@link #iterator}, which returns {@code char[]} instances. */	TokenNameCOMMENT_JAVADOC	 returns an iterator of new allocated Strings (an instance of {@link CharArraySetIterator}). @deprecated Use {@link #iterator}, which returns {@code char[]} instances. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stringIterator	TokenNameIdentifier	 string Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharArraySetIterator	TokenNameIdentifier	 Char Array Set Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an {@link Iterator} depending on the version used: * <ul> * <li>if {@code matchVersion} &ge; 3.1, it returns {@code char[]} instances in this set.</li> * <li>if {@code matchVersion} is 3.0 or older, it returns new * allocated Strings, so this method violates the Set interface. * It is kept this way for backwards compatibility, normally it should * return {@code char[]} on {@code next()}</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Returns an {@link Iterator} depending on the version used: <ul> <li>if {@code matchVersion} &ge; 3.1, it returns {@code char[]} instances in this set.</li> <li>if {@code matchVersion} is 3.0 or older, it returns new allocated Strings, so this method violates the Set interface. It is kept this way for backwards compatibility, normally it should return {@code char[]} on {@code next()}</li> </ul> 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use the AbstractSet#keySet()'s iterator (to not produce endless recursion) 	TokenNameCOMMENT_LINE	use the AbstractSet#keySet()'s iterator (to not produce endless recursion) 
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
?	TokenNameQUESTION	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
originalKeySet	TokenNameIdentifier	 original Key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
)	TokenNameRPAREN	
stringIterator	TokenNameIdentifier	 string Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
:	TokenNameCOLON	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
instanceof	TokenNameinstanceof	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

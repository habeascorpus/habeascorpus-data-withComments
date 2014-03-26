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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractMap	TokenNameIdentifier	 Abstract Map
;	TokenNameSEMICOLON	
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
CharacterUtils	TokenNameIdentifier	 Character Utils
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
/** * A simple class that stores key Strings as char[]'s in a * hash table. Note that this is not a general purpose * class. For example, it cannot remove items from the * map, nor does it resize its hash table to be smaller, * etc. It is designed to be quick to retrieve items * by char[] keys without the necessity of converting * to a String first. * <p>You must specify the required {@link Version} * compatibility when creating {@link CharArrayMap}: * <ul> * <li> As of 3.1, supplementary characters are * properly lowercased.</li> * </ul> * Before 3.1 supplementary characters could not be * lowercased correctly due to the lack of Unicode 4 * support in JDK 1.4. To use instances of * {@link CharArrayMap} with the behavior before Lucene * 3.1 pass a {@link Version} &lt; 3.1 to the constructors. */	TokenNameCOMMENT_JAVADOC	 A simple class that stores key Strings as char[]'s in a hash table. Note that this is not a general purpose class. For example, it cannot remove items from the map, nor does it resize its hash table to be smaller, etc. It is designed to be quick to retrieve items by char[] keys without the necessity of converting to a String first. <p>You must specify the required {@link Version} compatibility when creating {@link CharArrayMap}: <ul> <li> As of 3.1, supplementary characters are properly lowercased.</li> </ul> Before 3.1 supplementary characters could not be lowercased correctly due to the lack of Unicode 4 support in JDK 1.4. To use instances of {@link CharArrayMap} with the behavior before Lucene 3.1 pass a {@link Version} &lt; 3.1 to the constructors. 
public	TokenNamepublic	
class	TokenNameclass	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
AbstractMap	TokenNameIdentifier	 Abstract Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
// private only because missing generics 	TokenNameCOMMENT_LINE	private only because missing generics 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
EMPTY_MAP	TokenNameIdentifier	 EMPTY  MAP
=	TokenNameEQUAL	
new	TokenNamenew	
EmptyCharArrayMap	TokenNameIdentifier	 Empty Char Array Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
INIT_SIZE	TokenNameIdentifier	 INIT  SIZE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharacterUtils	TokenNameIdentifier	 Character Utils
charUtils	TokenNameIdentifier	 char Utils
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
// package private because used in CharArraySet 	TokenNameCOMMENT_LINE	package private because used in CharArraySet 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
// package private because used in CharArraySet's non Set-conform CharArraySetIterator 	TokenNameCOMMENT_LINE	package private because used in CharArraySet's non Set-conform CharArraySetIterator 
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
// package private because used in CharArraySet's non Set-conform CharArraySetIterator 	TokenNameCOMMENT_LINE	package private because used in CharArraySet's non Set-conform CharArraySetIterator 
/** * Create map with enough capacity to hold startSize terms * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. * @param startSize * the initial capacity * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Create map with enough capacity to hold startSize terms * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. @param startSize the initial capacity @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
CharArrayMap	TokenNameIdentifier	 Char Array Map
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
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
INIT_SIZE	TokenNameIdentifier	 INIT  SIZE
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
startSize	TokenNameIdentifier	 start Size
+	TokenNamePLUS	
(	TokenNameLPAREN	
startSize	TokenNameIdentifier	 start Size
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a map from the mappings in another map. * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. * @param c * a map whose mappings to be copied * @param ignoreCase * <code>false</code> if and only if the set should be case sensitive * otherwise <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a map from the mappings in another map. * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. @param c a map whose mappings to be copied @param ignoreCase <code>false</code> if and only if the set should be case sensitive otherwise <code>true</code>. 
public	TokenNamepublic	
CharArrayMap	TokenNameIdentifier	 Char Array Map
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
extends	TokenNameextends	
V	TokenNameIdentifier	 V
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
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create set from the supplied map (used internally for readonly maps...) */	TokenNameCOMMENT_JAVADOC	 Create set from the supplied map (used internally for readonly maps...) 
private	TokenNameprivate	
CharArrayMap	TokenNameIdentifier	 Char Array Map
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
charUtils	TokenNameIdentifier	 char Utils
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
toCopy	TokenNameIdentifier	 to Copy
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clears all entries in this map. This method is supported for reusing, but not {@link Map#remove}. */	TokenNameCOMMENT_JAVADOC	 Clears all entries in this map. This method is supported for reusing, but not {@link Map#remove}. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** true if the <code>len</code> chars of <code>text</code> starting at <code>off</code> * are in the {@link #keySet} */	TokenNameCOMMENT_JAVADOC	 true if the <code>len</code> chars of <code>text</code> starting at <code>off</code> are in the {@link #keySet} 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
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
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** true if the <code>CharSequence</code> is in the {@link #keySet} */	TokenNameCOMMENT_JAVADOC	 true if the <code>CharSequence</code> is in the {@link #keySet} 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the value of the mapping of <code>len</code> chars of <code>text</code> * starting at <code>off</code> */	TokenNameCOMMENT_JAVADOC	 returns the value of the mapping of <code>len</code> chars of <code>text</code> starting at <code>off</code> 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
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
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the value of the mapping of the chars inside this {@code CharSequence} */	TokenNameCOMMENT_JAVADOC	 returns the value of the mapping of the chars inside this {@code CharSequence} 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getSlot	TokenNameIdentifier	 get Slot
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
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
getHashCode	TokenNameIdentifier	 get Hash Code
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if the String is in the set */	TokenNameCOMMENT_JAVADOC	 Returns true if the String is in the set 
private	TokenNameprivate	
int	TokenNameint	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
getHashCode	TokenNameIdentifier	 get Hash Code
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add the given mapping. */	TokenNameCOMMENT_JAVADOC	 Add the given mapping. 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// could be more efficient 	TokenNameCOMMENT_LINE	could be more efficient 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add the given mapping. */	TokenNameCOMMENT_JAVADOC	 Add the given mapping. 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add the given mapping. * If ignoreCase is true for this Set, the text array will be directly modified. * The user should never modify this text array after calling this method. */	TokenNameCOMMENT_JAVADOC	 Add the given mapping. If ignoreCase is true for this Set, the text array will be directly modified. The user should never modify this text array after calling this method. 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
V	TokenNameIdentifier	 V
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
private	TokenNameprivate	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldkeys	TokenNameIdentifier	 oldkeys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
final	TokenNamefinal	
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldvalues	TokenNameIdentifier	 oldvalues
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
oldkeys	TokenNameIdentifier	 oldkeys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
oldkeys	TokenNameIdentifier	 oldkeys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// todo: could be faster... no need to compare strings on collision 	TokenNameCOMMENT_LINE	todo: could be faster... no need to compare strings on collision 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
oldvalues	TokenNameIdentifier	 oldvalues
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
text2	TokenNameIdentifier	 text2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
=	TokenNameEQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text1	TokenNameIdentifier	 text1
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
text2	TokenNameIdentifier	 text2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
text1	TokenNameIdentifier	 text1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
text2	TokenNameIdentifier	 text2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
=	TokenNameEQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text1	TokenNameIdentifier	 text1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
text2	TokenNameIdentifier	 text2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getHashCode	TokenNameIdentifier	 get Hash Code
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
=	TokenNameEQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getHashCode	TokenNameIdentifier	 get Hash Code
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
=	TokenNameEQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
codePointAt	TokenNameIdentifier	 code Point At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
count	TokenNameIdentifier	 count
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
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
EntrySet	TokenNameIdentifier	 Entry Set
entrySet	TokenNameIdentifier	 entry Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArraySet	TokenNameIdentifier	 Char Array Set
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
EntrySet	TokenNameIdentifier	 Entry Set
createEntrySet	TokenNameIdentifier	 create Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EntrySet	TokenNameIdentifier	 Entry Set
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
EntrySet	TokenNameIdentifier	 Entry Set
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entrySet	TokenNameIdentifier	 entry Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entrySet	TokenNameIdentifier	 entry Set
=	TokenNameEQUAL	
createEntrySet	TokenNameIdentifier	 create Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
entrySet	TokenNameIdentifier	 entry Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// helper for CharArraySet to not produce endless recursion 	TokenNameCOMMENT_LINE	helper for CharArraySet to not produce endless recursion 
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
originalKeySet	TokenNameIdentifier	 original Key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an {@link CharArraySet} view on the map's keys. * The set will use the same {@code matchVersion} as this map. */	TokenNameCOMMENT_JAVADOC	 Returns an {@link CharArraySet} view on the map's keys. The set will use the same {@code matchVersion} as this map. 
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
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keySet	TokenNameIdentifier	 key Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prevent adding of entries 	TokenNameCOMMENT_LINE	prevent adding of entries 
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
keySet	TokenNameIdentifier	 key Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** public iterator class so efficient methods are exposed to users */	TokenNameCOMMENT_JAVADOC	 public iterator class so efficient methods are exposed to users 
public	TokenNamepublic	
class	TokenNameclass	
EntryIterator	TokenNameIdentifier	 Entry Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastPos	TokenNameIdentifier	 last Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EntryIterator	TokenNameIdentifier	 Entry Iterator
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
allowModify	TokenNameIdentifier	 allow Modify
=	TokenNameEQUAL	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
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
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
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
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** gets the next key... do not modify the returned char[] */	TokenNameCOMMENT_JAVADOC	 gets the next key... do not modify the returned char[] 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nextKey	TokenNameIdentifier	 next Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goNext	TokenNameIdentifier	 go Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
lastPos	TokenNameIdentifier	 last Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** gets the next key as a newly created String object */	TokenNameCOMMENT_JAVADOC	 gets the next key as a newly created String object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nextKeyString	TokenNameIdentifier	 next Key String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
nextKey	TokenNameIdentifier	 next Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the value associated with the last key returned */	TokenNameCOMMENT_JAVADOC	 returns the value associated with the last key returned 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
currentValue	TokenNameIdentifier	 current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
lastPos	TokenNameIdentifier	 last Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** sets the value associated with the last key returned */	TokenNameCOMMENT_JAVADOC	 sets the value associated with the last key returned 
public	TokenNamepublic	
V	TokenNameIdentifier	 V
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
V	TokenNameIdentifier	 V
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
lastPos	TokenNameIdentifier	 last Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
lastPos	TokenNameIdentifier	 last Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** use nextCharArray() + currentValue() for better efficiency. */	TokenNameCOMMENT_JAVADOC	 use nextCharArray() + currentValue() for better efficiency. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goNext	TokenNameIdentifier	 go Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MapEntry	TokenNameIdentifier	 Map Entry
(	TokenNameLPAREN	
lastPos	TokenNameIdentifier	 last Pos
,	TokenNameCOMMA	
allowModify	TokenNameIdentifier	 allow Modify
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
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
MapEntry	TokenNameIdentifier	 Map Entry
implements	TokenNameimplements	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MapEntry	TokenNameIdentifier	 Map Entry
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
allowModify	TokenNameIdentifier	 allow Modify
=	TokenNameEQUAL	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we must clone here, as putAll to another CharArrayMap 	TokenNameCOMMENT_LINE	we must clone here, as putAll to another CharArrayMap 
// with other case sensitivity flag would corrupt the keys 	TokenNameCOMMENT_LINE	with other case sensitivity flag would corrupt the keys 
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
V	TokenNameIdentifier	 V
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
old	TokenNameIdentifier	 old
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
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"(this Map)"	TokenNameStringLiteral	(this Map)
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** public EntrySet class so efficient methods are exposed to users */	TokenNameCOMMENT_JAVADOC	 public EntrySet class so efficient methods are exposed to users 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
EntrySet	TokenNameIdentifier	 Entry Set
extends	TokenNameextends	
AbstractSet	TokenNameIdentifier	 Abstract Set
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EntrySet	TokenNameIdentifier	 Entry Set
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
allowModify	TokenNameIdentifier	 allow Modify
=	TokenNameEQUAL	
allowModify	TokenNameIdentifier	 allow Modify
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
EntryIterator	TokenNameIdentifier	 Entry Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EntryIterator	TokenNameIdentifier	 Entry Iterator
(	TokenNameLPAREN	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
allowModify	TokenNameIdentifier	 allow Modify
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArrayMap	TokenNameIdentifier	 Char Array Map
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns an unmodifiable {@link CharArrayMap}. This allows to provide * unmodifiable views of internal map for "read-only" use. * * @param map * a map for which the unmodifiable map is returned. * @return an new unmodifiable {@link CharArrayMap}. * @throws NullPointerException * if the given map is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns an unmodifiable {@link CharArrayMap}. This allows to provide unmodifiable views of internal map for "read-only" use. * @param map a map for which the unmodifiable map is returned. @return an new unmodifiable {@link CharArrayMap}. @throws NullPointerException if the given map is <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Given map is null"	TokenNameStringLiteral	Given map is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
instanceof	TokenNameinstanceof	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
)	TokenNameRPAREN	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a copy of the given map as a {@link CharArrayMap}. If the given map * is a {@link CharArrayMap} the ignoreCase property will be preserved. * <p> * <b>Note:</b> If you intend to create a copy of another {@link CharArrayMap} where * the {@link Version} of the source map differs from its copy * {@link #CharArrayMap(Version, Map, boolean)} should be used instead. * The {@link #copy(Version, Map)} will preserve the {@link Version} of the * source map it is an instance of {@link CharArrayMap}. * </p> * * @param matchVersion * compatibility match version see <a href="#version">Version * note</a> above for details. This argument will be ignored if the * given map is a {@link CharArrayMap}. * @param map * a map to copy * @return a copy of the given map as a {@link CharArrayMap}. If the given map * is a {@link CharArrayMap} the ignoreCase property as well as the * matchVersion will be of the given map will be preserved. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the given map as a {@link CharArrayMap}. If the given map is a {@link CharArrayMap} the ignoreCase property will be preserved. <p> <b>Note:</b> If you intend to create a copy of another {@link CharArrayMap} where the {@link Version} of the source map differs from its copy {@link #CharArrayMap(Version, Map, boolean)} should be used instead. The {@link #copy(Version, Map)} will preserve the {@link Version} of the source map it is an instance of {@link CharArrayMap}. </p> * @param matchVersion compatibility match version see <a href="#version">Version note</a> above for details. This argument will be ignored if the given map is a {@link CharArrayMap}. @param map a map to copy @return a copy of the given map as a {@link CharArrayMap}. If the given map is a {@link CharArrayMap} the ignoreCase property as well as the matchVersion will be of the given map will be preserved. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
extends	TokenNameextends	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
EMPTY_MAP	TokenNameIdentifier	 EMPTY  MAP
)	TokenNameRPAREN	
return	TokenNamereturn	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
instanceof	TokenNameinstanceof	
CharArrayMap	TokenNameIdentifier	 Char Array Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
// use fast path instead of iterating all values 	TokenNameCOMMENT_LINE	use fast path instead of iterating all values 
// this is even on very small sets ~10 times faster than iterating 	TokenNameCOMMENT_LINE	this is even on very small sets ~10 times faster than iterating 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an empty, unmodifiable map. */	TokenNameCOMMENT_JAVADOC	 Returns an empty, unmodifiable map. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
)	TokenNameRPAREN	
EMPTY_MAP	TokenNameIdentifier	 EMPTY  MAP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// package private CharArraySet instanceof check in CharArraySet 	TokenNameCOMMENT_LINE	package private CharArraySet instanceof check in CharArraySet 
static	TokenNamestatic	
class	TokenNameclass	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
EntrySet	TokenNameIdentifier	 Entry Set
createEntrySet	TokenNameIdentifier	 create Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EntrySet	TokenNameIdentifier	 Entry Set
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Empty {@link UnmodifiableCharArrayMap} optimized for speed. * Contains checks will always return <code>false</code> or throw * NPE if necessary. */	TokenNameCOMMENT_JAVADOC	 Empty {@link UnmodifiableCharArrayMap} optimized for speed. Contains checks will always return <code>false</code> or throw NPE if necessary. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
EmptyCharArrayMap	TokenNameIdentifier	 Empty Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
UnmodifiableCharArrayMap	TokenNameIdentifier	 Unmodifiable Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
EmptyCharArrayMap	TokenNameIdentifier	 Empty Char Array Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
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
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
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
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

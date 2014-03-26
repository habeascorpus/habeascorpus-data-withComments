/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
SyntaxException	TokenNameIdentifier	 Syntax Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/* * The encoding of a DynamicCompositeType column name should be: * <component><component><component> ... * where <component> is: * <comparator part><value><'end-of-component' byte> * where: * - <comparator part>: either the comparator full name, or a declared * aliases. This is at least 2 bytes (those 2 bytes are called header in * the following). If the first bit of the header is 1, then this * comparator part is an alias, otherwise it's a comparator full name: * - aliases: the actual alias is the 2nd byte of header taken as a * character. The whole <comparator part> is thus 2 byte long. * - comparator full name: the header is the length of the remaining * part. The remaining part is the UTF-8 encoded comparator class * name. * - <value>: the component value bytes preceded by 2 byte containing the * size of value (see CompositeType). * - 'end-of-component' byte is defined as in CompositeType */	TokenNameCOMMENT_BLOCK	 The encoding of a DynamicCompositeType column name should be: <component><component><component> ... where <component> is: <comparator part><value><'end-of-component' byte> where: - <comparator part>: either the comparator full name, or a declared aliases. This is at least 2 bytes (those 2 bytes are called header in the following). If the first bit of the header is 1, then this comparator part is an alias, otherwise it's a comparator full name: - aliases: the actual alias is the 2nd byte of header taken as a character. The whole <comparator part> is thus 2 byte long. - comparator full name: the header is the length of the remaining part. The remaining part is the UTF-8 encoded comparator class name. - <value>: the component value bytes preceded by 2 byte containing the size of value (see CompositeType). - 'end-of-component' byte is defined as in CompositeType 
public	TokenNamepublic	
class	TokenNameclass	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
extends	TokenNameextends	
AbstractCompositeType	TokenNameIdentifier	 Abstract Composite Type
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
aliases	TokenNameIdentifier	 aliases
;	TokenNameSEMICOLON	
// interning instances 	TokenNameCOMMENT_LINE	interning instances 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
,	TokenNameCOMMA	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
>	TokenNameGREATER	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
,	TokenNameCOMMA	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getAliasParameters	TokenNameIdentifier	 get Alias Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
aliases	TokenNameIdentifier	 aliases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
dct	TokenNameIdentifier	 dct
=	TokenNameEQUAL	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dct	TokenNameIdentifier	 dct
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dct	TokenNameIdentifier	 dct
=	TokenNameEQUAL	
new	TokenNamenew	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
,	TokenNameCOMMA	
dct	TokenNameIdentifier	 dct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dct	TokenNameIdentifier	 dct
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
aliases	TokenNameIdentifier	 aliases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aliases	TokenNameIdentifier	 aliases
=	TokenNameEQUAL	
aliases	TokenNameIdentifier	 aliases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0x8000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SyntaxException	TokenNameIdentifier	 Syntax Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb1	TokenNameIdentifier	 bb1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb2	TokenNameIdentifier	 bb2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comp1	TokenNameIdentifier	 comp1
=	TokenNameEQUAL	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
bb1	TokenNameIdentifier	 bb1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comp2	TokenNameIdentifier	 comp2
=	TokenNameEQUAL	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
bb2	TokenNameIdentifier	 bb2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fast test if the comparator uses singleton instances 	TokenNameCOMMENT_LINE	Fast test if the comparator uses singleton instances 
if	TokenNameif	
(	TokenNameLPAREN	
comp1	TokenNameIdentifier	 comp1
!=	TokenNameNOT_EQUAL	
comp2	TokenNameIdentifier	 comp2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * We compare component of different types by comparing the * comparator class names. We start with the simple classname * first because that will be faster in almost all cases, but * fallback on the full name if necessary */	TokenNameCOMMENT_BLOCK	 We compare component of different types by comparing the comparator class names. We start with the simple classname first because that will be faster in almost all cases, but fallback on the full name if necessary 
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
comp1	TokenNameIdentifier	 comp1
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
comp2	TokenNameIdentifier	 comp2
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
.	TokenNameDOT	
alwaysLesserThan	TokenNameIdentifier	 always Lesser Than
:	TokenNameCOLON	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
.	TokenNameDOT	
alwaysGreaterThan	TokenNameIdentifier	 always Greater Than
;	TokenNameSEMICOLON	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
comp1	TokenNameIdentifier	 comp1
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
comp2	TokenNameIdentifier	 comp2
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
.	TokenNameDOT	
alwaysLesserThan	TokenNameIdentifier	 always Lesser Than
:	TokenNameCOLON	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
.	TokenNameDOT	
alwaysGreaterThan	TokenNameIdentifier	 always Greater Than
;	TokenNameSEMICOLON	
// if cmp == 0, we're actually having the same type, but one that 	TokenNameCOMMENT_LINE	if cmp == 0, we're actually having the same type, but one that 
// did not have a singleton instance. It's ok (though inefficient). 	TokenNameCOMMENT_LINE	did not have a singleton instance. It's ok (though inefficient). 
}	TokenNameRBRACE	
return	TokenNamereturn	
comp1	TokenNameIdentifier	 comp1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getAndAppendComparator	TokenNameIdentifier	 get And Append Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0x8000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SyntaxException	TokenNameIdentifier	 Syntax Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
parseComparator	TokenNameIdentifier	 parse Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DynamicParsedComparator	TokenNameIdentifier	 Dynamic Parsed Comparator
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
validateComparator	TokenNameIdentifier	 validate Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to header of the comparator part of component "	TokenNameStringLiteral	Not enough bytes to header of the comparator part of component 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0x8000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to read comparator name of component "	TokenNameStringLiteral	Not enough bytes to read comparator name of component 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we'll deal with this below since comparator == null 	TokenNameCOMMENT_LINE	we'll deal with this below since comparator == null 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Cannot find comparator for component "	TokenNameStringLiteral	Cannot find comparator for component 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
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
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
instanceof	TokenNameinstanceof	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Adding new aliases is fine (but removing is not) 	TokenNameCOMMENT_LINE	Adding new aliases is fine (but removing is not) 
// Note that modifying the type for an alias to a compatible type is 	TokenNameCOMMENT_LINE	Note that modifying the type for an alias to a compatible type is 
// *not* fine since this would deal correctly with mixed aliased/not 	TokenNameCOMMENT_LINE	*not* fine since this would deal correctly with mixed aliased/not 
// aliased component. 	TokenNameCOMMENT_LINE	aliased component. 
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DynamicCompositeType	TokenNameIdentifier	 Dynamic Composite Type
)	TokenNameRPAREN	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
tprev	TokenNameIdentifier	 tprev
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
tnew	TokenNameIdentifier	 tnew
=	TokenNameEQUAL	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tnew	TokenNameIdentifier	 tnew
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
tnew	TokenNameIdentifier	 tnew
!=	TokenNameNOT_EQUAL	
tprev	TokenNameIdentifier	 tprev
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
DynamicParsedComparator	TokenNameIdentifier	 Dynamic Parsed Comparator
implements	TokenNameimplements	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
{	TokenNameLBRACE	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
isAlias	TokenNameIdentifier	 is Alias
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
comparatorName	TokenNameIdentifier	 comparator Name
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
remainingPart	TokenNameIdentifier	 remaining Part
;	TokenNameSEMICOLON	
DynamicParsedComparator	TokenNameIdentifier	 Dynamic Parsed Comparator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splits	TokenNameIdentifier	 splits
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid component representation: "	TokenNameStringLiteral	Invalid component representation: 
+	TokenNamePLUS	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparatorName	TokenNameIdentifier	 comparator Name
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
remainingPart	TokenNameIdentifier	 remaining Part
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try for an alias 	TokenNameCOMMENT_LINE	try for an alias 
// Note: the char to byte cast is theorically bogus for unicode character. I take full 	TokenNameCOMMENT_LINE	Note: the char to byte cast is theorically bogus for unicode character. I take full 
// responsibility if someone get hit by this (without making it on purpose) 	TokenNameCOMMENT_LINE	responsibility if someone get hit by this (without making it on purpose) 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isAlias	TokenNameIdentifier	 is Alias
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlias	TokenNameIdentifier	 is Alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SyntaxException	TokenNameIdentifier	 Syntax Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getAbstractType	TokenNameIdentifier	 get Abstract Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemainingPart	TokenNameIdentifier	 get Remaining Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remainingPart	TokenNameIdentifier	 remaining Part
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getComparatorSerializedSize	TokenNameIdentifier	 get Comparator Serialized Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isAlias	TokenNameIdentifier	 is Alias
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
)	TokenNameRPAREN	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serializeComparator	TokenNameIdentifier	 serialize Comparator
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isAlias	TokenNameIdentifier	 is Alias
)	TokenNameRPAREN	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
0x8000	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
comparatorName	TokenNameIdentifier	 comparator Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putShortLength	TokenNameIdentifier	 put Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlias	TokenNameIdentifier	 is Alias
)	TokenNameRPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
comparatorName	TokenNameIdentifier	 comparator Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
stringifyAliasesParameters	TokenNameIdentifier	 stringify Aliases Parameters
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * A comparator that always sorts it's first argument before the second * one. */	TokenNameCOMMENT_BLOCK	 A comparator that always sorts it's first argument before the second one. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
alwaysLesserThan	TokenNameIdentifier	 always Lesser Than
=	TokenNameEQUAL	
new	TokenNamenew	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
alwaysGreaterThan	TokenNameIdentifier	 always Greater Than
=	TokenNameEQUAL	
new	TokenNamenew	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FixedValueComparator	TokenNameIdentifier	 Fixed Value Comparator
(	TokenNameLPAREN	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Void	TokenNameIdentifier	 Void
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
Void	TokenNameIdentifier	 Void
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
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
}	TokenNameRBRACE	

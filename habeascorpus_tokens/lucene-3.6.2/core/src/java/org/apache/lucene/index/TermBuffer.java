package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
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
UnicodeUtil	TokenNameIdentifier	 Unicode Util
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
TermBuffer	TokenNameIdentifier	 Term Buffer
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
// cached 	TokenNameCOMMENT_LINE	cached 
private	TokenNameprivate	
boolean	TokenNameboolean	
preUTF8Strings	TokenNameIdentifier	 pre UT F8 Strings
;	TokenNameSEMICOLON	
// true if strings are stored in modified UTF8 encoding (LUCENE-510) 	TokenNameCOMMENT_LINE	true if strings are stored in modified UTF8 encoding (LUCENE-510) 
private	TokenNameprivate	
boolean	TokenNameboolean	
dirty	TokenNameIdentifier	 dirty
;	TokenNameSEMICOLON	
// true if text was set externally (ie not read via UTF8 bytes) 	TokenNameCOMMENT_LINE	true if text was set externally (ie not read via UTF8 bytes) 
private	TokenNameprivate	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
TermBuffer	TokenNameIdentifier	 Term Buffer
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
// fields are interned 	TokenNameCOMMENT_LINE	fields are interned 
return	TokenNamereturn	
compareChars	TokenNameIdentifier	 compare Chars
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
compareChars	TokenNameIdentifier	 compare Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars1	TokenNameIdentifier	 chars1
,	TokenNameCOMMA	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars2	TokenNameIdentifier	 chars2
,	TokenNameCOMMA	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
len1	TokenNameIdentifier	 len1
<	TokenNameLESS	
len2	TokenNameIdentifier	 len2
?	TokenNameQUESTION	
len1	TokenNameIdentifier	 len1
:	TokenNameCOLON	
len2	TokenNameIdentifier	 len2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
chars1	TokenNameIdentifier	 chars1
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
chars2	TokenNameIdentifier	 chars2
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
len1	TokenNameIdentifier	 len1
-	TokenNameMINUS	
len2	TokenNameIdentifier	 len2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Call this if the IndexInput passed to {@link #read} * stores terms in the "modified UTF8" (pre LUCENE-510) * format. */	TokenNameCOMMENT_JAVADOC	 Call this if the IndexInput passed to {@link #read} stores terms in the "modified UTF8" (pre LUCENE-510) format. 
void	TokenNamevoid	
setPreUTF8Strings	TokenNameIdentifier	 set Pre UT F8 Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preUTF8Strings	TokenNameIdentifier	 pre UT F8 Strings
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// invalidate cache 	TokenNameCOMMENT_LINE	invalidate cache 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preUTF8Strings	TokenNameIdentifier	 pre UT F8 Strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dirty	TokenNameIdentifier	 dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fully convert all bytes since bytes is dirty 	TokenNameCOMMENT_LINE	Fully convert all bytes since bytes is dirty 
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Incrementally convert only the UTF8 bytes that are new: 	TokenNameCOMMENT_LINE	Incrementally convert only the UTF8 bytes that are new: 
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termLen	TokenNameIdentifier	 term Len
=	TokenNameEQUAL	
termText	TokenNameIdentifier	 term Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
termLen	TokenNameIdentifier	 term Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termText	TokenNameIdentifier	 term Text
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termLen	TokenNameIdentifier	 term Len
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
TermBuffer	TokenNameIdentifier	 Term Buffer
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
copyText	TokenNameIdentifier	 copy Text
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
toTerm	TokenNameIdentifier	 to Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// unset 	TokenNameCOMMENT_LINE	unset 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermBuffer	TokenNameIdentifier	 Term Buffer
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermBuffer	TokenNameIdentifier	 Term Buffer
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
copyText	TokenNameIdentifier	 copy Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

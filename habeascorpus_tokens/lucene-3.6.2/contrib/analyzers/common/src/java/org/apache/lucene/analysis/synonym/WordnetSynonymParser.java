package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
synonym	TokenNameIdentifier	 synonym
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
LineNumberReader	TokenNameIdentifier	 Line Number Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
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
CharsRef	TokenNameIdentifier	 Chars Ref
;	TokenNameSEMICOLON	
/** * Parser for wordnet prolog format * <p> * See http://wordnet.princeton.edu/man/prologdb.5WN.html for a description of the format. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Parser for wordnet prolog format <p> See http://wordnet.princeton.edu/man/prologdb.5WN.html for a description of the format. @lucene.experimental 
// TODO: allow you to specify syntactic categories (e.g. just nouns, etc) 	TokenNameCOMMENT_LINE	TODO: allow you to specify syntactic categories (e.g. just nouns, etc) 
public	TokenNamepublic	
class	TokenNameclass	
WordnetSynonymParser	TokenNameIdentifier	 Wordnet Synonym Parser
extends	TokenNameextends	
SynonymMap	TokenNameIdentifier	 Synonym Map
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WordnetSynonymParser	TokenNameIdentifier	 Wordnet Synonym Parser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
dedup	TokenNameIdentifier	 dedup
,	TokenNameCOMMA	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
dedup	TokenNameIdentifier	 dedup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expand	TokenNameIdentifier	 expand
=	TokenNameEQUAL	
expand	TokenNameIdentifier	 expand
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lastSynSetID	TokenNameIdentifier	 last Syn Set ID
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
CharsRef	TokenNameIdentifier	 Chars Ref
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
synsetSize	TokenNameIdentifier	 synset Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
synSetID	TokenNameIdentifier	 syn Set ID
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
synSetID	TokenNameIdentifier	 syn Set ID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lastSynSetID	TokenNameIdentifier	 last Syn Set ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
,	TokenNameCOMMA	
synsetSize	TokenNameIdentifier	 synset Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synsetSize	TokenNameIdentifier	 synset Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
synsetSize	TokenNameIdentifier	 synset Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharsRef	TokenNameIdentifier	 Chars Ref
larger	TokenNameIdentifier	 larger
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
[	TokenNameLBRACKET	
synset	TokenNameIdentifier	 synset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
larger	TokenNameIdentifier	 larger
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
synsetSize	TokenNameIdentifier	 synset Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synset	TokenNameIdentifier	 synset
=	TokenNameEQUAL	
larger	TokenNameIdentifier	 larger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
synsetSize	TokenNameIdentifier	 synset Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parseSynonym	TokenNameIdentifier	 parse Synonym
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
synsetSize	TokenNameIdentifier	 synset Size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synsetSize	TokenNameIdentifier	 synset Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastSynSetID	TokenNameIdentifier	 last Syn Set ID
=	TokenNameEQUAL	
synSetID	TokenNameIdentifier	 syn Set ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// final synset in the file 	TokenNameCOMMENT_LINE	final synset in the file 
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
,	TokenNameCOMMA	
synsetSize	TokenNameIdentifier	 synset Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"Invalid synonym rule at line "	TokenNameStringLiteral	Invalid synonym rule at line 
+	TokenNamePLUS	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
CharsRef	TokenNameIdentifier	 Chars Ref
parseSynonym	TokenNameIdentifier	 parse Synonym
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
CharsRef	TokenNameIdentifier	 Chars Ref
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reuse	TokenNameIdentifier	 reuse
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reuse	TokenNameIdentifier	 reuse
=	TokenNameEQUAL	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
"''"	TokenNameStringLiteral	''
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
analyze	TokenNameIdentifier	 analyze
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// nothing to do 	TokenNameCOMMENT_LINE	nothing to do 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expand	TokenNameIdentifier	 expand
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
synset	TokenNameIdentifier	 synset
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

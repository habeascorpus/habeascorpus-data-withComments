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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Position of a term in a document that takes into account the term offset within the phrase. */	TokenNameCOMMENT_JAVADOC	 Position of a term in a document that takes into account the term offset within the phrase. 
final	TokenNamefinal	
class	TokenNameclass	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
// current doc 	TokenNameCOMMENT_LINE	current doc 
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// position in doc 	TokenNameCOMMENT_LINE	position in doc 
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// remaining pos in this doc 	TokenNameCOMMENT_LINE	remaining pos in this doc 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// position in phrase 	TokenNameCOMMENT_LINE	position in phrase 
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
// unique across all PhrasePositions instances 	TokenNameCOMMENT_LINE	unique across all PhrasePositions instances 
TermPositions	TokenNameIdentifier	 Term Positions
tp	TokenNameIdentifier	 tp
;	TokenNameSEMICOLON	
// stream of positions 	TokenNameCOMMENT_LINE	stream of positions 
PhrasePositions	TokenNameIdentifier	 Phrase Positions
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// used to make lists 	TokenNameCOMMENT_LINE	used to make lists 
int	TokenNameint	
rptGroup	TokenNameIdentifier	 rpt Group
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// >=0 indicates that this is a repeating PP 	TokenNameCOMMENT_LINE	>=0 indicates that this is a repeating PP 
int	TokenNameint	
rptInd	TokenNameIdentifier	 rpt Ind
;	TokenNameSEMICOLON	
// index in the rptGroup 	TokenNameCOMMENT_LINE	index in the rptGroup 
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
// for repetitions initialization 	TokenNameCOMMENT_LINE	for repetitions initialization 
PhrasePositions	TokenNameIdentifier	 Phrase Positions
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tp	TokenNameIdentifier	 tp
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// increments to next doc 	TokenNameCOMMENT_LINE	increments to next doc 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// sentinel value 	TokenNameCOMMENT_LINE	sentinel value 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// sentinel value 	TokenNameCOMMENT_LINE	sentinel value 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
firstPosition	TokenNameIdentifier	 first Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read first pos 	TokenNameCOMMENT_LINE	read first pos 
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Go to next location of this term current document, and set * <code>position</code> as <code>location - offset</code>, so that a * matching exact phrase is easily identified when all PhrasePositions * have exactly the same <code>position</code>. */	TokenNameCOMMENT_JAVADOC	 Go to next location of this term current document, and set <code>position</code> as <code>location - offset</code>, so that a matching exact phrase is easily identified when all PhrasePositions have exactly the same <code>position</code>. 
final	TokenNamefinal	
boolean	TokenNameboolean	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read subsequent pos's 	TokenNameCOMMENT_LINE	read subsequent pos's 
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** for debug purposes */	TokenNameCOMMENT_JAVADOC	 for debug purposes 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"d:"	TokenNameStringLiteral	d:
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" o:"	TokenNameStringLiteral	 o:
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
" p:"	TokenNameStringLiteral	 p:
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
" c:"	TokenNameStringLiteral	 c:
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rptGroup	TokenNameIdentifier	 rpt Group
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" rpt:"	TokenNameStringLiteral	 rpt:
+	TokenNamePLUS	
rptGroup	TokenNameIdentifier	 rpt Group
+	TokenNamePLUS	
",i"	TokenNameStringLiteral	,i
+	TokenNamePLUS	
rptInd	TokenNameIdentifier	 rpt Ind
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

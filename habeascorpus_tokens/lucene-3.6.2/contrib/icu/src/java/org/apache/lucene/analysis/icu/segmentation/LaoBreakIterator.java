package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UCharacter	TokenNameIdentifier	 U Character
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UnicodeSet	TokenNameIdentifier	 Unicode Set
;	TokenNameSEMICOLON	
/** * Syllable iterator for Lao text. * <p> * This breaks Lao text into syllables according to: * <i>Syllabification of Lao Script for Line Breaking</i> * Phonpasit Phissamay, Valaxay Dalolay, Chitaphone Chanhsililath, Oulaiphone Silimasak, * Sarmad Hussain, Nadir Durrani, Science Technology and Environment Agency, CRULP. * <ul> * <li>http://www.panl10n.net/english/final%20reports/pdf%20files/Laos/LAO06.pdf * <li>http://www.panl10n.net/Presentations/Cambodia/Phonpassit/LineBreakingAlgo.pdf * </ul> * <p> * Most work is accomplished with RBBI rules, however some additional special logic is needed * that cannot be coded in a grammar, and this is implemented here. * <p> * For example, what appears to be a final consonant might instead be part of the next syllable. * Rules match in a greedy fashion, leaving an illegal sequence that matches no rules. * <p> * Take for instance the text ກວ່າດອກ * The first rule greedily matches ກວ່າດ, but then ອກ is encountered, which is illegal. * What LaoBreakIterator does, according to the paper: * <ol> * <li>backtrack and remove the ດ from the last syllable, placing it on the current syllable. * <li>verify the modified previous syllable (ກວ່າ ) is still legal. * <li>verify the modified current syllable (ດອກ) is now legal. * <li>If 2 or 3 fails, then restore the ດ to the last syllable and skip the current character. * </ol> * <p> * Finally, LaoBreakIterator also takes care of the second concern mentioned in the paper. * This is the issue of combining marks being in the wrong order (typos). * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Syllable iterator for Lao text. <p> This breaks Lao text into syllables according to: <i>Syllabification of Lao Script for Line Breaking</i> Phonpasit Phissamay, Valaxay Dalolay, Chitaphone Chanhsililath, Oulaiphone Silimasak, Sarmad Hussain, Nadir Durrani, Science Technology and Environment Agency, CRULP. <ul> <li>http://www.panl10n.net/english/final%20reports/pdf%20files/Laos/LAO06.pdf <li>http://www.panl10n.net/Presentations/Cambodia/Phonpassit/LineBreakingAlgo.pdf </ul> <p> Most work is accomplished with RBBI rules, however some additional special logic is needed that cannot be coded in a grammar, and this is implemented here. <p> For example, what appears to be a final consonant might instead be part of the next syllable. Rules match in a greedy fashion, leaving an illegal sequence that matches no rules. <p> Take for instance the text ກວ່າດອກ The first rule greedily matches ກວ່າດ, but then ອກ is encountered, which is illegal. What LaoBreakIterator does, according to the paper: <ol> <li>backtrack and remove the ດ from the last syllable, placing it on the current syllable. <li>verify the modified previous syllable (ກວ່າ ) is still legal. <li>verify the modified current syllable (ດອກ) is now legal. <li>If 2 or 3 fails, then restore the ດ to the last syllable and skip the current character. </ol> <p> Finally, LaoBreakIterator also takes care of the second concern mentioned in the paper. This is the issue of combining marks being in the wrong order (typos). @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
extends	TokenNameextends	
BreakIterator	TokenNameIdentifier	 Break Iterator
{	TokenNameLBRACE	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
rules	TokenNameIdentifier	 rules
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
working	TokenNameIdentifier	 working
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
workingOffset	TokenNameIdentifier	 working Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
verifyText	TokenNameIdentifier	 verify Text
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
verify	TokenNameIdentifier	 verify
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
UnicodeSet	TokenNameIdentifier	 Unicode Set
laoSet	TokenNameIdentifier	 lao Set
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
laoSet	TokenNameIdentifier	 lao Set
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
"[:Lao:]"	TokenNameStringLiteral	[:Lao:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
laoSet	TokenNameIdentifier	 lao Set
.	TokenNameDOT	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
laoSet	TokenNameIdentifier	 lao Set
.	TokenNameDOT	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
)	TokenNameRPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verify	TokenNameIdentifier	 verify
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
)	TokenNameRPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
?	TokenNameQUESTION	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
:	TokenNameCOLON	
workingOffset	TokenNameIdentifier	 working Offset
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
working	TokenNameIdentifier	 working
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
working	TokenNameIdentifier	 working
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workingOffset	TokenNameIdentifier	 working Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
?	TokenNameQUESTION	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
:	TokenNameCOLON	
workingOffset	TokenNameIdentifier	 working Offset
+	TokenNamePLUS	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
following	TokenNameIdentifier	 following
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
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
CharacterIterator	TokenNameIdentifier	 Character Iterator
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
last	TokenNameIdentifier	 last
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
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
next	TokenNameIdentifier	 next
+=	TokenNamePLUS_EQUAL	
workingOffset	TokenNameIdentifier	 working Offset
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
working	TokenNameIdentifier	 working
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
following	TokenNameIdentifier	 following
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lookahead 	TokenNameCOMMENT_LINE	lookahead 
if	TokenNameif	
(	TokenNameLPAREN	
following	TokenNameIdentifier	 following
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
following	TokenNameIdentifier	 following
+=	TokenNamePLUS_EQUAL	
workingOffset	TokenNameIdentifier	 working Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
laoSet	TokenNameIdentifier	 lao Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
verifyPushBack	TokenNameIdentifier	 verify Push Back
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workingOffset	TokenNameIdentifier	 working Offset
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
working	TokenNameIdentifier	 working
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
workingOffset	TokenNameIdentifier	 working Offset
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
workingOffset	TokenNameIdentifier	 working Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// undo the lookahead 	TokenNameCOMMENT_LINE	undo the lookahead 
}	TokenNameRBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Backwards traversal is unsupported"	TokenNameStringLiteral	Backwards traversal is unsupported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Backwards traversal is unsupported"	TokenNameStringLiteral	Backwards traversal is unsupported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
instanceof	TokenNameinstanceof	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"unsupported CharacterIterator"	TokenNameStringLiteral	unsupported CharacterIterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
ccReorder	TokenNameIdentifier	 cc Reorder
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
working	TokenNameIdentifier	 working
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
working	TokenNameIdentifier	 working
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workingOffset	TokenNameIdentifier	 working Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newText	TokenNameIdentifier	 new Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci	TokenNameIdentifier	 ci
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
verifyPushBack	TokenNameIdentifier	 verify Push Back
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
shortenedSyllable	TokenNameIdentifier	 shortened Syllable
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
-	TokenNameMINUS	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
verifyText	TokenNameIdentifier	 verify Text
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
shortenedSyllable	TokenNameIdentifier	 shortened Syllable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
verifyText	TokenNameIdentifier	 verify Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
shortenedSyllable	TokenNameIdentifier	 shortened Syllable
||	TokenNameOR_OR	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
verifyText	TokenNameIdentifier	 verify Text
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
next	TokenNameIdentifier	 next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
verifyText	TokenNameIdentifier	 verify Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
&&	TokenNameAND_AND	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: only bubblesort around runs of combining marks, instead of the entire text. 	TokenNameCOMMENT_LINE	TODO: only bubblesort around runs of combining marks, instead of the entire text. 
private	TokenNameprivate	
void	TokenNamevoid	
ccReorder	TokenNameIdentifier	 cc Reorder
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
reordered	TokenNameIdentifier	 reordered
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
prevCC	TokenNameIdentifier	 prev CC
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
reordered	TokenNameIdentifier	 reordered
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
getCombiningClass	TokenNameIdentifier	 get Combining Class
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
cc	TokenNameIdentifier	 cc
<	TokenNameLESS	
prevCC	TokenNameIdentifier	 prev CC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swap 	TokenNameCOMMENT_LINE	swap 
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
reordered	TokenNameIdentifier	 reordered
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prevCC	TokenNameIdentifier	 prev CC
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
reordered	TokenNameIdentifier	 reordered
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone method. Creates another LaoBreakIterator with the same behavior * and current state as this one. * @return The clone. */	TokenNameCOMMENT_JAVADOC	 Clone method. Creates another LaoBreakIterator with the same behavior and current state as this one. @return The clone. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
)	TokenNameRPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
verify	TokenNameIdentifier	 verify
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
)	TokenNameRPAREN	
verify	TokenNameIdentifier	 verify
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
working	TokenNameIdentifier	 working
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
working	TokenNameIdentifier	 working
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
working	TokenNameIdentifier	 working
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verifyText	TokenNameIdentifier	 verify Text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
verifyText	TokenNameIdentifier	 verify Text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
verifyText	TokenNameIdentifier	 verify Text
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

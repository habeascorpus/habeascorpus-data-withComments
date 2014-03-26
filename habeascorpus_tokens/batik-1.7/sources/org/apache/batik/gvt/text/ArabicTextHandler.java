/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedString	TokenNameIdentifier	 Attributed String
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Handles the processing of arabic text. In particular it determines the * form each arabic char should take. It also contains methods for substituting * plain arabic glyphs with their shaped forms. This is needed when the arabic * text is rendered using an AWT font. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: ArabicTextHandler.java 491229 2006-12-30 14:37:28Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Handles the processing of arabic text. In particular it determines the form each arabic char should take. It also contains methods for substituting plain arabic glyphs with their shaped forms. This is needed when the arabic text is rendered using an AWT font. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: ArabicTextHandler.java 491229 2006-12-30 14:37:28Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
arabicStart	TokenNameIdentifier	 arabic Start
=	TokenNameEQUAL	
0x0600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
arabicEnd	TokenNameIdentifier	 arabic End
=	TokenNameEQUAL	
0x06FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_INITIAL	TokenNameIdentifier	 ARABIC  INITIAL
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_INITIAL	TokenNameIdentifier	 ARABIC  INITIAL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
;	TokenNameSEMICOLON	
/** * private ctor prevents unnecessary instantiation of this class. */	TokenNameCOMMENT_JAVADOC	 private ctor prevents unnecessary instantiation of this class. 
private	TokenNameprivate	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * If the AttributedString contains any arabic chars, assigns an * arabic form attribute, i&#x2e;e&#x2e; initial|medial|terminal|isolated, * to each arabic char. * * @param as The string to attach the arabic form attributes to. * @return An attributed string with arabic form attributes. */	TokenNameCOMMENT_JAVADOC	 If the AttributedString contains any arabic chars, assigns an arabic form attribute, i&#x2e;e&#x2e; initial|medial|terminal|isolated, to each arabic char. * @param as The string to attach the arabic form attributes to. @return An attributed string with arabic form attributes. 
public	TokenNamepublic	
static	TokenNamestatic	
AttributedString	TokenNameIdentifier	 Attributed String
assignArabicForms	TokenNameIdentifier	 assign Arabic Forms
(	TokenNameLPAREN	
AttributedString	TokenNameIdentifier	 Attributed String
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first check to see if the string contains any arabic chars 	TokenNameCOMMENT_LINE	first check to see if the string contains any arabic chars 
// if not, then don't need to do anything 	TokenNameCOMMENT_LINE	if not, then don't need to do anything 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
containsArabic	TokenNameIdentifier	 contains Arabic
(	TokenNameLPAREN	
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the string contains any ligatures with transparent chars 	TokenNameCOMMENT_LINE	if the string contains any ligatures with transparent chars 
// eg. AtB where AB form a ligature and t is transparent, then 	TokenNameCOMMENT_LINE	eg. AtB where AB form a ligature and t is transparent, then 
// reorder that part of the string so that it becomes tAB 	TokenNameCOMMENT_LINE	reorder that part of the string so that it becomes tAB 
// construct the reordered ACI 	TokenNameCOMMENT_LINE	construct the reordered ACI 
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charOrder	TokenNameIdentifier	 char Order
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numChars	TokenNameIdentifier	 num Chars
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
prevChar	TokenNameIdentifier	 prev Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
prevChar	TokenNameIdentifier	 prev Char
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
,	TokenNameCOMMA	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arabicCharTransparent	TokenNameIdentifier	 arabic Char Transparent
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasSubstitute	TokenNameIdentifier	 has Substitute
(	TokenNameLPAREN	
prevChar	TokenNameIdentifier	 prev Char
,	TokenNameCOMMA	
nextChar	TokenNameIdentifier	 next Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found a ligature, separated by a transparent char 	TokenNameCOMMENT_LINE	found a ligature, separated by a transparent char 
if	TokenNameif	
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charOrder	TokenNameIdentifier	 char Order
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numChars	TokenNameIdentifier	 num Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to reconstruct the reordered attributed string 	TokenNameCOMMENT_LINE	need to reconstruct the reordered attributed string 
StringBuffer	TokenNameIdentifier	 String Buffer
reorderedString	TokenNameIdentifier	 reordered String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
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
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reorderedString	TokenNameIdentifier	 reordered String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AttributedString	TokenNameIdentifier	 Attributed String
reorderedAS	TokenNameIdentifier	 reordered AS
;	TokenNameSEMICOLON	
reorderedAS	TokenNameIdentifier	 reordered AS
=	TokenNameEQUAL	
new	TokenNamenew	
AttributedString	TokenNameIdentifier	 Attributed String
(	TokenNameLPAREN	
reorderedString	TokenNameIdentifier	 reordered String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// have swapped the first char. Need to move 	TokenNameCOMMENT_LINE	have swapped the first char. Need to move 
// any position attributes 	TokenNameCOMMENT_LINE	any position attributes 
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
Y	TokenNameIdentifier	 Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
y	TokenNameIdentifier	 y
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
charOrder	TokenNameIdentifier	 char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
reorderedAS	TokenNameIdentifier	 reordered AS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// first assign none to all arabic letters 	TokenNameCOMMENT_LINE	first assign none to all arabic letters 
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
arabicStart	TokenNameIdentifier	 arabic Start
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
arabicEnd	TokenNameIdentifier	 arabic End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runStart	TokenNameIdentifier	 run Start
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
runStart	TokenNameIdentifier	 run Start
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
,	TokenNameCOMMA	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runStart	TokenNameIdentifier	 run Start
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
,	TokenNameCOMMA	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure ACI tracks ARABIC_FORM 	TokenNameCOMMENT_LINE	Make sure ACI tracks ARABIC_FORM 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
;	TokenNameSEMICOLON	
// for each run of arabic chars, assign the appropriate form 	TokenNameCOMMENT_LINE	for each run of arabic chars, assign the appropriate form 
while	TokenNamewhile	
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentForm	TokenNameIdentifier	 current Form
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only modify if the chars in the run are arabic 	TokenNameCOMMENT_LINE	only modify if the chars in the run are arabic 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
prevCharIndex	TokenNameIdentifier	 prev Char Index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
prevChar	TokenNameIdentifier	 prev Char
=	TokenNameEQUAL	
currentChar	TokenNameIdentifier	 current Char
;	TokenNameSEMICOLON	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
arabicCharTransparent	TokenNameIdentifier	 arabic Char Transparent
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
prevForm	TokenNameIdentifier	 prev Form
=	TokenNameEQUAL	
currentForm	TokenNameIdentifier	 current Form
;	TokenNameSEMICOLON	
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevCharIndex	TokenNameIdentifier	 prev Char Index
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if not at the start 	TokenNameCOMMENT_LINE	if not at the start 
// if prev char right AND current char left 	TokenNameCOMMENT_LINE	if prev char right AND current char left 
if	TokenNameif	
(	TokenNameLPAREN	
arabicCharShapesRight	TokenNameIdentifier	 arabic Char Shapes Right
(	TokenNameLPAREN	
prevChar	TokenNameIdentifier	 prev Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
arabicCharShapesLeft	TokenNameIdentifier	 arabic Char Shapes Left
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Increment the form of the previous char 	TokenNameCOMMENT_LINE	Increment the form of the previous char 
prevForm	TokenNameIdentifier	 prev Form
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
prevForm	TokenNameIdentifier	 prev Form
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
,	TokenNameCOMMA	
prevForm	TokenNameIdentifier	 prev Form
,	TokenNameCOMMA	
prevCharIndex	TokenNameIdentifier	 prev Char Index
,	TokenNameCOMMA	
prevCharIndex	TokenNameIdentifier	 prev Char Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and set the form of the current char to INITIAL 	TokenNameCOMMENT_LINE	and set the form of the current char to INITIAL 
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
ARABIC_INITIAL	TokenNameIdentifier	 ARABIC  INITIAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arabicCharShaped	TokenNameIdentifier	 arabic Char Shaped
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set the form of the current char to ISOLATE 	TokenNameCOMMENT_LINE	set the form of the current char to ISOLATE 
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if this is the first arabic char and its 	TokenNameCOMMENT_LINE	if this is the first arabic char and its 
// shaped, set to ISOLATE 	TokenNameCOMMENT_LINE	shaped, set to ISOLATE 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arabicCharShaped	TokenNameIdentifier	 arabic Char Shaped
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set the form of the current char to ISOLATE 	TokenNameCOMMENT_LINE	set the form of the current char to ISOLATE 
currentForm	TokenNameIdentifier	 current Form
=	TokenNameEQUAL	
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentForm	TokenNameIdentifier	 current Form
!=	TokenNameNOT_EQUAL	
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
)	TokenNameRPAREN	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
,	TokenNameCOMMA	
currentForm	TokenNameIdentifier	 current Form
,	TokenNameCOMMA	
currentIndex	TokenNameIdentifier	 current Index
,	TokenNameCOMMA	
currentIndex	TokenNameIdentifier	 current Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevCharIndex	TokenNameIdentifier	 prev Char Index
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the char is a standard arabic char. * (ie. within the range U+0600 - U+6FF) * * @param c The character to test. * @return True if the char is arabic, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the char is a standard arabic char. (ie. within the range U+0600 - U+6FF) * @param c The character to test. @return True if the char is arabic, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicChar	TokenNameIdentifier	 arabic Char
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
arabicStart	TokenNameIdentifier	 arabic Start
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
arabicEnd	TokenNameIdentifier	 arabic End
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
/** * Returns true if the string contains any arabic characters. * * @param as The string to test. * @return True if at least one char is arabic, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the string contains any arabic characters. * @param as The string to test. @return True if at least one char is arabic, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
containsArabic	TokenNameIdentifier	 contains Arabic
(	TokenNameLPAREN	
AttributedString	TokenNameIdentifier	 Attributed String
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
containsArabic	TokenNameIdentifier	 contains Arabic
(	TokenNameLPAREN	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the ACI contains any arabic characters. * * @param aci The AttributedCharacterIterator to test. * @return True if at least one char is arabic, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the ACI contains any arabic characters. * @param aci The AttributedCharacterIterator to test. @return True if at least one char is arabic, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
containsArabic	TokenNameIdentifier	 contains Arabic
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arabicChar	TokenNameIdentifier	 arabic Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the char is transparent. * * @param c The character to test. * @return True if the character is transparent, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the char is transparent. * @param c The character to test. @return True if the character is transparent, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicCharTransparent	TokenNameIdentifier	 arabic Char Transparent
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charVal	TokenNameIdentifier	 char Val
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
<	TokenNameLESS	
0x064B	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>	TokenNameGREATER	
0x06ED	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0655	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0670	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06D6	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06E4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06E7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06E8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06EA	TokenNameIntegerLiteral	
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
/** * Returns true if the character shapes to the right. Note that duel * shaping characters also shape to the right and so will return true. * * @param c The character to test. * @return True if the character shapes to the right, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the character shapes to the right. Note that duel shaping characters also shape to the right and so will return true. * @param c The character to test. @return True if the character shapes to the right, false otherwise. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicCharShapesRight	TokenNameIdentifier	 arabic Char Shapes Right
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charVal	TokenNameIdentifier	 char Val
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0622	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0625	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0627	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0629	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x062F	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0632	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0648	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0671	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0673	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0675	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0677	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0688	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0699	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x06C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06C2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06CB	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x06CD	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x06CF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06D2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06D3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// check for duel shaping too 	TokenNameCOMMENT_LINE	check for duel shaping too 
||	TokenNameOR_OR	
arabicCharShapesDuel	TokenNameIdentifier	 arabic Char Shapes Duel
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
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
/** * Returns true if character has duel shaping. * * @param c The character to test. * @return True if the character is duel shaping, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if character has duel shaping. * @param c The character to test. @return True if the character is duel shaping, false otherwise. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicCharShapesDuel	TokenNameIdentifier	 arabic Char Shapes Duel
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charVal	TokenNameIdentifier	 char Val
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0626	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0628	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x062A	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x062E	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0633	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x063A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0641	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0647	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0649	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x064A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x0678	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x0687	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x069A	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06BF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x6C1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x6CC	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x6CE	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06D0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06D1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0x06FA	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0x06FC	TokenNameIntegerLiteral	
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
/** * Returns true if character shapes to the left. Note that duel * shaping characters also shape to the left and so will return true. * * @param c The character to test. * @return True if the character shapes to the left, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if character shapes to the left. Note that duel shaping characters also shape to the left and so will return true. * @param c The character to test. @return True if the character shapes to the left, false otherwise. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicCharShapesLeft	TokenNameIdentifier	 arabic Char Shapes Left
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arabicCharShapesDuel	TokenNameIdentifier	 arabic Char Shapes Duel
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if character is shaped. * * @param c The character to test. * @return True if the character is shaped, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if character is shaped. * @param c The character to test. @return True if the character is shaped, false otherwise. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
arabicCharShaped	TokenNameIdentifier	 arabic Char Shaped
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arabicCharShapesRight	TokenNameIdentifier	 arabic Char Shapes Right
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasSubstitute	TokenNameIdentifier	 has Substitute
(	TokenNameLPAREN	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
,	TokenNameCOMMA	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
<	TokenNameLESS	
doubleCharFirst	TokenNameIdentifier	 double Char First
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
>	TokenNameGREATER	
doubleCharLast	TokenNameIdentifier	 double Char Last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
remaps	TokenNameIdentifier	 remaps
=	TokenNameEQUAL	
doubleCharRemappings	TokenNameIdentifier	 double Char Remappings
[	TokenNameLBRACKET	
ch1	TokenNameIdentifier	 ch1
-	TokenNameMINUS	
doubleCharFirst	TokenNameIdentifier	 double Char First
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remaps	TokenNameIdentifier	 remaps
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
remaps	TokenNameIdentifier	 remaps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
remaps	TokenNameIdentifier	 remaps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Will try and find a substitute character of the specified form. * * @param ch1 The first character of two to replace. * @param ch2 The second character of two to replace. * @param form Indicates the required arabic form. * (isolated = 1, final = 2, initial = 3, medial = 4) * * @return The unicode value of the substutute char, or -1 if no substitute * exists. */	TokenNameCOMMENT_JAVADOC	 Will try and find a substitute character of the specified form. * @param ch1 The first character of two to replace. @param ch2 The second character of two to replace. @param form Indicates the required arabic form. (isolated = 1, final = 2, initial = 3, medial = 4) * @return The unicode value of the substutute char, or -1 if no substitute exists. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
,	TokenNameCOMMA	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
,	TokenNameCOMMA	
int	TokenNameint	
form	TokenNameIdentifier	 form
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
<	TokenNameLESS	
doubleCharFirst	TokenNameIdentifier	 double Char First
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
>	TokenNameGREATER	
doubleCharLast	TokenNameIdentifier	 double Char Last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
remaps	TokenNameIdentifier	 remaps
=	TokenNameEQUAL	
doubleCharRemappings	TokenNameIdentifier	 double Char Remappings
[	TokenNameLBRACKET	
ch1	TokenNameIdentifier	 ch1
-	TokenNameMINUS	
doubleCharFirst	TokenNameIdentifier	 double Char First
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remaps	TokenNameIdentifier	 remaps
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
remaps	TokenNameIdentifier	 remaps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
remaps	TokenNameIdentifier	 remaps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
return	TokenNamereturn	
remaps	TokenNameIdentifier	 remaps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
form	TokenNameIdentifier	 form
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
form	TokenNameIdentifier	 form
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
singleCharFirst	TokenNameIdentifier	 single Char First
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
singleCharLast	TokenNameIdentifier	 single Char Last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
singleCharRemappings	TokenNameIdentifier	 single Char Remappings
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
singleCharFirst	TokenNameIdentifier	 single Char First
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
form	TokenNameIdentifier	 form
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Where possible substitues plain arabic glyphs with their shaped * forms. This is needed when the arabic text is rendered using * an AWT font. Simple arabic ligatures will also be recognised * and replaced by a single character so the length of the * resulting string may be shorter than the number of characters * in the aci. * * @param aci Contains the text to process. Arabic form attributes * should already be assigned to each arabic character. * @return A String containing the shaped versions of the arabic characters */	TokenNameCOMMENT_JAVADOC	 Where possible substitues plain arabic glyphs with their shaped forms. This is needed when the arabic text is rendered using an AWT font. Simple arabic ligatures will also be recognised and replaced by a single character so the length of the resulting string may be shorter than the number of characters in the aci. * @param aci Contains the text to process. Arabic form attributes should already be assigned to each arabic character. @return A String containing the shaped versions of the arabic characters 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
createSubstituteString	TokenNameIdentifier	 create Substitute String
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numChar	TokenNameIdentifier	 num Char
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
substString	TokenNameIdentifier	 subst String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
numChar	TokenNameIdentifier	 num Char
)	TokenNameRPAREN	
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
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arabicChar	TokenNameIdentifier	 arabic Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
form	TokenNameIdentifier	 form
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// see if the c is the start of a ligature 	TokenNameCOMMENT_LINE	see if the c is the start of a ligature 
if	TokenNameif	
(	TokenNameLPAREN	
charStartsLigature	TokenNameIdentifier	 char Starts Ligature
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
nextForm	TokenNameIdentifier	 next Form
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nextForm	TokenNameIdentifier	 next Form
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nextForm	TokenNameIdentifier	 next Form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ARABIC_INITIAL	TokenNameIdentifier	 ARABIC  INITIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for an isolated ligature 	TokenNameCOMMENT_LINE	look for an isolated ligature 
int	TokenNameint	
substChar	TokenNameIdentifier	 subst Char
=	TokenNameEQUAL	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
nextChar	TokenNameIdentifier	 next Char
,	TokenNameCOMMA	
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
substChar	TokenNameIdentifier	 subst Char
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
substChar	TokenNameIdentifier	 subst Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for a terminal ligature 	TokenNameCOMMENT_LINE	look for a terminal ligature 
int	TokenNameint	
substChar	TokenNameIdentifier	 subst Char
=	TokenNameEQUAL	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
nextChar	TokenNameIdentifier	 next Char
,	TokenNameCOMMA	
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
substChar	TokenNameIdentifier	 subst Char
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
substChar	TokenNameIdentifier	 subst Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nextForm	TokenNameIdentifier	 next Form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for a medial ligature 	TokenNameCOMMENT_LINE	look for a medial ligature 
int	TokenNameint	
substChar	TokenNameIdentifier	 subst Char
=	TokenNameEQUAL	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
nextChar	TokenNameIdentifier	 next Char
,	TokenNameCOMMA	
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
substChar	TokenNameIdentifier	 subst Char
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
substChar	TokenNameIdentifier	 subst Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// couldn't find a matching ligature so just look for a 	TokenNameCOMMENT_LINE	couldn't find a matching ligature so just look for a 
// simple substitution 	TokenNameCOMMENT_LINE	simple substitution 
if	TokenNameif	
(	TokenNameLPAREN	
form	TokenNameIdentifier	 form
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
form	TokenNameIdentifier	 form
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
substChar	TokenNameIdentifier	 subst Char
=	TokenNameEQUAL	
getSubstituteChar	TokenNameIdentifier	 get Substitute Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
form	TokenNameIdentifier	 form
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
substChar	TokenNameIdentifier	 subst Char
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
substChar	TokenNameIdentifier	 subst Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
substString	TokenNameIdentifier	 subst String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a ligature exists that starts with the * specified character. * * @param c The character to test. * @return True if there is a ligature that starts with c, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if a ligature exists that starts with the specified character. * @param c The character to test. @return True if there is a ligature that starts with c, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
charStartsLigature	TokenNameIdentifier	 char Starts Ligature
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charVal	TokenNameIdentifier	 char Val
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x064B	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x064C	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x064D	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x064E	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x064F	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0650	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0651	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0652	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0622	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0623	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0625	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0x0627	TokenNameIntegerLiteral	
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
/** * Returns the number of characters the glyph for the specified * character represents. If the glyph represents a ligature this * will be 2, otherwise 1. * * @param c The character to test. * @return The number of characters the glyph for c represents. */	TokenNameCOMMENT_JAVADOC	 Returns the number of characters the glyph for the specified character represents. If the glyph represents a ligature this will be 2, otherwise 1. * @param c The character to test. @return The number of characters the glyph for c represents. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNumChars	TokenNameIdentifier	 get Num Chars
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if c is a ligature returns 2, else returns 1 	TokenNameCOMMENT_LINE	if c is a ligature returns 2, else returns 1 
if	TokenNameif	
(	TokenNameLPAREN	
isLigature	TokenNameIdentifier	 is Ligature
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// at the moment only support ligatures with two chars 	TokenNameCOMMENT_LINE	at the moment only support ligatures with two chars 
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the glyph for the specified character * respresents a ligature. * * @param c The character to test. * @return True if c is a ligature, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the glyph for the specified character respresents a ligature. * @param c The character to test. @return True if c is a ligature, false otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLigature	TokenNameIdentifier	 is Ligature
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charVal	TokenNameIdentifier	 char Val
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
<	TokenNameLESS	
0xFE70	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>	TokenNameGREATER	
0xFEFC	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0xFE72	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
==	TokenNameEQUAL_EQUAL	
0xFE74	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0xFE76	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charVal	TokenNameIdentifier	 char Val
<=	TokenNameLESS_EQUAL	
0xFE7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charVal	TokenNameIdentifier	 char Val
>=	TokenNameGREATER_EQUAL	
0xFEF5	TokenNameIntegerLiteral	
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
// constructs the character map that maps arabic characters and 	TokenNameCOMMENT_LINE	constructs the character map that maps arabic characters and 
// ligature to their various forms 	TokenNameCOMMENT_LINE	ligature to their various forms 
// NOTE: the unicode values for ligatures are stored here in 	TokenNameCOMMENT_LINE	NOTE: the unicode values for ligatures are stored here in 
// visual order (not logical order) 	TokenNameCOMMENT_LINE	visual order (not logical order) 
// Single char remappings: 	TokenNameCOMMENT_LINE	Single char remappings: 
static	TokenNamestatic	
int	TokenNameint	
singleCharFirst	TokenNameIdentifier	 single Char First
=	TokenNameEQUAL	
0x0621	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
singleCharLast	TokenNameIdentifier	 single Char Last
=	TokenNameEQUAL	
0x064A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
singleCharRemappings	TokenNameIdentifier	 single Char Remappings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// isolated, final, initial, medial 	TokenNameCOMMENT_LINE	isolated, final, initial, medial 
{	TokenNameLBRACE	
0xFE80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0621 	TokenNameCOMMENT_LINE	0x0621 
{	TokenNameLBRACE	
0xFE81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0622 	TokenNameCOMMENT_LINE	0x0622 
{	TokenNameLBRACE	
0xFE83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0623 	TokenNameCOMMENT_LINE	0x0623 
{	TokenNameLBRACE	
0xFE85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0624 	TokenNameCOMMENT_LINE	0x0624 
{	TokenNameLBRACE	
0xFE87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0625 	TokenNameCOMMENT_LINE	0x0625 
{	TokenNameLBRACE	
0xFE89	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE8A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE8B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE8C	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0626 	TokenNameCOMMENT_LINE	0x0626 
{	TokenNameLBRACE	
0xFE8D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE8E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0627 	TokenNameCOMMENT_LINE	0x0627 
{	TokenNameLBRACE	
0xFE8F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE92	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0628 	TokenNameCOMMENT_LINE	0x0628 
{	TokenNameLBRACE	
0xFE93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0629 	TokenNameCOMMENT_LINE	0x0629 
{	TokenNameLBRACE	
0xFE95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE96	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE98	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062A 	TokenNameCOMMENT_LINE	0x062A 
{	TokenNameLBRACE	
0xFE99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE9A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE9B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE9C	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062B 	TokenNameCOMMENT_LINE	0x062B 
{	TokenNameLBRACE	
0xFE9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE9F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062C 	TokenNameCOMMENT_LINE	0x062C 
{	TokenNameLBRACE	
0xFEA1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062D 	TokenNameCOMMENT_LINE	0x062D 
{	TokenNameLBRACE	
0xFEA5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEA8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062E 	TokenNameCOMMENT_LINE	0x062E 
{	TokenNameLBRACE	
0xFEA9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x062F 	TokenNameCOMMENT_LINE	0x062F 
{	TokenNameLBRACE	
0xFEAB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEAC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0630 	TokenNameCOMMENT_LINE	0x0630 
{	TokenNameLBRACE	
0xFEAD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEAE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0631 	TokenNameCOMMENT_LINE	0x0631 
{	TokenNameLBRACE	
0xFEAF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0632 	TokenNameCOMMENT_LINE	0x0632 
{	TokenNameLBRACE	
0xFEB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0633 	TokenNameCOMMENT_LINE	0x0633 
{	TokenNameLBRACE	
0xFEB5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEB8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0634 	TokenNameCOMMENT_LINE	0x0634 
{	TokenNameLBRACE	
0xFEB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEBA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEBB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEBC	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0635 	TokenNameCOMMENT_LINE	0x0635 
{	TokenNameLBRACE	
0xFEBD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEBF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0636 	TokenNameCOMMENT_LINE	0x0636 
{	TokenNameLBRACE	
0xFEC1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0637 	TokenNameCOMMENT_LINE	0x0637 
{	TokenNameLBRACE	
0xFEC5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEC8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0638 	TokenNameCOMMENT_LINE	0x0638 
{	TokenNameLBRACE	
0xFEC9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFECA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFECB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFECC	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0639 	TokenNameCOMMENT_LINE	0x0639 
{	TokenNameLBRACE	
0xFECD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFECE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFECF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x063A 	TokenNameCOMMENT_LINE	0x063A 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063B 	TokenNameCOMMENT_LINE	0x063B 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063C 	TokenNameCOMMENT_LINE	0x063C 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063D 	TokenNameCOMMENT_LINE	0x063D 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063E 	TokenNameCOMMENT_LINE	0x063E 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063F 	TokenNameCOMMENT_LINE	0x063F 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0640 	TokenNameCOMMENT_LINE	0x0640 
{	TokenNameLBRACE	
0xFED1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0641 	TokenNameCOMMENT_LINE	0x0641 
{	TokenNameLBRACE	
0xFED5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFED8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0642 	TokenNameCOMMENT_LINE	0x0642 
{	TokenNameLBRACE	
0xFED9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEDA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEDB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEDC	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0643 	TokenNameCOMMENT_LINE	0x0643 
{	TokenNameLBRACE	
0xFEDD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEDE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEDF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0644 	TokenNameCOMMENT_LINE	0x0644 
{	TokenNameLBRACE	
0xFEE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0645 	TokenNameCOMMENT_LINE	0x0645 
{	TokenNameLBRACE	
0xFEE5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEE8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0646 	TokenNameCOMMENT_LINE	0x0646 
{	TokenNameLBRACE	
0xFEE9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEEA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEEB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEEC	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0647 	TokenNameCOMMENT_LINE	0x0647 
{	TokenNameLBRACE	
0xFEED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEEE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0648 	TokenNameCOMMENT_LINE	0x0648 
{	TokenNameLBRACE	
0xFEEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0649 	TokenNameCOMMENT_LINE	0x0649 
{	TokenNameLBRACE	
0xFEF1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 0x064A 	TokenNameCOMMENT_LINE	0x064A 
static	TokenNamestatic	
int	TokenNameint	
doubleCharFirst	TokenNameIdentifier	 double Char First
=	TokenNameEQUAL	
0x0622	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
doubleCharLast	TokenNameIdentifier	 double Char Last
=	TokenNameEQUAL	
0x0652	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
doubleCharRemappings	TokenNameIdentifier	 double Char Remappings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// 2nd Char, isolated, final, initial, medial 	TokenNameCOMMENT_LINE	2nd Char, isolated, final, initial, medial 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0644	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0622 	TokenNameCOMMENT_LINE	0x0622 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0644	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0623 	TokenNameCOMMENT_LINE	0x0623 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0624 	TokenNameCOMMENT_LINE	0x0624 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0644	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEF9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0625 	TokenNameCOMMENT_LINE	0x0625 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0626 	TokenNameCOMMENT_LINE	0x0626 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0644	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0627 	TokenNameCOMMENT_LINE	0x0627 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0628 	TokenNameCOMMENT_LINE	0x0628 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0629 	TokenNameCOMMENT_LINE	0x0629 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0630 	TokenNameCOMMENT_LINE	0x0630 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0631 	TokenNameCOMMENT_LINE	0x0631 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0632 	TokenNameCOMMENT_LINE	0x0632 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0633 	TokenNameCOMMENT_LINE	0x0633 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0634 	TokenNameCOMMENT_LINE	0x0634 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0635 	TokenNameCOMMENT_LINE	0x0635 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0636 	TokenNameCOMMENT_LINE	0x0636 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0637 	TokenNameCOMMENT_LINE	0x0637 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0638 	TokenNameCOMMENT_LINE	0x0638 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0639 	TokenNameCOMMENT_LINE	0x0639 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063A 	TokenNameCOMMENT_LINE	0x063A 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063B 	TokenNameCOMMENT_LINE	0x063B 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063C 	TokenNameCOMMENT_LINE	0x063C 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063D 	TokenNameCOMMENT_LINE	0x063D 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063E 	TokenNameCOMMENT_LINE	0x063E 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x063F 	TokenNameCOMMENT_LINE	0x063F 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0640 	TokenNameCOMMENT_LINE	0x0640 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0641 	TokenNameCOMMENT_LINE	0x0641 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0642 	TokenNameCOMMENT_LINE	0x0642 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0643 	TokenNameCOMMENT_LINE	0x0643 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0644 	TokenNameCOMMENT_LINE	0x0644 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0645 	TokenNameCOMMENT_LINE	0x0645 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0646 	TokenNameCOMMENT_LINE	0x0646 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0647 	TokenNameCOMMENT_LINE	0x0647 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0648 	TokenNameCOMMENT_LINE	0x0648 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x0649 	TokenNameCOMMENT_LINE	0x0649 
null	TokenNamenull	
,	TokenNameCOMMA	
// 0x064A 	TokenNameCOMMENT_LINE	0x064A 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x064B 	TokenNameCOMMENT_LINE	0x064B 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE71	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x064C 	TokenNameCOMMENT_LINE	0x064C 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x064D 	TokenNameCOMMENT_LINE	0x064D 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x064E 	TokenNameCOMMENT_LINE	0x064E 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE77	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x064F 	TokenNameCOMMENT_LINE	0x064F 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE79	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0650 	TokenNameCOMMENT_LINE	0x0650 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7B	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0651 	TokenNameCOMMENT_LINE	0x0651 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7D	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0x0652 	TokenNameCOMMENT_LINE	0x0652 
{	TokenNameLBRACE	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE7F	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

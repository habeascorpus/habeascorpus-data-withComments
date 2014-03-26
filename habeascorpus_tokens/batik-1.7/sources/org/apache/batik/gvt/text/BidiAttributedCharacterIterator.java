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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
FontRenderContext	TokenNameIdentifier	 Font Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextLayout	TokenNameIdentifier	 Text Layout
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
HashMap	TokenNameIdentifier	 Hash Map
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
/** * An attributed character iterator that does the reordering of the characters * for bidirectional text. It reorders the characters so they are in visual order. * It also assigns a BIDI_LEVEL attribute to each character which can be used * to split the reordered ACI into text runs based on direction. ie. characters * in a text run will all have the same bidi level. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: BidiAttributedCharacterIterator.java 522271 2007-03-25 14:42:45Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An attributed character iterator that does the reordering of the characters for bidirectional text. It reorders the characters so they are in visual order. It also assigns a BIDI_LEVEL attribute to each character which can be used to split the reordered ACI into text runs based on direction. ie. characters in a text run will all have the same bidi level. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: BidiAttributedCharacterIterator.java 522271 2007-03-25 14:42:45Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
BidiAttributedCharacterIterator	TokenNameIdentifier	 Bidi Attributed Character Iterator
implements	TokenNameimplements	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
reorderedACI	TokenNameIdentifier	 reordered ACI
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newCharOrder	TokenNameIdentifier	 new Char Order
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Float	TokenNameIdentifier	 Float
FLOAT_NAN	TokenNameIdentifier	 FLOAT  NAN
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BidiAttributedCharacterIterator	TokenNameIdentifier	 Bidi Attributed Character Iterator
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
reorderedACI	TokenNameIdentifier	 reordered ACI
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
int	TokenNameint	
chunkStart	TokenNameIdentifier	 chunk Start
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newCharOrder	TokenNameIdentifier	 new Char Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reorderedACI	TokenNameIdentifier	 reordered ACI
=	TokenNameEQUAL	
reorderedACI	TokenNameIdentifier	 reordered ACI
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
frc	TokenNameIdentifier	 frc
=	TokenNameEQUAL	
frc	TokenNameIdentifier	 frc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkStart	TokenNameIdentifier	 chunk Start
=	TokenNameEQUAL	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newCharOrder	TokenNameIdentifier	 new Char Order
=	TokenNameEQUAL	
newCharOrder	TokenNameIdentifier	 new Char Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a character iterator that represents the visual display order * of characters within bidirectional text. * * @param aci The character iterator containing the characters in logical * order. * @param frc The current font render context */	TokenNameCOMMENT_JAVADOC	 Constructs a character iterator that represents the visual display order of characters within bidirectional text. * @param aci The character iterator containing the characters in logical order. @param frc The current font render context 
public	TokenNamepublic	
BidiAttributedCharacterIterator	TokenNameIdentifier	 Bidi Attributed Character Iterator
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
int	TokenNameint	
chunkStart	TokenNameIdentifier	 chunk Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frc	TokenNameIdentifier	 frc
=	TokenNameEQUAL	
frc	TokenNameIdentifier	 frc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkStart	TokenNameIdentifier	 chunk Start
=	TokenNameEQUAL	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
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
AttributedString	TokenNameIdentifier	 Attributed String
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
// Ideally we would do a 'quick' check on chars and 	TokenNameCOMMENT_LINE	Ideally we would do a 'quick' check on chars and 
// attributes to decide if we really need to do bidi or not. 	TokenNameCOMMENT_LINE	attributes to decide if we really need to do bidi or not. 
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Believe it or not this is much slower than the else case 	TokenNameCOMMENT_LINE	Believe it or not this is much slower than the else case 
// but the two are exactly equivalent (including the stripping 	TokenNameCOMMENT_LINE	but the two are exactly equivalent (including the stripping 
// of null keys/values). 	TokenNameCOMMENT_LINE	of null keys/values). 
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
new	TokenNamenew	
AttributedString	TokenNameIdentifier	 Attributed String
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
strB	TokenNameIdentifier	 str B
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
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
strB	TokenNameIdentifier	 str B
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
new	TokenNamenew	
AttributedString	TokenNameIdentifier	 Attributed String
(	TokenNameLPAREN	
strB	TokenNameIdentifier	 str B
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extent	TokenNameIdentifier	 extent
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
destMap	TokenNameIdentifier	 dest Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Font doesn't like getting attribute sets with 	TokenNameCOMMENT_LINE	Font doesn't like getting attribute sets with 
// null keys or values so we strip them here. 	TokenNameCOMMENT_LINE	null keys or values so we strip them here. 
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
destMap	TokenNameIdentifier	 dest Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Run: " + (index-start) + "->" + 	TokenNameCOMMENT_LINE	System.out.println("Run: " + (index-start) + "->" + 
// (extent-start) + " of " + numChars); 	TokenNameCOMMENT_LINE	(extent-start) + " of " + numChars); 
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
destMap	TokenNameIdentifier	 dest Map
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
extent	TokenNameIdentifier	 extent
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
extent	TokenNameIdentifier	 extent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// We Just want it to do BIDI for us... 	TokenNameCOMMENT_LINE	We Just want it to do BIDI for us... 
// In 1.4 we might be able to use the BIDI class... 	TokenNameCOMMENT_LINE	In 1.4 we might be able to use the BIDI class... 
TextLayout	TokenNameIdentifier	 Text Layout
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
new	TokenNamenew	
TextLayout	TokenNameIdentifier	 Text Layout
(	TokenNameLPAREN	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charIndices	TokenNameIdentifier	 char Indices
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numChars	TokenNameIdentifier	 num Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charLevels	TokenNameIdentifier	 char Levels
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numChars	TokenNameIdentifier	 num Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
currBiDi	TokenNameIdentifier	 curr Bi Di
=	TokenNameEQUAL	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
getCharacterLevel	TokenNameIdentifier	 get Character Level
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currBiDi	TokenNameIdentifier	 curr Bi Di
;	TokenNameSEMICOLON	
int	TokenNameint	
maxBiDi	TokenNameIdentifier	 max Bi Di
=	TokenNameEQUAL	
currBiDi	TokenNameIdentifier	 curr Bi Di
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newBiDi	TokenNameIdentifier	 new Bi Di
=	TokenNameEQUAL	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
getCharacterLevel	TokenNameIdentifier	 get Character Level
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newBiDi	TokenNameIdentifier	 new Bi Di
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newBiDi	TokenNameIdentifier	 new Bi Di
!=	TokenNameNOT_EQUAL	
currBiDi	TokenNameIdentifier	 curr Bi Di
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
BIDI_LEVEL	TokenNameIdentifier	 BIDI  LEVEL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
currBiDi	TokenNameIdentifier	 curr Bi Di
)	TokenNameRPAREN	
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
currBiDi	TokenNameIdentifier	 curr Bi Di
=	TokenNameEQUAL	
newBiDi	TokenNameIdentifier	 new Bi Di
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newBiDi	TokenNameIdentifier	 new Bi Di
>	TokenNameGREATER	
maxBiDi	TokenNameIdentifier	 max Bi Di
)	TokenNameRPAREN	
maxBiDi	TokenNameIdentifier	 max Bi Di
=	TokenNameEQUAL	
newBiDi	TokenNameIdentifier	 new Bi Di
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
BIDI_LEVEL	TokenNameIdentifier	 BIDI  LEVEL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
currBiDi	TokenNameIdentifier	 curr Bi Di
)	TokenNameRPAREN	
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
numChars	TokenNameIdentifier	 num Chars
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
runStart	TokenNameIdentifier	 run Start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currBiDi	TokenNameIdentifier	 curr Bi Di
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This avoids all the mucking about we need to do when 	TokenNameCOMMENT_LINE	This avoids all the mucking about we need to do when 
// bidi is actually performed for cases where it 	TokenNameCOMMENT_LINE	bidi is actually performed for cases where it 
// is not actually needed. 	TokenNameCOMMENT_LINE	is not actually needed. 
this	TokenNamethis	
.	TokenNameDOT	
reorderedACI	TokenNameIdentifier	 reordered ACI
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
newCharOrder	TokenNameIdentifier	 new Char Order
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
newCharOrder	TokenNameIdentifier	 new Char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chunkStart	TokenNameIdentifier	 chunk Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// work out the new character order 	TokenNameCOMMENT_LINE	work out the new character order 
newCharOrder	TokenNameIdentifier	 new Char Order
=	TokenNameEQUAL	
doBidiReorder	TokenNameIdentifier	 do Bidi Reorder
(	TokenNameLPAREN	
charIndices	TokenNameIdentifier	 char Indices
,	TokenNameCOMMA	
charLevels	TokenNameIdentifier	 char Levels
,	TokenNameCOMMA	
numChars	TokenNameIdentifier	 num Chars
,	TokenNameCOMMA	
maxBiDi	TokenNameIdentifier	 max Bi Di
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// construct the string in the new order 	TokenNameCOMMENT_LINE	construct the string in the new order 
StringBuffer	TokenNameIdentifier	 String Buffer
reorderedString	TokenNameIdentifier	 reordered String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
int	TokenNameint	
srcIdx	TokenNameIdentifier	 src Idx
=	TokenNameEQUAL	
newCharOrder	TokenNameIdentifier	 new Char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
srcIdx	TokenNameIdentifier	 src Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcIdx	TokenNameIdentifier	 src Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// check for mirrored char 	TokenNameCOMMENT_LINE	check for mirrored char 
int	TokenNameint	
bidiLevel	TokenNameIdentifier	 bidi Level
=	TokenNameEQUAL	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
getCharacterLevel	TokenNameIdentifier	 get Character Level
(	TokenNameLPAREN	
srcIdx	TokenNameIdentifier	 src Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bidiLevel	TokenNameIdentifier	 bidi Level
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bidi level is odd so writing dir is right to left 	TokenNameCOMMENT_LINE	bidi level is odd so writing dir is right to left 
// So get the mirror version of the char if there 	TokenNameCOMMENT_LINE	So get the mirror version of the char if there 
// is one. 	TokenNameCOMMENT_LINE	is one. 
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
mirrorChar	TokenNameIdentifier	 mirror Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reorderedString	TokenNameIdentifier	 reordered String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// construct the reordered ACI 	TokenNameCOMMENT_LINE	construct the reordered ACI 
AttributedString	TokenNameIdentifier	 Attributed String
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
Map	TokenNameIdentifier	 Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Map	TokenNameIdentifier	 Map
[	TokenNameLBRACKET	
numChars	TokenNameIdentifier	 num Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extent	TokenNameIdentifier	 extent
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
extent	TokenNameIdentifier	 extent
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
extent	TokenNameIdentifier	 extent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
prevAttrMap	TokenNameIdentifier	 prev Attr Map
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
newCharOrder	TokenNameIdentifier	 new Char Order
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
newCharOrder	TokenNameIdentifier	 new Char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrMap	TokenNameIdentifier	 attr Map
!=	TokenNameNOT_EQUAL	
prevAttrMap	TokenNameIdentifier	 prev Attr Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Change in attrs set last run... 	TokenNameCOMMENT_LINE	Change in attrs set last run... 
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
prevAttrMap	TokenNameIdentifier	 prev Attr Map
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevAttrMap	TokenNameIdentifier	 prev Attr Map
=	TokenNameEQUAL	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
prevAttrMap	TokenNameIdentifier	 prev Attr Map
,	TokenNameCOMMA	
runStart	TokenNameIdentifier	 run Start
,	TokenNameCOMMA	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// transfer any position atttributes to the new first char 	TokenNameCOMMENT_LINE	transfer any position atttributes to the new first char 
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
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
FLOAT_NAN	TokenNameIdentifier	 FLOAT  NAN
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
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
FLOAT_NAN	TokenNameIdentifier	 FLOAT  NAN
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
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
Float	TokenNameIdentifier	 Float
dx	TokenNameIdentifier	 dx
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
DX	TokenNameIdentifier	 DX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
dx	TokenNameIdentifier	 dx
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
DX	TokenNameIdentifier	 DX
,	TokenNameCOMMA	
FLOAT_NAN	TokenNameIdentifier	 FLOAT  NAN
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
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
DX	TokenNameIdentifier	 DX
,	TokenNameCOMMA	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Float	TokenNameIdentifier	 Float
dy	TokenNameIdentifier	 dy
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
DY	TokenNameIdentifier	 DY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
dy	TokenNameIdentifier	 dy
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
DY	TokenNameIdentifier	 DY
,	TokenNameCOMMA	
FLOAT_NAN	TokenNameIdentifier	 FLOAT  NAN
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
,	TokenNameCOMMA	
reorderedFirstChar	TokenNameIdentifier	 reordered First Char
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
DY	TokenNameIdentifier	 DY
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assign arabic form attributes to any arabic chars in the string 	TokenNameCOMMENT_LINE	assign arabic form attributes to any arabic chars in the string 
reorderedAS	TokenNameIdentifier	 reordered AS
=	TokenNameEQUAL	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
assignArabicForms	TokenNameIdentifier	 assign Arabic Forms
(	TokenNameLPAREN	
reorderedAS	TokenNameIdentifier	 reordered AS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Shift the values to match the source text string... 	TokenNameCOMMENT_LINE	Shift the values to match the source text string... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
newCharOrder	TokenNameIdentifier	 new Char Order
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newCharOrder	TokenNameIdentifier	 new Char Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reorderedACI	TokenNameIdentifier	 reordered ACI
=	TokenNameEQUAL	
reorderedAS	TokenNameIdentifier	 reordered AS
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns an array that give the character index in the source ACI for 	TokenNameCOMMENT_LINE	Returns an array that give the character index in the source ACI for 
// each character in this ACI. 	TokenNameCOMMENT_LINE	each character in this ACI. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCharMap	TokenNameIdentifier	 get Char Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newCharOrder	TokenNameIdentifier	 new Char Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the display order of the characters based on the specified * character levels. This method is recursive. * * @param charIndices An array contianing the original indices of each char. * @param charLevels An array containing the current levels of each char. * @param numChars The number of chars to reorder. * * @return An array contianing the reordered character indices. */	TokenNameCOMMENT_JAVADOC	 Calculates the display order of the characters based on the specified character levels. This method is recursive. * @param charIndices An array contianing the original indices of each char. @param charLevels An array containing the current levels of each char. @param numChars The number of chars to reorder. * @return An array contianing the reordered character indices. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
doBidiReorder	TokenNameIdentifier	 do Bidi Reorder
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charIndices	TokenNameIdentifier	 char Indices
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charLevels	TokenNameIdentifier	 char Levels
,	TokenNameCOMMA	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
,	TokenNameCOMMA	
int	TokenNameint	
highestLevel	TokenNameIdentifier	 highest Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
highestLevel	TokenNameIdentifier	 highest Level
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
charIndices	TokenNameIdentifier	 char Indices
;	TokenNameSEMICOLON	
// find all groups of chars at the highest level and reverse 	TokenNameCOMMENT_LINE	find all groups of chars at the highest level and reverse 
// their order 	TokenNameCOMMENT_LINE	their order 
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find the first char at the highest index 	TokenNameCOMMENT_LINE	find the first char at the highest index 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
<	TokenNameLESS	
highestLevel	TokenNameIdentifier	 highest Level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
==	TokenNameEQUAL_EQUAL	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// have reached the end of the string 	TokenNameCOMMENT_LINE	have reached the end of the string 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// now find the index where the run at the highestLevel end 	TokenNameCOMMENT_LINE	now find the index where the run at the highestLevel end 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
highestLevel	TokenNameIdentifier	 highest Level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// now reverse the chars between startIndex and endIndex 	TokenNameCOMMENT_LINE	now reverse the chars between startIndex and endIndex 
// Calculate the middle of the swap region, we include 	TokenNameCOMMENT_LINE	Calculate the middle of the swap region, we include 
// the middle char when region is an odd number of 	TokenNameCOMMENT_LINE	the middle char when region is an odd number of 
// chars wide so we properly decrement it's charLevel. 	TokenNameCOMMENT_LINE	chars wide so we properly decrement it's charLevel. 
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
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
middle	TokenNameIdentifier	 middle
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
startIndex	TokenNameIdentifier	 start Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
startIndex	TokenNameIdentifier	 start Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charIndices	TokenNameIdentifier	 char Indices
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
startIndex	TokenNameIdentifier	 start Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
highestLevel	TokenNameIdentifier	 highest Level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charLevels	TokenNameIdentifier	 char Levels
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
highestLevel	TokenNameIdentifier	 highest Level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doBidiReorder	TokenNameIdentifier	 do Bidi Reorder
(	TokenNameLPAREN	
charIndices	TokenNameIdentifier	 char Indices
,	TokenNameCOMMA	
charLevels	TokenNameIdentifier	 char Levels
,	TokenNameCOMMA	
numChars	TokenNameIdentifier	 num Chars
,	TokenNameCOMMA	
highestLevel	TokenNameIdentifier	 highest Level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the keys of all attributes defined on the iterator's text range. */	TokenNameCOMMENT_JAVADOC	 Get the keys of all attributes defined on the iterator's text range. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of the named attribute for the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the value of the named attribute for the current character. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a map with the attributes defined on the current * character. */	TokenNameCOMMENT_JAVADOC	 Returns a map with the attributes defined on the current character. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to all attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attribute containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attribute containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to all attributes containing the current character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to the given attribute containing the current character. * @param attribute The attribute for whose appearance the first offset * is requested. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attribute containing the current character. @param attribute The attribute for whose appearance the first offset is requested. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to the given attributes containing the current character. * @param attributes the Set of attributes which begins at the returned index. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attributes containing the current character. @param attributes the Set of attributes which begins at the returned index. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a copy of this iterator. */	TokenNameCOMMENT_JAVADOC	 Creates a copy of this iterator. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BidiAttributedCharacterIterator	TokenNameIdentifier	 Bidi Attributed Character Iterator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
)	TokenNameRPAREN	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
chunkStart	TokenNameIdentifier	 chunk Start
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
newCharOrder	TokenNameIdentifier	 new Char Order
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the character at the current position (as returned by getIndex()). */	TokenNameCOMMENT_JAVADOC	 Gets the character at the current position (as returned by getIndex()). 
public	TokenNamepublic	
char	TokenNamechar	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getBeginIndex() and returns the character at * that position. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getBeginIndex() and returns the character at that position. 
public	TokenNamepublic	
char	TokenNamechar	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start index of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the start index of the text. 
public	TokenNamepublic	
int	TokenNameint	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end index of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the end index of the text. 
public	TokenNamepublic	
int	TokenNameint	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current index. */	TokenNameCOMMENT_JAVADOC	 Returns the current index. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) * and returns the character at that position. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) and returns the character at that position. 
public	TokenNamepublic	
char	TokenNamechar	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increments the iterator's index by one and returns the character at * the new index. */	TokenNameCOMMENT_JAVADOC	 Increments the iterator's index by one and returns the character at the new index. 
public	TokenNamepublic	
char	TokenNamechar	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decrements the iterator's index by one and returns the character at the new index. */	TokenNameCOMMENT_JAVADOC	 Decrements the iterator's index by one and returns the character at the new index. 
public	TokenNamepublic	
char	TokenNamechar	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to the specified position in the text and returns that character. */	TokenNameCOMMENT_JAVADOC	 Sets the position to the specified position in the text and returns that character. 
public	TokenNamepublic	
char	TokenNamechar	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reorderedACI	TokenNameIdentifier	 reordered ACI
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param c the character to 'mirror' * @return either the 'mirror'-character for c or c itself */	TokenNameCOMMENT_JAVADOC	 @param c the character to 'mirror' @return either the 'mirror'-character for c or c itself 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
mirrorChar	TokenNameIdentifier	 mirror Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// note: the switch-statement is compiled to a tableswitch, 	TokenNameCOMMENT_LINE	note: the switch-statement is compiled to a tableswitch, 
// which is evaluated by doing a binary search through the sorted case-list. 	TokenNameCOMMENT_LINE	which is evaluated by doing a binary search through the sorted case-list. 
// the ca 130 cases are searched with max 8 compares 	TokenNameCOMMENT_LINE	the ca 130 cases are searched with max 8 compares 
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set up the mirrored glyph case statement; 	TokenNameCOMMENT_LINE	set up the mirrored glyph case statement; 
case	TokenNamecase	
0x0028	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x0029	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	LEFT PARENTHESIS 
case	TokenNamecase	
0x0029	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x0028	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	RIGHT PARENTHESIS 
case	TokenNamecase	
0x003C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x003E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN SIGN 	TokenNameCOMMENT_LINE	LESS-THAN SIGN 
case	TokenNamecase	
0x003E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x003C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN SIGN 	TokenNameCOMMENT_LINE	GREATER-THAN SIGN 
case	TokenNamecase	
0x005B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x005D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT SQUARE BRACKET 	TokenNameCOMMENT_LINE	LEFT SQUARE BRACKET 
case	TokenNamecase	
0x005D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x005B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT SQUARE BRACKET 	TokenNameCOMMENT_LINE	RIGHT SQUARE BRACKET 
case	TokenNamecase	
0x007B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x007D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT CURLY BRACKET 	TokenNameCOMMENT_LINE	LEFT CURLY BRACKET 
case	TokenNamecase	
0x007D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x007B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT CURLY BRACKET 	TokenNameCOMMENT_LINE	RIGHT CURLY BRACKET 
case	TokenNamecase	
0x00AB	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x00BB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT-POINTING DOUBLE ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	LEFT-POINTING DOUBLE ANGLE QUOTATION MARK 
case	TokenNamecase	
0x00BB	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x00AB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK 
case	TokenNamecase	
0x2039	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x203A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SINGLE LEFT-POINTING ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	SINGLE LEFT-POINTING ANGLE QUOTATION MARK 
case	TokenNamecase	
0x203A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2039	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SINGLE RIGHT-POINTING ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	SINGLE RIGHT-POINTING ANGLE QUOTATION MARK 
case	TokenNamecase	
0x2045	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2046	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT SQUARE BRACKET WITH QUILL 	TokenNameCOMMENT_LINE	LEFT SQUARE BRACKET WITH QUILL 
case	TokenNamecase	
0x2046	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2045	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT SQUARE BRACKET WITH QUILL 	TokenNameCOMMENT_LINE	RIGHT SQUARE BRACKET WITH QUILL 
case	TokenNamecase	
0x207D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x207E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUPERSCRIPT LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	SUPERSCRIPT LEFT PARENTHESIS 
case	TokenNamecase	
0x207E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x207D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUPERSCRIPT RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	SUPERSCRIPT RIGHT PARENTHESIS 
case	TokenNamecase	
0x208D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x208E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUBSCRIPT LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	SUBSCRIPT LEFT PARENTHESIS 
case	TokenNamecase	
0x208E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x208D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUBSCRIPT RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	SUBSCRIPT RIGHT PARENTHESIS 
case	TokenNamecase	
0x2208	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x220B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//ELEMENT OF 	TokenNameCOMMENT_LINE	ELEMENT OF 
case	TokenNamecase	
0x2209	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x220C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//NOT AN ELEMENT OF 	TokenNameCOMMENT_LINE	NOT AN ELEMENT OF 
case	TokenNamecase	
0x220A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x220D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SMALL ELEMENT OF 	TokenNameCOMMENT_LINE	SMALL ELEMENT OF 
case	TokenNamecase	
0x220B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2208	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//CONTAINS AS MEMBER 	TokenNameCOMMENT_LINE	CONTAINS AS MEMBER 
case	TokenNamecase	
0x220C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2209	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//DOES NOT CONTAIN AS MEMBER 	TokenNameCOMMENT_LINE	DOES NOT CONTAIN AS MEMBER 
case	TokenNamecase	
0x220D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x220A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SMALL CONTAINS AS MEMBER 	TokenNameCOMMENT_LINE	SMALL CONTAINS AS MEMBER 
case	TokenNamecase	
0x223C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x223D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//TILDE OPERATOR 	TokenNameCOMMENT_LINE	TILDE OPERATOR 
case	TokenNamecase	
0x223D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x223C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//REVERSED TILDE 	TokenNameCOMMENT_LINE	REVERSED TILDE 
case	TokenNamecase	
0x2243	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22CD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//ASYMPTOTICALLY EQUAL TO 	TokenNameCOMMENT_LINE	ASYMPTOTICALLY EQUAL TO 
case	TokenNamecase	
0x2252	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2253	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//APPROXIMATELY EQUAL TO OR THE IMAGE OF 	TokenNameCOMMENT_LINE	APPROXIMATELY EQUAL TO OR THE IMAGE OF 
case	TokenNamecase	
0x2253	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2252	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//IMAGE OF OR APPROXIMATELY EQUAL TO 	TokenNameCOMMENT_LINE	IMAGE OF OR APPROXIMATELY EQUAL TO 
case	TokenNamecase	
0x2254	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//COLON EQUALS 	TokenNameCOMMENT_LINE	COLON EQUALS 
case	TokenNamecase	
0x2255	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2254	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//EQUALS COLON 	TokenNameCOMMENT_LINE	EQUALS COLON 
case	TokenNamecase	
0x2264	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2265	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN OR EQUAL TO 	TokenNameCOMMENT_LINE	LESS-THAN OR EQUAL TO 
case	TokenNamecase	
0x2265	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2264	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN OR EQUAL TO 	TokenNameCOMMENT_LINE	GREATER-THAN OR EQUAL TO 
case	TokenNamecase	
0x2266	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2267	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN OVER EQUAL TO 	TokenNameCOMMENT_LINE	LESS-THAN OVER EQUAL TO 
case	TokenNamecase	
0x2267	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2266	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN OVER EQUAL TO 	TokenNameCOMMENT_LINE	GREATER-THAN OVER EQUAL TO 
case	TokenNamecase	
0x2268	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2269	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LESS-THAN BUT NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] LESS-THAN BUT NOT EQUAL TO 
case	TokenNamecase	
0x2269	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2268	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] GREATER-THAN BUT NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] GREATER-THAN BUT NOT EQUAL TO 
case	TokenNamecase	
0x226A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x226B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//MUCH LESS-THAN 	TokenNameCOMMENT_LINE	MUCH LESS-THAN 
case	TokenNamecase	
0x226B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x226A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//MUCH GREATER-THAN 	TokenNameCOMMENT_LINE	MUCH GREATER-THAN 
case	TokenNamecase	
0x226E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x226F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT LESS-THAN 	TokenNameCOMMENT_LINE	[BEST FIT] NOT LESS-THAN 
case	TokenNamecase	
0x226F	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x226E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT GREATER-THAN 	TokenNameCOMMENT_LINE	[BEST FIT] NOT GREATER-THAN 
case	TokenNamecase	
0x2270	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2271	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER LESS-THAN NOR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER LESS-THAN NOR EQUAL TO 
case	TokenNamecase	
0x2271	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2270	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER GREATER-THAN NOR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER GREATER-THAN NOR EQUAL TO 
case	TokenNamecase	
0x2272	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2273	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LESS-THAN OR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] LESS-THAN OR EQUIVALENT TO 
case	TokenNamecase	
0x2273	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2272	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] GREATER-THAN OR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] GREATER-THAN OR EQUIVALENT TO 
case	TokenNamecase	
0x2274	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2275	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER LESS-THAN NOR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER LESS-THAN NOR EQUIVALENT TO 
case	TokenNamecase	
0x2275	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2274	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER GREATER-THAN NOR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER GREATER-THAN NOR EQUIVALENT TO 
case	TokenNamecase	
0x2276	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2277	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN OR GREATER-THAN 	TokenNameCOMMENT_LINE	LESS-THAN OR GREATER-THAN 
case	TokenNamecase	
0x2277	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2276	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN OR LESS-THAN 	TokenNameCOMMENT_LINE	GREATER-THAN OR LESS-THAN 
case	TokenNamecase	
0x2278	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2279	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//NEITHER LESS-THAN NOR GREATER-THAN 	TokenNameCOMMENT_LINE	NEITHER LESS-THAN NOR GREATER-THAN 
case	TokenNamecase	
0x2279	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2278	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//NEITHER GREATER-THAN NOR LESS-THAN 	TokenNameCOMMENT_LINE	NEITHER GREATER-THAN NOR LESS-THAN 
case	TokenNamecase	
0x227A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//PRECEDES 	TokenNameCOMMENT_LINE	PRECEDES 
case	TokenNamecase	
0x227B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUCCEEDS 	TokenNameCOMMENT_LINE	SUCCEEDS 
case	TokenNamecase	
0x227C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//PRECEDES OR EQUAL TO 	TokenNameCOMMENT_LINE	PRECEDES OR EQUAL TO 
case	TokenNamecase	
0x227D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUCCEEDS OR EQUAL TO 	TokenNameCOMMENT_LINE	SUCCEEDS OR EQUAL TO 
case	TokenNamecase	
0x227E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] PRECEDES OR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] PRECEDES OR EQUIVALENT TO 
case	TokenNamecase	
0x227F	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x227E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SUCCEEDS OR EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] SUCCEEDS OR EQUIVALENT TO 
case	TokenNamecase	
0x2280	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2281	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT PRECEDE 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT PRECEDE 
case	TokenNamecase	
0x2281	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2280	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT SUCCEED 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT SUCCEED 
case	TokenNamecase	
0x2282	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2283	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUBSET OF 	TokenNameCOMMENT_LINE	SUBSET OF 
case	TokenNamecase	
0x2283	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2282	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUPERSET OF 	TokenNameCOMMENT_LINE	SUPERSET OF 
case	TokenNamecase	
0x2284	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2285	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT A SUBSET OF 	TokenNameCOMMENT_LINE	[BEST FIT] NOT A SUBSET OF 
case	TokenNamecase	
0x2285	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2284	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT A SUPERSET OF 	TokenNameCOMMENT_LINE	[BEST FIT] NOT A SUPERSET OF 
case	TokenNamecase	
0x2286	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2287	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUBSET OF OR EQUAL TO 	TokenNameCOMMENT_LINE	SUBSET OF OR EQUAL TO 
case	TokenNamecase	
0x2287	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2286	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUPERSET OF OR EQUAL TO 	TokenNameCOMMENT_LINE	SUPERSET OF OR EQUAL TO 
case	TokenNamecase	
0x2288	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2289	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER A SUBSET OF NOR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER A SUBSET OF NOR EQUAL TO 
case	TokenNamecase	
0x2289	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2288	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NEITHER A SUPERSET OF NOR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NEITHER A SUPERSET OF NOR EQUAL TO 
case	TokenNamecase	
0x228A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x228B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SUBSET OF WITH NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] SUBSET OF WITH NOT EQUAL TO 
case	TokenNamecase	
0x228B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x228A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SUPERSET OF WITH NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] SUPERSET OF WITH NOT EQUAL TO 
case	TokenNamecase	
0x228F	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2290	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SQUARE IMAGE OF 	TokenNameCOMMENT_LINE	SQUARE IMAGE OF 
case	TokenNamecase	
0x2290	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x228F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SQUARE ORIGINAL OF 	TokenNameCOMMENT_LINE	SQUARE ORIGINAL OF 
case	TokenNamecase	
0x2291	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2292	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SQUARE IMAGE OF OR EQUAL TO 	TokenNameCOMMENT_LINE	SQUARE IMAGE OF OR EQUAL TO 
case	TokenNamecase	
0x2292	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2291	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SQUARE ORIGINAL OF OR EQUAL TO 	TokenNameCOMMENT_LINE	SQUARE ORIGINAL OF OR EQUAL TO 
case	TokenNamecase	
0x22A2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22A3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT TACK 	TokenNameCOMMENT_LINE	RIGHT TACK 
case	TokenNamecase	
0x22A3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22A2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT TACK 	TokenNameCOMMENT_LINE	LEFT TACK 
case	TokenNamecase	
0x22B0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//PRECEDES UNDER RELATION 	TokenNameCOMMENT_LINE	PRECEDES UNDER RELATION 
case	TokenNamecase	
0x22B1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//SUCCEEDS UNDER RELATION 	TokenNameCOMMENT_LINE	SUCCEEDS UNDER RELATION 
case	TokenNamecase	
0x22B2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//NORMAL SUBGROUP OF 	TokenNameCOMMENT_LINE	NORMAL SUBGROUP OF 
case	TokenNamecase	
0x22B3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//CONTAINS AS NORMAL SUBGROUP 	TokenNameCOMMENT_LINE	CONTAINS AS NORMAL SUBGROUP 
case	TokenNamecase	
0x22B4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//NORMAL SUBGROUP OF OR EQUAL TO 	TokenNameCOMMENT_LINE	NORMAL SUBGROUP OF OR EQUAL TO 
case	TokenNamecase	
0x22B5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//CONTAINS AS NORMAL SUBGROUP OR EQUAL TO 	TokenNameCOMMENT_LINE	CONTAINS AS NORMAL SUBGROUP OR EQUAL TO 
case	TokenNamecase	
0x22B6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//ORIGINAL OF 	TokenNameCOMMENT_LINE	ORIGINAL OF 
case	TokenNamecase	
0x22B7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22B6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//IMAGE OF 	TokenNameCOMMENT_LINE	IMAGE OF 
case	TokenNamecase	
0x22C9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22CA	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT NORMAL FACTOR SEMIDIRECT PRODUCT 	TokenNameCOMMENT_LINE	LEFT NORMAL FACTOR SEMIDIRECT PRODUCT 
case	TokenNamecase	
0x22CA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22C9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT NORMAL FACTOR SEMIDIRECT PRODUCT 	TokenNameCOMMENT_LINE	RIGHT NORMAL FACTOR SEMIDIRECT PRODUCT 
case	TokenNamecase	
0x22CB	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22CC	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT SEMIDIRECT PRODUCT 	TokenNameCOMMENT_LINE	LEFT SEMIDIRECT PRODUCT 
case	TokenNamecase	
0x22CC	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22CB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT SEMIDIRECT PRODUCT 	TokenNameCOMMENT_LINE	RIGHT SEMIDIRECT PRODUCT 
case	TokenNamecase	
0x22CD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2243	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//REVERSED TILDE EQUALS 	TokenNameCOMMENT_LINE	REVERSED TILDE EQUALS 
case	TokenNamecase	
0x22D0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//DOUBLE SUBSET 	TokenNameCOMMENT_LINE	DOUBLE SUBSET 
case	TokenNamecase	
0x22D1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//DOUBLE SUPERSET 	TokenNameCOMMENT_LINE	DOUBLE SUPERSET 
case	TokenNamecase	
0x22D6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN WITH DOT 	TokenNameCOMMENT_LINE	LESS-THAN WITH DOT 
case	TokenNamecase	
0x22D7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN WITH DOT 	TokenNameCOMMENT_LINE	GREATER-THAN WITH DOT 
case	TokenNamecase	
0x22D8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//VERY MUCH LESS-THAN 	TokenNameCOMMENT_LINE	VERY MUCH LESS-THAN 
case	TokenNamecase	
0x22D9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22D8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//VERY MUCH GREATER-THAN 	TokenNameCOMMENT_LINE	VERY MUCH GREATER-THAN 
case	TokenNamecase	
0x22DA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LESS-THAN EQUAL TO OR GREATER-THAN 	TokenNameCOMMENT_LINE	LESS-THAN EQUAL TO OR GREATER-THAN 
case	TokenNamecase	
0x22DB	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DA	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//GREATER-THAN EQUAL TO OR LESS-THAN 	TokenNameCOMMENT_LINE	GREATER-THAN EQUAL TO OR LESS-THAN 
case	TokenNamecase	
0x22DC	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//EQUAL TO OR LESS-THAN 	TokenNameCOMMENT_LINE	EQUAL TO OR LESS-THAN 
case	TokenNamecase	
0x22DD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DC	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//EQUAL TO OR GREATER-THAN 	TokenNameCOMMENT_LINE	EQUAL TO OR GREATER-THAN 
case	TokenNamecase	
0x22DE	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//EQUAL TO OR PRECEDES 	TokenNameCOMMENT_LINE	EQUAL TO OR PRECEDES 
case	TokenNamecase	
0x22DF	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22DE	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//EQUAL TO OR SUCCEEDS 	TokenNameCOMMENT_LINE	EQUAL TO OR SUCCEEDS 
case	TokenNamecase	
0x22E0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT PRECEDE OR EQUAL 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT PRECEDE OR EQUAL 
case	TokenNamecase	
0x22E1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT SUCCEED OR EQUAL 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT SUCCEED OR EQUAL 
case	TokenNamecase	
0x22E2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT SQUARE IMAGE OF OR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NOT SQUARE IMAGE OF OR EQUAL TO 
case	TokenNamecase	
0x22E3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT SQUARE ORIGINAL OF OR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NOT SQUARE ORIGINAL OF OR EQUAL TO 
case	TokenNamecase	
0x22E4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SQUARE IMAGE OF OR NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] SQUARE IMAGE OF OR NOT EQUAL TO 
case	TokenNamecase	
0x22E5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SQUARE ORIGINAL OF OR NOT EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] SQUARE ORIGINAL OF OR NOT EQUAL TO 
case	TokenNamecase	
0x22E6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LESS-THAN BUT NOT EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] LESS-THAN BUT NOT EQUIVALENT TO 
case	TokenNamecase	
0x22E7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] GREATER-THAN BUT NOT EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] GREATER-THAN BUT NOT EQUIVALENT TO 
case	TokenNamecase	
0x22E8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] PRECEDES BUT NOT EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] PRECEDES BUT NOT EQUIVALENT TO 
case	TokenNamecase	
0x22E9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22E8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] SUCCEEDS BUT NOT EQUIVALENT TO 	TokenNameCOMMENT_LINE	[BEST FIT] SUCCEEDS BUT NOT EQUIVALENT TO 
case	TokenNamecase	
0x22EA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22EB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT NORMAL SUBGROUP OF 	TokenNameCOMMENT_LINE	[BEST FIT] NOT NORMAL SUBGROUP OF 
case	TokenNamecase	
0x22EB	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22EA	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT CONTAIN AS NORMAL SUBGROUP 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT CONTAIN AS NORMAL SUBGROUP 
case	TokenNamecase	
0x22EC	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22ED	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] NOT NORMAL SUBGROUP OF OR EQUAL TO 	TokenNameCOMMENT_LINE	[BEST FIT] NOT NORMAL SUBGROUP OF OR EQUAL TO 
case	TokenNamecase	
0x22ED	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22EC	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] DOES NOT CONTAIN AS NORMAL SUBGROUP OR EQUAL 	TokenNameCOMMENT_LINE	[BEST FIT] DOES NOT CONTAIN AS NORMAL SUBGROUP OR EQUAL 
case	TokenNamecase	
0x22F0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22F1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//UP RIGHT DIAGONAL ELLIPSIS 	TokenNameCOMMENT_LINE	UP RIGHT DIAGONAL ELLIPSIS 
case	TokenNamecase	
0x22F1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x22F0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//DOWN RIGHT DIAGONAL ELLIPSIS 	TokenNameCOMMENT_LINE	DOWN RIGHT DIAGONAL ELLIPSIS 
case	TokenNamecase	
0x2308	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2309	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT CEILING 	TokenNameCOMMENT_LINE	LEFT CEILING 
case	TokenNamecase	
0x2309	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2308	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT CEILING 	TokenNameCOMMENT_LINE	RIGHT CEILING 
case	TokenNamecase	
0x230A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x230B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT FLOOR 	TokenNameCOMMENT_LINE	LEFT FLOOR 
case	TokenNamecase	
0x230B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x230A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT FLOOR 	TokenNameCOMMENT_LINE	RIGHT FLOOR 
case	TokenNamecase	
0x2329	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x232A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT-POINTING ANGLE BRACKET 	TokenNameCOMMENT_LINE	LEFT-POINTING ANGLE BRACKET 
case	TokenNamecase	
0x232A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x2329	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT-POINTING ANGLE BRACKET 	TokenNameCOMMENT_LINE	RIGHT-POINTING ANGLE BRACKET 
case	TokenNamecase	
0x3008	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3009	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT ANGLE BRACKET 	TokenNameCOMMENT_LINE	LEFT ANGLE BRACKET 
case	TokenNamecase	
0x3009	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT ANGLE BRACKET 	TokenNameCOMMENT_LINE	RIGHT ANGLE BRACKET 
case	TokenNamecase	
0x300A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT DOUBLE ANGLE BRACKET 	TokenNameCOMMENT_LINE	LEFT DOUBLE ANGLE BRACKET 
case	TokenNamecase	
0x300B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT DOUBLE ANGLE BRACKET 	TokenNameCOMMENT_LINE	RIGHT DOUBLE ANGLE BRACKET 
case	TokenNamecase	
0x300C	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LEFT CORNER BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] LEFT CORNER BRACKET 
case	TokenNamecase	
0x300D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] RIGHT CORNER BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] RIGHT CORNER BRACKET 
case	TokenNamecase	
0x300E	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LEFT WHITE CORNER BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] LEFT WHITE CORNER BRACKET 
case	TokenNamecase	
0x300F	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x300E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] RIGHT WHITE CORNER BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] RIGHT WHITE CORNER BRACKET 
case	TokenNamecase	
0x3010	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3011	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT BLACK LENTICULAR BRACKET 	TokenNameCOMMENT_LINE	LEFT BLACK LENTICULAR BRACKET 
case	TokenNamecase	
0x3011	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3010	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT BLACK LENTICULAR BRACKET 	TokenNameCOMMENT_LINE	RIGHT BLACK LENTICULAR BRACKET 
case	TokenNamecase	
0x3014	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] LEFT TORTOISE SHELL BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] LEFT TORTOISE SHELL BRACKET 
case	TokenNamecase	
0x3015	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3014	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//[BEST FIT] RIGHT TORTOISE SHELL BRACKET 	TokenNameCOMMENT_LINE	[BEST FIT] RIGHT TORTOISE SHELL BRACKET 
case	TokenNamecase	
0x3016	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3017	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT WHITE LENTICULAR BRACKET 	TokenNameCOMMENT_LINE	LEFT WHITE LENTICULAR BRACKET 
case	TokenNamecase	
0x3017	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3016	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT WHITE LENTICULAR BRACKET 	TokenNameCOMMENT_LINE	RIGHT WHITE LENTICULAR BRACKET 
case	TokenNamecase	
0x3018	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3019	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT WHITE TORTOISE SHELL BRACKET 	TokenNameCOMMENT_LINE	LEFT WHITE TORTOISE SHELL BRACKET 
case	TokenNamecase	
0x3019	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x3018	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT WHITE TORTOISE SHELL BRACKET 	TokenNameCOMMENT_LINE	RIGHT WHITE TORTOISE SHELL BRACKET 
case	TokenNamecase	
0x301A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x301B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//LEFT WHITE SQUARE BRACKET 	TokenNameCOMMENT_LINE	LEFT WHITE SQUARE BRACKET 
case	TokenNamecase	
0x301B	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
0x301A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//RIGHT WHITE SQUARE BRACKET 	TokenNameCOMMENT_LINE	RIGHT WHITE SQUARE BRACKET 
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

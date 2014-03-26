/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
/** * Boyer-Moore searcher. * * @xerces.internal * * @version $Id: BMPattern.java 572108 2007-09-02 18:48:31Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Boyer-Moore searcher. * @xerces.internal * @version $Id: BMPattern.java 572108 2007-09-02 18:48:31Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
BMPattern	TokenNameIdentifier	 BM Pattern
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shiftTable	TokenNameIdentifier	 shift Table
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BMPattern	TokenNameIdentifier	 BM Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
256	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BMPattern	TokenNameIdentifier	 BM Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
int	TokenNameint	
tableSize	TokenNameIdentifier	 table Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tableSize	TokenNameIdentifier	 table Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @return -1 if <var>iterator</var> does not contain this pattern. */	TokenNameCOMMENT_JAVADOC	 * @return -1 if <var>iterator</var> does not contain this pattern. 
public	TokenNamepublic	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return -1 if <var>str</var> does not contain this pattern. */	TokenNameCOMMENT_JAVADOC	 * @return -1 if <var>str</var> does not contain this pattern. 
public	TokenNamepublic	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Starts at "+index); 	TokenNameCOMMENT_LINE	System.err.println("Starts at "+index); 
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return -1 if <var>chars</char> does not contain this pattern. */	TokenNameCOMMENT_JAVADOC	 * @return -1 if <var>chars</char> does not contain this pattern. 
public	TokenNamepublic	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Starts at "+index); 	TokenNameCOMMENT_LINE	System.err.println("Starts at "+index); 
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
matchesIgnoreCase	TokenNameIdentifier	 matches Ignore Case
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
plength	TokenNameIdentifier	 plength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plength	TokenNameIdentifier	 plength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
plength	TokenNameIdentifier	 plength
;	TokenNameSEMICOLON	
int	TokenNameint	
nindex	TokenNameIdentifier	 nindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pindex	TokenNameIdentifier	 pindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
this	TokenNamethis	
.	TokenNameDOT	
shiftTable	TokenNameIdentifier	 shift Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
nindex	TokenNameIdentifier	 nindex
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nindex	TokenNameIdentifier	 nindex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static void main(String[] argv) { try { int[] shiftTable = new int[256]; initializeBoyerMoore(argv[0], shiftTable, true); int o = -1; CharacterIterator ite = new java.text.StringCharacterIterator(argv[1]); long start = System.currentTimeMillis(); //for (int i = 0; i < 10000; i ++) o = searchIgnoreCasesWithBoyerMoore(ite, 0, argv[0], shiftTable); start = System.currentTimeMillis()-start; System.out.println("Result: "+o+", Elapsed: "+start); } catch (Exception ex) { ex.printStackTrace(); } }*/	TokenNameCOMMENT_BLOCK	 public static void main(String[] argv) { try { int[] shiftTable = new int[256]; initializeBoyerMoore(argv[0], shiftTable, true); int o = -1; CharacterIterator ite = new java.text.StringCharacterIterator(argv[1]); long start = System.currentTimeMillis(); //for (int i = 0; i < 10000; i ++) o = searchIgnoreCasesWithBoyerMoore(ite, 0, argv[0], shiftTable); start = System.currentTimeMillis()-start; System.out.println("Result: "+o+", Elapsed: "+start); } catch (Exception ex) { ex.printStackTrace(); } }
}	TokenNameRBRACE	

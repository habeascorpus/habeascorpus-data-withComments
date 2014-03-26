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
/** * This class represents a character class such as [a-z] or a period. * * @xerces.internal * * @version $Id: RangeToken.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class represents a character class such as [a-z] or a period. * @xerces.internal * @version $Id: RangeToken.java 965250 2010-07-18 16:04:58Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
RangeToken	TokenNameIdentifier	 Range Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
553983121197679934L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ranges	TokenNameIdentifier	 ranges
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sorted	TokenNameIdentifier	 sorted
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
compacted	TokenNameIdentifier	 compacted
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nonMapIndex	TokenNameIdentifier	 non Map Index
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for RANGE or NRANGE 	TokenNameCOMMENT_LINE	for RANGE or NRANGE 
protected	TokenNameprotected	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//System.err.println("Token#addRange(): "+start+" "+end); 	TokenNameCOMMENT_LINE	System.err.println("Token#addRange(): "+start+" "+end); 
int	TokenNameint	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSorted	TokenNameIdentifier	 is Sorted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
sorted	TokenNameIdentifier	 sorted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
boolean	TokenNameboolean	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sorted	TokenNameIdentifier	 sorted
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
compacted	TokenNameIdentifier	 compacted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCompacted	TokenNameIdentifier	 is Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
compacted	TokenNameIdentifier	 compacted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
setCompacted	TokenNameIdentifier	 set Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compacted	TokenNameIdentifier	 compacted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSorted	TokenNameIdentifier	 is Sorted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//System.err.println("Do sorting: "+this.ranges.length); 	TokenNameCOMMENT_LINE	System.err.println("Do sorting: "+this.ranges.length); 
// Bubble sort 	TokenNameCOMMENT_LINE	Bubble sort 
// Why? -- In many cases, 	TokenNameCOMMENT_LINE	Why? -- In many cases, 
// this.ranges has few elements. 	TokenNameCOMMENT_LINE	this.ranges has few elements. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
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
<=	TokenNameLESS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this.ranges is sorted. */	TokenNameCOMMENT_JAVADOC	 this.ranges is sorted. 
protected	TokenNameprotected	
void	TokenNamevoid	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isCompacted	TokenNameIdentifier	 is Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Index of writing point 	TokenNameCOMMENT_LINE	Index of writing point 
int	TokenNameint	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Index of processing point 	TokenNameCOMMENT_LINE	Index of processing point 
while	TokenNamewhile	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
target	TokenNameIdentifier	 target
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
baseend	TokenNameIdentifier	 baseend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseend	TokenNameIdentifier	 baseend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseend	TokenNameIdentifier	 baseend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Token#compactRanges(): Compaction: ["	TokenNameStringLiteral	Token#compactRanges(): Compaction: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"], ["	TokenNameStringLiteral	], [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] -> ["	TokenNameStringLiteral	] -> [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
baseend	TokenNameIdentifier	 baseend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
baseend	TokenNameIdentifier	 baseend
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Token#compactRanges(): Compaction: ["	TokenNameStringLiteral	Token#compactRanges(): Compaction: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"], ["	TokenNameStringLiteral	], [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] -> ["	TokenNameStringLiteral	] -> [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
baseend	TokenNameIdentifier	 baseend
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Token#compactRanges(): Compaction: ["	TokenNameStringLiteral	Token#compactRanges(): Compaction: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"], ["	TokenNameStringLiteral	], [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] -> ["	TokenNameStringLiteral	] -> [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
baseend	TokenNameIdentifier	 baseend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#compactRanges(): Internel Error: ["	TokenNameStringLiteral	Token#compactRanges(): Internel Error: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] ["	TokenNameStringLiteral	] [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while 	TokenNameCOMMENT_LINE	while 
base	TokenNameIdentifier	 base
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setCompacted	TokenNameIdentifier	 set Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSorted	TokenNameIdentifier	 set Sorted
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
NRANGE	TokenNameIdentifier	 NRANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
intersectRanges	TokenNameIdentifier	 intersect Ranges
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("Token#substractRanges(): Entry: "+this.ranges.length+", "+tok.ranges.length); 	TokenNameCOMMENT_LINE	System.err.println("Token#substractRanges(): Entry: "+this.ranges.length+", "+tok.ranges.length); 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
wp	TokenNameIdentifier	 wp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
sub	TokenNameIdentifier	 sub
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
srcbegin	TokenNameIdentifier	 srcbegin
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcend	TokenNameIdentifier	 srcend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
subbegin	TokenNameIdentifier	 subbegin
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
sub	TokenNameIdentifier	 sub
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
subend	TokenNameIdentifier	 subend
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
sub	TokenNameIdentifier	 sub
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcend	TokenNameIdentifier	 srcend
<	TokenNameLESS	
subbegin	TokenNameIdentifier	 subbegin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not overlapped 	TokenNameCOMMENT_LINE	Not overlapped 
// src: o-----o 	TokenNameCOMMENT_LINE	src: o-----o 
// sub: o-----o 	TokenNameCOMMENT_LINE	sub: o-----o 
// res: o-----o 	TokenNameCOMMENT_LINE	res: o-----o 
// Reuse sub 	TokenNameCOMMENT_LINE	Reuse sub 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
srcend	TokenNameIdentifier	 srcend
>=	TokenNameGREATER_EQUAL	
subbegin	TokenNameIdentifier	 subbegin
&&	TokenNameAND_AND	
srcbegin	TokenNameIdentifier	 srcbegin
<=	TokenNameLESS_EQUAL	
subend	TokenNameIdentifier	 subend
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Overlapped 	TokenNameCOMMENT_LINE	Overlapped 
// src: o--------o 	TokenNameCOMMENT_LINE	src: o--------o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// sub: o------------o 	TokenNameCOMMENT_LINE	sub: o------------o 
if	TokenNameif	
(	TokenNameLPAREN	
subbegin	TokenNameIdentifier	 subbegin
<=	TokenNameLESS_EQUAL	
srcbegin	TokenNameIdentifier	 srcbegin
&&	TokenNameAND_AND	
srcend	TokenNameIdentifier	 srcend
<=	TokenNameLESS_EQUAL	
subend	TokenNameIdentifier	 subend
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src: o--------o 	TokenNameCOMMENT_LINE	src: o--------o 
// sub: o------------o 	TokenNameCOMMENT_LINE	sub: o------------o 
// res: empty 	TokenNameCOMMENT_LINE	res: empty 
// Reuse sub 	TokenNameCOMMENT_LINE	Reuse sub 
src	TokenNameIdentifier	 src
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
subbegin	TokenNameIdentifier	 subbegin
<=	TokenNameLESS_EQUAL	
srcbegin	TokenNameIdentifier	 srcbegin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src: o--------o 	TokenNameCOMMENT_LINE	src: o--------o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// res: o-----o 	TokenNameCOMMENT_LINE	res: o-----o 
// Reuse src(=res) 	TokenNameCOMMENT_LINE	Reuse src(=res) 
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subend	TokenNameIdentifier	 subend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
srcend	TokenNameIdentifier	 srcend
<=	TokenNameLESS_EQUAL	
subend	TokenNameIdentifier	 subend
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src: o--------o 	TokenNameCOMMENT_LINE	src: o--------o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// res: o-----o 	TokenNameCOMMENT_LINE	res: o-----o 
// Reuse sub 	TokenNameCOMMENT_LINE	Reuse sub 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcbegin	TokenNameIdentifier	 srcbegin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subbegin	TokenNameIdentifier	 subbegin
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// src: o--------o 	TokenNameCOMMENT_LINE	src: o--------o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
// res: o-o o-o 	TokenNameCOMMENT_LINE	res: o-o o-o 
// Reuse src(=right res) 	TokenNameCOMMENT_LINE	Reuse src(=right res) 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcbegin	TokenNameIdentifier	 srcbegin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subbegin	TokenNameIdentifier	 subbegin
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subend	TokenNameIdentifier	 subend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
subend	TokenNameIdentifier	 subend
<	TokenNameLESS	
srcbegin	TokenNameIdentifier	 srcbegin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not overlapped 	TokenNameCOMMENT_LINE	Not overlapped 
// src: o-----o 	TokenNameCOMMENT_LINE	src: o-----o 
// sub: o----o 	TokenNameCOMMENT_LINE	sub: o----o 
sub	TokenNameIdentifier	 sub
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#subtractRanges(): Internal Error: ["	TokenNameStringLiteral	Token#subtractRanges(): Internal Error: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] - ["	TokenNameStringLiteral	] - [
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
sub	TokenNameIdentifier	 sub
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
sub	TokenNameIdentifier	 sub
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wp	TokenNameIdentifier	 wp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this.ranges is sorted and compacted. 	TokenNameCOMMENT_LINE	this.ranges is sorted and compacted. 
}	TokenNameRBRACE	
/** * @param tok Ignore whether it is NRANGE or not. */	TokenNameCOMMENT_JAVADOC	 @param tok Ignore whether it is NRANGE or not. 
protected	TokenNameprotected	
void	TokenNamevoid	
intersectRanges	TokenNameIdentifier	 intersect Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
wp	TokenNameIdentifier	 wp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src1	TokenNameIdentifier	 src1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src2	TokenNameIdentifier	 src2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
src1	TokenNameIdentifier	 src1
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
src2	TokenNameIdentifier	 src2
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
src1begin	TokenNameIdentifier	 src1begin
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
src1end	TokenNameIdentifier	 src1end
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
src2begin	TokenNameIdentifier	 src2begin
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src2	TokenNameIdentifier	 src2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
src2end	TokenNameIdentifier	 src2end
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src2	TokenNameIdentifier	 src2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src1end	TokenNameIdentifier	 src1end
<	TokenNameLESS	
src2begin	TokenNameIdentifier	 src2begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not overlapped 	TokenNameCOMMENT_LINE	Not overlapped 
// src1: o-----o 	TokenNameCOMMENT_LINE	src1: o-----o 
// src2: o-----o 	TokenNameCOMMENT_LINE	src2: o-----o 
// res: empty 	TokenNameCOMMENT_LINE	res: empty 
// Reuse src2 	TokenNameCOMMENT_LINE	Reuse src2 
src1	TokenNameIdentifier	 src1
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
src1end	TokenNameIdentifier	 src1end
>=	TokenNameGREATER_EQUAL	
src2begin	TokenNameIdentifier	 src2begin
&&	TokenNameAND_AND	
src1begin	TokenNameIdentifier	 src1begin
<=	TokenNameLESS_EQUAL	
src2end	TokenNameIdentifier	 src2end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Overlapped 	TokenNameCOMMENT_LINE	Overlapped 
// src1: o--------o 	TokenNameCOMMENT_LINE	src1: o--------o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// src2: o------------o 	TokenNameCOMMENT_LINE	src2: o------------o 
if	TokenNameif	
(	TokenNameLPAREN	
src2begin	TokenNameIdentifier	 src2begin
<=	TokenNameLESS_EQUAL	
src1begin	TokenNameIdentifier	 src1begin
&&	TokenNameAND_AND	
src1end	TokenNameIdentifier	 src1end
<=	TokenNameLESS_EQUAL	
src2end	TokenNameIdentifier	 src2end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src1: o--------o 	TokenNameCOMMENT_LINE	src1: o--------o 
// src2: o------------o 	TokenNameCOMMENT_LINE	src2: o------------o 
// res: o--------o 	TokenNameCOMMENT_LINE	res: o--------o 
// Reuse src2 	TokenNameCOMMENT_LINE	Reuse src2 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src1begin	TokenNameIdentifier	 src1begin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src1end	TokenNameIdentifier	 src1end
;	TokenNameSEMICOLON	
src1	TokenNameIdentifier	 src1
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
src2begin	TokenNameIdentifier	 src2begin
<=	TokenNameLESS_EQUAL	
src1begin	TokenNameIdentifier	 src1begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src1: o--------o 	TokenNameCOMMENT_LINE	src1: o--------o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// res: o--o 	TokenNameCOMMENT_LINE	res: o--o 
// Reuse the rest of src1 	TokenNameCOMMENT_LINE	Reuse the rest of src1 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src1begin	TokenNameIdentifier	 src1begin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2end	TokenNameIdentifier	 src2end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2end	TokenNameIdentifier	 src2end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
src2	TokenNameIdentifier	 src2
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
src1end	TokenNameIdentifier	 src1end
<=	TokenNameLESS_EQUAL	
src2end	TokenNameIdentifier	 src2end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// src1: o--------o 	TokenNameCOMMENT_LINE	src1: o--------o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// res: o--o 	TokenNameCOMMENT_LINE	res: o--o 
// Reuse src2 	TokenNameCOMMENT_LINE	Reuse src2 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2begin	TokenNameIdentifier	 src2begin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src1end	TokenNameIdentifier	 src1end
;	TokenNameSEMICOLON	
src1	TokenNameIdentifier	 src1
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// src1: o--------o 	TokenNameCOMMENT_LINE	src1: o--------o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
// res: o----o 	TokenNameCOMMENT_LINE	res: o----o 
// Reuse the rest of src1 	TokenNameCOMMENT_LINE	Reuse the rest of src1 
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2begin	TokenNameIdentifier	 src2begin
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2end	TokenNameIdentifier	 src2end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2end	TokenNameIdentifier	 src2end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
src2end	TokenNameIdentifier	 src2end
<	TokenNameLESS	
src1begin	TokenNameIdentifier	 src1begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not overlapped 	TokenNameCOMMENT_LINE	Not overlapped 
// src1: o-----o 	TokenNameCOMMENT_LINE	src1: o-----o 
// src2: o----o 	TokenNameCOMMENT_LINE	src2: o----o 
src2	TokenNameIdentifier	 src2
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#intersectRanges(): Internal Error: ["	TokenNameStringLiteral	Token#intersectRanges(): Internal Error: [
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] & ["	TokenNameStringLiteral	] & [
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src2	TokenNameIdentifier	 src2
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src2	TokenNameIdentifier	 src2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
src1	TokenNameIdentifier	 src1
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
src1	TokenNameIdentifier	 src1
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wp	TokenNameIdentifier	 wp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this.ranges is sorted and compacted. 	TokenNameCOMMENT_LINE	this.ranges is sorted and compacted. 
}	TokenNameRBRACE	
/** * for RANGE: Creates complement. * for NRANGE: Creates the same meaning RANGE. */	TokenNameCOMMENT_JAVADOC	 for RANGE: Creates complement. for NRANGE: Creates the same meaning RANGE. 
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
RANGE	TokenNameIdentifier	 RANGE
&&	TokenNameAND_AND	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
NRANGE	TokenNameIdentifier	 NRANGE
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Token#complementRanges(): must be RANGE: "	TokenNameStringLiteral	Token#complementRanges(): must be RANGE: 
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
wp	TokenNameIdentifier	 wp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
wp	TokenNameIdentifier	 wp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setCompacted	TokenNameIdentifier	 set Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
RangeToken	TokenNameIdentifier	 Range Token
getCaseInsensitiveToken	TokenNameIdentifier	 get Case Insensitive Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
uppers	TokenNameIdentifier	 uppers
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createNRange	TokenNameIdentifier	 create N Range
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
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
uppers	TokenNameIdentifier	 uppers
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
char	TokenNamechar	
uch	TokenNameIdentifier	 uch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uppers	TokenNameIdentifier	 uppers
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
uch	TokenNameIdentifier	 uch
,	TokenNameCOMMA	
uch	TokenNameIdentifier	 uch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
lowers	TokenNameIdentifier	 lowers
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createNRange	TokenNameIdentifier	 create N Range
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
uppers	TokenNameIdentifier	 uppers
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
uppers	TokenNameIdentifier	 uppers
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
uppers	TokenNameIdentifier	 uppers
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
lowers	TokenNameIdentifier	 lowers
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
char	TokenNamechar	
uch	TokenNameIdentifier	 uch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowers	TokenNameIdentifier	 lowers
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
uch	TokenNameIdentifier	 uch
,	TokenNameCOMMA	
uch	TokenNameIdentifier	 uch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lowers	TokenNameIdentifier	 lowers
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
uppers	TokenNameIdentifier	 uppers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowers	TokenNameIdentifier	 lowers
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowers	TokenNameIdentifier	 lowers
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
icaseCache	TokenNameIdentifier	 icase Cache
=	TokenNameEQUAL	
lowers	TokenNameIdentifier	 lowers
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lowers	TokenNameIdentifier	 lowers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
dumpRanges	TokenNameIdentifier	 dump Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"RANGE: "	TokenNameStringLiteral	RANGE: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NULL"	TokenNameStringLiteral	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
createMap	TokenNameIdentifier	 create Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
RANGE	TokenNameIdentifier	 RANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
/	TokenNameDIVIDE	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nonMapIndex	TokenNameIdentifier	 non Map Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
/	TokenNameDIVIDE	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nonMapIndex	TokenNameIdentifier	 non Map Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
createMap	TokenNameIdentifier	 create Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
asize	TokenNameIdentifier	 asize
=	TokenNameEQUAL	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
/	TokenNameDIVIDE	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 32 is the number of bits in `int'. 	TokenNameCOMMENT_LINE	32 is the number of bits in `int'. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
asize	TokenNameIdentifier	 asize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
nonMapIndex	TokenNameIdentifier	 non Map Index
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
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
asize	TokenNameIdentifier	 asize
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
e	TokenNameIdentifier	 e
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
/	TokenNameDIVIDE	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// s&0x1f : 0-31 	TokenNameCOMMENT_LINE	s&0x1f : 0-31 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nonMapIndex	TokenNameIdentifier	 non Map Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
>=	TokenNameGREATER_EQUAL	
MAPSIZE	TokenNameIdentifier	 MAPSIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nonMapIndex	TokenNameIdentifier	 non Map Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nonMapIndex	TokenNameIdentifier	 non Map Index
=	TokenNameEQUAL	
nonMapIndex	TokenNameIdentifier	 non Map Index
;	TokenNameSEMICOLON	
//for (int i = 0; i < asize; i ++) System.err.println("Map: "+Integer.toString(this.map[i], 16)); 	TokenNameCOMMENT_LINE	for (int i = 0; i < asize; i ++) System.err.println("Map: "+Integer.toString(this.map[i], 16)); 
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
RANGE	TokenNameIdentifier	 RANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_dot	TokenNameIdentifier	 token dot
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_0to9	TokenNameIdentifier	 token 0to9
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\d"	TokenNameStringLiteral	\d
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\w"	TokenNameStringLiteral	\w
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\s"	TokenNameStringLiteral	\s
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
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
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
SPECIAL_COMMA	TokenNameIdentifier	 SPECIAL  COMMA
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_0to9	TokenNameIdentifier	 token not 0to9
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\D"	TokenNameStringLiteral	\D
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_wordchars	TokenNameIdentifier	 token not wordchars
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\W"	TokenNameStringLiteral	\W
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_spaces	TokenNameIdentifier	 token not spaces
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\S"	TokenNameStringLiteral	\S
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"[^"	TokenNameStringLiteral	[^
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
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
SPECIAL_COMMA	TokenNameIdentifier	 SPECIAL  COMMA
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escapeCharInCharClass	TokenNameIdentifier	 escape Char In Char Class
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'^'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\f"	TokenNameStringLiteral	\f
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\n"	TokenNameStringLiteral	\n
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\r"	TokenNameStringLiteral	\r
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\t"	TokenNameStringLiteral	\t
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x1b	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\e"	TokenNameStringLiteral	\e
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
//case 0x0b: ret = "\\v"; break; 	TokenNameCOMMENT_LINE	case 0x0b: ret = "\\v"; break; 
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\x"	TokenNameStringLiteral	\x
+	TokenNamePLUS	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\v"	TokenNameStringLiteral	\v
+	TokenNamePLUS	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

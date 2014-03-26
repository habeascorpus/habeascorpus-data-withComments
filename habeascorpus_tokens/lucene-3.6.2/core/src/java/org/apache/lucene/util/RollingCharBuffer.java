package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** Acts like a forever growing char[] as you read * characters into it from the provided reader, but * internally it uses a circular buffer to only hold the * characters that haven't been freed yet. This is like a * PushbackReader, except you don't have to specify * up-front the max size of the buffer, but you do have to * periodically call {@link #freeBefore}. */	TokenNameCOMMENT_JAVADOC	 Acts like a forever growing char[] as you read characters into it from the provided reader, but internally it uses a circular buffer to only hold the characters that haven't been freed yet. This is like a PushbackReader, except you don't have to specify up-front the max size of the buffer, but you do have to periodically call {@link #freeBefore}. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RollingCharBuffer	TokenNameIdentifier	 Rolling Char Buffer
{	TokenNameLBRACE	
private	TokenNameprivate	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Next array index to write to in buffer: 	TokenNameCOMMENT_LINE	Next array index to write to in buffer: 
private	TokenNameprivate	
int	TokenNameint	
nextWrite	TokenNameIdentifier	 next Write
;	TokenNameSEMICOLON	
// Next absolute position to read from reader: 	TokenNameCOMMENT_LINE	Next absolute position to read from reader: 
private	TokenNameprivate	
int	TokenNameint	
nextPos	TokenNameIdentifier	 next Pos
;	TokenNameSEMICOLON	
// How many valid chars (wrapped) are in the buffer: 	TokenNameCOMMENT_LINE	How many valid chars (wrapped) are in the buffer: 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// True if we hit EOF 	TokenNameCOMMENT_LINE	True if we hit EOF 
private	TokenNameprivate	
boolean	TokenNameboolean	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** Clear array and switch to new reader. */	TokenNameCOMMENT_JAVADOC	 Clear array and switch to new reader. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
nextPos	TokenNameIdentifier	 next Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextWrite	TokenNameIdentifier	 next Write
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Absolute position read. NOTE: pos must not jump * ahead by more than 1! Ie, it's OK to read arbitarily * far back (just not prior to the last {@link * #freeBefore}), but NOT ok to read arbitrarily far * ahead. Returns -1 if you hit EOF. */	TokenNameCOMMENT_BLOCK	 Absolute position read. NOTE: pos must not jump ahead by more than 1! Ie, it's OK to read arbitarily far back (just not prior to the last {@link #freeBefore}), but NOT ok to read arbitrarily far ahead. Returns -1 if you hit EOF. 
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println(" get pos=" + pos + " nextPos=" + nextPos + " count=" + count); 	TokenNameCOMMENT_LINE	System.out.println(" get pos=" + pos + " nextPos=" + nextPos + " count=" + count); 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
nextPos	TokenNameIdentifier	 next Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Grow 	TokenNameCOMMENT_LINE	Grow 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println(Thread.currentThread().getName() + ": cb grow " + newBuffer.length); 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName() + ": cb grow " + newBuffer.length); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
nextWrite	TokenNameIdentifier	 next Write
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
nextWrite	TokenNameIdentifier	 next Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
nextWrite	TokenNameIdentifier	 next Write
,	TokenNameCOMMA	
nextWrite	TokenNameIdentifier	 next Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextWrite	TokenNameIdentifier	 next Write
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextWrite	TokenNameIdentifier	 next Write
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextWrite	TokenNameIdentifier	 next Write
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
nextWrite	TokenNameIdentifier	 next Write
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextPos	TokenNameIdentifier	 next Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Cannot read from future (except by 1): 	TokenNameCOMMENT_LINE	Cannot read from future (except by 1): 
assert	TokenNameassert	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
nextPos	TokenNameIdentifier	 next Pos
;	TokenNameSEMICOLON	
// Cannot read from already freed past: 	TokenNameCOMMENT_LINE	Cannot read from already freed past: 
assert	TokenNameassert	
nextPos	TokenNameIdentifier	 next Pos
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
count	TokenNameIdentifier	 count
:	TokenNameCOLON	
"nextPos="	TokenNameStringLiteral	nextPos=
+	TokenNamePLUS	
nextPos	TokenNameIdentifier	 next Pos
+	TokenNamePLUS	
" pos="	TokenNameStringLiteral	 pos=
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
" count="	TokenNameStringLiteral	 count=
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// For assert: 	TokenNameCOMMENT_LINE	For assert: 
private	TokenNameprivate	
boolean	TokenNameboolean	
inBounds	TokenNameIdentifier	 in Bounds
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
nextPos	TokenNameIdentifier	 next Pos
&&	TokenNameAND_AND	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
nextPos	TokenNameIdentifier	 next Pos
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
nextWrite	TokenNameIdentifier	 next Write
-	TokenNameMINUS	
(	TokenNameLPAREN	
nextPos	TokenNameIdentifier	 next Pos
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Wrap: 	TokenNameCOMMENT_LINE	Wrap: 
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
posStart	TokenNameIdentifier	 pos Start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inBounds	TokenNameIdentifier	 in Bounds
(	TokenNameLPAREN	
posStart	TokenNameIdentifier	 pos Start
)	TokenNameRPAREN	
:	TokenNameCOLON	
"posStart="	TokenNameStringLiteral	posStart=
+	TokenNamePLUS	
posStart	TokenNameIdentifier	 pos Start
+	TokenNamePLUS	
" length="	TokenNameStringLiteral	 length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
//System.out.println(" buffer.get posStart=" + posStart + " len=" + length); 	TokenNameCOMMENT_LINE	System.out.println(" buffer.get posStart=" + posStart + " len=" + length); 
final	TokenNamefinal	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
posStart	TokenNameIdentifier	 pos Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
posStart	TokenNameIdentifier	 pos Start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" startIndex=" + startIndex + " endIndex=" + endIndex); 	TokenNameCOMMENT_LINE	System.out.println(" startIndex=" + startIndex + " endIndex=" + endIndex); 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
>=	TokenNameGREATER_EQUAL	
startIndex	TokenNameIdentifier	 start Index
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Wrapped: 	TokenNameCOMMENT_LINE	Wrapped: 
final	TokenNamefinal	
int	TokenNameint	
part1	TokenNameIdentifier	 part1
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
part1	TokenNameIdentifier	 part1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
part1	TokenNameIdentifier	 part1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Call this to notify us that no chars before this * absolute position are needed anymore. */	TokenNameCOMMENT_JAVADOC	 Call this to notify us that no chars before this absolute position are needed anymore. 
public	TokenNamepublic	
void	TokenNamevoid	
freeBefore	TokenNameIdentifier	 free Before
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
nextPos	TokenNameIdentifier	 next Pos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newCount	TokenNameIdentifier	 new Count
=	TokenNameEQUAL	
nextPos	TokenNameIdentifier	 next Pos
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newCount	TokenNameIdentifier	 new Count
<=	TokenNameLESS_EQUAL	
count	TokenNameIdentifier	 count
:	TokenNameCOLON	
"newCount="	TokenNameStringLiteral	newCount=
+	TokenNamePLUS	
newCount	TokenNameIdentifier	 new Count
+	TokenNamePLUS	
" count="	TokenNameStringLiteral	 count=
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newCount	TokenNameIdentifier	 new Count
<=	TokenNameLESS_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
"newCount="	TokenNameStringLiteral	newCount=
+	TokenNamePLUS	
newCount	TokenNameIdentifier	 new Count
+	TokenNamePLUS	
" buf.length="	TokenNameStringLiteral	 buf.length=
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
newCount	TokenNameIdentifier	 new Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

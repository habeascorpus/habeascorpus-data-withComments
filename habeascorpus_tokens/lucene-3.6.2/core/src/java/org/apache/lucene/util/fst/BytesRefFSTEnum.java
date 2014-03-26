package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
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
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
/** Enumerates all input (BytesRef) + output pairs in an * FST. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Enumerates all input (BytesRef) + output pairs in an FST. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BytesRefFSTEnum	TokenNameIdentifier	 Bytes Ref FST Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
FSTEnum	TokenNameIdentifier	 FST Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BytesRef	TokenNameIdentifier	 Bytes Ref
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** Holds a single input (BytesRef) + output pair. */	TokenNameCOMMENT_JAVADOC	 Holds a single input (BytesRef) + output pair. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** doFloor controls the behavior of advance: if it's true * doFloor is true, advance positions to the biggest * term before target. */	TokenNameCOMMENT_JAVADOC	 doFloor controls the behavior of advance: if it's true doFloor is true, advance positions to the biggest term before target. 
public	TokenNamepublic	
BytesRefFSTEnum	TokenNameIdentifier	 Bytes Ref FST Enum
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println(" enum.next"); 	TokenNameCOMMENT_LINE	System.out.println(" enum.next"); 
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Seeks to smallest term that's >= target. */	TokenNameCOMMENT_JAVADOC	 Seeks to smallest term that's >= target. 
public	TokenNamepublic	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
seekCeil	TokenNameIdentifier	 seek Ceil
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
targetLength	TokenNameIdentifier	 target Length
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
doSeekCeil	TokenNameIdentifier	 do Seek Ceil
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Seeks to biggest term that's <= target. */	TokenNameCOMMENT_JAVADOC	 Seeks to biggest term that's <= target. 
public	TokenNamepublic	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
seekFloor	TokenNameIdentifier	 seek Floor
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
targetLength	TokenNameIdentifier	 target Length
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
doSeekFloor	TokenNameIdentifier	 do Seek Floor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Seeks to exactly this term, returning null if the term * doesn't exist. This is faster than using {@link * #seekFloor} or {@link #seekCeil} because it * short-circuits as soon the match is not found. */	TokenNameCOMMENT_JAVADOC	 Seeks to exactly this term, returning null if the term doesn't exist. This is faster than using {@link #seekFloor} or {@link #seekCeil} because it short-circuits as soon the match is not found. 
public	TokenNamepublic	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
seekExact	TokenNameIdentifier	 seek Exact
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
targetLength	TokenNameIdentifier	 target Length
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
doSeekExact	TokenNameIdentifier	 do Seek Exact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
getCurrentLabel	TokenNameIdentifier	 get Current Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// current.offset fixed at 1 	TokenNameCOMMENT_LINE	current.offset fixed at 1 
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
int	TokenNameint	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
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
/** * An FST {@link Outputs} implementation where each output * is a sequence of bytes. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An FST {@link Outputs} implementation where each output is a sequence of bytes. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ByteSequenceOutputs	TokenNameIdentifier	 Byte Sequence Outputs
extends	TokenNameextends	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
BytesRef	TokenNameIdentifier	 Bytes Ref
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ByteSequenceOutputs	TokenNameIdentifier	 Byte Sequence Outputs
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequenceOutputs	TokenNameIdentifier	 Byte Sequence Outputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteSequenceOutputs	TokenNameIdentifier	 Byte Sequence Outputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ByteSequenceOutputs	TokenNameIdentifier	 Byte Sequence Outputs
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singleton	TokenNameIdentifier	 singleton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
output1	TokenNameIdentifier	 output1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output2	TokenNameIdentifier	 output2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
=	TokenNameEQUAL	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
=	TokenNameEQUAL	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
stopAt1	TokenNameIdentifier	 stop At1
=	TokenNameEQUAL	
pos1	TokenNameIdentifier	 pos1
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos1	TokenNameIdentifier	 pos1
<	TokenNameLESS	
stopAt1	TokenNameIdentifier	 stop At1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos1	TokenNameIdentifier	 pos1
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos2	TokenNameIdentifier	 pos2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos1	TokenNameIdentifier	 pos1
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pos2	TokenNameIdentifier	 pos2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos1	TokenNameIdentifier	 pos1
==	TokenNameEQUAL_EQUAL	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no common prefix 	TokenNameCOMMENT_LINE	no common prefix 
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pos1	TokenNameIdentifier	 pos1
==	TokenNameEQUAL_EQUAL	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// output1 is a prefix of output2 	TokenNameCOMMENT_LINE	output1 is a prefix of output2 
return	TokenNamereturn	
output1	TokenNameIdentifier	 output1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pos2	TokenNameIdentifier	 pos2
==	TokenNameEQUAL_EQUAL	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// output2 is a prefix of output1 	TokenNameCOMMENT_LINE	output2 is a prefix of output1 
return	TokenNamereturn	
output2	TokenNameIdentifier	 output2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
pos1	TokenNameIdentifier	 pos1
-	TokenNameMINUS	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inc	TokenNameIdentifier	 inc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no prefix removed 	TokenNameCOMMENT_LINE	no prefix removed 
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// entire output removed 	TokenNameCOMMENT_LINE	entire output removed 
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
"inc.length="	TokenNameStringLiteral	inc.length=
+	TokenNamePLUS	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" vs output.length="	TokenNameStringLiteral	 vs output.length=
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

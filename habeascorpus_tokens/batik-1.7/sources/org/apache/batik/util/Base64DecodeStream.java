/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * This class implements a Base64 Character decoder as specified in RFC1113. * Unlike some other encoding schemes there is nothing in this encoding that * tells the decoder where a buffer starts or stops, so to use it you will need * to isolate your encoded data into a single chunk and then feed them * this decoder. The simplest way to do that is to read all of the encoded * data into a string and then use: * <pre> * byte data[]; * InputStream is = new ByteArrayInputStream(data); * is = new Base64DecodeStream(is); * </pre> * * On errors, this class throws a IOException with the following detail * strings: * <pre> * "Base64DecodeStream: Bad Padding byte (2)." * "Base64DecodeStream: Bad Padding byte (1)." * </pre> * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author Chuck McManis * @version $Id: Base64DecodeStream.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements a Base64 Character decoder as specified in RFC1113. Unlike some other encoding schemes there is nothing in this encoding that tells the decoder where a buffer starts or stops, so to use it you will need to isolate your encoded data into a single chunk and then feed them this decoder. The simplest way to do that is to read all of the encoded data into a string and then use: <pre> byte data[]; InputStream is = new ByteArrayInputStream(data); is = new Base64DecodeStream(is); </pre> * On errors, this class throws a IOException with the following detail strings: <pre> "Base64DecodeStream: Bad Padding byte (2)." "Base64DecodeStream: Bad Padding byte (1)." </pre> * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author Chuck McManis @version $Id: Base64DecodeStream.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Base64DecodeStream	TokenNameIdentifier	 Base64 Decode Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Base64DecodeStream	TokenNameIdentifier	 Base64 Decode Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pem_array	TokenNameIdentifier	 pem array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
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
pem_array	TokenNameIdentifier	 pem array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
'/'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
-	TokenNameMINUS	
out_offset	TokenNameIdentifier	 out offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decode_buffer	TokenNameIdentifier	 decode buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_buffer	TokenNameIdentifier	 out buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
out_offset	TokenNameIdentifier	 out offset
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out_offset	TokenNameIdentifier	 out offset
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EOF	TokenNameIdentifier	 EOF
||	TokenNameOR_OR	
getNextAtom	TokenNameIdentifier	 get Next Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out_offset	TokenNameIdentifier	 out offset
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EOF	TokenNameIdentifier	 EOF
||	TokenNameOR_OR	
getNextAtom	TokenNameIdentifier	 get Next Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
getNextAtom	TokenNameIdentifier	 get Next Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
pem_array	TokenNameIdentifier	 pem array
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All three bytes are good. 	TokenNameCOMMENT_LINE	All three bytes are good. 
out_offset	TokenNameIdentifier	 out offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
decode_buffer	TokenNameIdentifier	 decode buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only one byte of output. 	TokenNameCOMMENT_LINE	Only one byte of output. 
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
out_offset	TokenNameIdentifier	 out offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Only two bytes of output. 	TokenNameCOMMENT_LINE	Only two bytes of output. 
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_buffer	TokenNameIdentifier	 out buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
out_offset	TokenNameIdentifier	 out offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

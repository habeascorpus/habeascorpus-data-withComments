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
/* * Some of this code came from the excellent Unicode * conversion examples from: * * http://www.unicode.org/Public/PROGRAMS/CVTUTF * * Full Copyright for that code follows: */	TokenNameCOMMENT_BLOCK	 Some of this code came from the excellent Unicode conversion examples from: * http://www.unicode.org/Public/PROGRAMS/CVTUTF * Full Copyright for that code follows: 
/* * Copyright 2001-2004 Unicode, Inc. * * Disclaimer * * This source code is provided as is by Unicode, Inc. No claims are * made as to fitness for any particular purpose. No warranties of any * kind are expressed or implied. The recipient agrees to determine * applicability of information provided. If this file has been * purchased on magnetic or optical media from Unicode, Inc., the * sole remedy for any claim will be exchange of defective media * within 90 days of receipt. * * Limitations on Rights to Redistribute This Code * * Unicode, Inc. hereby grants the right to freely use the information * supplied in this file in the creation of products supporting the * Unicode Standard, and to make copies of this file in any form * for internal or external distribution as long as this notice * remains attached. */	TokenNameCOMMENT_BLOCK	 Copyright 2001-2004 Unicode, Inc. * Disclaimer * This source code is provided as is by Unicode, Inc. No claims are made as to fitness for any particular purpose. No warranties of any kind are expressed or implied. The recipient agrees to determine applicability of information provided. If this file has been purchased on magnetic or optical media from Unicode, Inc., the sole remedy for any claim will be exchange of defective media within 90 days of receipt. * Limitations on Rights to Redistribute This Code * Unicode, Inc. hereby grants the right to freely use the information supplied in this file in the creation of products supporting the Unicode Standard, and to make copies of this file in any form for internal or external distribution as long as this notice remains attached. 
/* * Additional code came from the IBM ICU library. * * http://www.icu-project.org * * Full Copyright for that code follows. */	TokenNameCOMMENT_BLOCK	 Additional code came from the IBM ICU library. * http://www.icu-project.org * Full Copyright for that code follows. 
/* * Copyright (C) 1999-2010, International Business Machines * Corporation and others. All Rights Reserved. * * Permission is hereby granted, free of charge, to any person obtaining a copy * of this software and associated documentation files (the "Software"), to deal * in the Software without restriction, including without limitation the rights * to use, copy, modify, merge, publish, distribute, and/or sell copies of the * Software, and to permit persons to whom the Software is furnished to do so, * provided that the above copyright notice(s) and this permission notice appear * in all copies of the Software and that both the above copyright notice(s) and * this permission notice appear in supporting documentation. * * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF THIRD PARTY RIGHTS. * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS NOTICE BE * LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL DAMAGES, OR * ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER * IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT * OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. * * Except as contained in this notice, the name of a copyright holder shall not * be used in advertising or otherwise to promote the sale, use or other * dealings in this Software without prior written authorization of the * copyright holder. */	TokenNameCOMMENT_BLOCK	 Copyright (C) 1999-2010, International Business Machines Corporation and others. All Rights Reserved. * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, provided that the above copyright notice(s) and this permission notice appear in all copies of the Software and that both the above copyright notice(s) and this permission notice appear in supporting documentation. * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. * Except as contained in this notice, the name of a copyright holder shall not be used in advertising or otherwise to promote the sale, use or other dealings in this Software without prior written authorization of the copyright holder. 
/** * Class to encode java's UTF16 char[] into UTF8 byte[] * without always allocating a new byte[] as * String.getBytes("UTF-8") does. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Class to encode java's UTF16 char[] into UTF8 byte[] without always allocating a new byte[] as String.getBytes("UTF-8") does. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
{	TokenNameLBRACE	
private	TokenNameprivate	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
=	TokenNameEQUAL	
0xD800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNI_SUR_HIGH_END	TokenNameIdentifier	 UNI  SUR  HIGH  END
=	TokenNameEQUAL	
0xDBFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
=	TokenNameEQUAL	
0xDC00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNI_SUR_LOW_END	TokenNameIdentifier	 UNI  SUR  LOW  END
=	TokenNameEQUAL	
0xDFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNI_REPLACEMENT_CHAR	TokenNameIdentifier	 UNI  REPLACEMENT  CHAR
=	TokenNameEQUAL	
0xFFFD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
UNI_MAX_BMP	TokenNameIdentifier	 UNI  MAX  BMP
=	TokenNameEQUAL	
0x0000FFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HALF_BASE	TokenNameIdentifier	 HALF  BASE
=	TokenNameEQUAL	
0x0010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
HALF_SHIFT	TokenNameIdentifier	 HALF  SHIFT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
HALF_MASK	TokenNameIdentifier	 HALF  MASK
=	TokenNameEQUAL	
0x3FFL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SURROGATE_OFFSET	TokenNameIdentifier	 SURROGATE  OFFSET
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MIN_SUPPLEMENTARY_CODE_POINT	TokenNameIdentifier	 MIN  SUPPLEMENTARY  CODE  POINT
-	TokenNameMINUS	
(	TokenNameLPAREN	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
<<	TokenNameLEFT_SHIFT	
HALF_SHIFT	TokenNameIdentifier	 HALF  SHIFT
)	TokenNameRPAREN	
-	TokenNameMINUS	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
;	TokenNameSEMICOLON	
/** * Holds decoded UTF8 code units. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Holds decoded UTF8 code units. * @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UTF8Result	TokenNameIdentifier	 UT F8 Result
{	TokenNameLBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLength	TokenNameIdentifier	 new Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holds decoded UTF16 code units. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Holds decoded UTF16 code units. * @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UTF16Result	TokenNameIdentifier	 UT F16 Result
{	TokenNameLBRACE	
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLength	TokenNameIdentifier	 new Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copyText	TokenNameIdentifier	 copy Text
(	TokenNameLPAREN	
UTF16Result	TokenNameIdentifier	 UT F16 Result
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Encode characters from a char[] source, starting at * offset for length chars. Returns a hash of the resulting bytes. After encoding, result.offset will always be 0. */	TokenNameCOMMENT_JAVADOC	 Encode characters from a char[] source, starting at offset for length chars. Returns a hash of the resulting bytes. After encoding, result.offset will always be 0. 
// TODO: broken if incoming result.offset != 0 	TokenNameCOMMENT_LINE	TODO: broken if incoming result.offset != 0 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
UTF16toUTF8WithHash	TokenNameIdentifier	 UT F16to UT F8 With Hash
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
// Pre-allocate for worst case 4-for-1 	TokenNameCOMMENT_LINE	Pre-allocate for worst case 4-for-1 
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
maxLen	TokenNameIdentifier	 max Len
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
utf32	TokenNameIdentifier	 utf32
+	TokenNamePLUS	
SURROGATE_OFFSET	TokenNameIdentifier	 SURROGATE  OFFSET
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(source, offset, length, out, upto); 	TokenNameCOMMENT_LINE	assert matches(source, offset, length, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Encode characters from a char[] source, starting at * offset and stopping when the character 0xffff is seen. * Returns the number of bytes written to bytesOut. */	TokenNameCOMMENT_JAVADOC	 Encode characters from a char[] source, starting at offset and stopping when the character 0xffff is seen. Returns the number of bytes written to bytesOut. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
UTF8Result	TokenNameIdentifier	 UT F8 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
>	TokenNameGREATER	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// END 	TokenNameCOMMENT_LINE	END 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
-	TokenNameMINUS	
0xD7C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(source, offset, i-offset-1, out, upto); 	TokenNameCOMMENT_LINE	assert matches(source, offset, i-offset-1, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Encode characters from a char[] source, starting at * offset for length chars. Returns the number of bytes * written to bytesOut. */	TokenNameCOMMENT_JAVADOC	 Encode characters from a char[] source, starting at offset for length chars. Returns the number of bytes written to bytesOut. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
UTF8Result	TokenNameIdentifier	 UT F8 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
>	TokenNameGREATER	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
-	TokenNameMINUS	
0xD7C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(source, offset, length, out, upto); 	TokenNameCOMMENT_LINE	assert matches(source, offset, length, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Encode characters from this String, starting at offset * for length characters. Returns the number of bytes * written to bytesOut. */	TokenNameCOMMENT_JAVADOC	 Encode characters from this String, starting at offset for length characters. Returns the number of bytes written to bytesOut. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
UTF8Result	TokenNameIdentifier	 UT F8 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
>	TokenNameGREATER	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
-	TokenNameMINUS	
0xD7C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(s, offset, length, out, upto); 	TokenNameCOMMENT_LINE	assert matches(s, offset, length, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Encode characters from this String, starting at offset * for length characters. After encoding, result.offset will always be 0. */	TokenNameCOMMENT_JAVADOC	 Encode characters from this String, starting at offset for length characters. After encoding, result.offset will always be 0. 
// TODO: broken if incoming result.offset != 0 	TokenNameCOMMENT_LINE	TODO: broken if incoming result.offset != 0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Pre-allocate for worst case 4-for-1 	TokenNameCOMMENT_LINE	Pre-allocate for worst case 4-for-1 
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
maxLen	TokenNameIdentifier	 max Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
utf32	TokenNameIdentifier	 utf32
+	TokenNamePLUS	
SURROGATE_OFFSET	TokenNameIdentifier	 SURROGATE  OFFSET
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(s, offset, length, out, upto); 	TokenNameCOMMENT_LINE	assert matches(s, offset, length, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Encode characters from a char[] source, starting at * offset for length chars. After encoding, result.offset will always be 0. */	TokenNameCOMMENT_JAVADOC	 Encode characters from a char[] source, starting at offset for length chars. After encoding, result.offset will always be 0. 
// TODO: broken if incoming result.offset != 0 	TokenNameCOMMENT_LINE	TODO: broken if incoming result.offset != 0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
// Pre-allocate for worst case 4-for-1 	TokenNameCOMMENT_LINE	Pre-allocate for worst case 4-for-1 
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
maxLen	TokenNameIdentifier	 max Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xD800	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate pair 	TokenNameCOMMENT_LINE	surrogate pair 
// confirm valid high surrogate 	TokenNameCOMMENT_LINE	confirm valid high surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// confirm valid low surrogate and write pair 	TokenNameCOMMENT_LINE	confirm valid low surrogate and write pair 
if	TokenNameif	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>=	TokenNameGREATER_EQUAL	
0xDC00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
utf32	TokenNameIdentifier	 utf32
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
utf32	TokenNameIdentifier	 utf32
+	TokenNamePLUS	
SURROGATE_OFFSET	TokenNameIdentifier	 SURROGATE  OFFSET
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// replace unpaired surrogate or out-of-order low surrogate 	TokenNameCOMMENT_LINE	replace unpaired surrogate or out-of-order low surrogate 
// with substitution character 	TokenNameCOMMENT_LINE	with substitution character 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//assert matches(source, offset, length, out, upto); 	TokenNameCOMMENT_LINE	assert matches(source, offset, length, out, upto); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert UTF8 bytes into UTF16 characters. If offset * is non-zero, conversion starts at that starting point * in utf8, re-using the results from the previous call * up until offset. */	TokenNameCOMMENT_JAVADOC	 Convert UTF8 bytes into UTF16 characters. If offset is non-zero, conversion starts at that starting point in utf8, re-using the results from the previous call up until offset. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
utf8	TokenNameIdentifier	 utf8
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
final	TokenNamefinal	
UTF16Result	TokenNameIdentifier	 UT F16 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
// If incremental decoding fell in the middle of a 	TokenNameCOMMENT_LINE	If incremental decoding fell in the middle of a 
// single unicode character, rollback to its start: 	TokenNameCOMMENT_LINE	single unicode character, rollback to its start: 
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
outUpto	TokenNameIdentifier	 out Upto
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Pre-allocate for worst case 1-for-1 	TokenNameCOMMENT_LINE	Pre-allocate for worst case 1-for-1 
if	TokenNameif	
(	TokenNameLPAREN	
outUpto	TokenNameIdentifier	 out Upto
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
outUpto	TokenNameIdentifier	 out Upto
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
outUpto	TokenNameIdentifier	 out Upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xe0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xf8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
UNI_MAX_BMP	TokenNameIdentifier	 UNI  MAX  BMP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// target is a character <= 0xFFFF 	TokenNameCOMMENT_LINE	target is a character <= 0xFFFF 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outUpto	TokenNameIdentifier	 out Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// target is a character in range 0xFFFF - 0x10FFFF 	TokenNameCOMMENT_LINE	target is a character in range 0xFFFF - 0x10FFFF 
final	TokenNamefinal	
int	TokenNameint	
chHalf	TokenNameIdentifier	 ch Half
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
HALF_BASE	TokenNameIdentifier	 HALF  BASE
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outUpto	TokenNameIdentifier	 out Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
chHalf	TokenNameIdentifier	 ch Half
>>	TokenNameRIGHT_SHIFT	
HALF_SHIFT	TokenNameIdentifier	 HALF  SHIFT
)	TokenNameRPAREN	
+	TokenNamePLUS	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outUpto	TokenNameIdentifier	 out Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
chHalf	TokenNameIdentifier	 ch Half
&	TokenNameAND	
HALF_MASK	TokenNameIdentifier	 HALF  MASK
)	TokenNameRPAREN	
+	TokenNamePLUS	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
outUpto	TokenNameIdentifier	 out Upto
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
outUpto	TokenNameIdentifier	 out Upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only called from assert 	TokenNameCOMMENT_LINE	Only called from assert 
/* private static boolean matches(char[] source, int offset, int length, byte[] result, int upto) { try { String s1 = new String(source, offset, length); String s2 = new String(result, 0, upto, "UTF-8"); if (!s1.equals(s2)) { //System.out.println("DIFF: s1 len=" + s1.length()); //for(int i=0;i<s1.length();i++) // System.out.println(" " + i + ": " + (int) s1.charAt(i)); //System.out.println("s2 len=" + s2.length()); //for(int i=0;i<s2.length();i++) // System.out.println(" " + i + ": " + (int) s2.charAt(i)); // If the input string was invalid, then the // difference is OK if (!validUTF16String(s1)) return true; return false; } return s1.equals(s2); } catch (UnsupportedEncodingException uee) { return false; } } // Only called from assert private static boolean matches(String source, int offset, int length, byte[] result, int upto) { try { String s1 = source.substring(offset, offset+length); String s2 = new String(result, 0, upto, "UTF-8"); if (!s1.equals(s2)) { // Allow a difference if s1 is not valid UTF-16 //System.out.println("DIFF: s1 len=" + s1.length()); //for(int i=0;i<s1.length();i++) // System.out.println(" " + i + ": " + (int) s1.charAt(i)); //System.out.println(" s2 len=" + s2.length()); //for(int i=0;i<s2.length();i++) // System.out.println(" " + i + ": " + (int) s2.charAt(i)); // If the input string was invalid, then the // difference is OK if (!validUTF16String(s1)) return true; return false; } return s1.equals(s2); } catch (UnsupportedEncodingException uee) { return false; } } public static final boolean validUTF16String(String s) { final int size = s.length(); for(int i=0;i<size;i++) { char ch = s.charAt(i); if (ch >= UNI_SUR_HIGH_START && ch <= UNI_SUR_HIGH_END) { if (i < size-1) { i++; char nextCH = s.charAt(i); if (nextCH >= UNI_SUR_LOW_START && nextCH <= UNI_SUR_LOW_END) { // Valid surrogate pair } else // Unmatched high surrogate return false; } else // Unmatched high surrogate return false; } else if (ch >= UNI_SUR_LOW_START && ch <= UNI_SUR_LOW_END) // Unmatched low surrogate return false; } return true; } public static final boolean validUTF16String(char[] s, int size) { for(int i=0;i<size;i++) { char ch = s[i]; if (ch >= UNI_SUR_HIGH_START && ch <= UNI_SUR_HIGH_END) { if (i < size-1) { i++; char nextCH = s[i]; if (nextCH >= UNI_SUR_LOW_START && nextCH <= UNI_SUR_LOW_END) { // Valid surrogate pair } else return false; } else return false; } else if (ch >= UNI_SUR_LOW_START && ch <= UNI_SUR_LOW_END) // Unmatched low surrogate return false; } return true; } */	TokenNameCOMMENT_BLOCK	 private static boolean matches(char[] source, int offset, int length, byte[] result, int upto) { try { String s1 = new String(source, offset, length); String s2 = new String(result, 0, upto, "UTF-8"); if (!s1.equals(s2)) { //System.out.println("DIFF: s1 len=" + s1.length()); //for(int i=0;i<s1.length();i++) // System.out.println(" " + i + ": " + (int) s1.charAt(i)); //System.out.println("s2 len=" + s2.length()); //for(int i=0;i<s2.length();i++) // System.out.println(" " + i + ": " + (int) s2.charAt(i)); // If the input string was invalid, then the // difference is OK if (!validUTF16String(s1)) return true; return false; } return s1.equals(s2); } catch (UnsupportedEncodingException uee) { return false; } } // Only called from assert private static boolean matches(String source, int offset, int length, byte[] result, int upto) { try { String s1 = source.substring(offset, offset+length); String s2 = new String(result, 0, upto, "UTF-8"); if (!s1.equals(s2)) { // Allow a difference if s1 is not valid UTF-16 //System.out.println("DIFF: s1 len=" + s1.length()); //for(int i=0;i<s1.length();i++) // System.out.println(" " + i + ": " + (int) s1.charAt(i)); //System.out.println(" s2 len=" + s2.length()); //for(int i=0;i<s2.length();i++) // System.out.println(" " + i + ": " + (int) s2.charAt(i)); // If the input string was invalid, then the // difference is OK if (!validUTF16String(s1)) return true; return false; } return s1.equals(s2); } catch (UnsupportedEncodingException uee) { return false; } } public static final boolean validUTF16String(String s) { final int size = s.length(); for(int i=0;i<size;i++) { char ch = s.charAt(i); if (ch >= UNI_SUR_HIGH_START && ch <= UNI_SUR_HIGH_END) { if (i < size-1) { i++; char nextCH = s.charAt(i); if (nextCH >= UNI_SUR_LOW_START && nextCH <= UNI_SUR_LOW_END) { // Valid surrogate pair } else // Unmatched high surrogate return false; } else // Unmatched high surrogate return false; } else if (ch >= UNI_SUR_LOW_START && ch <= UNI_SUR_LOW_END) // Unmatched low surrogate return false; } return true; } public static final boolean validUTF16String(char[] s, int size) { for(int i=0;i<size;i++) { char ch = s[i]; if (ch >= UNI_SUR_HIGH_START && ch <= UNI_SUR_HIGH_END) { if (i < size-1) { i++; char nextCH = s[i]; if (nextCH >= UNI_SUR_LOW_START && nextCH <= UNI_SUR_LOW_END) { // Valid surrogate pair } else return false; } else return false; } else if (ch >= UNI_SUR_LOW_START && ch <= UNI_SUR_LOW_END) // Unmatched low surrogate return false; } return true; } 
/** Shift value for lead surrogate to form a supplementary character. */	TokenNameCOMMENT_JAVADOC	 Shift value for lead surrogate to form a supplementary character. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEAD_SURROGATE_SHIFT_	TokenNameIdentifier	 LEAD  SURROGATE  SHIFT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Mask to retrieve the significant value from a trail surrogate.*/	TokenNameCOMMENT_JAVADOC	 Mask to retrieve the significant value from a trail surrogate.
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRAIL_SURROGATE_MASK_	TokenNameIdentifier	 TRAIL  SURROGATE  MASK
=	TokenNameEQUAL	
0x3FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Trail surrogate minimum value */	TokenNameCOMMENT_JAVADOC	 Trail surrogate minimum value 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRAIL_SURROGATE_MIN_VALUE	TokenNameIdentifier	 TRAIL  SURROGATE  MIN  VALUE
=	TokenNameEQUAL	
0xDC00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Lead surrogate minimum value */	TokenNameCOMMENT_JAVADOC	 Lead surrogate minimum value 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEAD_SURROGATE_MIN_VALUE	TokenNameIdentifier	 LEAD  SURROGATE  MIN  VALUE
=	TokenNameEQUAL	
0xD800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The minimum value for Supplementary code points */	TokenNameCOMMENT_JAVADOC	 The minimum value for Supplementary code points 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUPPLEMENTARY_MIN_VALUE	TokenNameIdentifier	 SUPPLEMENTARY  MIN  VALUE
=	TokenNameEQUAL	
0x10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Value that all lead surrogate starts with */	TokenNameCOMMENT_JAVADOC	 Value that all lead surrogate starts with 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEAD_SURROGATE_OFFSET_	TokenNameIdentifier	 LEAD  SURROGATE  OFFSET
=	TokenNameEQUAL	
LEAD_SURROGATE_MIN_VALUE	TokenNameIdentifier	 LEAD  SURROGATE  MIN  VALUE
-	TokenNameMINUS	
(	TokenNameLPAREN	
SUPPLEMENTARY_MIN_VALUE	TokenNameIdentifier	 SUPPLEMENTARY  MIN  VALUE
>>	TokenNameRIGHT_SHIFT	
LEAD_SURROGATE_SHIFT_	TokenNameIdentifier	 LEAD  SURROGATE  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Cover JDK 1.5 API. Create a String from an array of codePoints. * * @param codePoints The code array * @param offset The start of the text in the code point array * @param count The number of code points * @return a String representing the code points between offset and count * @throws IllegalArgumentException If an invalid code point is encountered * @throws IndexOutOfBoundsException If the offset or count are out of bounds. */	TokenNameCOMMENT_JAVADOC	 Cover JDK 1.5 API. Create a String from an array of codePoints. * @param codePoints The code array @param offset The start of the text in the code point array @param count The number of code points @return a String representing the code points between offset and count @throws IllegalArgumentException If an invalid code point is encountered @throws IndexOutOfBoundsException If the offset or count are out of bounds. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
newString	TokenNameIdentifier	 new String
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
codePoints	TokenNameIdentifier	 code Points
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
codePoints	TokenNameIdentifier	 code Points
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
cp	TokenNameIdentifier	 cp
>	TokenNameGREATER	
0x10ffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
<	TokenNameLESS	
0x010000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
LEAD_SURROGATE_OFFSET_	TokenNameIdentifier	 LEAD  SURROGATE  OFFSET
+	TokenNamePLUS	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
>>	TokenNameRIGHT_SHIFT	
LEAD_SURROGATE_SHIFT_	TokenNameIdentifier	 LEAD  SURROGATE  SHIFT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
TRAIL_SURROGATE_MIN_VALUE	TokenNameIdentifier	 TRAIL  SURROGATE  MIN  VALUE
+	TokenNamePLUS	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
&	TokenNameAND	
TRAIL_SURROGATE_MASK_	TokenNameIdentifier	 TRAIL  SURROGATE  MASK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newlen	TokenNameIdentifier	 newlen
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
codePoints	TokenNameIdentifier	 code Points
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newlen	TokenNameIdentifier	 newlen
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Interprets the given byte array as UTF-8 and converts to UTF-16. The {@link CharsRef} will be extended if * it doesn't provide enough space to hold the worst case of each byte becoming a UTF-16 codepoint. * <p> * NOTE: Full characters are read, even if this reads past the length passed (and * can result in an ArrayOutOfBoundsException if invalid UTF-8 is passed). * Explicit checks for valid UTF-8 are not performed. */	TokenNameCOMMENT_JAVADOC	 Interprets the given byte array as UTF-8 and converts to UTF-16. The {@link CharsRef} will be extended if it doesn't provide enough space to hold the worst case of each byte becoming a UTF-16 codepoint. <p> NOTE: Full characters are read, even if this reads past the length passed (and can result in an ArrayOutOfBoundsException if invalid UTF-8 is passed). Explicit checks for valid UTF-8 are not performed. 
// TODO: broken if incoming result.offset != 0 	TokenNameCOMMENT_LINE	TODO: broken if incoming result.offset != 0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
utf8	TokenNameIdentifier	 utf8
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
CharsRef	TokenNameIdentifier	 Chars Ref
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
out_offset	TokenNameIdentifier	 out offset
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xe0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0xf8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"b="	TokenNameStringLiteral	b=
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
UNI_MAX_BMP	TokenNameIdentifier	 UNI  MAX  BMP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
chHalf	TokenNameIdentifier	 ch Half
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x0010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
chHalf	TokenNameIdentifier	 ch Half
>>	TokenNameRIGHT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xD800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
out_offset	TokenNameIdentifier	 out offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
chHalf	TokenNameIdentifier	 ch Half
&	TokenNameAND	
HALF_MASK	TokenNameIdentifier	 HALF  MASK
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xDC00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
out_offset	TokenNameIdentifier	 out offset
-	TokenNameMINUS	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for {@link #UTF8toUTF16(byte[], int, int, CharsRef)} * @see #UTF8toUTF16(byte[], int, int, CharsRef) */	TokenNameCOMMENT_JAVADOC	 Utility method for {@link #UTF8toUTF16(byte[], int, int, CharsRef)} @see #UTF8toUTF16(byte[], int, int, CharsRef) 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytesRef	TokenNameIdentifier	 bytes Ref
,	TokenNameCOMMA	
CharsRef	TokenNameIdentifier	 Chars Ref
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
UNI_SUR_HIGH_END	TokenNameIdentifier	 UNI  SUR  HIGH  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
char	TokenNamechar	
nextCH	TokenNameIdentifier	 next CH
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextCH	TokenNameIdentifier	 next CH
>=	TokenNameGREATER_EQUAL	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
&&	TokenNameAND_AND	
nextCH	TokenNameIdentifier	 next CH
<=	TokenNameLESS_EQUAL	
UNI_SUR_LOW_END	TokenNameIdentifier	 UNI  SUR  LOW  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Valid surrogate pair 	TokenNameCOMMENT_LINE	Valid surrogate pair 
}	TokenNameRBRACE	
else	TokenNameelse	
// Unmatched high surrogate 	TokenNameCOMMENT_LINE	Unmatched high surrogate 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// Unmatched high surrogate 	TokenNameCOMMENT_LINE	Unmatched high surrogate 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
UNI_SUR_LOW_END	TokenNameIdentifier	 UNI  SUR  LOW  END
)	TokenNameRPAREN	
// Unmatched low surrogate 	TokenNameCOMMENT_LINE	Unmatched low surrogate 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

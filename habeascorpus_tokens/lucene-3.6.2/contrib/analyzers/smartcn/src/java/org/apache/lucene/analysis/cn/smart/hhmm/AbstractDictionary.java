/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
/** * <p> * SmartChineseAnalyzer abstract dictionary implementation. * </p> * <p> * Contains methods for dealing with GB2312 encoding. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 <p> SmartChineseAnalyzer abstract dictionary implementation. </p> <p> Contains methods for dealing with GB2312 encoding. </p> @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDictionary	TokenNameIdentifier	 Abstract Dictionary
{	TokenNameLBRACE	
/** * First Chinese Character in GB2312 (15 * 94) * Characters in GB2312 are arranged in a grid of 94 * 94, 0-14 are unassigned or punctuation. */	TokenNameCOMMENT_JAVADOC	 First Chinese Character in GB2312 (15 94) Characters in GB2312 are arranged in a grid of 94 94, 0-14 are unassigned or punctuation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GB2312_FIRST_CHAR	TokenNameIdentifier	 G B2312  FIRST  CHAR
=	TokenNameEQUAL	
1410	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Last Chinese Character in GB2312 (87 * 94). * Characters in GB2312 are arranged in a grid of 94 * 94, 88-94 are unassigned. */	TokenNameCOMMENT_JAVADOC	 Last Chinese Character in GB2312 (87 94). Characters in GB2312 are arranged in a grid of 94 94, 88-94 are unassigned. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GB2312_CHAR_NUM	TokenNameIdentifier	 G B2312  CHAR  NUM
=	TokenNameEQUAL	
87	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
94	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Dictionary data contains 6768 Chinese characters with frequency statistics. */	TokenNameCOMMENT_JAVADOC	 Dictionary data contains 6768 Chinese characters with frequency statistics. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_NUM_IN_FILE	TokenNameIdentifier	 CHAR  NUM  IN  FILE
=	TokenNameEQUAL	
6768	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ===================================================== 	TokenNameCOMMENT_LINE	===================================================== 
// code +0 +1 +2 +3 +4 +5 +6 +7 +8 +9 +A +B +C +D +E +F 	TokenNameCOMMENT_LINE	code +0 +1 +2 +3 +4 +5 +6 +7 +8 +9 +A +B +C +D +E +F 
// B0A0 啊 阿 埃 挨 哎 唉 哀 皑 癌 蔼 矮 艾 碍 爱 隘 	TokenNameCOMMENT_LINE	B0A0 啊 阿 埃 挨 哎 唉 哀 皑 癌 蔼 矮 艾 碍 爱 隘 
// B0B0 鞍 氨 安 俺 按 暗 岸 胺 案 肮 昂 盎 凹 敖 熬 翱 	TokenNameCOMMENT_LINE	B0B0 鞍 氨 安 俺 按 暗 岸 胺 案 肮 昂 盎 凹 敖 熬 翱 
// B0C0 袄 傲 奥 懊 澳 芭 捌 扒 叭 吧 笆 八 疤 巴 拔 跋 	TokenNameCOMMENT_LINE	B0C0 袄 傲 奥 懊 澳 芭 捌 扒 叭 吧 笆 八 疤 巴 拔 跋 
// B0D0 靶 把 耙 坝 霸 罢 爸 白 柏 百 摆 佰 败 拜 稗 斑 	TokenNameCOMMENT_LINE	B0D0 靶 把 耙 坝 霸 罢 爸 白 柏 百 摆 佰 败 拜 稗 斑 
// B0E0 班 搬 扳 般 颁 板 版 扮 拌 伴 瓣 半 办 绊 邦 帮 	TokenNameCOMMENT_LINE	B0E0 班 搬 扳 般 颁 板 版 扮 拌 伴 瓣 半 办 绊 邦 帮 
// B0F0 梆 榜 膀 绑 棒 磅 蚌 镑 傍 谤 苞 胞 包 褒 剥 	TokenNameCOMMENT_LINE	B0F0 梆 榜 膀 绑 棒 磅 蚌 镑 傍 谤 苞 胞 包 褒 剥 
// ===================================================== 	TokenNameCOMMENT_LINE	===================================================== 
// 	TokenNameCOMMENT_LINE	 
// GB2312 character set： 	TokenNameCOMMENT_LINE	GB2312 character set： 
// 01 94 Symbols 	TokenNameCOMMENT_LINE	01 94 Symbols 
// 02 72 Numbers 	TokenNameCOMMENT_LINE	02 72 Numbers 
// 03 94 Latin 	TokenNameCOMMENT_LINE	03 94 Latin 
// 04 83 Kana 	TokenNameCOMMENT_LINE	04 83 Kana 
// 05 86 Katakana 	TokenNameCOMMENT_LINE	05 86 Katakana 
// 06 48 Greek 	TokenNameCOMMENT_LINE	06 48 Greek 
// 07 66 Cyrillic 	TokenNameCOMMENT_LINE	07 66 Cyrillic 
// 08 63 Phonetic Symbols 	TokenNameCOMMENT_LINE	08 63 Phonetic Symbols 
// 09 76 Drawing Symbols 	TokenNameCOMMENT_LINE	09 76 Drawing Symbols 
// 10-15 Unassigned 	TokenNameCOMMENT_LINE	10-15 Unassigned 
// 16-55 3755 Plane 1, in pinyin order 	TokenNameCOMMENT_LINE	16-55 3755 Plane 1, in pinyin order 
// 56-87 3008 Plane 2, in radical/stroke order 	TokenNameCOMMENT_LINE	56-87 3008 Plane 2, in radical/stroke order 
// 88-94 Unassigned 	TokenNameCOMMENT_LINE	88-94 Unassigned 
// ====================================================== 	TokenNameCOMMENT_LINE	====================================================== 
/** * <p> * Transcode from GB2312 ID to Unicode * </p> * <p> * GB2312 is divided into a 94 * 94 grid, containing 7445 characters consisting of 6763 Chinese characters and 682 symbols. * Some regions are unassigned (reserved). * </p> * * @param ccid GB2312 id * @return unicode String */	TokenNameCOMMENT_JAVADOC	 <p> Transcode from GB2312 ID to Unicode </p> <p> GB2312 is divided into a 94 94 grid, containing 7445 characters consisting of 6763 Chinese characters and 682 symbols. Some regions are unassigned (reserved). </p> * @param ccid GB2312 id @return unicode String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCCByGB2312Id	TokenNameIdentifier	 get CC By G B2312 Id
(	TokenNameLPAREN	
int	TokenNameint	
ccid	TokenNameIdentifier	 ccid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ccid	TokenNameIdentifier	 ccid
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ccid	TokenNameIdentifier	 ccid
>	TokenNameGREATER	
AbstractDictionary	TokenNameIdentifier	 Abstract Dictionary
.	TokenNameDOT	
GB2312_CHAR_NUM	TokenNameIdentifier	 G B2312  CHAR  NUM
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
cc1	TokenNameIdentifier	 cc1
=	TokenNameEQUAL	
ccid	TokenNameIdentifier	 ccid
/	TokenNameDIVIDE	
94	TokenNameIntegerLiteral	
+	TokenNamePLUS	
161	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
cc2	TokenNameIdentifier	 cc2
=	TokenNameEQUAL	
ccid	TokenNameIdentifier	 ccid
%	TokenNameREMAINDER	
94	TokenNameIntegerLiteral	
+	TokenNamePLUS	
161	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
cc1	TokenNameIdentifier	 cc1
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
cc2	TokenNameIdentifier	 cc2
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cchar	TokenNameIdentifier	 cchar
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cchar	TokenNameIdentifier	 cchar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Transcode from Unicode to GB2312 * * @param ch input character in Unicode, or character in Basic Latin range. * @return position in GB2312 */	TokenNameCOMMENT_JAVADOC	 Transcode from Unicode to GB2312 * @param ch input character in Unicode, or character in Basic Latin range. @return position in GB2312 
public	TokenNamepublic	
short	TokenNameshort	
getGB2312Id	TokenNameIdentifier	 get G B2312 Id
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should be a two-byte character 	TokenNameCOMMENT_LINE	Should be a two-byte character 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x0FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
161	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Code starts from A1, therefore subtract 0xA1=161 	TokenNameCOMMENT_LINE	Code starts from A1, therefore subtract 0xA1=161 
int	TokenNameint	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x0FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
161	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// There is no Chinese char for the first and last symbol. 	TokenNameCOMMENT_LINE	There is no Chinese char for the first and last symbol. 
// Therefore, each code page only has 16*6-2=94 characters. 	TokenNameCOMMENT_LINE	Therefore, each code page only has 16*6-2=94 characters. 
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
*	TokenNameMULTIPLY	
94	TokenNameIntegerLiteral	
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 32-bit FNV Hash Function * * @param c input character * @return hashcode */	TokenNameCOMMENT_JAVADOC	 32-bit FNV Hash Function * @param c input character @return hashcode 
public	TokenNamepublic	
long	TokenNamelong	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
1099511628211L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0xcbf29ce484222325L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
^=	TokenNameXOR_EQUAL	
hash	TokenNameIdentifier	 hash
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
^=	TokenNameXOR_EQUAL	
hash	TokenNameIdentifier	 hash
>>	TokenNameRIGHT_SHIFT	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 32-bit FNV Hash Function * * @param carray character array * @return hashcode */	TokenNameCOMMENT_JAVADOC	 32-bit FNV Hash Function * @param carray character array @return hashcode 
public	TokenNamepublic	
long	TokenNamelong	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
char	TokenNamechar	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
1099511628211L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0xcbf29ce484222325L	TokenNameLongLiteral	
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
carray	TokenNameIdentifier	 carray
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash += hash << 13; 	TokenNameCOMMENT_LINE	hash += hash << 13; 
// hash ^= hash >> 7; 	TokenNameCOMMENT_LINE	hash ^= hash >> 7; 
// hash += hash << 3; 	TokenNameCOMMENT_LINE	hash += hash << 3; 
// hash ^= hash >> 17; 	TokenNameCOMMENT_LINE	hash ^= hash >> 17; 
// hash += hash << 5; 	TokenNameCOMMENT_LINE	hash += hash << 5; 
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * djb2 hash algorithm，this algorithm (k=33) was first reported by dan * bernstein many years ago in comp.lang.c. another version of this algorithm * (now favored by bernstein) uses xor: hash(i) = hash(i - 1) * 33 ^ str[i]; * the magic of number 33 (why it works better than many other constants, * prime or not) has never been adequately explained. * * @param c character * @return hashcode */	TokenNameCOMMENT_JAVADOC	 djb2 hash algorithm，this algorithm (k=33) was first reported by dan bernstein many years ago in comp.lang.c. another version of this algorithm (now favored by bernstein) uses xor: hash(i) = hash(i - 1) 33 ^ str[i]; the magic of number 33 (why it works better than many other constants, prime or not) has never been adequately explained. * @param c character @return hashcode 
public	TokenNamepublic	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
5381	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* hash 33 + c */	TokenNameCOMMENT_BLOCK	 hash 33 + c 
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * djb2 hash algorithm，this algorithm (k=33) was first reported by dan * bernstein many years ago in comp.lang.c. another version of this algorithm * (now favored by bernstein) uses xor: hash(i) = hash(i - 1) * 33 ^ str[i]; * the magic of number 33 (why it works better than many other constants, * prime or not) has never been adequately explained. * * @param carray character array * @return hashcode */	TokenNameCOMMENT_JAVADOC	 djb2 hash algorithm，this algorithm (k=33) was first reported by dan bernstein many years ago in comp.lang.c. another version of this algorithm (now favored by bernstein) uses xor: hash(i) = hash(i - 1) 33 ^ str[i]; the magic of number 33 (why it works better than many other constants, prime or not) has never been adequately explained. * @param carray character array @return hashcode 
public	TokenNamepublic	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
char	TokenNamechar	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
5381	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* hash 33 + c */	TokenNameCOMMENT_BLOCK	 hash 33 + c 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
carray	TokenNameIdentifier	 carray
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

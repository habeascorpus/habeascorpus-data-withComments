/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This package is based on the work done by Timothy Gerard Endres * (time@ice.com) to whom the Ant project is very grateful for his great code. */	TokenNameCOMMENT_BLOCK	 This package is based on the work done by Timothy Gerard Endres (time@ice.com) to whom the Ant project is very grateful for his great code. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
;	TokenNameSEMICOLON	
/** * This class provides static utility methods to work with byte streams. * */	TokenNameCOMMENT_JAVADOC	 This class provides static utility methods to work with byte streams. 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
public	TokenNamepublic	
class	TokenNameclass	
TarUtils	TokenNameIdentifier	 Tar Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Parse an octal string from a header buffer. This is used for the * file permission mode value. * * @param header The header buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The long value of the octal string. */	TokenNameCOMMENT_JAVADOC	 Parse an octal string from a header buffer. This is used for the file permission mode value. * @param header The header buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The long value of the octal string. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
stillPadding	TokenNameIdentifier	 still Padding
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
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
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stillPadding	TokenNameIdentifier	 still Padding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
stillPadding	TokenNameIdentifier	 still Padding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse an entry name from a header buffer. * * @param header The header buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The header's entry name. */	TokenNameCOMMENT_JAVADOC	 Parse an entry name from a header buffer. * @param header The header buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The header's entry name. 
public	TokenNamepublic	
static	TokenNamestatic	
StringBuffer	TokenNameIdentifier	 String Buffer
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
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
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the number of bytes in an entry name. * * @param name The header name from which to parse. * @param buf The buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The number of bytes in a header's entry name. */	TokenNameCOMMENT_JAVADOC	 Determine the number of bytes in an entry name. * @param name The header name from which to parse. @param buf The buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The number of bytes in a header's entry name. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse an octal integer from a header buffer. * * @param value The header value * @param buf The buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The integer value of the octal bytes. */	TokenNameCOMMENT_JAVADOC	 Parse an octal integer from a header buffer. * @param value The header value @param buf The buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The integer value of the octal bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse an octal long integer from a header buffer. * * @param value The header value * @param buf The buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The long value of the octal bytes. */	TokenNameCOMMENT_JAVADOC	 Parse an octal long integer from a header buffer. * @param value The header value @param buf The buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The long value of the octal bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getLongOctalBytes	TokenNameIdentifier	 get Long Octal Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the checksum octal integer from a header buffer. * * @param value The header value * @param buf The buffer from which to parse. * @param offset The offset into the buffer from which to parse. * @param length The number of header bytes to parse. * @return The integer value of the entry's checksum. */	TokenNameCOMMENT_JAVADOC	 Parse the checksum octal integer from a header buffer. * @param value The header value @param buf The buffer from which to parse. @param offset The offset into the buffer from which to parse. @param length The number of header bytes to parse. @return The integer value of the entry's checksum. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getCheckSumOctalBytes	TokenNameIdentifier	 get Check Sum Octal Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute the checksum of a tar entry header. * * @param buf The tar entry's header buffer. * @return The computed checksum. */	TokenNameCOMMENT_JAVADOC	 Compute the checksum of a tar entry header. * @param buf The tar entry's header buffer. @return The computed checksum. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
computeCheckSum	TokenNameIdentifier	 compute Check Sum
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sum	TokenNameIdentifier	 sum
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
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
&	TokenNameAND	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

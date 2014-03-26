/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** <p>PatternConverter is an abtract class that provides the formatting functionality that derived classes need. <p>Conversion specifiers in a conversion patterns are parsed to individual PatternConverters. Each of which is responsible for converting a logging event in a converter specific manner. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 0.8.2 */	TokenNameCOMMENT_JAVADOC	 <p>PatternConverter is an abtract class that provides the formatting functionality that derived classes need. <p>Conversion specifiers in a conversion patterns are parsed to individual PatternConverters. Each of which is responsible for converting a logging event in a converter specific manner. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 0.8.2 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
public	TokenNamepublic	
PatternConverter	TokenNameIdentifier	 Pattern Converter
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
PatternConverter	TokenNameIdentifier	 Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PatternConverter	TokenNameIdentifier	 Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
leftAlign	TokenNameIdentifier	 left Align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Derived pattern converters must override this method in order to convert conversion specifiers in the correct way. */	TokenNameCOMMENT_JAVADOC	 Derived pattern converters must override this method in order to convert conversion specifiers in the correct way. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A template method for formatting in a converter specific way. */	TokenNameCOMMENT_JAVADOC	 A template method for formatting in a converter specific way. 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
LoggingEvent	TokenNameIdentifier	 Logging Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
spacePad	TokenNameIdentifier	 space Pad
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftAlign	TokenNameIdentifier	 left Align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spacePad	TokenNameIdentifier	 space Pad
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
-	TokenNameMINUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
spacePad	TokenNameIdentifier	 space Pad
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
-	TokenNameMINUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SPACES	TokenNameIdentifier	 SPACES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
//1,2,4,8 spaces 	TokenNameCOMMENT_LINE	1,2,4,8 spaces 
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
// 16 spaces 	TokenNameCOMMENT_LINE	16 spaces 
" "	TokenNameStringLiteral	 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 32 spaces 	TokenNameCOMMENT_LINE	32 spaces 
/** Fast space padding method. */	TokenNameCOMMENT_JAVADOC	 Fast space padding method. 
public	TokenNamepublic	
void	TokenNamevoid	
spacePad	TokenNameIdentifier	 space Pad
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACES	TokenNameIdentifier	 SPACES
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACES	TokenNameIdentifier	 SPACES
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

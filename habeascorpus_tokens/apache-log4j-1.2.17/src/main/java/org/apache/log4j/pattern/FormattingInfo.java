/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
/** * Modifies the output of a pattern converter for a specified minimum * and maximum width and alignment. * * * @author <a href=mailto:jim_cakalic@na.biomerieux.com>Jim Cakalic</a> * @author Ceki G&uuml;lc&uuml; * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 Modifies the output of a pattern converter for a specified minimum and maximum width and alignment. * @author <a href=mailto:jim_cakalic@na.biomerieux.com>Jim Cakalic</a> @author Ceki G&uuml;lc&uuml; @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FormattingInfo	TokenNameIdentifier	 Formatting Info
{	TokenNameLBRACE	
/** * Array of spaces. */	TokenNameCOMMENT_JAVADOC	 Array of spaces. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SPACES	TokenNameIdentifier	 SPACES
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Default instance. */	TokenNameCOMMENT_JAVADOC	 Default instance. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FormattingInfo	TokenNameIdentifier	 Formatting Info
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Minimum length. */	TokenNameCOMMENT_JAVADOC	 Minimum length. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minLength	TokenNameIdentifier	 min Length
;	TokenNameSEMICOLON	
/** * Maximum length. */	TokenNameCOMMENT_JAVADOC	 Maximum length. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxLength	TokenNameIdentifier	 max Length
;	TokenNameSEMICOLON	
/** * Alignment. */	TokenNameCOMMENT_JAVADOC	 Alignment. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
leftAlign	TokenNameIdentifier	 left Align
;	TokenNameSEMICOLON	
/** * Creates new instance. * @param leftAlign left align if true. * @param minLength minimum length. * @param maxLength maximum length. */	TokenNameCOMMENT_JAVADOC	 Creates new instance. @param leftAlign left align if true. @param minLength minimum length. @param maxLength maximum length. 
public	TokenNamepublic	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
leftAlign	TokenNameIdentifier	 left Align
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minLength	TokenNameIdentifier	 min Length
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
maxLength	TokenNameIdentifier	 max Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
leftAlign	TokenNameIdentifier	 left Align
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minLength	TokenNameIdentifier	 min Length
=	TokenNameEQUAL	
minLength	TokenNameIdentifier	 min Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxLength	TokenNameIdentifier	 max Length
=	TokenNameEQUAL	
maxLength	TokenNameIdentifier	 max Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets default instance. * @return default instance. */	TokenNameCOMMENT_JAVADOC	 Gets default instance. @return default instance. 
public	TokenNamepublic	
static	TokenNamestatic	
FormattingInfo	TokenNameIdentifier	 Formatting Info
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if left aligned. * @return true if left aligned. */	TokenNameCOMMENT_JAVADOC	 Determine if left aligned. @return true if left aligned. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leftAlign	TokenNameIdentifier	 left Align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get minimum length. * @return minimum length. */	TokenNameCOMMENT_JAVADOC	 Get minimum length. @return minimum length. 
public	TokenNamepublic	
int	TokenNameint	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minLength	TokenNameIdentifier	 min Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get maximum length. * @return maximum length. */	TokenNameCOMMENT_JAVADOC	 Get maximum length. @return maximum length. 
public	TokenNamepublic	
int	TokenNameint	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxLength	TokenNameIdentifier	 max Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adjust the content of the buffer based on the specified lengths and alignment. * * @param fieldStart start of field in buffer. * @param buffer buffer to be modified. */	TokenNameCOMMENT_JAVADOC	 Adjust the content of the buffer based on the specified lengths and alignment. * @param fieldStart start of field in buffer. @param buffer buffer to be modified. 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
rawLength	TokenNameIdentifier	 raw Length
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
fieldStart	TokenNameIdentifier	 field Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rawLength	TokenNameIdentifier	 raw Length
>	TokenNameGREATER	
maxLength	TokenNameIdentifier	 max Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
maxLength	TokenNameIdentifier	 max Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rawLength	TokenNameIdentifier	 raw Length
<	TokenNameLESS	
minLength	TokenNameIdentifier	 min Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftAlign	TokenNameIdentifier	 left Align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
fieldEnd	TokenNameIdentifier	 field End
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
+	TokenNamePLUS	
minLength	TokenNameIdentifier	 min Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fieldEnd	TokenNameIdentifier	 field End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
padLength	TokenNameIdentifier	 pad Length
=	TokenNameEQUAL	
minLength	TokenNameIdentifier	 min Length
-	TokenNameMINUS	
rawLength	TokenNameIdentifier	 raw Length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
padLength	TokenNameIdentifier	 pad Length
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
padLength	TokenNameIdentifier	 pad Length
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
SPACES	TokenNameIdentifier	 SPACES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
SPACES	TokenNameIdentifier	 SPACES
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
padLength	TokenNameIdentifier	 pad Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

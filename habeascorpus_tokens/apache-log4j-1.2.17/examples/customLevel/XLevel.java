/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
customLevel	TokenNameIdentifier	 custom Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
/** This class introduces a new level level called TRACE. TRACE has lower level than DEBUG. */	TokenNameCOMMENT_JAVADOC	 This class introduces a new level level called TRACE. TRACE has lower level than DEBUG. 
public	TokenNamepublic	
class	TokenNameclass	
XLevel	TokenNameIdentifier	 X Level
extends	TokenNameextends	
Level	TokenNameIdentifier	 Level
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2626753561969426769L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
LETHAL_INT	TokenNameIdentifier	 LETHAL  INT
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TRACE_STR	TokenNameIdentifier	 TRACE  STR
=	TokenNameEQUAL	
"TRACE"	TokenNameStringLiteral	TRACE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LETHAL_STR	TokenNameIdentifier	 LETHAL  STR
=	TokenNameEQUAL	
"LETHAL"	TokenNameStringLiteral	LETHAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XLevel	TokenNameIdentifier	 X Level
TRACE	TokenNameIdentifier	 TRACE
=	TokenNameEQUAL	
new	TokenNamenew	
XLevel	TokenNameIdentifier	 X Level
(	TokenNameLPAREN	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
,	TokenNameCOMMA	
TRACE_STR	TokenNameIdentifier	 TRACE  STR
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XLevel	TokenNameIdentifier	 X Level
LETHAL	TokenNameIdentifier	 LETHAL
=	TokenNameEQUAL	
new	TokenNamenew	
XLevel	TokenNameIdentifier	 X Level
(	TokenNameLPAREN	
LETHAL_INT	TokenNameIdentifier	 LETHAL  INT
,	TokenNameCOMMA	
LETHAL_STR	TokenNameIdentifier	 LETHAL  STR
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XLevel	TokenNameIdentifier	 X Level
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
strLevel	TokenNameIdentifier	 str Level
,	TokenNameCOMMA	
int	TokenNameint	
syslogEquiv	TokenNameIdentifier	 syslog Equiv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
strLevel	TokenNameIdentifier	 str Level
,	TokenNameCOMMA	
syslogEquiv	TokenNameIdentifier	 syslog Equiv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert the string passed as argument to a level. If the conversion fails, then this method returns {@link #TRACE}. */	TokenNameCOMMENT_JAVADOC	 Convert the string passed as argument to a level. If the conversion fails, then this method returns {@link #TRACE}. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stringVal	TokenNameIdentifier	 string Val
=	TokenNameEQUAL	
sArg	TokenNameIdentifier	 s Arg
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stringVal	TokenNameIdentifier	 string Val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TRACE_STR	TokenNameIdentifier	 TRACE  STR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
stringVal	TokenNameIdentifier	 string Val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LETHAL_STR	TokenNameIdentifier	 LETHAL  STR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
:	TokenNameCOLON	
return	TokenNamereturn	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
;	TokenNameSEMICOLON	
case	TokenNamecase	
LETHAL_INT	TokenNameIdentifier	 LETHAL  INT
:	TokenNameCOLON	
return	TokenNamereturn	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

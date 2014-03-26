/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This class represents a parser with support for numbers. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: NumberParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a parser with support for numbers. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: NumberParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NumberParser	TokenNameIdentifier	 Number Parser
extends	TokenNameextends	
AbstractParser	TokenNameIdentifier	 Abstract Parser
{	TokenNameLBRACE	
/** * Parses the content of the buffer and converts it to a float. */	TokenNameCOMMENT_JAVADOC	 Parses the content of the buffer and converts it to a float. 
protected	TokenNameprotected	
float	TokenNamefloat	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mantDig	TokenNameIdentifier	 mant Dig
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mantPos	TokenNameIdentifier	 mant Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
expDig	TokenNameIdentifier	 exp Dig
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
expAdj	TokenNameIdentifier	 exp Adj
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expPos	TokenNameIdentifier	 exp Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantPos	TokenNameIdentifier	 mant Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// fallthrough 	TokenNameCOMMENT_LINE	fallthrough 
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m1	TokenNameIdentifier	 m1
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
m1	TokenNameIdentifier	 m1
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
<	TokenNameLESS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mantDig	TokenNameIdentifier	 mant Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
mant	TokenNameIdentifier	 mant
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expAdj	TokenNameIdentifier	 exp Adj
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m2	TokenNameIdentifier	 m2
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mantRead	TokenNameIdentifier	 mant Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expAdj	TokenNameIdentifier	 exp Adj
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mantRead	TokenNameIdentifier	 mant Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
m2	TokenNameIdentifier	 m2
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
<	TokenNameLESS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mantDig	TokenNameIdentifier	 mant Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
mant	TokenNameIdentifier	 mant
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expAdj	TokenNameIdentifier	 exp Adj
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
expPos	TokenNameIdentifier	 exp Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
en	TokenNameIdentifier	 en
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
en	TokenNameIdentifier	 en
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expDig	TokenNameIdentifier	 exp Dig
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expDig	TokenNameIdentifier	 exp Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expPos	TokenNameIdentifier	 exp Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
-	TokenNameMINUS	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exp	TokenNameIdentifier	 exp
+=	TokenNamePLUS_EQUAL	
expAdj	TokenNameIdentifier	 exp Adj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mantPos	TokenNameIdentifier	 mant Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
-	TokenNameMINUS	
mant	TokenNameIdentifier	 mant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buildFloat	TokenNameIdentifier	 build Float
(	TokenNameLPAREN	
mant	TokenNameIdentifier	 mant
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes a float from mantissa and exponent. */	TokenNameCOMMENT_JAVADOC	 Computes a float from mantissa and exponent. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
buildFloat	TokenNameIdentifier	 build Float
(	TokenNameLPAREN	
int	TokenNameint	
mant	TokenNameIdentifier	 mant
,	TokenNameCOMMA	
int	TokenNameint	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
<	TokenNameLESS	
-	TokenNameMINUS	
125	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
mant	TokenNameIdentifier	 mant
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
mant	TokenNameIdentifier	 mant
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
:	TokenNameCOLON	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mant	TokenNameIdentifier	 mant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mant	TokenNameIdentifier	 mant
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
26	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mant	TokenNameIdentifier	 mant
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// round up trailing bits if they will be dropped. 	TokenNameCOMMENT_LINE	round up trailing bits if they will be dropped. 
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
mant	TokenNameIdentifier	 mant
*	TokenNameMULTIPLY	
pow10	TokenNameIdentifier	 pow10
[	TokenNameLBRACKET	
exp	TokenNameIdentifier	 exp
]	TokenNameRBRACKET	
:	TokenNameCOLON	
mant	TokenNameIdentifier	 mant
/	TokenNameDIVIDE	
pow10	TokenNameIdentifier	 pow10
[	TokenNameLBRACKET	
-	TokenNameMINUS	
exp	TokenNameIdentifier	 exp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Array of powers of ten. Using double instead of float gives a tiny bit more precision. */	TokenNameCOMMENT_JAVADOC	 Array of powers of ten. Using double instead of float gives a tiny bit more precision. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pow10	TokenNameIdentifier	 pow10
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
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
pow10	TokenNameIdentifier	 pow10
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pow10	TokenNameIdentifier	 pow10
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

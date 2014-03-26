/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * JRE specific helper functions for {@link DOMUtilities}. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMUtilitiesSupport.java 502541 2007-02-02 08:55:41Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 JRE specific helper functions for {@link DOMUtilities}. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMUtilitiesSupport.java 502541 2007-02-02 08:55:41Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DOMUtilitiesSupport	TokenNameIdentifier	 DOM Utilities Support
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BITS	TokenNameIdentifier	 BITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Shift"	TokenNameStringLiteral	Shift
,	TokenNameCOMMA	
"Ctrl"	TokenNameStringLiteral	Ctrl
,	TokenNameCOMMA	
"Meta-or-Button3"	TokenNameStringLiteral	Meta-or-Button3
,	TokenNameCOMMA	
"Alt-or-Button2"	TokenNameStringLiteral	Alt-or-Button2
,	TokenNameCOMMA	
"Button1"	TokenNameStringLiteral	Button1
,	TokenNameCOMMA	
"AltGraph"	TokenNameStringLiteral	AltGraph
,	TokenNameCOMMA	
"ShiftDown"	TokenNameStringLiteral	ShiftDown
,	TokenNameCOMMA	
"CtrlDown"	TokenNameStringLiteral	CtrlDown
,	TokenNameCOMMA	
"MetaDown"	TokenNameStringLiteral	MetaDown
,	TokenNameCOMMA	
"AltDown"	TokenNameStringLiteral	AltDown
,	TokenNameCOMMA	
"Button1Down"	TokenNameStringLiteral	Button1Down
,	TokenNameCOMMA	
"Button2Down"	TokenNameStringLiteral	Button2Down
,	TokenNameCOMMA	
"Button3Down"	TokenNameStringLiteral	Button3Down
,	TokenNameCOMMA	
"AltGraphDown"	TokenNameStringLiteral	AltGraphDown
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Gets a DOM 3 modifiers string from the given lock and * shift bitmasks. */	TokenNameCOMMENT_JAVADOC	 Gets a DOM 3 modifiers string from the given lock and shift bitmasks. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getModifiersList	TokenNameIdentifier	 get Modifiers List
(	TokenNameLPAREN	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
,	TokenNameCOMMA	
int	TokenNameint	
modifiersEx	TokenNameIdentifier	 modifiers Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
modifiersEx	TokenNameIdentifier	 modifiers Ex
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiersEx	TokenNameIdentifier	 modifiers Ex
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
modifiersEx	TokenNameIdentifier	 modifiers Ex
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
modifiersEx	TokenNameIdentifier	 modifiers Ex
=	TokenNameEQUAL	
(	TokenNameLPAREN	
modifiersEx	TokenNameIdentifier	 modifiers Ex
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
LOCK_STRINGS	TokenNameIdentifier	 LOCK  STRINGS
[	TokenNameLBRACKET	
lockState	TokenNameIdentifier	 lock State
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
MODIFIER_STRINGS	TokenNameIdentifier	 MODIFIER  STRINGS
[	TokenNameLBRACKET	
modifiersEx	TokenNameIdentifier	 modifiers Ex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
MODIFIER_STRINGS	TokenNameIdentifier	 MODIFIER  STRINGS
[	TokenNameLBRACKET	
modifiersEx	TokenNameIdentifier	 modifiers Ex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

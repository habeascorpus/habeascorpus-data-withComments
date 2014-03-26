/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T1	TokenNameIdentifier	 T1
,	TokenNameCOMMA	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
T1	TokenNameIdentifier	 T1
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
T2	TokenNameIdentifier	 T2
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
T1	TokenNameIdentifier	 T1
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T2	TokenNameIdentifier	 T2
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hashCode	TokenNameIdentifier	 hash Code
+	TokenNamePLUS	
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
// handles nulls properly 	TokenNameCOMMENT_LINE	handles nulls properly 
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

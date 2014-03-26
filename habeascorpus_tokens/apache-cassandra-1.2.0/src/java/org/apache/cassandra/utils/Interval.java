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
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
C	TokenNameIdentifier	 C
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
C	TokenNameIdentifier	 C
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
D	TokenNameIdentifier	 D
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Interval	TokenNameIdentifier	 Interval
(	TokenNameLPAREN	
C	TokenNameIdentifier	 C
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
>	TokenNameGREATER	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
C	TokenNameIdentifier	 C
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
>	TokenNameGREATER	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
C	TokenNameIdentifier	 C
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
D	TokenNameIdentifier	 D
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Interval	TokenNameIdentifier	 Interval
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"[%s, %s]%s"	TokenNameStringLiteral	[%s, %s]%s
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"(%s)"	TokenNameStringLiteral	(%s)
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
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
Interval	TokenNameIdentifier	 Interval
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Interval	TokenNameIdentifier	 Interval
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
// handles nulls properly 	TokenNameCOMMENT_LINE	handles nulls properly 
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

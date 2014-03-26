package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
FieldPosition	TokenNameIdentifier	 Field Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Format	TokenNameIdentifier	 Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParsePosition	TokenNameIdentifier	 Parse Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
/** * This {@link Format} parses {@link Long} into date strings and vice-versa. It * uses the given {@link DateFormat} to parse and format dates, but before, it * converts {@link Long} to {@link Date} objects or vice-versa. */	TokenNameCOMMENT_JAVADOC	 This {@link Format} parses {@link Long} into date strings and vice-versa. It uses the given {@link DateFormat} to parse and format dates, but before, it converts {@link Long} to {@link Date} objects or vice-versa. 
public	TokenNamepublic	
class	TokenNameclass	
NumberDateFormat	TokenNameIdentifier	 Number Date Format
extends	TokenNameextends	
NumberFormat	TokenNameIdentifier	 Number Format
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
964823936071308283L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
private	TokenNameprivate	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
/** * Constructs a {@link NumberDateFormat} object using the given {@link DateFormat}. * * @param dateFormat {@link DateFormat} used to parse and format dates */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link NumberDateFormat} object using the given {@link DateFormat}. * @param dateFormat {@link DateFormat} used to parse and format dates 
public	TokenNamepublic	
NumberDateFormat	TokenNameIdentifier	 Number Date Format
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
double	TokenNamedouble	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
FieldPosition	TokenNameIdentifier	 Field Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
long	TokenNamelong	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
FieldPosition	TokenNameIdentifier	 Field Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Number	TokenNameIdentifier	 Number
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
parsePosition	TokenNameIdentifier	 parse Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
parsePosition	TokenNameIdentifier	 parse Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
FieldPosition	TokenNameIdentifier	 Field Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

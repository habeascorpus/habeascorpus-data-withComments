/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: XMLSimpleType.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: XMLSimpleType.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** TYPE_CDATA */	TokenNameCOMMENT_JAVADOC	 TYPE_CDATA 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_CDATA	TokenNameIdentifier	 TYPE  CDATA
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_ENTITY */	TokenNameCOMMENT_JAVADOC	 TYPE_ENTITY 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_ENTITY	TokenNameIdentifier	 TYPE  ENTITY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_ENUMERATION */	TokenNameCOMMENT_JAVADOC	 TYPE_ENUMERATION 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_ENUMERATION	TokenNameIdentifier	 TYPE  ENUMERATION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_ID */	TokenNameCOMMENT_JAVADOC	 TYPE_ID 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_ID	TokenNameIdentifier	 TYPE  ID
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_IDREF */	TokenNameCOMMENT_JAVADOC	 TYPE_IDREF 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_IDREF	TokenNameIdentifier	 TYPE  IDREF
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_NMTOKEN */	TokenNameCOMMENT_JAVADOC	 TYPE_NMTOKEN 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_NMTOKEN	TokenNameIdentifier	 TYPE  NMTOKEN
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_NOTATION */	TokenNameCOMMENT_JAVADOC	 TYPE_NOTATION 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_NOTATION	TokenNameIdentifier	 TYPE  NOTATION
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_NAMED */	TokenNameCOMMENT_JAVADOC	 TYPE_NAMED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_NAMED	TokenNameIdentifier	 TYPE  NAMED
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** DEFAULT_TYPE_DEFAULT */	TokenNameCOMMENT_JAVADOC	 DEFAULT_TYPE_DEFAULT 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DEFAULT_TYPE_DEFAULT	TokenNameIdentifier	 DEFAULT  TYPE  DEFAULT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** DEFAULT_TYPE_FIXED */	TokenNameCOMMENT_JAVADOC	 DEFAULT_TYPE_FIXED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DEFAULT_TYPE_FIXED	TokenNameIdentifier	 DEFAULT  TYPE  FIXED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** DEFAULT_TYPE_IMPLIED */	TokenNameCOMMENT_JAVADOC	 DEFAULT_TYPE_IMPLIED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DEFAULT_TYPE_IMPLIED	TokenNameIdentifier	 DEFAULT  TYPE  IMPLIED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** DEFAULT_TYPE_REQUIRED */	TokenNameCOMMENT_JAVADOC	 DEFAULT_TYPE_REQUIRED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DEFAULT_TYPE_REQUIRED	TokenNameIdentifier	 DEFAULT  TYPE  REQUIRED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** type */	TokenNameCOMMENT_JAVADOC	 type 
public	TokenNamepublic	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** name */	TokenNameCOMMENT_JAVADOC	 name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** enumeration */	TokenNameCOMMENT_JAVADOC	 enumeration 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumeration	TokenNameIdentifier	 enumeration
;	TokenNameSEMICOLON	
/** list */	TokenNameCOMMENT_JAVADOC	 list 
public	TokenNamepublic	
boolean	TokenNameboolean	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
/** defaultType */	TokenNameCOMMENT_JAVADOC	 defaultType 
public	TokenNamepublic	
short	TokenNameshort	
defaultType	TokenNameIdentifier	 default Type
;	TokenNameSEMICOLON	
/** defaultValue */	TokenNameCOMMENT_JAVADOC	 defaultValue 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
/** non-normalized defaultValue */	TokenNameCOMMENT_JAVADOC	 non-normalized defaultValue 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
;	TokenNameSEMICOLON	
/** datatypeValidator */	TokenNameCOMMENT_JAVADOC	 datatypeValidator 
public	TokenNamepublic	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
datatypeValidator	TokenNameIdentifier	 datatype Validator
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * setValues * * @param type * @param name * @param enumeration * @param list * @param defaultType * @param defaultValue * @param nonNormalizedDefaultValue * @param datatypeValidator */	TokenNameCOMMENT_JAVADOC	 setValues * @param type @param name @param enumeration @param list @param defaultType @param defaultValue @param nonNormalizedDefaultValue @param datatypeValidator 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
boolean	TokenNameboolean	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
short	TokenNameshort	
defaultType	TokenNameIdentifier	 default Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
,	TokenNameCOMMA	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
datatypeValidator	TokenNameIdentifier	 datatype Validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// REVISIT: Should this be a copy? -Ac 	TokenNameCOMMENT_LINE	REVISIT: Should this be a copy? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
enumeration	TokenNameIdentifier	 enumeration
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultType	TokenNameIdentifier	 default Type
=	TokenNameEQUAL	
defaultType	TokenNameIdentifier	 default Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
=	TokenNameEQUAL	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
datatypeValidator	TokenNameIdentifier	 datatype Validator
=	TokenNameEQUAL	
datatypeValidator	TokenNameIdentifier	 datatype Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues(short,String,String[],boolean,short,String,String,DatatypeValidator) 	TokenNameCOMMENT_LINE	setValues(short,String,String[],boolean,short,String,String,DatatypeValidator) 
/** Set values. */	TokenNameCOMMENT_JAVADOC	 Set values. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// REVISIT: Should this be a copy? -Ac 	TokenNameCOMMENT_LINE	REVISIT: Should this be a copy? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
defaultType	TokenNameIdentifier	 default Type
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
defaultType	TokenNameIdentifier	 default Type
;	TokenNameSEMICOLON	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
;	TokenNameSEMICOLON	
datatypeValidator	TokenNameIdentifier	 datatype Validator
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
datatypeValidator	TokenNameIdentifier	 datatype Validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues(XMLSimpleType) 	TokenNameCOMMENT_LINE	setValues(XMLSimpleType) 
/** * clear */	TokenNameCOMMENT_JAVADOC	 clear 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultType	TokenNameIdentifier	 default Type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
datatypeValidator	TokenNameIdentifier	 datatype Validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear 	TokenNameCOMMENT_LINE	clear 
}	TokenNameRBRACE	
// class XMLSimpleType 	TokenNameCOMMENT_LINE	class XMLSimpleType 

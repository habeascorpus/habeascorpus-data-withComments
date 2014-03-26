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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
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
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
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
ValidationContext	TokenNameIdentifier	 Validation Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLChar	TokenNameIdentifier	 XML Char
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
.	TokenNameDOT	
XSQName	TokenNameIdentifier	 XSQ Name
;	TokenNameSEMICOLON	
/** * Represent the schema type "QName" and "NOTATION" * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: QNameDV.java 701915 2008-10-06 02:39:42Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represent the schema type "QName" and "NOTATION" * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: QNameDV.java 701915 2008-10-06 02:39:42Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
QNameDV	TokenNameIdentifier	 Q Name DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
getAllowedFacets	TokenNameIdentifier	 get Allowed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_LENGTH	TokenNameIdentifier	 FACET  LENGTH
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MAXLENGTH	TokenNameIdentifier	 FACET  MAXLENGTH
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_ENUMERATION	TokenNameIdentifier	 FACET  ENUMERATION
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
// "prefix:localpart" or "localpart" 	TokenNameCOMMENT_LINE	"prefix:localpart" or "localpart" 
// get prefix and local part out of content 	TokenNameCOMMENT_LINE	get prefix and local part out of content 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
int	TokenNameint	
colonptr	TokenNameIdentifier	 colonptr
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonptr	TokenNameIdentifier	 colonptr
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonptr	TokenNameIdentifier	 colonptr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colonptr	TokenNameIdentifier	 colonptr
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// both prefix (if any) a nd localpart must be valid NCName 	TokenNameCOMMENT_LINE	both prefix (if any) a nd localpart must be valid NCName 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"cvc-datatype-valid.1.2.1"	TokenNameStringLiteral	cvc-datatype-valid.1.2.1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
"QName"	TokenNameStringLiteral	QName
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"cvc-datatype-valid.1.2.1"	TokenNameStringLiteral	cvc-datatype-valid.1.2.1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
"QName"	TokenNameStringLiteral	QName
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// resove prefix to a uri, report an error if failed 	TokenNameCOMMENT_LINE	resove prefix to a uri, report an error if failed 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"UndeclaredPrefix"	TokenNameStringLiteral	UndeclaredPrefix
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XQName	TokenNameIdentifier	 XQ Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// REVISIT: qname and notation shouldn't support length facets. 	TokenNameCOMMENT_LINE	REVISIT: qname and notation shouldn't support length facets. 
// now we just return the length of the rawname 	TokenNameCOMMENT_LINE	now we just return the length of the rawname 
public	TokenNamepublic	
int	TokenNameint	
getDataLength	TokenNameIdentifier	 get Data Length
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XQName	TokenNameIdentifier	 XQ Name
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * represent QName data */	TokenNameCOMMENT_JAVADOC	 represent QName data 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
XQName	TokenNameIdentifier	 XQ Name
extends	TokenNameextends	
QName	TokenNameIdentifier	 Q Name
implements	TokenNameimplements	
XSQName	TokenNameIdentifier	 XSQ Name
{	TokenNameLBRACE	
/** Constructs a QName with the specified values. */	TokenNameCOMMENT_JAVADOC	 Constructs a QName with the specified values. 
public	TokenNamepublic	
XQName	TokenNameIdentifier	 XQ Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String) 
/** Returns true if the two objects are equal. */	TokenNameCOMMENT_JAVADOC	 Returns true if the two objects are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
&&	TokenNameAND_AND	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// equals(Object):boolean 	TokenNameCOMMENT_LINE	equals(Object):boolean 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
getJAXPQName	TokenNameIdentifier	 get JAXPQ Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getXNIQName	TokenNameIdentifier	 get XNIQ Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class QNameDVDV 	TokenNameCOMMENT_LINE	class QNameDVDV 

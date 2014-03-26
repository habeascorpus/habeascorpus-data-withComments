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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
.	TokenNameDOT	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
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
/** * @xerces.internal * * @version $Id: XMLElementDecl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: XMLElementDecl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLElementDecl	TokenNameIdentifier	 XML Element Decl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** TYPE_ANY */	TokenNameCOMMENT_JAVADOC	 TYPE_ANY 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_ANY	TokenNameIdentifier	 TYPE  ANY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_EMPTY */	TokenNameCOMMENT_JAVADOC	 TYPE_EMPTY 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_EMPTY	TokenNameIdentifier	 TYPE  EMPTY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_MIXED */	TokenNameCOMMENT_JAVADOC	 TYPE_MIXED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_MIXED	TokenNameIdentifier	 TYPE  MIXED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 TYPE_CHILDREN 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_CHILDREN	TokenNameIdentifier	 TYPE  CHILDREN
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** TYPE_SIMPLE */	TokenNameCOMMENT_JAVADOC	 TYPE_SIMPLE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_SIMPLE	TokenNameIdentifier	 TYPE  SIMPLE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** name */	TokenNameCOMMENT_JAVADOC	 name 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** scope */	TokenNameCOMMENT_JAVADOC	 scope 
public	TokenNamepublic	
int	TokenNameint	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** type */	TokenNameCOMMENT_JAVADOC	 type 
public	TokenNamepublic	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** contentModelValidator */	TokenNameCOMMENT_JAVADOC	 contentModelValidator 
public	TokenNamepublic	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
contentModelValidator	TokenNameIdentifier	 content Model Validator
;	TokenNameSEMICOLON	
/** simpleType */	TokenNameCOMMENT_JAVADOC	 simpleType 
public	TokenNamepublic	
final	TokenNamefinal	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
simpleType	TokenNameIdentifier	 simple Type
=	TokenNameEQUAL	
new	TokenNamenew	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * setValues * * @param name * @param scope * @param type * @param contentModelValidator * @param simpleType */	TokenNameCOMMENT_JAVADOC	 setValues * @param name @param scope @param type @param contentModelValidator @param simpleType 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
contentModelValidator	TokenNameIdentifier	 content Model Validator
,	TokenNameCOMMA	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contentModelValidator	TokenNameIdentifier	 content Model Validator
=	TokenNameEQUAL	
contentModelValidator	TokenNameIdentifier	 content Model Validator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues 	TokenNameCOMMENT_LINE	setValues 
/** * clear */	TokenNameCOMMENT_JAVADOC	 clear 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contentModelValidator	TokenNameIdentifier	 content Model Validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear 	TokenNameCOMMENT_LINE	clear 
}	TokenNameRBRACE	
// class XMLElementDecl 	TokenNameCOMMENT_LINE	class XMLElementDecl 

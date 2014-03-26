/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngine	TokenNameIdentifier	 CSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * This class provides a manager for the property with support for * identifier values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: IdentifierManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the property with support for identifier values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: IdentifierManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
extends	TokenNameextends	
AbstractValueManager	TokenNameIdentifier	 Abstract Value Manager
{	TokenNameLBRACE	
/** * Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INHERIT	TokenNameIdentifier	 SAC  INHERIT
:	TokenNameCOLON	
return	TokenNamereturn	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INHERIT_VALUE	TokenNameIdentifier	 INHERIT  VALUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createInvalidIdentifierDOMException	TokenNameIdentifier	 create Invalid Identifier DOM Exception
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createInvalidLexicalUnitDOMException	TokenNameIdentifier	 create Invalid Lexical Unit DOM Exception
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link * ValueManager#createStringValue(short,String,CSSEngine)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#createStringValue(short,String,CSSEngine)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
createStringValue	TokenNameIdentifier	 create String Value
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createInvalidStringTypeDOMException	TokenNameIdentifier	 create Invalid String Type DOM Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createInvalidIdentifierDOMException	TokenNameIdentifier	 create Invalid Identifier DOM Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the map that contains the name/value mappings for each * possible identifiers. */	TokenNameCOMMENT_JAVADOC	 Returns the map that contains the name/value mappings for each possible identifiers. 
public	TokenNamepublic	
abstract	TokenNameabstract	
StringMap	TokenNameIdentifier	 String Map
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

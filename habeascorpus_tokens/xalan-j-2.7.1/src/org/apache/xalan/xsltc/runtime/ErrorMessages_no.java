/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_no.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_no.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
ErrorMessages_no	TokenNameIdentifier	 Error Messages no
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
// Disse feilmeldingene maa korrespondere med konstantene some er definert 	TokenNameCOMMENT_LINE	Disse feilmeldingene maa korrespondere med konstantene some er definert 
// nederst i kildekoden til BasisLibrary. 	TokenNameCOMMENT_LINE	nederst i kildekoden til BasisLibrary. 
/** Get the lookup table for error messages. * * @return The message lookup table. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages. * @return The message lookup table. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
RUN_TIME_INTERNAL_ERR	TokenNameIdentifier	 RUN  TIME  INTERNAL  ERR
,	TokenNameCOMMA	
"Intern programfeil i ''{0}''"	TokenNameStringLiteral	Intern programfeil i ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
RUN_TIME_COPY_ERR	TokenNameIdentifier	 RUN  TIME  COPY  ERR
,	TokenNameCOMMA	
"Programfeil under utføing av <xsl:copy>."	TokenNameStringLiteral	Programfeil under utføing av <xsl:copy>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Ugyldig konvertering av ''{0}'' fra ''{1}''."	TokenNameStringLiteral	Ugyldig konvertering av ''{0}'' fra ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
EXTERNAL_FUNC_ERR	TokenNameIdentifier	 EXTERNAL  FUNC  ERR
,	TokenNameCOMMA	
"Ekstern funksjon ''{0}'' er ikke støttet av XSLTC."	TokenNameStringLiteral	Ekstern funksjon ''{0}'' er ikke støttet av XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
EQUALITY_EXPR_ERR	TokenNameIdentifier	 EQUALITY  EXPR  ERR
,	TokenNameCOMMA	
"Ugyldig argument i EQUALITY uttrykk."	TokenNameStringLiteral	Ugyldig argument i EQUALITY uttrykk.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
INVALID_ARGUMENT_ERR	TokenNameIdentifier	 INVALID  ARGUMENT  ERR
,	TokenNameCOMMA	
"Ugyldig argument ''{0}'' i kall til ''{1}''"	TokenNameStringLiteral	Ugyldig argument ''{0}'' i kall til ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
FORMAT_NUMBER_ERR	TokenNameIdentifier	 FORMAT  NUMBER  ERR
,	TokenNameCOMMA	
"Forsøk på å formattere nummer ''{0}'' med ''{1}''."	TokenNameStringLiteral	Forsøk på å formattere nummer ''{0}'' med ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
ITERATOR_CLONE_ERR	TokenNameIdentifier	 ITERATOR  CLONE  ERR
,	TokenNameCOMMA	
"Kan ikke klone iterator ''{0}''."	TokenNameStringLiteral	Kan ikke klone iterator ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
AXIS_SUPPORT_ERR	TokenNameIdentifier	 AXIS  SUPPORT  ERR
,	TokenNameCOMMA	
"Iterator for axis ''{0}'' er ikke stèttet."	TokenNameStringLiteral	Iterator for axis ''{0}'' er ikke stèttet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
TYPED_AXIS_SUPPORT_ERR	TokenNameIdentifier	 TYPED  AXIS  SUPPORT  ERR
,	TokenNameCOMMA	
"Iterator for typet axis ''{0}'' er ikke stèttet."	TokenNameStringLiteral	Iterator for typet axis ''{0}'' er ikke stèttet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Attributt ''{0}'' utenfor element."	TokenNameStringLiteral	Attributt ''{0}'' utenfor element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
STRAY_NAMESPACE_ERR	TokenNameIdentifier	 STRAY  NAMESPACE  ERR
,	TokenNameCOMMA	
"Navnedeklarasjon ''{0}''=''{1}'' utenfor element."	TokenNameStringLiteral	Navnedeklarasjon ''{0}''=''{1}'' utenfor element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
NAMESPACE_PREFIX_ERR	TokenNameIdentifier	 NAMESPACE  PREFIX  ERR
,	TokenNameCOMMA	
"Prefix ''{0}'' er ikke deklartert."	TokenNameStringLiteral	Prefix ''{0}'' er ikke deklartert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
DOM_ADAPTER_INIT_ERR	TokenNameIdentifier	 DOM  ADAPTER  INIT  ERR
,	TokenNameCOMMA	
"Forsøk på å instansiere DOMAdapter med feil type DOM."	TokenNameStringLiteral	Forsøk på å instansiere DOMAdapter med feil type DOM.
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

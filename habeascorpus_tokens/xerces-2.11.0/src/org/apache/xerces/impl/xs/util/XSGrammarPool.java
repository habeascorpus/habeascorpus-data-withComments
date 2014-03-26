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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Constants	TokenNameIdentifier	 Constants
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSModelImpl	TokenNameIdentifier	 XS Model Impl
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
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
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
XSModel	TokenNameIdentifier	 XS Model
;	TokenNameSEMICOLON	
/** * Add a method that return an <code>XSModel</code> that represents components in * the schema grammars in this pool implementation. * * @xerces.internal * * @version $Id: XSGrammarPool.java 770963 2009-05-02 15:27:54Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Add a method that return an <code>XSModel</code> that represents components in the schema grammars in this pool implementation. * @xerces.internal * @version $Id: XSGrammarPool.java 770963 2009-05-02 15:27:54Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSGrammarPool	TokenNameIdentifier	 XS Grammar Pool
extends	TokenNameextends	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
{	TokenNameLBRACE	
/** * Return an <code>XSModel</code> that represents components in * the schema grammars in this pool implementation. * * @return an <code>XSModel</code> representing this schema grammar */	TokenNameCOMMENT_JAVADOC	 Return an <code>XSModel</code> that represents components in the schema grammars in this pool implementation. * @return an <code>XSModel</code> representing this schema grammar 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VERSION_1_0	TokenNameIdentifier	 SCHEMA  VERSION 1 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
short	TokenNameshort	
schemaVersion	TokenNameIdentifier	 schema Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
new	TokenNamenew	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
schemaVersion	TokenNameIdentifier	 schema Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
,	TokenNameCOMMA	
schemaVersion	TokenNameIdentifier	 schema Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
XSModel	TokenNameIdentifier	 XS Model
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
,	TokenNameCOMMA	
short	TokenNameshort	
schemaVersion	TokenNameIdentifier	 schema Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSModelImpl	TokenNameIdentifier	 XS Model Impl
(	TokenNameLPAREN	
grammars	TokenNameIdentifier	 grammars
,	TokenNameCOMMA	
schemaVersion	TokenNameIdentifier	 schema Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSGrammarPool 	TokenNameCOMMENT_LINE	class XSGrammarPool 

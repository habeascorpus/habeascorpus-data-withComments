/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
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
Grammar	TokenNameIdentifier	 Grammar
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
;	TokenNameSEMICOLON	
/** * <p>Implementation of Schema for W3C XML Schemas which * contains schema components from one target namespace.</p> * * @author Michael Glavassevich, IBM * @version $Id: SimpleXMLSchema.java 542516 2007-05-29 13:44:47Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Implementation of Schema for W3C XML Schemas which contains schema components from one target namespace.</p> * @author Michael Glavassevich, IBM @version $Id: SimpleXMLSchema.java 542516 2007-05-29 13:44:47Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
SimpleXMLSchema	TokenNameIdentifier	 Simple XML Schema
extends	TokenNameextends	
AbstractXMLSchema	TokenNameIdentifier	 Abstract XML Schema
implements	TokenNameimplements	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
{	TokenNameLBRACE	
/** Zero length grammar array. */	TokenNameCOMMENT_JAVADOC	 Zero length grammar array. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ZERO_LENGTH_GRAMMAR_ARRAY	TokenNameIdentifier	 ZERO  LENGTH  GRAMMAR  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Grammar	TokenNameIdentifier	 Grammar
fGrammar	TokenNameIdentifier	 f Grammar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGrammars	TokenNameIdentifier	 f Grammars
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
fGrammarDescription	TokenNameIdentifier	 f Grammar Description
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleXMLSchema	TokenNameIdentifier	 Simple XML Schema
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammar	TokenNameIdentifier	 f Grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
new	TokenNamenew	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fGrammarDescription	TokenNameIdentifier	 f Grammar Description
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGrammarDescription	TokenNameIdentifier	 get Grammar Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * XMLGrammarPool methods */	TokenNameCOMMENT_BLOCK	 XMLGrammarPool methods 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retrieveInitialGrammarSet	TokenNameIdentifier	 retrieve Initial Grammar Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ZERO_LENGTH_GRAMMAR_ARRAY	TokenNameIdentifier	 ZERO  LENGTH  GRAMMAR  ARRAY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cacheGrammars	TokenNameIdentifier	 cache Grammars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
grammarType	TokenNameIdentifier	 grammar Type
,	TokenNameCOMMA	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarDescription	TokenNameIdentifier	 f Grammar Description
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fGrammar	TokenNameIdentifier	 f Grammar
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lockPool	TokenNameIdentifier	 lock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unlockPool	TokenNameIdentifier	 unlock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/* * XSGrammarPoolContainer methods */	TokenNameCOMMENT_BLOCK	 XSGrammarPoolContainer methods 
public	TokenNamepublic	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
getGrammarPool	TokenNameIdentifier	 get Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFullyComposed	TokenNameIdentifier	 is Fully Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// SimpleXMLSchema 	TokenNameCOMMENT_LINE	SimpleXMLSchema 

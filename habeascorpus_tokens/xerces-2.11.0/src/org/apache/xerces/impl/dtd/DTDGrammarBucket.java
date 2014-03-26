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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
/** * This very simple class is the skeleton of what the DTDValidator could use * to store various grammars that it gets from the GrammarPool. As in the * case of XSGrammarBucket, one thinks of this object as being closely * associated with its validator; when fully mature, this class will be * filled from the GrammarPool when the DTDValidator is invoked on a * document, and, if a new DTD grammar is parsed, the new set will be * offered back to the GrammarPool for possible inclusion. * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: DTDGrammarBucket.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This very simple class is the skeleton of what the DTDValidator could use to store various grammars that it gets from the GrammarPool. As in the case of XSGrammarBucket, one thinks of this object as being closely associated with its validator; when fully mature, this class will be filled from the GrammarPool when the DTDValidator is invoked on a document, and, if a new DTD grammar is parsed, the new set will be offered back to the GrammarPool for possible inclusion. * @xerces.internal * @author Neil Graham, IBM * @version $Id: DTDGrammarBucket.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DTDGrammarBucket	TokenNameIdentifier	 DTD Grammar Bucket
{	TokenNameLBRACE	
// REVISIT: make this class smarter and *way* more complete! 	TokenNameCOMMENT_LINE	REVISIT: make this class smarter and *way* more complete! 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Grammars associated with element root name. */	TokenNameCOMMENT_JAVADOC	 Grammars associated with element root name. 
protected	TokenNameprotected	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
fGrammars	TokenNameIdentifier	 f Grammars
;	TokenNameSEMICOLON	
// the unique grammar from fGrammars (or that we're 	TokenNameCOMMENT_LINE	the unique grammar from fGrammars (or that we're 
// building) that is used in validation. 	TokenNameCOMMENT_LINE	building) that is used in validation. 
protected	TokenNameprotected	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
fActiveGrammar	TokenNameIdentifier	 f Active Grammar
;	TokenNameSEMICOLON	
// is the "active" grammar standalone? 	TokenNameCOMMENT_LINE	is the "active" grammar standalone? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
DTDGrammarBucket	TokenNameIdentifier	 DTD Grammar Bucket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Puts the specified grammar into the grammar pool and associate it to * a root element name (this being internal, the lack of generality is irrelevant). * * @param grammar The grammar. */	TokenNameCOMMENT_JAVADOC	 Puts the specified grammar into the grammar pool and associate it to a root element name (this being internal, the lack of generality is irrelevant). * @param grammar The grammar. 
public	TokenNamepublic	
void	TokenNamevoid	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
)	TokenNameRPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGrammarDescription	TokenNameIdentifier	 get Grammar Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putGrammar(DTDGrammar) 	TokenNameCOMMENT_LINE	putGrammar(DTDGrammar) 
// retrieve a DTDGrammar given an XMLDTDDescription 	TokenNameCOMMENT_LINE	retrieve a DTDGrammar given an XMLDTDDescription 
public	TokenNamepublic	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
)	TokenNameRPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putGrammar(DTDGrammar) 	TokenNameCOMMENT_LINE	putGrammar(DTDGrammar) 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fActiveGrammar	TokenNameIdentifier	 f Active Grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear() 	TokenNameCOMMENT_LINE	clear() 
// is the active grammar standalone? This must live here because 	TokenNameCOMMENT_LINE	is the active grammar standalone? This must live here because 
// at the time the validator discovers this we don't yet know 	TokenNameCOMMENT_LINE	at the time the validator discovers this we don't yet know 
// what the active grammar should be (no info about root) 	TokenNameCOMMENT_LINE	what the active grammar should be (no info about root) 
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
=	TokenNameEQUAL	
standalone	TokenNameIdentifier	 standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set the "active" grammar: 	TokenNameCOMMENT_LINE	set the "active" grammar: 
void	TokenNamevoid	
setActiveGrammar	TokenNameIdentifier	 set Active Grammar
(	TokenNameLPAREN	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fActiveGrammar	TokenNameIdentifier	 f Active Grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
getActiveGrammar	TokenNameIdentifier	 get Active Grammar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fActiveGrammar	TokenNameIdentifier	 f Active Grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DTDGrammarBucket 	TokenNameCOMMENT_LINE	class DTDGrammarBucket 

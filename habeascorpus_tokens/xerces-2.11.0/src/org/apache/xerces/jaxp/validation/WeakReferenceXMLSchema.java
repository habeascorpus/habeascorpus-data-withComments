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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
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
/** * <p>An implementation of Schema for W3C XML Schemas * that keeps a weak reference to its grammar pool. If * no validators currently have a reference to the * grammar pool, the garbage collector is free to reclaim * its memory.</p> * * @author Michael Glavassevich, IBM * @version $Id: WeakReferenceXMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An implementation of Schema for W3C XML Schemas that keeps a weak reference to its grammar pool. If no validators currently have a reference to the grammar pool, the garbage collector is free to reclaim its memory.</p> * @author Michael Glavassevich, IBM @version $Id: WeakReferenceXMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
WeakReferenceXMLSchema	TokenNameIdentifier	 Weak Reference XML Schema
extends	TokenNameextends	
AbstractXMLSchema	TokenNameIdentifier	 Abstract XML Schema
{	TokenNameLBRACE	
/** Weak reference to grammar pool. */	TokenNameCOMMENT_JAVADOC	 Weak reference to grammar pool. 
private	TokenNameprivate	
WeakReference	TokenNameIdentifier	 Weak Reference
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WeakReferenceXMLSchema	TokenNameIdentifier	 Weak Reference XML Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/* * XSGrammarPoolContainer methods */	TokenNameCOMMENT_BLOCK	 XSGrammarPoolContainer methods 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
getGrammarPool	TokenNameIdentifier	 get Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
)	TokenNameRPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there's no grammar pool then either we haven't created one 	TokenNameCOMMENT_LINE	If there's no grammar pool then either we haven't created one 
// yet or the garbage collector has already cleaned out the previous one. 	TokenNameCOMMENT_LINE	yet or the garbage collector has already cleaned out the previous one. 
if	TokenNameif	
(	TokenNameLPAREN	
grammarPool	TokenNameIdentifier	 grammar Pool
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammarPool	TokenNameIdentifier	 grammar Pool
=	TokenNameEQUAL	
new	TokenNamenew	
SoftReferenceGrammarPool	TokenNameIdentifier	 Soft Reference Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
(	TokenNameLPAREN	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
grammarPool	TokenNameIdentifier	 grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFullyComposed	TokenNameIdentifier	 is Fully Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// WeakReferenceXMLSchema 	TokenNameCOMMENT_LINE	WeakReferenceXMLSchema 

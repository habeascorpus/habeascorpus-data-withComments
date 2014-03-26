/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
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
ShadowedSymbolTable	TokenNameIdentifier	 Shadowed Symbol Table
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
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
/** * A parser pool that enables caching of grammars. The caching parser * pool is constructed with a specific symbol table and grammar pool * that has already been populated with the grammars used by the * application. * <p> * Once the caching parser pool is constructed, specific parser * instances are created by calling the appropriate factory method * on the parser pool. * <p> * <strong>Note:</strong> There is a performance penalty for using * a caching parser pool due to thread safety. Access to the symbol * table and grammar pool must be synchronized to ensure the safe * operation of the symbol table and grammar pool. * <p> * <strong>Note:</strong> If performance is critical, then another * mechanism needs to be used instead of the caching parser pool. * One approach would be to create parser instances that do not * share these structures. Instead, each instance would get its * own copy to use while parsing. This avoids the synchronization * overhead at the expense of more memory and the time required * to copy the structures for each new parser instance. And even * when a parser instance is re-used, there is a potential for a * memory leak due to new symbols being added to the symbol table * over time. In other words, always take caution to make sure * that your application is thread-safe and avoids leaking memory. * * @author Andy Clark, IBM * * @version $Id: CachingParserPool.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 A parser pool that enables caching of grammars. The caching parser pool is constructed with a specific symbol table and grammar pool that has already been populated with the grammars used by the application. <p> Once the caching parser pool is constructed, specific parser instances are created by calling the appropriate factory method on the parser pool. <p> <strong>Note:</strong> There is a performance penalty for using a caching parser pool due to thread safety. Access to the symbol table and grammar pool must be synchronized to ensure the safe operation of the symbol table and grammar pool. <p> <strong>Note:</strong> If performance is critical, then another mechanism needs to be used instead of the caching parser pool. One approach would be to create parser instances that do not share these structures. Instead, each instance would get its own copy to use while parsing. This avoids the synchronization overhead at the expense of more memory and the time required to copy the structures for each new parser instance. And even when a parser instance is re-used, there is a potential for a memory leak due to new symbols being added to the symbol table over time. In other words, always take caution to make sure that your application is thread-safe and avoids leaking memory. * @author Andy Clark, IBM * @version $Id: CachingParserPool.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CachingParserPool	TokenNameIdentifier	 Caching Parser Pool
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default shadow symbol table (false). */	TokenNameCOMMENT_JAVADOC	 Default shadow symbol table (false). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SHADOW_SYMBOL_TABLE	TokenNameIdentifier	 DEFAULT  SHADOW  SYMBOL  TABLE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default shadow grammar pool (false). */	TokenNameCOMMENT_JAVADOC	 Default shadow grammar pool (false). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SHADOW_GRAMMAR_POOL	TokenNameIdentifier	 DEFAULT  SHADOW  GRAMMAR  POOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * Symbol table. The symbol table that the caching parser pool is * constructed with is automatically wrapped in a synchronized * version for thread-safety. */	TokenNameCOMMENT_JAVADOC	 Symbol table. The symbol table that the caching parser pool is constructed with is automatically wrapped in a synchronized version for thread-safety. 
protected	TokenNameprotected	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
;	TokenNameSEMICOLON	
/** * Grammar pool. The grammar pool that the caching parser pool is * constructed with is automatically wrapped in a synchronized * version for thread-safety. */	TokenNameCOMMENT_JAVADOC	 Grammar pool. The grammar pool that the caching parser pool is constructed with is automatically wrapped in a synchronized version for thread-safety. 
protected	TokenNameprotected	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
;	TokenNameSEMICOLON	
/** * Shadow the symbol table for new parser instances. If true, * new parser instances use shadow copies of the main symbol * table and are not allowed to add new symbols to the main * symbol table. New symbols are added to the shadow symbol * table and are local to the parser instance. */	TokenNameCOMMENT_JAVADOC	 Shadow the symbol table for new parser instances. If true, new parser instances use shadow copies of the main symbol table and are not allowed to add new symbols to the main symbol table. New symbols are added to the shadow symbol table and are local to the parser instance. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fShadowSymbolTable	TokenNameIdentifier	 f Shadow Symbol Table
=	TokenNameEQUAL	
DEFAULT_SHADOW_SYMBOL_TABLE	TokenNameIdentifier	 DEFAULT  SHADOW  SYMBOL  TABLE
;	TokenNameSEMICOLON	
/** * Shadow the grammar pool for new parser instances. If true, * new parser instances use shadow copies of the main grammar * pool and are not allowed to add new grammars to the main * grammar pool. New grammars are added to the shadow grammar * pool and are local to the parser instance. */	TokenNameCOMMENT_JAVADOC	 Shadow the grammar pool for new parser instances. If true, new parser instances use shadow copies of the main grammar pool and are not allowed to add new grammars to the main grammar pool. New grammars are added to the shadow grammar pool and are local to the parser instance. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fShadowGrammarPool	TokenNameIdentifier	 f Shadow Grammar Pool
=	TokenNameEQUAL	
DEFAULT_SHADOW_GRAMMAR_POOL	TokenNameIdentifier	 DEFAULT  SHADOW  GRAMMAR  POOL
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
CachingParserPool	TokenNameIdentifier	 Caching Parser Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a caching parser pool with the specified symbol table * and grammar pool. * * @param symbolTable The symbol table. * @param grammarPool The grammar pool. */	TokenNameCOMMENT_JAVADOC	 Constructs a caching parser pool with the specified symbol table and grammar pool. * @param symbolTable The symbol table. @param grammarPool The grammar pool. 
public	TokenNamepublic	
CachingParserPool	TokenNameIdentifier	 Caching Parser Pool
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
=	TokenNameEQUAL	
new	TokenNamenew	
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
=	TokenNameEQUAL	
new	TokenNamenew	
SynchronizedGrammarPool	TokenNameIdentifier	 Synchronized Grammar Pool
(	TokenNameLPAREN	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the symbol table. */	TokenNameCOMMENT_JAVADOC	 Returns the symbol table. 
public	TokenNamepublic	
SymbolTable	TokenNameIdentifier	 Symbol Table
getSymbolTable	TokenNameIdentifier	 get Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSymbolTable():SymbolTable 	TokenNameCOMMENT_LINE	getSymbolTable():SymbolTable 
/** Returns the grammar pool. */	TokenNameCOMMENT_JAVADOC	 Returns the grammar pool. 
public	TokenNamepublic	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
getXMLGrammarPool	TokenNameIdentifier	 get XML Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXMLGrammarPool():XMLGrammarPool 	TokenNameCOMMENT_LINE	getXMLGrammarPool():XMLGrammarPool 
// setters and getters 	TokenNameCOMMENT_LINE	setters and getters 
/** * Sets whether new parser instance receive shadow copies of the * main symbol table. * * @param shadow If true, new parser instances use shadow copies * of the main symbol table and are not allowed to * add new symbols to the main symbol table. New * symbols are added to the shadow symbol table and * are local to the parser instance. If false, new * parser instances are allowed to add new symbols * to the main symbol table. */	TokenNameCOMMENT_JAVADOC	 Sets whether new parser instance receive shadow copies of the main symbol table. * @param shadow If true, new parser instances use shadow copies of the main symbol table and are not allowed to add new symbols to the main symbol table. New symbols are added to the shadow symbol table and are local to the parser instance. If false, new parser instances are allowed to add new symbols to the main symbol table. 
public	TokenNamepublic	
void	TokenNamevoid	
setShadowSymbolTable	TokenNameIdentifier	 set Shadow Symbol Table
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shadow	TokenNameIdentifier	 shadow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fShadowSymbolTable	TokenNameIdentifier	 f Shadow Symbol Table
=	TokenNameEQUAL	
shadow	TokenNameIdentifier	 shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setShadowSymbolTable(boolean) 	TokenNameCOMMENT_LINE	setShadowSymbolTable(boolean) 
// factory methods 	TokenNameCOMMENT_LINE	factory methods 
/** Creates a new DOM parser. */	TokenNameCOMMENT_JAVADOC	 Creates a new DOM parser. 
public	TokenNamepublic	
DOMParser	TokenNameIdentifier	 DOM Parser
createDOMParser	TokenNameIdentifier	 create DOM Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
=	TokenNameEQUAL	
fShadowSymbolTable	TokenNameIdentifier	 f Shadow Symbol Table
?	TokenNameQUESTION	
new	TokenNamenew	
ShadowedSymbolTable	TokenNameIdentifier	 Shadowed Symbol Table
(	TokenNameLPAREN	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
)	TokenNameRPAREN	
:	TokenNameCOLON	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
;	TokenNameSEMICOLON	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
=	TokenNameEQUAL	
fShadowGrammarPool	TokenNameIdentifier	 f Shadow Grammar Pool
?	TokenNameQUESTION	
new	TokenNamenew	
ShadowedGrammarPool	TokenNameIdentifier	 Shadowed Grammar Pool
(	TokenNameLPAREN	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
)	TokenNameRPAREN	
:	TokenNameCOLON	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DOMParser	TokenNameIdentifier	 DOM Parser
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDOMParser():DOMParser 	TokenNameCOMMENT_LINE	createDOMParser():DOMParser 
/** Creates a new SAX parser. */	TokenNameCOMMENT_JAVADOC	 Creates a new SAX parser. 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
createSAXParser	TokenNameIdentifier	 create SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
=	TokenNameEQUAL	
fShadowSymbolTable	TokenNameIdentifier	 f Shadow Symbol Table
?	TokenNameQUESTION	
new	TokenNamenew	
ShadowedSymbolTable	TokenNameIdentifier	 Shadowed Symbol Table
(	TokenNameLPAREN	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
)	TokenNameRPAREN	
:	TokenNameCOLON	
fSynchronizedSymbolTable	TokenNameIdentifier	 f Synchronized Symbol Table
;	TokenNameSEMICOLON	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
=	TokenNameEQUAL	
fShadowGrammarPool	TokenNameIdentifier	 f Shadow Grammar Pool
?	TokenNameQUESTION	
new	TokenNamenew	
ShadowedGrammarPool	TokenNameIdentifier	 Shadowed Grammar Pool
(	TokenNameLPAREN	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
)	TokenNameRPAREN	
:	TokenNameCOLON	
fSynchronizedGrammarPool	TokenNameIdentifier	 f Synchronized Grammar Pool
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SAXParser	TokenNameIdentifier	 SAX Parser
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createSAXParser():SAXParser 	TokenNameCOMMENT_LINE	createSAXParser():SAXParser 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * Synchronized grammar pool. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Synchronized grammar pool. * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SynchronizedGrammarPool	TokenNameIdentifier	 Synchronized Grammar Pool
implements	TokenNameimplements	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Main grammar pool. */	TokenNameCOMMENT_JAVADOC	 Main grammar pool. 
private	TokenNameprivate	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a synchronized grammar pool. */	TokenNameCOMMENT_JAVADOC	 Constructs a synchronized grammar pool. 
public	TokenNamepublic	
SynchronizedGrammarPool	TokenNameIdentifier	 Synchronized Grammar Pool
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
grammarPool	TokenNameIdentifier	 grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(XMLGrammarPool) 
// 	TokenNameCOMMENT_LINE	 
// GrammarPool methods 	TokenNameCOMMENT_LINE	GrammarPool methods 
// 	TokenNameCOMMENT_LINE	 
// retrieve the initial set of grammars for the validator 	TokenNameCOMMENT_LINE	retrieve the initial set of grammars for the validator 
// to work with. 	TokenNameCOMMENT_LINE	to work with. 
// REVISIT: does this need to be synchronized since it's just reading? 	TokenNameCOMMENT_LINE	REVISIT: does this need to be synchronized since it's just reading? 
// @param grammarType type of the grammars to be retrieved. 	TokenNameCOMMENT_LINE	@param grammarType type of the grammars to be retrieved. 
// @return the initial grammar set the validator may place in its "bucket" 	TokenNameCOMMENT_LINE	@return the initial grammar set the validator may place in its "bucket" 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
retrieveInitialGrammarSet	TokenNameIdentifier	 retrieve Initial Grammar Set
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// retrieveInitialGrammarSet(String): Grammar[] 	TokenNameCOMMENT_LINE	retrieveInitialGrammarSet(String): Grammar[] 
// retrieve a particular grammar. 	TokenNameCOMMENT_LINE	retrieve a particular grammar. 
// REVISIT: does this need to be synchronized since it's just reading? 	TokenNameCOMMENT_LINE	REVISIT: does this need to be synchronized since it's just reading? 
// @param gDesc description of the grammar to be retrieved 	TokenNameCOMMENT_LINE	@param gDesc description of the grammar to be retrieved 
// @return Grammar corresponding to gDesc, or null if none exists. 	TokenNameCOMMENT_LINE	@return Grammar corresponding to gDesc, or null if none exists. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
gDesc	TokenNameIdentifier	 g Desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
gDesc	TokenNameIdentifier	 g Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// retrieveGrammar(XMLGrammarDesc): Grammar 	TokenNameCOMMENT_LINE	retrieveGrammar(XMLGrammarDesc): Grammar 
// give the grammarPool the option of caching these grammars. 	TokenNameCOMMENT_LINE	give the grammarPool the option of caching these grammars. 
// This certainly must be synchronized. 	TokenNameCOMMENT_LINE	This certainly must be synchronized. 
// @param grammarType The type of the grammars to be cached. 	TokenNameCOMMENT_LINE	@param grammarType The type of the grammars to be cached. 
// @param grammars the Grammars that may be cached (unordered, Grammars previously 	TokenNameCOMMENT_LINE	@param grammars the Grammars that may be cached (unordered, Grammars previously 
// given to the validator may be included). 	TokenNameCOMMENT_LINE	given to the validator may be included). 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
cacheGrammars	TokenNameIdentifier	 cache Grammars
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
,	TokenNameCOMMA	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// cacheGrammars(String, Grammar[]); 	TokenNameCOMMENT_LINE	cacheGrammars(String, Grammar[]); 
/** lock the grammar pool */	TokenNameCOMMENT_JAVADOC	 lock the grammar pool 
public	TokenNamepublic	
void	TokenNamevoid	
lockPool	TokenNameIdentifier	 lock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
lockPool	TokenNameIdentifier	 lock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// lockPool() 	TokenNameCOMMENT_LINE	lockPool() 
/** clear the grammar pool */	TokenNameCOMMENT_JAVADOC	 clear the grammar pool 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// lockPool() 	TokenNameCOMMENT_LINE	lockPool() 
/** unlock the grammar pool */	TokenNameCOMMENT_JAVADOC	 unlock the grammar pool 
public	TokenNamepublic	
void	TokenNamevoid	
unlockPool	TokenNameIdentifier	 unlock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
unlockPool	TokenNameIdentifier	 unlock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// unlockPool() 	TokenNameCOMMENT_LINE	unlockPool() 
/*** * Methods corresponding to original (pre Xerces2.0.0final) * grammarPool have been commented out. */	TokenNameCOMMENT_JAVADOC	* Methods corresponding to original (pre Xerces2.0.0final) grammarPool have been commented out. 
/** * Puts the specified grammar into the grammar pool. * * @param key Key to associate with grammar. * @param grammar Grammar object. */	TokenNameCOMMENT_JAVADOC	 Puts the specified grammar into the grammar pool. * @param key Key to associate with grammar. @param grammar Grammar object. 
/****** public void putGrammar(String key, Grammar grammar) { synchronized (fGrammarPool) { fGrammarPool.putGrammar(key, grammar); } } // putGrammar(String,Grammar) *******/	TokenNameCOMMENT_JAVADOC	**** public void putGrammar(String key, Grammar grammar) { synchronized (fGrammarPool) { fGrammarPool.putGrammar(key, grammar); } } // putGrammar(String,Grammar) ******
/** * Returns the grammar associated to the specified key. * * @param key The key of the grammar. */	TokenNameCOMMENT_JAVADOC	 Returns the grammar associated to the specified key. * @param key The key of the grammar. 
/********** public Grammar getGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.getGrammar(key); } } // getGrammar(String):Grammar ***********/	TokenNameCOMMENT_JAVADOC	******** public Grammar getGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.getGrammar(key); } } // getGrammar(String):Grammar **********
/** * Removes the grammar associated to the specified key from the * grammar pool and returns the removed grammar. * * @param key The key of the grammar. */	TokenNameCOMMENT_JAVADOC	 Removes the grammar associated to the specified key from the grammar pool and returns the removed grammar. * @param key The key of the grammar. 
/********** public Grammar removeGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.removeGrammar(key); } } // removeGrammar(String):Grammar ******/	TokenNameCOMMENT_JAVADOC	******** public Grammar removeGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.removeGrammar(key); } } // removeGrammar(String):Grammar *****
/** * Returns true if the grammar pool contains a grammar associated * to the specified key. * * @param key The key of the grammar. */	TokenNameCOMMENT_JAVADOC	 Returns true if the grammar pool contains a grammar associated to the specified key. * @param key The key of the grammar. 
/********** public boolean containsGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.containsGrammar(key); } } // containsGrammar(String):boolean ********/	TokenNameCOMMENT_JAVADOC	******** public boolean containsGrammar(String key) { synchronized (fGrammarPool) { return fGrammarPool.containsGrammar(key); } } // containsGrammar(String):boolean *******
}	TokenNameRBRACE	
// class SynchronizedGrammarPool 	TokenNameCOMMENT_LINE	class SynchronizedGrammarPool 
/** * Shadowed grammar pool. * This class is predicated on the existence of a concrete implementation; * so using our own doesn't seem to bad an idea. * * @author Andy Clark, IBM * @author Neil Graham, IBM */	TokenNameCOMMENT_JAVADOC	 Shadowed grammar pool. This class is predicated on the existence of a concrete implementation; so using our own doesn't seem to bad an idea. * @author Andy Clark, IBM @author Neil Graham, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ShadowedGrammarPool	TokenNameIdentifier	 Shadowed Grammar Pool
extends	TokenNameextends	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Main grammar pool. */	TokenNameCOMMENT_JAVADOC	 Main grammar pool. 
private	TokenNameprivate	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a shadowed grammar pool. */	TokenNameCOMMENT_JAVADOC	 Constructs a shadowed grammar pool. 
public	TokenNamepublic	
ShadowedGrammarPool	TokenNameIdentifier	 Shadowed Grammar Pool
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
grammarPool	TokenNameIdentifier	 grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(GrammarPool) 	TokenNameCOMMENT_LINE	<init>(GrammarPool) 
// 	TokenNameCOMMENT_LINE	 
// GrammarPool methods 	TokenNameCOMMENT_LINE	GrammarPool methods 
// 	TokenNameCOMMENT_LINE	 
/** * Retrieve the initial set of grammars for the validator to work with. * REVISIT: does this need to be synchronized since it's just reading? * * @param grammarType Type of the grammars to be retrieved. * @return The initial grammar set the validator may place in its "bucket" */	TokenNameCOMMENT_JAVADOC	 Retrieve the initial set of grammars for the validator to work with. REVISIT: does this need to be synchronized since it's just reading? * @param grammarType Type of the grammars to be retrieved. @return The initial grammar set the validator may place in its "bucket" 
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
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
retrieveInitialGrammarSet	TokenNameIdentifier	 retrieve Initial Grammar Set
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
grammars	TokenNameIdentifier	 grammars
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
retrieveInitialGrammarSet	TokenNameIdentifier	 retrieve Initial Grammar Set
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// retrieveInitialGrammarSet(String): Grammar[] 	TokenNameCOMMENT_LINE	retrieveInitialGrammarSet(String): Grammar[] 
/** * Retrieve a particular grammar. * REVISIT: does this need to be synchronized since it's just reading? * * @param gDesc Description of the grammar to be retrieved * @return Grammar corresponding to gDesc, or null if none exists. */	TokenNameCOMMENT_JAVADOC	 Retrieve a particular grammar. REVISIT: does this need to be synchronized since it's just reading? * @param gDesc Description of the grammar to be retrieved @return Grammar corresponding to gDesc, or null if none exists. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
gDesc	TokenNameIdentifier	 g Desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Grammar	TokenNameIdentifier	 Grammar
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
gDesc	TokenNameIdentifier	 g Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
gDesc	TokenNameIdentifier	 g Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// retrieveGrammar(XMLGrammarDesc): Grammar 	TokenNameCOMMENT_LINE	retrieveGrammar(XMLGrammarDesc): Grammar 
/** * Give the grammarPool the option of caching these grammars. * This certainly must be synchronized. * * @param grammarType The type of the grammars to be cached. * @param grammars The Grammars that may be cached (unordered, Grammars previously * given to the validator may be included). */	TokenNameCOMMENT_JAVADOC	 Give the grammarPool the option of caching these grammars. This certainly must be synchronized. * @param grammarType The type of the grammars to be cached. @param grammars The Grammars that may be cached (unordered, Grammars previously given to the validator may be included). 
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
// better give both grammars a shot... 	TokenNameCOMMENT_LINE	better give both grammars a shot... 
super	TokenNamesuper	
.	TokenNameDOT	
cacheGrammars	TokenNameIdentifier	 cache Grammars
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
,	TokenNameCOMMA	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
.	TokenNameDOT	
cacheGrammars	TokenNameIdentifier	 cache Grammars
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
,	TokenNameCOMMA	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cacheGrammars(grammarType, Grammar[]); 	TokenNameCOMMENT_LINE	cacheGrammars(grammarType, Grammar[]); 
/** * Returns the grammar associated to the specified description. * * @param desc The description of the grammar. */	TokenNameCOMMENT_JAVADOC	 Returns the grammar associated to the specified description. * @param desc The description of the grammar. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
containsGrammar	TokenNameIdentifier	 contains Grammar
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getGrammar(XMLGrammarDescription):Grammar 	TokenNameCOMMENT_LINE	getGrammar(XMLGrammarDescription):Grammar 
/** * Returns true if the grammar pool contains a grammar associated * to the specified description. * * @param desc The description of the grammar. */	TokenNameCOMMENT_JAVADOC	 Returns true if the grammar pool contains a grammar associated to the specified description. * @param desc The description of the grammar. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsGrammar	TokenNameIdentifier	 contains Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
containsGrammar	TokenNameIdentifier	 contains Grammar
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// containsGrammar(XMLGrammarDescription):boolean 	TokenNameCOMMENT_LINE	containsGrammar(XMLGrammarDescription):boolean 
}	TokenNameRBRACE	
// class ShadowedGrammarPool 	TokenNameCOMMENT_LINE	class ShadowedGrammarPool 
}	TokenNameRBRACE	
// class CachingParserPool 	TokenNameCOMMENT_LINE	class CachingParserPool 

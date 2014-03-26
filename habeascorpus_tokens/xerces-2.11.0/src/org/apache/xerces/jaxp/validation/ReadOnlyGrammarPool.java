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
/** * <p>Filter {@link XMLGrammarPool} that exposes a * read-only view of the underlying pool.</p> * * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) * @version $Id: ReadOnlyGrammarPool.java 447235 2006-09-18 05:01:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Filter {@link XMLGrammarPool} that exposes a read-only view of the underlying pool.</p> * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com) @version $Id: ReadOnlyGrammarPool.java 447235 2006-09-18 05:01:44Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
ReadOnlyGrammarPool	TokenNameIdentifier	 Read Only Grammar Pool
implements	TokenNameimplements	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
core	TokenNameIdentifier	 core
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReadOnlyGrammarPool	TokenNameIdentifier	 Read Only Grammar Pool
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
core	TokenNameIdentifier	 core
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
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
// noop. don't let caching to happen 	TokenNameCOMMENT_LINE	noop. don't let caching to happen 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// noop. cache is read-only. 	TokenNameCOMMENT_LINE	noop. cache is read-only. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lockPool	TokenNameIdentifier	 lock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// noop. this pool is always read-only 	TokenNameCOMMENT_LINE	noop. this pool is always read-only 
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
retrieveInitialGrammarSet	TokenNameIdentifier	 retrieve Initial Grammar Set
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unlockPool	TokenNameIdentifier	 unlock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// noop. this pool is always read-only. 	TokenNameCOMMENT_LINE	noop. this pool is always read-only. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ReadOnlyGrammarPool 	TokenNameCOMMENT_LINE	ReadOnlyGrammarPool 

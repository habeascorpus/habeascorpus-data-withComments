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
Reference	TokenNameIdentifier	 Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
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
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
;	TokenNameSEMICOLON	
/** * <p>This grammar pool is a memory sensitive cache. The grammars * stored in the pool are softly reachable and may be cleared by * the garbage collector in response to memory demand. Equality * of <code>XMLSchemaDescription</code>s is determined using both * the target namespace for the schema and schema location.</p> * * @author Michael Glavassevich, IBM * @version $Id: SoftReferenceGrammarPool.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This grammar pool is a memory sensitive cache. The grammars stored in the pool are softly reachable and may be cleared by the garbage collector in response to memory demand. Equality of <code>XMLSchemaDescription</code>s is determined using both the target namespace for the schema and schema location.</p> * @author Michael Glavassevich, IBM @version $Id: SoftReferenceGrammarPool.java 699892 2008-09-28 21:08:27Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
SoftReferenceGrammarPool	TokenNameIdentifier	 Soft Reference Grammar Pool
implements	TokenNameimplements	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default size. */	TokenNameCOMMENT_JAVADOC	 Default size. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Zero length grammar array. */	TokenNameCOMMENT_JAVADOC	 Zero length grammar array. 
protected	TokenNameprotected	
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
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Grammars. */	TokenNameCOMMENT_JAVADOC	 Grammars. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Flag indicating whether this pool is locked */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether this pool is locked 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
;	TokenNameSEMICOLON	
/** The number of grammars in the pool */	TokenNameCOMMENT_JAVADOC	 The number of grammars in the pool 
protected	TokenNameprotected	
int	TokenNameint	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Reference queue for cleared grammar references */	TokenNameCOMMENT_JAVADOC	 Reference queue for cleared grammar references 
protected	TokenNameprotected	
final	TokenNamefinal	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a grammar pool with a default number of buckets. */	TokenNameCOMMENT_JAVADOC	 Constructs a grammar pool with a default number of buckets. 
public	TokenNamepublic	
SoftReferenceGrammarPool	TokenNameIdentifier	 Soft Reference Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** Constructs a grammar pool with a specified number of buckets. */	TokenNameCOMMENT_JAVADOC	 Constructs a grammar pool with a specified number of buckets. 
public	TokenNamepublic	
SoftReferenceGrammarPool	TokenNameIdentifier	 Soft Reference Grammar Pool
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
initialCapacity	TokenNameIdentifier	 initial Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLGrammarPool methods 	TokenNameCOMMENT_LINE	XMLGrammarPool methods 
// 	TokenNameCOMMENT_LINE	 
/* <p> Retrieve the initial known set of grammars. This method is * called by a validator before the validation starts. The application * can provide an initial set of grammars available to the current * validation attempt. </p> * * @param grammarType The type of the grammar, from the * <code>org.apache.xerces.xni.grammars.XMLGrammarDescription</code> * interface. * @return The set of grammars the validator may put in its "bucket" */	TokenNameCOMMENT_BLOCK	 <p> Retrieve the initial known set of grammars. This method is called by a validator before the validation starts. The application can provide an initial set of grammars available to the current validation attempt. </p> * @param grammarType The type of the grammar, from the <code>org.apache.xerces.xni.grammars.XMLGrammarDescription</code> interface. @return The set of grammars the validator may put in its "bucket" 
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
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return no grammars. This allows the garbage collector to sift 	TokenNameCOMMENT_LINE	Return no grammars. This allows the garbage collector to sift 
// out grammars which are not in use when memory demand is high. 	TokenNameCOMMENT_LINE	out grammars which are not in use when memory demand is high. 
// It also allows the pool to return the "right" schema grammar 	TokenNameCOMMENT_LINE	It also allows the pool to return the "right" schema grammar 
// based on schema locations. 	TokenNameCOMMENT_LINE	based on schema locations. 
return	TokenNamereturn	
ZERO_LENGTH_GRAMMAR_ARRAY	TokenNameIdentifier	 ZERO  LENGTH  GRAMMAR  ARRAY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// retrieveInitialGrammarSet (String): Grammar[] 	TokenNameCOMMENT_LINE	retrieveInitialGrammarSet (String): Grammar[] 
/* <p> Return the final set of grammars that the validator ended up * with. This method is called after the validation finishes. The * application may then choose to cache some of the returned grammars.</p> * <p>In this implementation, we make our choice based on whether this object * is "locked"--that is, whether the application has instructed * us not to accept any new grammars.</p> * * @param grammarType The type of the grammars being returned; * @param grammars An array containing the set of grammars being * returned; order is not significant. */	TokenNameCOMMENT_BLOCK	 <p> Return the final set of grammars that the validator ended up with. This method is called after the validation finishes. The application may then choose to cache some of the returned grammars.</p> <p>In this implementation, we make our choice based on whether this object is "locked"--that is, whether the application has instructed us not to accept any new grammars.</p> * @param grammarType The type of the grammars being returned; @param grammars An array containing the set of grammars being returned; order is not significant. 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammars	TokenNameIdentifier	 grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// cacheGrammars(String, Grammar[]); 	TokenNameCOMMENT_LINE	cacheGrammars(String, Grammar[]); 
/* <p> This method requests that the application retrieve a grammar * corresponding to the given GrammarIdentifier from its cache. * If it cannot do so it must return null; the parser will then * call the EntityResolver. </p> * <strong>An application must not call its EntityResolver itself * from this method; this may result in infinite recursions.</strong> * * This implementation chooses to use the root element name to identify a DTD grammar * and the target namespace to identify a Schema grammar. * * @param desc The description of the Grammar being requested. * @return The Grammar corresponding to this description or null if * no such Grammar is known. */	TokenNameCOMMENT_BLOCK	 <p> This method requests that the application retrieve a grammar corresponding to the given GrammarIdentifier from its cache. If it cannot do so it must return null; the parser will then call the EntityResolver. </p> <strong>An application must not call its EntityResolver itself from this method; this may result in infinite recursions.</strong> * This implementation chooses to use the root element name to identify a DTD grammar and the target namespace to identify a Schema grammar. * @param desc The description of the Grammar being requested. @return The Grammar corresponding to this description or null if no such Grammar is known. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
retrieveGrammar	TokenNameIdentifier	 retrieve Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// retrieveGrammar(XMLGrammarDescription): Grammar 	TokenNameCOMMENT_LINE	retrieveGrammar(XMLGrammarDescription): Grammar 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Puts the specified grammar into the grammar pool and associates it to * its root element name or its target namespace. * * @param grammar The Grammar. */	TokenNameCOMMENT_JAVADOC	 Puts the specified grammar into the grammar pool and associates it to its root element name or its target namespace. * @param grammar The Grammar. 
public	TokenNamepublic	
void	TokenNamevoid	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getGrammarDescription	TokenNameIdentifier	 get Grammar Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
new	TokenNamenew	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// create a new entry 	TokenNameCOMMENT_LINE	create a new entry 
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// putGrammar(Grammar) 	TokenNameCOMMENT_LINE	putGrammar(Grammar) 
/** * Returns the grammar associated to the specified grammar description. * Currently, the root element name is used as the key for DTD grammars * and the target namespace is used as the key for Schema grammars. * * @param desc The Grammar Description. */	TokenNameCOMMENT_JAVADOC	 Returns the grammar associated to the specified grammar description. Currently, the root element name is used as the key for DTD grammars and the target namespace is used as the key for Schema grammars. * @param desc The Grammar Description. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
Grammar	TokenNameIdentifier	 Grammar
tempGrammar	TokenNameIdentifier	 temp Grammar
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** If the soft reference has been cleared, remove this entry from the pool. */	TokenNameCOMMENT_JAVADOC	 If the soft reference has been cleared, remove this entry from the pool. 
if	TokenNameif	
(	TokenNameLPAREN	
tempGrammar	TokenNameIdentifier	 temp Grammar
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tempGrammar	TokenNameIdentifier	 temp Grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// getGrammar(XMLGrammarDescription):Grammar 	TokenNameCOMMENT_LINE	getGrammar(XMLGrammarDescription):Grammar 
/** * Removes the grammar associated to the specified grammar description from the * grammar pool and returns the removed grammar. Currently, the root element name * is used as the key for DTD grammars and the target namespace is used * as the key for Schema grammars. * * @param desc The Grammar Description. * @return The removed grammar. */	TokenNameCOMMENT_JAVADOC	 Removes the grammar associated to the specified grammar description from the grammar pool and returns the removed grammar. Currently, the root element name is used as the key for DTD grammars and the target namespace is used as the key for Schema grammars. * @param desc The Grammar Description. @return The removed grammar. 
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
removeGrammar	TokenNameIdentifier	 remove Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// removeGrammar(XMLGrammarDescription):Grammar 	TokenNameCOMMENT_LINE	removeGrammar(XMLGrammarDescription):Grammar 
/** * Returns true if the grammar pool contains a grammar associated * to the specified grammar description. Currently, the root element name * is used as the key for DTD grammars and the target namespace is used * as the key for Schema grammars. * * @param desc The Grammar Description. */	TokenNameCOMMENT_JAVADOC	 Returns true if the grammar pool contains a grammar associated to the specified grammar description. Currently, the root element name is used as the key for DTD grammars and the target namespace is used as the key for Schema grammars. * @param desc The Grammar Description. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsGrammar	TokenNameIdentifier	 contains Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
Grammar	TokenNameIdentifier	 Grammar
tempGrammar	TokenNameIdentifier	 temp Grammar
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** If the soft reference has been cleared, remove this entry from the pool. */	TokenNameCOMMENT_JAVADOC	 If the soft reference has been cleared, remove this entry from the pool. 
if	TokenNameif	
(	TokenNameLPAREN	
tempGrammar	TokenNameIdentifier	 temp Grammar
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// containsGrammar(XMLGrammarDescription):boolean 	TokenNameCOMMENT_LINE	containsGrammar(XMLGrammarDescription):boolean 
/* <p> Sets this grammar pool to a "locked" state--i.e., * no new grammars will be added until it is "unlocked". */	TokenNameCOMMENT_BLOCK	 <p> Sets this grammar pool to a "locked" state--i.e., no new grammars will be added until it is "unlocked". 
public	TokenNamepublic	
void	TokenNamevoid	
lockPool	TokenNameIdentifier	 lock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// lockPool() 	TokenNameCOMMENT_LINE	lockPool() 
/* <p> Sets this grammar pool to an "unlocked" state--i.e., * new grammars will be added when putGrammar or cacheGrammars * are called. */	TokenNameCOMMENT_BLOCK	 <p> Sets this grammar pool to an "unlocked" state--i.e., new grammars will be added when putGrammar or cacheGrammars are called. 
public	TokenNamepublic	
void	TokenNamevoid	
unlockPool	TokenNameIdentifier	 unlock Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// unlockPool() 	TokenNameCOMMENT_LINE	unlockPool() 
/* * <p>This method clears the pool-i.e., removes references * to all the grammars in it.</p> */	TokenNameCOMMENT_BLOCK	 <p>This method clears the pool-i.e., removes references to all the grammars in it.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear() 	TokenNameCOMMENT_LINE	clear() 
/** * This method checks whether two grammars are the same. Currently, we compare * the root element names for DTD grammars and the target namespaces for Schema grammars. * The application can override this behaviour and add its own logic. * * @param desc1 The grammar description * @param desc2 The grammar description of the grammar to be compared to * @return True if the grammars are equal, otherwise false */	TokenNameCOMMENT_JAVADOC	 This method checks whether two grammars are the same. Currently, we compare the root element names for DTD grammars and the target namespaces for Schema grammars. The application can override this behaviour and add its own logic. * @param desc1 The grammar description @param desc2 The grammar description of the grammar to be compared to @return True if the grammars are equal, otherwise false 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc1	TokenNameIdentifier	 desc1
,	TokenNameCOMMA	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc2	TokenNameIdentifier	 desc2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
desc1	TokenNameIdentifier	 desc1
instanceof	TokenNameinstanceof	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
desc2	TokenNameIdentifier	 desc2
instanceof	TokenNameinstanceof	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
sd1	TokenNameIdentifier	 sd1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
desc1	TokenNameIdentifier	 desc1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
sd2	TokenNameIdentifier	 sd2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
desc2	TokenNameIdentifier	 desc2
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
=	TokenNameEQUAL	
sd1	TokenNameIdentifier	 sd1
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetNamespace	TokenNameIdentifier	 target Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
targetNamespace	TokenNameIdentifier	 target Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sd2	TokenNameIdentifier	 sd2
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sd2	TokenNameIdentifier	 sd2
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The JAXP 1.3 spec says that the implementation can assume that 	TokenNameCOMMENT_LINE	The JAXP 1.3 spec says that the implementation can assume that 
// if two schema location hints are the same they always resolve 	TokenNameCOMMENT_LINE	if two schema location hints are the same they always resolve 
// to the same document. In the default grammar pool implementation 	TokenNameCOMMENT_LINE	to the same document. In the default grammar pool implementation 
// we only look at the target namespaces. Here we also compare 	TokenNameCOMMENT_LINE	we only look at the target namespaces. Here we also compare 
// location hints. 	TokenNameCOMMENT_LINE	location hints. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
=	TokenNameEQUAL	
sd1	TokenNameIdentifier	 sd1
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expandedSystemId	TokenNameIdentifier	 expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expandedSystemId	TokenNameIdentifier	 expanded System Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sd2	TokenNameIdentifier	 sd2
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sd2	TokenNameIdentifier	 sd2
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
desc1	TokenNameIdentifier	 desc1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc2	TokenNameIdentifier	 desc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the hash code value for the given grammar description. * * @param desc The grammar description * @return The hash code value */	TokenNameCOMMENT_JAVADOC	 Returns the hash code value for the given grammar description. * @param desc The grammar description @return The hash code value 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
instanceof	TokenNameinstanceof	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
targetNamespace	TokenNameIdentifier	 target Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
targetNamespace	TokenNameIdentifier	 target Namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
expandedSystemId	TokenNameIdentifier	 expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
expandedSystemId	TokenNameIdentifier	 expanded System Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the given entry from the pool * * @param entry the entry to remove * @return The grammar attached to this entry */	TokenNameCOMMENT_JAVADOC	 Removes the given entry from the pool * @param entry the entry to remove @return The grammar attached to this entry 
private	TokenNameprivate	
Grammar	TokenNameIdentifier	 Grammar
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Grammar	TokenNameIdentifier	 Grammar
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes stale entries from the pool. */	TokenNameCOMMENT_JAVADOC	 Removes stale entries from the pool. 
private	TokenNameprivate	
void	TokenNamevoid	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class is a grammar pool entry. Each entry acts as a node * in a doubly linked list. */	TokenNameCOMMENT_JAVADOC	 This class is a grammar pool entry. Each entry acts as a node in a doubly linked list. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
queue	TokenNameIdentifier	 queue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
new	TokenNamenew	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
queue	TokenNameIdentifier	 queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear this entry; useful to promote garbage collection 	TokenNameCOMMENT_LINE	clear this entry; useful to promote garbage collection 
// since reduces reference count of objects to be destroyed 	TokenNameCOMMENT_LINE	since reduces reference count of objects to be destroyed 
protected	TokenNameprotected	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// clear() 	TokenNameCOMMENT_LINE	clear() 
}	TokenNameRBRACE	
// class Entry 	TokenNameCOMMENT_LINE	class Entry 
/** * This class stores a soft reference to a grammar object. It keeps a reference * to its associated entry, so that it can be easily removed from the pool. */	TokenNameCOMMENT_JAVADOC	 This class stores a soft reference to a grammar object. It keeps a reference to its associated entry, so that it can be easily removed from the pool. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
extends	TokenNameextends	
SoftReference	TokenNameIdentifier	 Soft Reference
{	TokenNameLBRACE	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SoftGrammarReference	TokenNameIdentifier	 Soft Grammar Reference
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
queue	TokenNameIdentifier	 queue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
queue	TokenNameIdentifier	 queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class SoftGrammarReference 	TokenNameCOMMENT_LINE	class SoftGrammarReference 
}	TokenNameRBRACE	
// class SoftReferenceGrammarPool 	TokenNameCOMMENT_LINE	class SoftReferenceGrammarPool 

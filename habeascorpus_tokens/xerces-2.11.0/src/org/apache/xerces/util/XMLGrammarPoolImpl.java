/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
/** * Stores grammars in a pool associated to a specific key. This grammar pool * implementation stores two types of grammars: those keyed by the root element * name, and those keyed by the grammar's target namespace. * * This is the default implementation of the GrammarPool interface. * As we move forward, this will become more function-rich and robust. * * @author Jeffrey Rodriguez, IBM * @author Andy Clark, IBM * @author Neil Graham, IBM * @author Pavani Mukthipudi, Sun Microsystems * @author Neeraj Bajaj, SUN Microsystems * * @version $Id: XMLGrammarPoolImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Stores grammars in a pool associated to a specific key. This grammar pool implementation stores two types of grammars: those keyed by the root element name, and those keyed by the grammar's target namespace. * This is the default implementation of the GrammarPool interface. As we move forward, this will become more function-rich and robust. * @author Jeffrey Rodriguez, IBM @author Andy Clark, IBM @author Neil Graham, IBM @author Pavani Mukthipudi, Sun Microsystems @author Neeraj Bajaj, SUN Microsystems * @version $Id: XMLGrammarPoolImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
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
// whether this pool is locked 	TokenNameCOMMENT_LINE	whether this pool is locked 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fPoolIsLocked	TokenNameIdentifier	 f Pool Is Locked
;	TokenNameSEMICOLON	
// the number of grammars in the pool 	TokenNameCOMMENT_LINE	the number of grammars in the pool 
protected	TokenNameprotected	
int	TokenNameint	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a grammar pool with a default number of buckets. */	TokenNameCOMMENT_JAVADOC	 Constructs a grammar pool with a default number of buckets. 
public	TokenNamepublic	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
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
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
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
int	TokenNameint	
grammarSize	TokenNameIdentifier	 grammar Size
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempGrammars	TokenNameIdentifier	 temp Grammars
=	TokenNameEQUAL	
new	TokenNamenew	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
grammarSize	TokenNameIdentifier	 grammar Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
grammarType	TokenNameIdentifier	 grammar Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempGrammars	TokenNameIdentifier	 temp Grammars
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
new	TokenNamenew	
Grammar	TokenNameIdentifier	 Grammar
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tempGrammars	TokenNameIdentifier	 temp Grammars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toReturn	TokenNameIdentifier	 to Return
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"CACHED GRAMMAR "	TokenNameStringLiteral	CACHED GRAMMAR 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Grammar	TokenNameIdentifier	 Grammar
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
grammars	TokenNameIdentifier	 grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//print(temp.getGrammarDescription()); 	TokenNameCOMMENT_LINE	print(temp.getGrammarDescription()); 
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"RETRIEVING GRAMMAR FROM THE APPLICATION WITH FOLLOWING DESCRIPTION :"	TokenNameStringLiteral	RETRIEVING GRAMMAR FROM THE APPLICATION WITH FOLLOWING DESCRIPTION :
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//print(desc); 	TokenNameCOMMENT_LINE	print(desc); 
}	TokenNameRBRACE	
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
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
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
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
fGrammars	TokenNameIdentifier	 f Grammars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
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
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
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
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
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
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Grammar	TokenNameIdentifier	 Grammar
tempGrammar	TokenNameIdentifier	 temp Grammar
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fGrammarCount	TokenNameIdentifier	 f Grammar Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is a grammar pool entry. Each entry acts as a node * in a linked list. */	TokenNameCOMMENT_JAVADOC	 This class is a grammar pool entry. Each entry acts as a node in a linked list. 
protected	TokenNameprotected	
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
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
Grammar	TokenNameIdentifier	 Grammar
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
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
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
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
/* For DTD build we can't import here XSDDescription. Thus, this method is commented out.. */	TokenNameCOMMENT_BLOCK	 For DTD build we can't import here XSDDescription. Thus, this method is commented out.. 
/* public void print(XMLGrammarDescription description){ if(description.getGrammarType().equals(XMLGrammarDescription.XML_DTD)){ } else if(description.getGrammarType().equals(XMLGrammarDescription.XML_SCHEMA)){ XSDDescription schema = (XSDDescription)description ; System.out.println("Context = " + schema.getContextType()); System.out.println("TargetNamespace = " + schema.getTargetNamespace()); String [] temp = schema.getLocationHints(); for (int i = 0 ; (temp != null && i < temp.length) ; i++){ System.out.println("LocationHint " + i + " = "+ temp[i]); } System.out.println("Triggering Component = " + schema.getTriggeringComponent()); System.out.println("EnclosingElementName =" + schema.getEnclosingElementName()); } }//print */	TokenNameCOMMENT_BLOCK	 public void print(XMLGrammarDescription description){ if(description.getGrammarType().equals(XMLGrammarDescription.XML_DTD)){ } else if(description.getGrammarType().equals(XMLGrammarDescription.XML_SCHEMA)){ XSDDescription schema = (XSDDescription)description ; System.out.println("Context = " + schema.getContextType()); System.out.println("TargetNamespace = " + schema.getTargetNamespace()); String [] temp = schema.getLocationHints(); for (int i = 0 ; (temp != null && i < temp.length) ; i++){ System.out.println("LocationHint " + i + " = "+ temp[i]); } System.out.println("Triggering Component = " + schema.getTriggeringComponent()); System.out.println("EnclosingElementName =" + schema.getEnclosingElementName()); } }//print 
}	TokenNameRBRACE	
// class XMLGrammarPoolImpl 	TokenNameCOMMENT_LINE	class XMLGrammarPoolImpl 

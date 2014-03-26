package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
/** An Analyzer builds TokenStreams, which analyze text. It thus represents a * policy for extracting index terms from text. * <p> * Typical implementations first build a Tokenizer, which breaks the stream of * characters from the Reader into raw Tokens. One or more TokenFilters may * then be applied to the output of the Tokenizer. * <p>The {@code Analyzer}-API in Lucene is based on the decorator pattern. * Therefore all non-abstract subclasses must be final or their {@link #tokenStream} * and {@link #reusableTokenStream} implementations must be final! This is checked * when Java assertions are enabled. */	TokenNameCOMMENT_JAVADOC	 An Analyzer builds TokenStreams, which analyze text. It thus represents a policy for extracting index terms from text. <p> Typical implementations first build a Tokenizer, which breaks the stream of characters from the Reader into raw Tokens. One or more TokenFilters may then be applied to the output of the Tokenizer. <p>The {@code Analyzer}-API in Lucene is based on the decorator pattern. Therefore all non-abstract subclasses must be final or their {@link #tokenStream} and {@link #reusableTokenStream} implementations must be final! This is checked when Java assertions are enabled. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Analyzer	TokenNameIdentifier	 Analyzer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
protected	TokenNameprotected	
Analyzer	TokenNameIdentifier	 Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
assertFinal	TokenNameIdentifier	 assert Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
assertFinal	TokenNameIdentifier	 assert Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
desiredAssertionStatus	TokenNameIdentifier	 desired Assertion Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
isAnonymousClass	TokenNameIdentifier	 is Anonymous Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
FINAL	TokenNameIdentifier	 FINAL
|	TokenNameOR	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
PRIVATE	TokenNameIdentifier	 PRIVATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"tokenStream"	TokenNameStringLiteral	tokenStream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"reusableTokenStream"	TokenNameStringLiteral	reusableTokenStream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Analyzer implementation classes or at least their tokenStream() and reusableTokenStream() implementations must be final"	TokenNameStringLiteral	Analyzer implementation classes or at least their tokenStream() and reusableTokenStream() implementations must be final
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Creates a TokenStream which tokenizes all the text in the provided * Reader. Must be able to handle null field name for * backward compatibility. */	TokenNameCOMMENT_JAVADOC	 Creates a TokenStream which tokenizes all the text in the provided Reader. Must be able to handle null field name for backward compatibility. 
public	TokenNamepublic	
abstract	TokenNameabstract	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Creates a TokenStream that is allowed to be re-used * from the previous time that the same thread called * this method. Callers that do not need to use more * than one TokenStream at the same time from this * analyzer should use this method for better * performance. */	TokenNameCOMMENT_JAVADOC	 Creates a TokenStream that is allowed to be re-used from the previous time that the same thread called this method. Callers that do not need to use more than one TokenStream at the same time from this analyzer should use this method for better performance. 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
tokenStreams	TokenNameIdentifier	 token Streams
=	TokenNameEQUAL	
new	TokenNamenew	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Used by Analyzers that implement reusableTokenStream * to retrieve previously saved TokenStreams for re-use * by the same thread. */	TokenNameCOMMENT_JAVADOC	 Used by Analyzers that implement reusableTokenStream to retrieve previously saved TokenStreams for re-use by the same thread. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenStreams	TokenNameIdentifier	 token Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenStreams	TokenNameIdentifier	 token Streams
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"this Analyzer is closed"	TokenNameStringLiteral	this Analyzer is closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
npe	TokenNameIdentifier	 npe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Used by Analyzers that implement reusableTokenStream * to save a TokenStream for later re-use by the same * thread. */	TokenNameCOMMENT_JAVADOC	 Used by Analyzers that implement reusableTokenStream to save a TokenStream for later re-use by the same thread. 
protected	TokenNameprotected	
void	TokenNamevoid	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
tokenStreams	TokenNameIdentifier	 token Streams
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenStreams	TokenNameIdentifier	 token Streams
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"this Analyzer is closed"	TokenNameStringLiteral	this Analyzer is closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
npe	TokenNameIdentifier	 npe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked before indexing a Fieldable instance if * terms have already been added to that field. This allows custom * analyzers to place an automatic position increment gap between * Fieldable instances using the same field name. The default value * position increment gap is 0. With a 0 position increment gap and * the typical default token position increment of 1, all terms in a field, * including across Fieldable instances, are in successive positions, allowing * exact PhraseQuery matches, for instance, across Fieldable instance boundaries. * * @param fieldName Fieldable name being indexed. * @return position increment gap, added to the next token emitted from {@link #tokenStream(String,Reader)} */	TokenNameCOMMENT_JAVADOC	 Invoked before indexing a Fieldable instance if terms have already been added to that field. This allows custom analyzers to place an automatic position increment gap between Fieldable instances using the same field name. The default value position increment gap is 0. With a 0 position increment gap and the typical default token position increment of 1, all terms in a field, including across Fieldable instances, are in successive positions, allowing exact PhraseQuery matches, for instance, across Fieldable instance boundaries. * @param fieldName Fieldable name being indexed. @return position increment gap, added to the next token emitted from {@link #tokenStream(String,Reader)} 
public	TokenNamepublic	
int	TokenNameint	
getPositionIncrementGap	TokenNameIdentifier	 get Position Increment Gap
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just like {@link #getPositionIncrementGap}, except for * Token offsets instead. By default this returns 1 for * tokenized fields and, as if the fields were joined * with an extra space character, and 0 for un-tokenized * fields. This method is only called if the field * produced at least one token for indexing. * * @param field the field just indexed * @return offset gap, added to the next token emitted from {@link #tokenStream(String,Reader)} */	TokenNameCOMMENT_JAVADOC	 Just like {@link #getPositionIncrementGap}, except for Token offsets instead. By default this returns 1 for tokenized fields and, as if the fields were joined with an extra space character, and 0 for un-tokenized fields. This method is only called if the field produced at least one token for indexing. * @param field the field just indexed @return offset gap, added to the next token emitted from {@link #tokenStream(String,Reader)} 
public	TokenNamepublic	
int	TokenNameint	
getOffsetGap	TokenNameIdentifier	 get Offset Gap
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Frees persistent resources used by this Analyzer */	TokenNameCOMMENT_JAVADOC	 Frees persistent resources used by this Analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenStreams	TokenNameIdentifier	 token Streams
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenStreams	TokenNameIdentifier	 token Streams
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

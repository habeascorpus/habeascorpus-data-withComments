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
IOException	TokenNameIdentifier	 IO Exception
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
AttributeImpl	TokenNameIdentifier	 Attribute Impl
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
AttributeSource	TokenNameIdentifier	 Attribute Source
;	TokenNameSEMICOLON	
/** * This TokenFilter provides the ability to set aside attribute states * that have already been analyzed. This is useful in situations where multiple fields share * many common analysis steps and then go their separate ways. * <p/> * It is also useful for doing things like entity extraction or proper noun analysis as * part of the analysis workflow and saving off those tokens for use in another field. * * <pre> TeeSinkTokenFilter source1 = new TeeSinkTokenFilter(new WhitespaceTokenizer(reader1)); TeeSinkTokenFilter.SinkTokenStream sink1 = source1.newSinkTokenStream(); TeeSinkTokenFilter.SinkTokenStream sink2 = source1.newSinkTokenStream(); TeeSinkTokenFilter source2 = new TeeSinkTokenFilter(new WhitespaceTokenizer(reader2)); source2.addSinkTokenStream(sink1); source2.addSinkTokenStream(sink2); TokenStream final1 = new LowerCaseFilter(source1); TokenStream final2 = source2; TokenStream final3 = new EntityDetect(sink1); TokenStream final4 = new URLDetect(sink2); d.add(new Field("f1", final1)); d.add(new Field("f2", final2)); d.add(new Field("f3", final3)); d.add(new Field("f4", final4)); * </pre> * In this example, <code>sink1</code> and <code>sink2</code> will both get tokens from both * <code>reader1</code> and <code>reader2</code> after whitespace tokenizer * and now we can further wrap any of these in extra analysis, and more "sources" can be inserted if desired. * It is important, that tees are consumed before sinks (in the above example, the field names must be * less the sink's field names). If you are not sure, which stream is consumed first, you can simply * add another sink and then pass all tokens to the sinks at once using {@link #consumeAllTokens}. * This TokenFilter is exhausted after this. In the above example, change * the example above to: * <pre> ... TokenStream final1 = new LowerCaseFilter(source1.newSinkTokenStream()); TokenStream final2 = source2.newSinkTokenStream(); sink1.consumeAllTokens(); sink2.consumeAllTokens(); ... * </pre> * In this case, the fields can be added in any order, because the sources are not used anymore and all sinks are ready. * <p>Note, the EntityDetect and URLDetect TokenStreams are for the example and do not currently exist in Lucene. */	TokenNameCOMMENT_JAVADOC	 This TokenFilter provides the ability to set aside attribute states that have already been analyzed. This is useful in situations where multiple fields share many common analysis steps and then go their separate ways. <p/> It is also useful for doing things like entity extraction or proper noun analysis as part of the analysis workflow and saving off those tokens for use in another field. * <pre> TeeSinkTokenFilter source1 = new TeeSinkTokenFilter(new WhitespaceTokenizer(reader1)); TeeSinkTokenFilter.SinkTokenStream sink1 = source1.newSinkTokenStream(); TeeSinkTokenFilter.SinkTokenStream sink2 = source1.newSinkTokenStream(); TeeSinkTokenFilter source2 = new TeeSinkTokenFilter(new WhitespaceTokenizer(reader2)); source2.addSinkTokenStream(sink1); source2.addSinkTokenStream(sink2); TokenStream final1 = new LowerCaseFilter(source1); TokenStream final2 = source2; TokenStream final3 = new EntityDetect(sink1); TokenStream final4 = new URLDetect(sink2); d.add(new Field("f1", final1)); d.add(new Field("f2", final2)); d.add(new Field("f3", final3)); d.add(new Field("f4", final4)); </pre> In this example, <code>sink1</code> and <code>sink2</code> will both get tokens from both <code>reader1</code> and <code>reader2</code> after whitespace tokenizer and now we can further wrap any of these in extra analysis, and more "sources" can be inserted if desired. It is important, that tees are consumed before sinks (in the above example, the field names must be less the sink's field names). If you are not sure, which stream is consumed first, you can simply add another sink and then pass all tokens to the sinks at once using {@link #consumeAllTokens}. This TokenFilter is exhausted after this. In the above example, change the example above to: <pre> ... TokenStream final1 = new LowerCaseFilter(source1.newSinkTokenStream()); TokenStream final2 = source2.newSinkTokenStream(); sink1.consumeAllTokens(); sink2.consumeAllTokens(); ... </pre> In this case, the fields can be added in any order, because the sources are not used anymore and all sinks are ready. <p>Note, the EntityDetect and URLDetect TokenStreams are for the example and do not currently exist in Lucene. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>>	TokenNameRIGHT_SHIFT	
sinks	TokenNameIdentifier	 sinks
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Instantiates a new TeeSinkTokenFilter. */	TokenNameCOMMENT_JAVADOC	 Instantiates a new TeeSinkTokenFilter. 
public	TokenNamepublic	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new {@link SinkTokenStream} that receives all tokens consumed by this stream. */	TokenNameCOMMENT_JAVADOC	 Returns a new {@link SinkTokenStream} that receives all tokens consumed by this stream. 
public	TokenNamepublic	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
ACCEPT_ALL_FILTER	TokenNameIdentifier	 ACCEPT  ALL  FILTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new {@link SinkTokenStream} that receives all tokens consumed by this stream * that pass the supplied filter. * @see SinkFilter */	TokenNameCOMMENT_JAVADOC	 Returns a new {@link SinkTokenStream} that receives all tokens consumed by this stream that pass the supplied filter. @see SinkFilter 
public	TokenNamepublic	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
SinkFilter	TokenNameIdentifier	 Sink Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
new	TokenNamenew	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sink	TokenNameIdentifier	 sink
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a {@link SinkTokenStream} created by another <code>TeeSinkTokenFilter</code> * to this one. The supplied stream will also receive all consumed tokens. * This method can be used to pass tokens from two different tees to one sink. */	TokenNameCOMMENT_JAVADOC	 Adds a {@link SinkTokenStream} created by another <code>TeeSinkTokenFilter</code> to this one. The supplied stream will also receive all consumed tokens. This method can be used to pass tokens from two different tees to one sink. 
public	TokenNamepublic	
void	TokenNamevoid	
addSinkTokenStream	TokenNameIdentifier	 add Sink Token Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
sink	TokenNameIdentifier	 sink
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that sink has correct factory 	TokenNameCOMMENT_LINE	check that sink has correct factory 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
getAttributeFactory	TokenNameIdentifier	 get Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
getAttributeFactory	TokenNameIdentifier	 get Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The supplied sink is not compatible to this tee"	TokenNameStringLiteral	The supplied sink is not compatible to this tee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add eventually missing attribute impls to the existing sink 	TokenNameCOMMENT_LINE	add eventually missing attribute impls to the existing sink 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeImplsIterator	TokenNameIdentifier	 get Attribute Impls Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
addAttributeImpl	TokenNameIdentifier	 add Attribute Impl
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>TeeSinkTokenFilter</code> passes all tokens to the added sinks * when itself is consumed. To be sure, that all tokens from the input * stream are passed to the sinks, you can call this methods. * This instance is exhausted after this, but all sinks are instant available. */	TokenNameCOMMENT_JAVADOC	 <code>TeeSinkTokenFilter</code> passes all tokens to the added sinks when itself is consumed. To be sure, that all tokens from the input stream are passed to the sinks, you can call this methods. This instance is exhausted after this, but all sinks are instant available. 
public	TokenNamepublic	
void	TokenNamevoid	
consumeAllTokens	TokenNameIdentifier	 consume All Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// capture state lazily - maybe no SinkFilter accepts this state 	TokenNameCOMMENT_LINE	capture state lazily - maybe no SinkFilter accepts this state 
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>	TokenNameGREATER	
ref	TokenNameIdentifier	 ref
:	TokenNameCOLON	
sinks	TokenNameIdentifier	 sinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
addState	TokenNameIdentifier	 add State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
finalState	TokenNameIdentifier	 final State
=	TokenNameEQUAL	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
>	TokenNameGREATER	
ref	TokenNameIdentifier	 ref
:	TokenNameCOLON	
sinks	TokenNameIdentifier	 sinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
setFinalState	TokenNameIdentifier	 set Final State
(	TokenNameLPAREN	
finalState	TokenNameIdentifier	 final State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A filter that decides which {@link AttributeSource} states to store in the sink. */	TokenNameCOMMENT_JAVADOC	 A filter that decides which {@link AttributeSource} states to store in the sink. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
SinkFilter	TokenNameIdentifier	 Sink Filter
{	TokenNameLBRACE	
/** * Returns true, iff the current state of the passed-in {@link AttributeSource} shall be stored * in the sink. */	TokenNameCOMMENT_JAVADOC	 Returns true, iff the current state of the passed-in {@link AttributeSource} shall be stored in the sink. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called by {@link SinkTokenStream#reset()}. This method does nothing by default * and can optionally be overridden. */	TokenNameCOMMENT_JAVADOC	 Called by {@link SinkTokenStream#reset()}. This method does nothing by default and can optionally be overridden. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// nothing to do; can be overridden 	TokenNameCOMMENT_LINE	nothing to do; can be overridden 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * TokenStream output from a tee with optional filtering. */	TokenNameCOMMENT_JAVADOC	 TokenStream output from a tee with optional filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
cachedStates	TokenNameIdentifier	 cached States
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
finalState	TokenNameIdentifier	 final State
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SinkFilter	TokenNameIdentifier	 Sink Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SinkFilter	TokenNameIdentifier	 Sink Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addState	TokenNameIdentifier	 add State
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"The tee must be consumed before sinks are consumed."	TokenNameStringLiteral	The tee must be consumed before sinks are consumed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cachedStates	TokenNameIdentifier	 cached States
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setFinalState	TokenNameIdentifier	 set Final State
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
finalState	TokenNameIdentifier	 final State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
finalState	TokenNameIdentifier	 final State
=	TokenNameEQUAL	
finalState	TokenNameIdentifier	 final State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// lazy init the iterator 	TokenNameCOMMENT_LINE	lazy init the iterator 
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
cachedStates	TokenNameIdentifier	 cached States
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
finalState	TokenNameIdentifier	 final State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
finalState	TokenNameIdentifier	 final State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
cachedStates	TokenNameIdentifier	 cached States
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SinkFilter	TokenNameIdentifier	 Sink Filter
ACCEPT_ALL_FILTER	TokenNameIdentifier	 ACCEPT  ALL  FILTER
=	TokenNameEQUAL	
new	TokenNamenew	
SinkFilter	TokenNameIdentifier	 Sink Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

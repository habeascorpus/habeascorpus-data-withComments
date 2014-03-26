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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
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
Attribute	TokenNameIdentifier	 Attribute
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
/** * A <code>TokenStream</code> enumerates the sequence of tokens, either from * {@link Field}s of a {@link Document} or from query text. * <p> * This is an abstract class; concrete subclasses are: * <ul> * <li>{@link Tokenizer}, a <code>TokenStream</code> whose input is a Reader; and * <li>{@link TokenFilter}, a <code>TokenStream</code> whose input is another * <code>TokenStream</code>. * </ul> * A new <code>TokenStream</code> API has been introduced with Lucene 2.9. This API * has moved from being {@link Token}-based to {@link Attribute}-based. While * {@link Token} still exists in 2.9 as a convenience class, the preferred way * to store the information of a {@link Token} is to use {@link AttributeImpl}s. * <p> * <code>TokenStream</code> now extends {@link AttributeSource}, which provides * access to all of the token {@link Attribute}s for the <code>TokenStream</code>. * Note that only one instance per {@link AttributeImpl} is created and reused * for every token. This approach reduces object creation and allows local * caching of references to the {@link AttributeImpl}s. See * {@link #incrementToken()} for further details. * <p> * <b>The workflow of the new <code>TokenStream</code> API is as follows:</b> * <ol> * <li>Instantiation of <code>TokenStream</code>/{@link TokenFilter}s which add/get * attributes to/from the {@link AttributeSource}. * <li>The consumer calls {@link TokenStream#reset()}. * <li>The consumer retrieves attributes from the stream and stores local * references to all attributes it wants to access. * <li>The consumer calls {@link #incrementToken()} until it returns false * consuming the attributes after each call. * <li>The consumer calls {@link #end()} so that any end-of-stream operations * can be performed. * <li>The consumer calls {@link #close()} to release any resource when finished * using the <code>TokenStream</code>. * </ol> * To make sure that filters and consumers know which attributes are available, * the attributes must be added during instantiation. Filters and consumers are * not required to check for availability of attributes in * {@link #incrementToken()}. * <p> * You can find some example code for the new API in the analysis package level * Javadoc. * <p> * Sometimes it is desirable to capture a current state of a <code>TokenStream</code>, * e.g., for buffering purposes (see {@link CachingTokenFilter}, * {@link TeeSinkTokenFilter}). For this usecase * {@link AttributeSource#captureState} and {@link AttributeSource#restoreState} * can be used. * <p>The {@code TokenStream}-API in Lucene is based on the decorator pattern. * Therefore all non-abstract subclasses must be final or have at least a final * implementation of {@link #incrementToken}! This is checked when Java * assertions are enabled. */	TokenNameCOMMENT_JAVADOC	 A <code>TokenStream</code> enumerates the sequence of tokens, either from {@link Field}s of a {@link Document} or from query text. <p> This is an abstract class; concrete subclasses are: <ul> <li>{@link Tokenizer}, a <code>TokenStream</code> whose input is a Reader; and <li>{@link TokenFilter}, a <code>TokenStream</code> whose input is another <code>TokenStream</code>. </ul> A new <code>TokenStream</code> API has been introduced with Lucene 2.9. This API has moved from being {@link Token}-based to {@link Attribute}-based. While {@link Token} still exists in 2.9 as a convenience class, the preferred way to store the information of a {@link Token} is to use {@link AttributeImpl}s. <p> <code>TokenStream</code> now extends {@link AttributeSource}, which provides access to all of the token {@link Attribute}s for the <code>TokenStream</code>. Note that only one instance per {@link AttributeImpl} is created and reused for every token. This approach reduces object creation and allows local caching of references to the {@link AttributeImpl}s. See {@link #incrementToken()} for further details. <p> <b>The workflow of the new <code>TokenStream</code> API is as follows:</b> <ol> <li>Instantiation of <code>TokenStream</code>/{@link TokenFilter}s which add/get attributes to/from the {@link AttributeSource}. <li>The consumer calls {@link TokenStream#reset()}. <li>The consumer retrieves attributes from the stream and stores local references to all attributes it wants to access. <li>The consumer calls {@link #incrementToken()} until it returns false consuming the attributes after each call. <li>The consumer calls {@link #end()} so that any end-of-stream operations can be performed. <li>The consumer calls {@link #close()} to release any resource when finished using the <code>TokenStream</code>. </ol> To make sure that filters and consumers know which attributes are available, the attributes must be added during instantiation. Filters and consumers are not required to check for availability of attributes in {@link #incrementToken()}. <p> You can find some example code for the new API in the analysis package level Javadoc. <p> Sometimes it is desirable to capture a current state of a <code>TokenStream</code>, e.g., for buffering purposes (see {@link CachingTokenFilter}, {@link TeeSinkTokenFilter}). For this usecase {@link AttributeSource#captureState} and {@link AttributeSource#restoreState} can be used. <p>The {@code TokenStream}-API in Lucene is based on the decorator pattern. Therefore all non-abstract subclasses must be final or have at least a final implementation of {@link #incrementToken}! This is checked when Java assertions are enabled. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TokenStream	TokenNameIdentifier	 Token Stream
extends	TokenNameextends	
AttributeSource	TokenNameIdentifier	 Attribute Source
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** * A TokenStream using the default attribute factory. */	TokenNameCOMMENT_JAVADOC	 A TokenStream using the default attribute factory. 
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
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
/** * A TokenStream that uses the same attributes as the supplied one. */	TokenNameCOMMENT_JAVADOC	 A TokenStream that uses the same attributes as the supplied one. 
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
assertFinal	TokenNameIdentifier	 assert Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A TokenStream using the supplied AttributeFactory for creating new {@link Attribute} instances. */	TokenNameCOMMENT_JAVADOC	 A TokenStream using the supplied AttributeFactory for creating new {@link Attribute} instances. 
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
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
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"incrementToken"	TokenNameStringLiteral	incrementToken
)	TokenNameRPAREN	
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"TokenStream implementation classes or at least their incrementToken() implementation must be final"	TokenNameStringLiteral	TokenStream implementation classes or at least their incrementToken() implementation must be final
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
/** * Consumers (i.e., {@link IndexWriter}) use this method to advance the stream to * the next token. Implementing classes must implement this method and update * the appropriate {@link AttributeImpl}s with the attributes of the next * token. * <P> * The producer must make no assumptions about the attributes after the method * has been returned: the caller may arbitrarily change it. If the producer * needs to preserve the state for subsequent calls, it can use * {@link #captureState} to create a copy of the current attribute state. * <p> * This method is called for every token of a document, so an efficient * implementation is crucial for good performance. To avoid calls to * {@link #addAttribute(Class)} and {@link #getAttribute(Class)}, * references to all {@link AttributeImpl}s that this stream uses should be * retrieved during instantiation. * <p> * To ensure that filters and consumers know which attributes are available, * the attributes must be added during instantiation. Filters and consumers * are not required to check for availability of attributes in * {@link #incrementToken()}. * * @return false for end of stream; true otherwise */	TokenNameCOMMENT_JAVADOC	 Consumers (i.e., {@link IndexWriter}) use this method to advance the stream to the next token. Implementing classes must implement this method and update the appropriate {@link AttributeImpl}s with the attributes of the next token. <P> The producer must make no assumptions about the attributes after the method has been returned: the caller may arbitrarily change it. If the producer needs to preserve the state for subsequent calls, it can use {@link #captureState} to create a copy of the current attribute state. <p> This method is called for every token of a document, so an efficient implementation is crucial for good performance. To avoid calls to {@link #addAttribute(Class)} and {@link #getAttribute(Class)}, references to all {@link AttributeImpl}s that this stream uses should be retrieved during instantiation. <p> To ensure that filters and consumers know which attributes are available, the attributes must be added during instantiation. Filters and consumers are not required to check for availability of attributes in {@link #incrementToken()}. * @return false for end of stream; true otherwise 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This method is called by the consumer after the last token has been * consumed, after {@link #incrementToken()} returned <code>false</code> * (using the new <code>TokenStream</code> API). Streams implementing the old API * should upgrade to use this feature. * <p/> * This method can be used to perform any end-of-stream operations, such as * setting the final offset of a stream. The final offset of a stream might * differ from the offset of the last token eg in case one or more whitespaces * followed after the last token, but a {@link WhitespaceTokenizer} was used. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 This method is called by the consumer after the last token has been consumed, after {@link #incrementToken()} returned <code>false</code> (using the new <code>TokenStream</code> API). Streams implementing the old API should upgrade to use this feature. <p/> This method can be used to perform any end-of-stream operations, such as setting the final offset of a stream. The final offset of a stream might differ from the offset of the last token eg in case one or more whitespaces followed after the last token, but a {@link WhitespaceTokenizer} was used. * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// do nothing by default 	TokenNameCOMMENT_LINE	do nothing by default 
}	TokenNameRBRACE	
/** * Resets this stream to the beginning. This is an optional operation, so * subclasses may or may not implement this method. {@link #reset()} is not needed for * the standard indexing process. However, if the tokens of a * <code>TokenStream</code> are intended to be consumed more than once, it is * necessary to implement {@link #reset()}. Note that if your TokenStream * caches tokens and feeds them back again after a reset, it is imperative * that you clone the tokens when you store them away (on the first pass) as * well as when you return them (on future passes after {@link #reset()}). */	TokenNameCOMMENT_JAVADOC	 Resets this stream to the beginning. This is an optional operation, so subclasses may or may not implement this method. {@link #reset()} is not needed for the standard indexing process. However, if the tokens of a <code>TokenStream</code> are intended to be consumed more than once, it is necessary to implement {@link #reset()}. Note that if your TokenStream caches tokens and feeds them back again after a reset, it is imperative that you clone the tokens when you store them away (on the first pass) as well as when you return them (on future passes after {@link #reset()}). 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Releases resources associated with this stream. */	TokenNameCOMMENT_JAVADOC	 Releases resources associated with this stream. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

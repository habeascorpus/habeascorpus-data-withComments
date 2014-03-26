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
/** A Tokenizer is a TokenStream whose input is a Reader. <p> This is an abstract class; subclasses must override {@link #incrementToken()} <p> NOTE: Subclasses overriding {@link #incrementToken()} must call {@link AttributeSource#clearAttributes()} before setting attributes. */	TokenNameCOMMENT_JAVADOC	 A Tokenizer is a TokenStream whose input is a Reader. <p> This is an abstract class; subclasses must override {@link #incrementToken()} <p> NOTE: Subclasses overriding {@link #incrementToken()} must call {@link AttributeSource#clearAttributes()} before setting attributes. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Tokenizer	TokenNameIdentifier	 Tokenizer
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
/** The text source for this Tokenizer. */	TokenNameCOMMENT_JAVADOC	 The text source for this Tokenizer. 
protected	TokenNameprotected	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
/** Construct a tokenizer with null input. * @deprecated use {@link #Tokenizer(Reader)} instead. */	TokenNameCOMMENT_JAVADOC	 Construct a tokenizer with null input. @deprecated use {@link #Tokenizer(Reader)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Construct a token stream processing the given input. */	TokenNameCOMMENT_JAVADOC	 Construct a token stream processing the given input. 
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a tokenizer with null input using the given AttributeFactory. * @deprecated use {@link #Tokenizer(AttributeSource.AttributeFactory, Reader)} instead. */	TokenNameCOMMENT_JAVADOC	 Construct a tokenizer with null input using the given AttributeFactory. @deprecated use {@link #Tokenizer(AttributeSource.AttributeFactory, Reader)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
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
}	TokenNameRBRACE	
/** Construct a token stream processing the given input using the given AttributeFactory. */	TokenNameCOMMENT_JAVADOC	 Construct a token stream processing the given input using the given AttributeFactory. 
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a token stream processing the given input using the given AttributeSource. * @deprecated use {@link #Tokenizer(AttributeSource, Reader)} instead. */	TokenNameCOMMENT_JAVADOC	 Construct a token stream processing the given input using the given AttributeSource. @deprecated use {@link #Tokenizer(AttributeSource, Reader)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a token stream processing the given input using the given AttributeSource. */	TokenNameCOMMENT_JAVADOC	 Construct a token stream processing the given input using the given AttributeSource. 
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** By default, closes the input Reader. */	TokenNameCOMMENT_JAVADOC	 By default, closes the input Reader. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// LUCENE-2387: don't hold onto Reader after close, so 	TokenNameCOMMENT_LINE	LUCENE-2387: don't hold onto Reader after close, so 
// GC can reclaim 	TokenNameCOMMENT_LINE	GC can reclaim 
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the corrected offset. If {@link #input} is a {@link CharStream} subclass * this method calls {@link CharStream#correctOffset}, else returns <code>currentOff</code>. * @param currentOff offset as seen in the output * @return corrected offset based on the input * @see CharStream#correctOffset */	TokenNameCOMMENT_JAVADOC	 Return the corrected offset. If {@link #input} is a {@link CharStream} subclass this method calls {@link CharStream#correctOffset}, else returns <code>currentOff</code>. @param currentOff offset as seen in the output @return corrected offset based on the input @see CharStream#correctOffset 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
int	TokenNameint	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
instanceof	TokenNameinstanceof	
CharStream	TokenNameIdentifier	 Char Stream
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharStream	TokenNameIdentifier	 Char Stream
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
.	TokenNameDOT	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
:	TokenNameCOLON	
currentOff	TokenNameIdentifier	 current Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Reset the tokenizer to a new reader. Typically, an * analyzer (in its reusableTokenStream method) will use * this to re-use a previously created tokenizer. */	TokenNameCOMMENT_JAVADOC	 Expert: Reset the tokenizer to a new reader. Typically, an analyzer (in its reusableTokenStream method) will use this to re-use a previously created tokenizer. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

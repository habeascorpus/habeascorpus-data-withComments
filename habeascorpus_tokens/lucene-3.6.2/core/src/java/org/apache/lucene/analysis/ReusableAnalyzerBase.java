/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * An convenience subclass of Analyzer that makes it easy to implement * {@link TokenStream} reuse. * <p> * ReusableAnalyzerBase is a simplification of Analyzer that supports easy reuse * for the most common use-cases. Analyzers such as * {@link PerFieldAnalyzerWrapper} that behave differently depending upon the * field name need to subclass Analyzer directly instead. * </p> * <p> * To prevent consistency problems, this class does not allow subclasses to * extend {@link #reusableTokenStream(String, Reader)} or * {@link #tokenStream(String, Reader)} directly. Instead, subclasses must * implement {@link #createComponents(String, Reader)}. * </p> */	TokenNameCOMMENT_JAVADOC	 An convenience subclass of Analyzer that makes it easy to implement {@link TokenStream} reuse. <p> ReusableAnalyzerBase is a simplification of Analyzer that supports easy reuse for the most common use-cases. Analyzers such as {@link PerFieldAnalyzerWrapper} that behave differently depending upon the field name need to subclass Analyzer directly instead. </p> <p> To prevent consistency problems, this class does not allow subclasses to extend {@link #reusableTokenStream(String, Reader)} or {@link #tokenStream(String, Reader)} directly. Instead, subclasses must implement {@link #createComponents(String, Reader)}. </p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
/** * Creates a new {@link TokenStreamComponents} instance for this analyzer. * * @param fieldName * the name of the fields content passed to the * {@link TokenStreamComponents} sink as a reader * @param reader * the reader passed to the {@link Tokenizer} constructor * @return the {@link TokenStreamComponents} for this analyzer. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TokenStreamComponents} instance for this analyzer. * @param fieldName the name of the fields content passed to the {@link TokenStreamComponents} sink as a reader @param reader the reader passed to the {@link Tokenizer} constructor @return the {@link TokenStreamComponents} for this analyzer. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method uses {@link #createComponents(String, Reader)} to obtain an * instance of {@link TokenStreamComponents}. It returns the sink of the * components and stores the components internally. Subsequent calls to this * method will reuse the previously stored components if and only if the * {@link TokenStreamComponents#reset(Reader)} method returned * <code>true</code>. Otherwise a new instance of * {@link TokenStreamComponents} is created. * * @param fieldName the name of the field the created TokenStream is used for * @param reader the reader the streams source reads from */	TokenNameCOMMENT_JAVADOC	 This method uses {@link #createComponents(String, Reader)} to obtain an instance of {@link TokenStreamComponents}. It returns the sink of the components and stores the components internally. Subsequent calls to this method will reuse the previously stored components if and only if the {@link TokenStreamComponents#reset(Reader)} method returned <code>true</code>. Otherwise a new instance of {@link TokenStreamComponents} is created. * @param fieldName the name of the field the created TokenStream is used for @param reader the reader the streams source reads from 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
streamChain	TokenNameIdentifier	 stream Chain
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streamChain	TokenNameIdentifier	 stream Chain
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
streamChain	TokenNameIdentifier	 stream Chain
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streamChain	TokenNameIdentifier	 stream Chain
=	TokenNameEQUAL	
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
streamChain	TokenNameIdentifier	 stream Chain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
streamChain	TokenNameIdentifier	 stream Chain
.	TokenNameDOT	
getTokenStream	TokenNameIdentifier	 get Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method uses {@link #createComponents(String, Reader)} to obtain an * instance of {@link TokenStreamComponents} and returns the sink of the * components. Each calls to this method will create a new instance of * {@link TokenStreamComponents}. Created {@link TokenStream} instances are * never reused. * * @param fieldName the name of the field the created TokenStream is used for * @param reader the reader the streams source reads from */	TokenNameCOMMENT_JAVADOC	 This method uses {@link #createComponents(String, Reader)} to obtain an instance of {@link TokenStreamComponents} and returns the sink of the components. Each calls to this method will create a new instance of {@link TokenStreamComponents}. Created {@link TokenStream} instances are never reused. * @param fieldName the name of the field the created TokenStream is used for @param reader the reader the streams source reads from 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokenStream	TokenNameIdentifier	 get Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override this if you want to add a CharFilter chain. */	TokenNameCOMMENT_JAVADOC	 Override this if you want to add a CharFilter chain. 
protected	TokenNameprotected	
Reader	TokenNameIdentifier	 Reader
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class encapsulates the outer components of a token stream. It provides * access to the source ({@link Tokenizer}) and the outer end (sink), an * instance of {@link TokenFilter} which also serves as the * {@link TokenStream} returned by * {@link Analyzer#tokenStream(String, Reader)} and * {@link Analyzer#reusableTokenStream(String, Reader)}. */	TokenNameCOMMENT_JAVADOC	 This class encapsulates the outer components of a token stream. It provides access to the source ({@link Tokenizer}) and the outer end (sink), an instance of {@link TokenFilter} which also serves as the {@link TokenStream} returned by {@link Analyzer#tokenStream(String, Reader)} and {@link Analyzer#reusableTokenStream(String, Reader)}. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
sink	TokenNameIdentifier	 sink
;	TokenNameSEMICOLON	
/** * Creates a new {@link TokenStreamComponents} instance. * * @param source * the analyzer's tokenizer * @param result * the analyzer's resulting token stream */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TokenStreamComponents} instance. * @param source the analyzer's tokenizer @param result the analyzer's resulting token stream 
public	TokenNamepublic	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link TokenStreamComponents} instance. * * @param source * the analyzer's tokenizer */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TokenStreamComponents} instance. * @param source the analyzer's tokenizer 
public	TokenNamepublic	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the encapsulated components with the given reader. This method by * default returns <code>true</code> indicating that the components have * been reset successfully. Subclasses of {@link ReusableAnalyzerBase} might use * their own {@link TokenStreamComponents} returning <code>false</code> if * the components cannot be reset. * * @param reader * a reader to reset the source component * @return <code>true</code> if the components were reset, otherwise * <code>false</code> * @throws IOException * if the component's reset method throws an {@link IOException} */	TokenNameCOMMENT_JAVADOC	 Resets the encapsulated components with the given reader. This method by default returns <code>true</code> indicating that the components have been reset successfully. Subclasses of {@link ReusableAnalyzerBase} might use their own {@link TokenStreamComponents} returning <code>false</code> if the components cannot be reset. * @param reader a reader to reset the source component @return <code>true</code> if the components were reset, otherwise <code>false</code> @throws IOException if the component's reset method throws an {@link IOException} 
protected	TokenNameprotected	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the sink {@link TokenStream} * * @return the sink {@link TokenStream} */	TokenNameCOMMENT_JAVADOC	 Returns the sink {@link TokenStream} * @return the sink {@link TokenStream} 
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
getTokenStream	TokenNameIdentifier	 get Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sink	TokenNameIdentifier	 sink
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * A ShingleAnalyzerWrapper wraps a {@link ShingleFilter} around another {@link Analyzer}. * <p> * A shingle is another name for a token based n-gram. * </p> */	TokenNameCOMMENT_JAVADOC	 A ShingleAnalyzerWrapper wraps a {@link ShingleFilter} around another {@link Analyzer}. <p> A shingle is another name for a token based n-gram. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
=	TokenNameEQUAL	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
=	TokenNameEQUAL	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
TOKEN_SEPARATOR	TokenNameIdentifier	 TOKEN  SEPARATOR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
TOKEN_SEPARATOR	TokenNameIdentifier	 TOKEN  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ShingleAnalyzerWrapper * * @param defaultAnalyzer Analyzer whose TokenStream is to be filtered * @param minShingleSize Min shingle (token ngram) size * @param maxShingleSize Max shingle size * @param tokenSeparator Used to separate input stream tokens in output shingles * @param outputUnigrams Whether or not the filter shall pass the original * tokens to the output stream * @param outputUnigramsIfNoShingles Overrides the behavior of outputUnigrams==false for those * times when no shingles are available (because there are fewer than * minShingleSize tokens in the input stream)? * Note that if outputUnigrams==true, then unigrams are always output, * regardless of whether any shingles are available. */	TokenNameCOMMENT_JAVADOC	 Creates a new ShingleAnalyzerWrapper * @param defaultAnalyzer Analyzer whose TokenStream is to be filtered @param minShingleSize Min shingle (token ngram) size @param maxShingleSize Max shingle size @param tokenSeparator Used to separate input stream tokens in output shingles @param outputUnigrams Whether or not the filter shall pass the original tokens to the output stream @param outputUnigramsIfNoShingles Overrides the behavior of outputUnigrams==false for those times when no shingles are available (because there are fewer than minShingleSize tokens in the input stream)? Note that if outputUnigrams==true, then unigrams are always output, regardless of whether any shingles are available. 
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Max shingle size must be >= 2"	TokenNameStringLiteral	Max shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be >= 2"	TokenNameStringLiteral	Min shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
>	TokenNameGREATER	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be <= max shingle size"	TokenNameStringLiteral	Min shingle size must be <= max shingle size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minShingleSize	TokenNameIdentifier	 min Shingle Size
=	TokenNameEQUAL	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenSeparator	TokenNameIdentifier	 token Separator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
outputUnigrams	TokenNameIdentifier	 output Unigrams
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
=	TokenNameEQUAL	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps {@link StandardAnalyzer}. */	TokenNameCOMMENT_JAVADOC	 Wraps {@link StandardAnalyzer}. 
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps {@link StandardAnalyzer}. */	TokenNameCOMMENT_JAVADOC	 Wraps {@link StandardAnalyzer}. 
public	TokenNamepublic	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The max shingle (token ngram) size * * @return The max shingle (token ngram) size */	TokenNameCOMMENT_JAVADOC	 The max shingle (token ngram) size * @return The max shingle (token ngram) size 
public	TokenNamepublic	
int	TokenNameint	
getMaxShingleSize	TokenNameIdentifier	 get Max Shingle Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the maximum size of output shingles (default: 2) * * @param maxShingleSize max shingle size * @deprecated Setting maxShingleSize after Analyzer instantiation prevents reuse. * Confgure maxShingleSize during construction. */	TokenNameCOMMENT_JAVADOC	 Set the maximum size of output shingles (default: 2) * @param maxShingleSize max shingle size @deprecated Setting maxShingleSize after Analyzer instantiation prevents reuse. Confgure maxShingleSize during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setMaxShingleSize	TokenNameIdentifier	 set Max Shingle Size
(	TokenNameLPAREN	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Max shingle size must be >= 2"	TokenNameStringLiteral	Max shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The min shingle (token ngram) size * * @return The min shingle (token ngram) size */	TokenNameCOMMENT_JAVADOC	 The min shingle (token ngram) size * @return The min shingle (token ngram) size 
public	TokenNamepublic	
int	TokenNameint	
getMinShingleSize	TokenNameIdentifier	 get Min Shingle Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set the min shingle size (default: 2). * <p>This method requires that the passed in minShingleSize is not greater * than maxShingleSize, so make sure that maxShingleSize is set before * calling this method. * * @param minShingleSize min size of output shingles * @deprecated Setting minShingleSize after Analyzer instantiation prevents reuse. * Confgure minShingleSize during construction. */	TokenNameCOMMENT_JAVADOC	 <p>Set the min shingle size (default: 2). <p>This method requires that the passed in minShingleSize is not greater than maxShingleSize, so make sure that maxShingleSize is set before calling this method. * @param minShingleSize min size of output shingles @deprecated Setting minShingleSize after Analyzer instantiation prevents reuse. Confgure minShingleSize during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setMinShingleSize	TokenNameIdentifier	 set Min Shingle Size
(	TokenNameLPAREN	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be >= 2"	TokenNameStringLiteral	Min shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
>	TokenNameGREATER	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be <= max shingle size"	TokenNameStringLiteral	Min shingle size must be <= max shingle size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minShingleSize	TokenNameIdentifier	 min Shingle Size
=	TokenNameEQUAL	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTokenSeparator	TokenNameIdentifier	 get Token Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenSeparator	TokenNameIdentifier	 token Separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the string to use when joining adjacent tokens to form a shingle * @param tokenSeparator used to separate input stream tokens in output shingles * @deprecated Setting tokenSeparator after Analyzer instantiation prevents reuse. * Confgure tokenSeparator during construction. */	TokenNameCOMMENT_JAVADOC	 Sets the string to use when joining adjacent tokens to form a shingle @param tokenSeparator used to separate input stream tokens in output shingles @deprecated Setting tokenSeparator after Analyzer instantiation prevents reuse. Confgure tokenSeparator during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setTokenSeparator	TokenNameIdentifier	 set Token Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokenSeparator	TokenNameIdentifier	 token Separator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOutputUnigrams	TokenNameIdentifier	 is Output Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outputUnigrams	TokenNameIdentifier	 output Unigrams
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shall the filter pass the original tokens (the "unigrams") to the output * stream? * * @param outputUnigrams Whether or not the filter shall pass the original * tokens to the output stream * @deprecated Setting outputUnigrams after Analyzer instantiation prevents reuse. * Confgure outputUnigrams during construction. */	TokenNameCOMMENT_JAVADOC	 Shall the filter pass the original tokens (the "unigrams") to the output stream? * @param outputUnigrams Whether or not the filter shall pass the original tokens to the output stream @deprecated Setting outputUnigrams after Analyzer instantiation prevents reuse. Confgure outputUnigrams during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
outputUnigrams	TokenNameIdentifier	 output Unigrams
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOutputUnigramsIfNoShingles	TokenNameIdentifier	 is Output Unigrams If No Shingles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Shall we override the behavior of outputUnigrams==false for those * times when no shingles are available (because there are fewer than * minShingleSize tokens in the input stream)? (default: false.) * <p>Note that if outputUnigrams==true, then unigrams are always output, * regardless of whether any shingles are available. * * @param outputUnigramsIfNoShingles Whether or not to output a single * unigram when no shingles are available. * @deprecated Setting outputUnigramsIfNoShingles after Analyzer instantiation prevents reuse. * Confgure outputUnigramsIfNoShingles during construction. */	TokenNameCOMMENT_JAVADOC	 <p>Shall we override the behavior of outputUnigrams==false for those times when no shingles are available (because there are fewer than minShingleSize tokens in the input stream)? (default: false.) <p>Note that if outputUnigrams==true, then unigrams are always output, regardless of whether any shingles are available. * @param outputUnigramsIfNoShingles Whether or not to output a single unigram when no shingles are available. @deprecated Setting outputUnigramsIfNoShingles after Analyzer instantiation prevents reuse. Confgure outputUnigramsIfNoShingles during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setOutputUnigramsIfNoShingles	TokenNameIdentifier	 set Output Unigrams If No Shingles
(	TokenNameLPAREN	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
=	TokenNameEQUAL	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
,	TokenNameCOMMA	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setMinShingleSize	TokenNameIdentifier	 set Min Shingle Size
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setMaxShingleSize	TokenNameIdentifier	 set Max Shingle Size
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setTokenSeparator	TokenNameIdentifier	 set Token Separator
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigramsIfNoShingles	TokenNameIdentifier	 set Output Unigrams If No Shingles
(	TokenNameLPAREN	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SavedStreams	TokenNameIdentifier	 Saved Streams
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
shingle	TokenNameIdentifier	 shingle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
SavedStreams	TokenNameIdentifier	 Saved Streams
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SavedStreams	TokenNameIdentifier	 Saved Streams
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
SavedStreams	TokenNameIdentifier	 Saved Streams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* the wrapped analyzer did not, create a new shingle around the new one */	TokenNameCOMMENT_BLOCK	 the wrapped analyzer did not, create a new shingle around the new one 
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
setMaxShingleSize	TokenNameIdentifier	 set Max Shingle Size
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
setMinShingleSize	TokenNameIdentifier	 set Min Shingle Size
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
setTokenSeparator	TokenNameIdentifier	 set Token Separator
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
setOutputUnigramsIfNoShingles	TokenNameIdentifier	 set Output Unigrams If No Shingles
(	TokenNameLPAREN	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

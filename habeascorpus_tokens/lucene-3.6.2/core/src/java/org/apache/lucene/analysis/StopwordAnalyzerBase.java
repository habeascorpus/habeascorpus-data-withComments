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
File	TokenNameIdentifier	 File
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
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
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
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
IOUtils	TokenNameIdentifier	 IO Utils
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
/** * Base class for Analyzers that need to make use of stopword sets. * */	TokenNameCOMMENT_JAVADOC	 Base class for Analyzers that need to make use of stopword sets. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
extends	TokenNameextends	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
{	TokenNameLBRACE	
/** * An immutable stopword set */	TokenNameCOMMENT_JAVADOC	 An immutable stopword set 
protected	TokenNameprotected	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopwords	TokenNameIdentifier	 stopwords
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
/** * Returns the analyzer's stopword set or an empty set if the analyzer has no * stopwords * * @return the analyzer's stopword set or an empty set if the analyzer has no * stopwords */	TokenNameCOMMENT_JAVADOC	 Returns the analyzer's stopword set or an empty set if the analyzer has no stopwords * @return the analyzer's stopword set or an empty set if the analyzer has no stopwords 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getStopwordSet	TokenNameIdentifier	 get Stopword Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stopwords	TokenNameIdentifier	 stopwords
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance initialized with the given stopword set * * @param version * the Lucene version for cross version compatibility * @param stopwords * the analyzer's stopword set */	TokenNameCOMMENT_JAVADOC	 Creates a new instance initialized with the given stopword set * @param version the Lucene version for cross version compatibility @param stopwords the analyzer's stopword set 
protected	TokenNameprotected	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
// analyzers should use char array set for stopwords! 	TokenNameCOMMENT_LINE	analyzers should use char array set for stopwords! 
this	TokenNamethis	
.	TokenNameDOT	
stopwords	TokenNameIdentifier	 stopwords
=	TokenNameEQUAL	
stopwords	TokenNameIdentifier	 stopwords
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
:	TokenNameCOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Analyzer with an empty stopword set * * @param version * the Lucene version for cross version compatibility */	TokenNameCOMMENT_JAVADOC	 Creates a new Analyzer with an empty stopword set * @param version the Lucene version for cross version compatibility 
protected	TokenNameprotected	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a CharArraySet from a file resource associated with a class. (See * {@link Class#getResourceAsStream(String)}). * * @param ignoreCase * <code>true</code> if the set should ignore the case of the * stopwords, otherwise <code>false</code> * @param aClass * a class that is associated with the given stopwordResource * @param resource * name of the resource file associated with the given class * @param comment * comment string to ignore in the stopword file * @return a CharArraySet containing the distinct stopwords from the given * file * @throws IOException * if loading the stopwords throws an {@link IOException} */	TokenNameCOMMENT_JAVADOC	 Creates a CharArraySet from a file resource associated with a class. (See {@link Class#getResourceAsStream(String)}). * @param ignoreCase <code>true</code> if the set should ignore the case of the stopwords, otherwise <code>false</code> @param aClass a class that is associated with the given stopwordResource @param resource name of the resource file associated with the given class @param comment comment string to ignore in the stopword file @return a CharArraySet containing the distinct stopwords from the given file @throws IOException if loading the stopwords throws an {@link IOException} 
protected	TokenNameprotected	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
loadStopwordSet	TokenNameIdentifier	 load Stopword Set
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
>	TokenNameGREATER	
aClass	TokenNameIdentifier	 a Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
aClass	TokenNameIdentifier	 a Class
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
CHARSET_UTF_8	TokenNameIdentifier	 CHARSET  UTF 8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a CharArraySet from a file. * * @param stopwords * the stopwords file to load * * @param matchVersion * the Lucene version for cross version compatibility * @return a CharArraySet containing the distinct stopwords from the given * file * @throws IOException * if loading the stopwords throws an {@link IOException} */	TokenNameCOMMENT_JAVADOC	 Creates a CharArraySet from a file. * @param stopwords the stopwords file to load * @param matchVersion the Lucene version for cross version compatibility @return a CharArraySet containing the distinct stopwords from the given file @throws IOException if loading the stopwords throws an {@link IOException} 
protected	TokenNameprotected	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
loadStopwordSet	TokenNameIdentifier	 load Stopword Set
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
CHARSET_UTF_8	TokenNameIdentifier	 CHARSET  UTF 8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a CharArraySet from a file. * * @param stopwords * the stopwords reader to load * * @param matchVersion * the Lucene version for cross version compatibility * @return a CharArraySet containing the distinct stopwords from the given * reader * @throws IOException * if loading the stopwords throws an {@link IOException} */	TokenNameCOMMENT_JAVADOC	 Creates a CharArraySet from a file. * @param stopwords the stopwords reader to load * @param matchVersion the Lucene version for cross version compatibility @return a CharArraySet containing the distinct stopwords from the given reader @throws IOException if loading the stopwords throws an {@link IOException} 
protected	TokenNameprotected	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
loadStopwordSet	TokenNameIdentifier	 load Stopword Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

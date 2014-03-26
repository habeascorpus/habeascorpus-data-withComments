package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
/** * Class that allows for tailored Unicode Text Segmentation on * a per-writing system basis. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Class that allows for tailored Unicode Text Segmentation on a per-writing system basis. @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
{	TokenNameLBRACE	
/** Return a breakiterator capable of processing a given script. */	TokenNameCOMMENT_JAVADOC	 Return a breakiterator capable of processing a given script. 
public	TokenNamepublic	
abstract	TokenNameabstract	
BreakIterator	TokenNameIdentifier	 Break Iterator
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
int	TokenNameint	
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a token type value for a given script and BreakIterator * rule status. */	TokenNameCOMMENT_JAVADOC	 Return a token type value for a given script and BreakIterator rule status. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
int	TokenNameint	
ruleStatus	TokenNameIdentifier	 rule Status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); you may not * use this file except in compliance with the License. You may obtain a copy of * the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
stempel	TokenNameIdentifier	 stempel
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
Diff	TokenNameIdentifier	 Diff
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
Trie	TokenNameIdentifier	 Trie
;	TokenNameSEMICOLON	
/** * <p> * Stemmer class is a convenient facade for other stemmer-related classes. The * core stemming algorithm and its implementation is taken verbatim from the * Egothor project ( <a href="http://www.egothor.org">www.egothor.org </a>). * </p> * <p> * Even though the stemmer tables supplied in the distribution package are built * for Polish language, there is nothing language-specific here. * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Stemmer class is a convenient facade for other stemmer-related classes. The core stemming algorithm and its implementation is taken verbatim from the Egothor project ( <a href="http://www.egothor.org">www.egothor.org </a>). </p> <p> Even though the stemmer tables supplied in the distribution package are built for Polish language, there is nothing language-specific here. </p> 
public	TokenNamepublic	
class	TokenNameclass	
StempelStemmer	TokenNameIdentifier	 Stempel Stemmer
{	TokenNameLBRACE	
private	TokenNameprivate	
Trie	TokenNameIdentifier	 Trie
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a Stemmer using selected stemmer table * * @param stemmerTable stemmer table. */	TokenNameCOMMENT_JAVADOC	 Create a Stemmer using selected stemmer table * @param stemmerTable stemmer table. 
public	TokenNamepublic	
StempelStemmer	TokenNameIdentifier	 Stempel Stemmer
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stemmerTable	TokenNameIdentifier	 stemmer Table
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
stemmerTable	TokenNameIdentifier	 stemmer Table
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Stemmer using pre-loaded stemmer table * * @param stemmer pre-loaded stemmer table */	TokenNameCOMMENT_JAVADOC	 Create a Stemmer using pre-loaded stemmer table * @param stemmer pre-loaded stemmer table 
public	TokenNamepublic	
StempelStemmer	TokenNameIdentifier	 Stempel Stemmer
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
stemmer	TokenNameIdentifier	 stemmer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
stemmer	TokenNameIdentifier	 stemmer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load a stemmer table from an inputstream. */	TokenNameCOMMENT_JAVADOC	 Load a stemmer table from an inputstream. 
public	TokenNamepublic	
static	TokenNamestatic	
Trie	TokenNameIdentifier	 Trie
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stemmerTable	TokenNameIdentifier	 stemmer Table
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
stemmerTable	TokenNameIdentifier	 stemmer Table
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
MultiTrie2	TokenNameIdentifier	 Multi Trie2
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Stem a word. * * @param word input word to be stemmed. * @return stemmed word, or null if the stem could not be generated. */	TokenNameCOMMENT_JAVADOC	 Stem a word. * @param word input word to be stemmed. @return stemmed word, or null if the stem could not be generated. 
public	TokenNamepublic	
StringBuilder	TokenNameIdentifier	 String Builder
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
getLastOnPath	TokenNameIdentifier	 get Last On Path
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Diff	TokenNameIdentifier	 Diff
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

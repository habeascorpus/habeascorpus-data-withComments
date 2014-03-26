/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
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
InputStream	TokenNameIdentifier	 Input Stream
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Replaces tokens in the original input with user-supplied values. * * Example: * * <pre>&lt;replacetokens begintoken=&quot;#&quot; endtoken=&quot;#&quot;&gt; * &lt;token key=&quot;DATE&quot; value=&quot;${TODAY}&quot;/&gt; * &lt;/replacetokens&gt;</pre> * * Or: * * <pre>&lt;filterreader classname="org.apache.tools.ant.filters.ReplaceTokens"&gt; * &lt;param type="tokenchar" name="begintoken" value="#"/&gt; * &lt;param type="tokenchar" name="endtoken" value="#"/&gt; * &lt;param type="token" name="DATE" value="${TODAY}"/&gt; * &lt;/filterreader&gt;</pre> * */	TokenNameCOMMENT_JAVADOC	 Replaces tokens in the original input with user-supplied values. * Example: * <pre>&lt;replacetokens begintoken=&quot;#&quot; endtoken=&quot;#&quot;&gt; &lt;token key=&quot;DATE&quot; value=&quot;${TODAY}&quot;/&gt; &lt;/replacetokens&gt;</pre> * Or: * <pre>&lt;filterreader classname="org.apache.tools.ant.filters.ReplaceTokens"&gt; &lt;param type="tokenchar" name="begintoken" value="#"/&gt; &lt;param type="tokenchar" name="endtoken" value="#"/&gt; &lt;param type="token" name="DATE" value="${TODAY}"/&gt; &lt;/filterreader&gt;</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ReplaceTokens	TokenNameIdentifier	 Replace Tokens
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** Default "begin token" character. */	TokenNameCOMMENT_JAVADOC	 Default "begin token" character. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_BEGIN_TOKEN	TokenNameIdentifier	 DEFAULT  BEGIN  TOKEN
=	TokenNameEQUAL	
'@'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** Default "end token" character. */	TokenNameCOMMENT_JAVADOC	 Default "end token" character. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_END_TOKEN	TokenNameIdentifier	 DEFAULT  END  TOKEN
=	TokenNameEQUAL	
'@'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** Data to be used before reading from stream again */	TokenNameCOMMENT_JAVADOC	 Data to be used before reading from stream again 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
queuedData	TokenNameIdentifier	 queued Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** replacement test from a token */	TokenNameCOMMENT_JAVADOC	 replacement test from a token 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
replaceData	TokenNameIdentifier	 replace Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Index into replacement data */	TokenNameCOMMENT_JAVADOC	 Index into replacement data 
private	TokenNameprivate	
int	TokenNameint	
replaceIndex	TokenNameIdentifier	 replace Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Index into queue data */	TokenNameCOMMENT_JAVADOC	 Index into queue data 
private	TokenNameprivate	
int	TokenNameint	
queueIndex	TokenNameIdentifier	 queue Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Hashtable to hold the replacee-replacer pairs (String to String). */	TokenNameCOMMENT_JAVADOC	 Hashtable to hold the replacee-replacer pairs (String to String). 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Character marking the beginning of a token. */	TokenNameCOMMENT_JAVADOC	 Character marking the beginning of a token. 
private	TokenNameprivate	
char	TokenNamechar	
beginToken	TokenNameIdentifier	 begin Token
=	TokenNameEQUAL	
DEFAULT_BEGIN_TOKEN	TokenNameIdentifier	 DEFAULT  BEGIN  TOKEN
;	TokenNameSEMICOLON	
/** Character marking the end of a token. */	TokenNameCOMMENT_JAVADOC	 Character marking the end of a token. 
private	TokenNameprivate	
char	TokenNamechar	
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
DEFAULT_END_TOKEN	TokenNameIdentifier	 DEFAULT  END  TOKEN
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
ReplaceTokens	TokenNameIdentifier	 Replace Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new filtered reader. * * @param in A Reader object providing the underlying stream. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. 
public	TokenNamepublic	
ReplaceTokens	TokenNameIdentifier	 Replace Tokens
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getNextChar	TokenNameIdentifier	 get Next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queueIndex	TokenNameIdentifier	 queue Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
queuedData	TokenNameIdentifier	 queued Data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
queueIndex	TokenNameIdentifier	 queue Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueIndex	TokenNameIdentifier	 queue Index
>=	TokenNameGREATER_EQUAL	
queuedData	TokenNameIdentifier	 queued Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queueIndex	TokenNameIdentifier	 queue Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next character in the filtered stream, replacing tokens * from the original stream. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream, replacing tokens from the original stream. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getInitialized	TokenNameIdentifier	 get Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replaceIndex	TokenNameIdentifier	 replace Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
replaceData	TokenNameIdentifier	 replace Data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
replaceIndex	TokenNameIdentifier	 replace Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
replaceIndex	TokenNameIdentifier	 replace Index
>=	TokenNameGREATER_EQUAL	
replaceData	TokenNameIdentifier	 replace Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replaceIndex	TokenNameIdentifier	 replace Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
getNextChar	TokenNameIdentifier	 get Next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
beginToken	TokenNameIdentifier	 begin Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
getNextChar	TokenNameIdentifier	 get Next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
endToken	TokenNameIdentifier	 end Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queuedData	TokenNameIdentifier	 queued Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
queueIndex	TokenNameIdentifier	 queue Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queuedData	TokenNameIdentifier	 queued Data
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queuedData	TokenNameIdentifier	 queued Data
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
queuedData	TokenNameIdentifier	 queued Data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
queueIndex	TokenNameIdentifier	 queue Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queuedData	TokenNameIdentifier	 queued Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queueIndex	TokenNameIdentifier	 queue Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queueIndex	TokenNameIdentifier	 queue Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
beginToken	TokenNameIdentifier	 begin Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
replaceWith	TokenNameIdentifier	 replace With
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
replaceWith	TokenNameIdentifier	 replace With
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replaceWith	TokenNameIdentifier	 replace With
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replaceData	TokenNameIdentifier	 replace Data
=	TokenNameEQUAL	
replaceWith	TokenNameIdentifier	 replace With
;	TokenNameSEMICOLON	
replaceIndex	TokenNameIdentifier	 replace Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newData	TokenNameIdentifier	 new Data
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queuedData	TokenNameIdentifier	 queued Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
queueIndex	TokenNameIdentifier	 queue Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queuedData	TokenNameIdentifier	 queued Data
=	TokenNameEQUAL	
newData	TokenNameIdentifier	 new Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queuedData	TokenNameIdentifier	 queued Data
=	TokenNameEQUAL	
newData	TokenNameIdentifier	 new Data
+	TokenNamePLUS	
queuedData	TokenNameIdentifier	 queued Data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
queueIndex	TokenNameIdentifier	 queue Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
queueIndex	TokenNameIdentifier	 queue Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
beginToken	TokenNameIdentifier	 begin Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the "begin token" character. * * @param beginToken the character used to denote the beginning of a token */	TokenNameCOMMENT_JAVADOC	 Sets the "begin token" character. * @param beginToken the character used to denote the beginning of a token 
public	TokenNamepublic	
void	TokenNamevoid	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
beginToken	TokenNameIdentifier	 begin Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginToken	TokenNameIdentifier	 begin Token
=	TokenNameEQUAL	
beginToken	TokenNameIdentifier	 begin Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the "begin token" character. * * @return the character used to denote the beginning of a token */	TokenNameCOMMENT_JAVADOC	 Returns the "begin token" character. * @return the character used to denote the beginning of a token 
private	TokenNameprivate	
char	TokenNamechar	
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beginToken	TokenNameIdentifier	 begin Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the "end token" character. * * @param endToken the character used to denote the end of a token */	TokenNameCOMMENT_JAVADOC	 Sets the "end token" character. * @param endToken the character used to denote the end of a token 
public	TokenNamepublic	
void	TokenNamevoid	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
endToken	TokenNameIdentifier	 end Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the "end token" character. * * @return the character used to denote the end of a token */	TokenNameCOMMENT_JAVADOC	 Returns the "end token" character. * @return the character used to denote the end of a token 
private	TokenNameprivate	
char	TokenNamechar	
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A resource containing properties, each of which is interpreted * as a token/value pair. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A resource containing properties, each of which is interpreted as a token/value pair. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setPropertiesResource	TokenNameIdentifier	 set Properties Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
makeTokensFromProperties	TokenNameIdentifier	 make Tokens From Properties
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a token element to the map of tokens to replace. * * @param token The token to add to the map of replacements. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a token element to the map of tokens to replace. * @param token The token to add to the map of replacements. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredToken	TokenNameIdentifier	 add Configured Token
(	TokenNameLPAREN	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns properties from a specified properties file. * * @param fileName The file to load properties from. */	TokenNameCOMMENT_JAVADOC	 Returns properties from a specified properties file. * @param fileName The file to load properties from. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the map of tokens to replace. * * @param hash A map (String->String) of token keys to replacement * values. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the map of tokens to replace. * @param hash A map (String->String) of token keys to replacement values. Must not be <code>null</code>. 
private	TokenNameprivate	
void	TokenNamevoid	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the map of tokens which will be replaced. * * @return a map (String->String) of token keys to replacement * values */	TokenNameCOMMENT_JAVADOC	 Returns the map of tokens which will be replaced. * @return a map (String->String) of token keys to replacement values 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ReplaceTokens using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new ReplaceTokens using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReplaceTokens	TokenNameIdentifier	 Replace Tokens
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
ReplaceTokens	TokenNameIdentifier	 Replace Tokens
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes tokens and loads the replacee-replacer hashtable. */	TokenNameCOMMENT_JAVADOC	 Initializes tokens and loads the replacee-replacer hashtable. 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"tokenchar"	TokenNameStringLiteral	tokenchar
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"begintoken"	TokenNameStringLiteral	begintoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Begin token cannot "	TokenNameStringLiteral	Begin token cannot 
+	TokenNamePLUS	
"be empty"	TokenNameStringLiteral	be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beginToken	TokenNameIdentifier	 begin Token
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"endtoken"	TokenNameStringLiteral	endtoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"End token cannot "	TokenNameStringLiteral	End token cannot 
+	TokenNamePLUS	
"be empty"	TokenNameStringLiteral	be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"propertiesfile"	TokenNameStringLiteral	propertiesfile
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
makeTokensFromProperties	TokenNameIdentifier	 make Tokens From Properties
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeTokensFromProperties	TokenNameIdentifier	 make Tokens From Properties
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holds a token */	TokenNameCOMMENT_JAVADOC	 Holds a token 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Token	TokenNameIdentifier	 Token
{	TokenNameLBRACE	
/** Token key */	TokenNameCOMMENT_JAVADOC	 Token key 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
/** Token value */	TokenNameCOMMENT_JAVADOC	 Token value 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Sets the token key * * @param key The key for this token. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the token key * @param key The key for this token. Must not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setKey	TokenNameIdentifier	 set Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the token value * * @param value The value for this token. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the token value * @param value The value for this token. Must not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the key for this token. * * @return the key for this token */	TokenNameCOMMENT_JAVADOC	 Returns the key for this token. * @return the key for this token 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value for this token. * * @return the value for this token */	TokenNameCOMMENT_JAVADOC	 Returns the value for this token. * @return the value for this token 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

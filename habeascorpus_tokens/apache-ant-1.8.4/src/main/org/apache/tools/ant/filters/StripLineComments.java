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
Vector	TokenNameIdentifier	 Vector
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
/** * This filter strips line comments. * * Example: * * <pre>&lt;striplinecomments&gt; * &lt;comment value=&quot;#&quot;/&gt; * &lt;comment value=&quot;--&quot;/&gt; * &lt;comment value=&quot;REM &quot;/&gt; * &lt;comment value=&quot;rem &quot;/&gt; * &lt;comment value=&quot;//&quot;/&gt; * &lt;/striplinecomments&gt;</pre> * * Or: * * <pre>&lt;filterreader * classname=&quot;org.apache.tools.ant.filters.StripLineComments&quot;&gt; * &lt;param type=&quot;comment&quot; value="#&quot;/&gt; * &lt;param type=&quot;comment&quot; value=&quot;--&quot;/&gt; * &lt;param type=&quot;comment&quot; value=&quot;REM &quot;/&gt; * &lt;param type=&quot;comment&quot; value=&quot;rem &quot;/&gt; * &lt;param type=&quot;comment&quot; value=&quot;//&quot;/&gt; * &lt;/filterreader&gt;</pre> * */	TokenNameCOMMENT_JAVADOC	 This filter strips line comments. * Example: * <pre>&lt;striplinecomments&gt; &lt;comment value=&quot;#&quot;/&gt; &lt;comment value=&quot;--&quot;/&gt; &lt;comment value=&quot;REM &quot;/&gt; &lt;comment value=&quot;rem &quot;/&gt; &lt;comment value=&quot;//&quot;/&gt; &lt;/striplinecomments&gt;</pre> * Or: * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.StripLineComments&quot;&gt; &lt;param type=&quot;comment&quot; value="#&quot;/&gt; &lt;param type=&quot;comment&quot; value=&quot;--&quot;/&gt; &lt;param type=&quot;comment&quot; value=&quot;REM &quot;/&gt; &lt;param type=&quot;comment&quot; value=&quot;rem &quot;/&gt; &lt;param type=&quot;comment&quot; value=&quot;//&quot;/&gt; &lt;/filterreader&gt;</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StripLineComments	TokenNameIdentifier	 Strip Line Comments
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** Parameter name for the comment prefix. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the comment prefix. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMENTS_KEY	TokenNameIdentifier	 COMMENTS  KEY
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
;	TokenNameSEMICOLON	
/** Vector that holds the comment prefixes. */	TokenNameCOMMENT_JAVADOC	 Vector that holds the comment prefixes. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
comments	TokenNameIdentifier	 comments
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The line that has been read ahead. */	TokenNameCOMMENT_JAVADOC	 The line that has been read ahead. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
StripLineComments	TokenNameIdentifier	 Strip Line Comments
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
StripLineComments	TokenNameIdentifier	 Strip Line Comments
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
/** * Returns the next character in the filtered stream, only including * lines from the original stream which don't start with any of the * specified comment prefixes. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream, only including lines from the original stream which don't start with any of the specified comment prefixes. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
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
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
commentsSize	TokenNameIdentifier	 comments Size
=	TokenNameEQUAL	
comments	TokenNameIdentifier	 comments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
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
commentsSize	TokenNameIdentifier	 comments Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
comments	TokenNameIdentifier	 comments
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// line started with comment 	TokenNameCOMMENT_LINE	line started with comment 
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a <code>comment</code> element to the list of prefixes. * * @param comment The <code>comment</code> element to add to the * list of comment prefixes to strip. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a <code>comment</code> element to the list of prefixes. * @param comment The <code>comment</code> element to add to the list of comment prefixes to strip. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredComment	TokenNameIdentifier	 add Configured Comment
(	TokenNameLPAREN	
final	TokenNamefinal	
Comment	TokenNameIdentifier	 Comment
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comments	TokenNameIdentifier	 comments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the list of comment prefixes to strip. * * @param comments A list of strings, each of which is a prefix * for a comment line. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the list of comment prefixes to strip. * @param comments A list of strings, each of which is a prefix for a comment line. Must not be <code>null</code>. 
private	TokenNameprivate	
void	TokenNamevoid	
setComments	TokenNameIdentifier	 set Comments
(	TokenNameLPAREN	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
comments	TokenNameIdentifier	 comments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comments	TokenNameIdentifier	 comments
=	TokenNameEQUAL	
comments	TokenNameIdentifier	 comments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of comment prefixes to strip. * * @return the list of comment prefixes to strip. */	TokenNameCOMMENT_JAVADOC	 Returns the list of comment prefixes to strip. * @return the list of comment prefixes to strip. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
getComments	TokenNameIdentifier	 get Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comments	TokenNameIdentifier	 comments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new StripLineComments using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new StripLineComments using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StripLineComments	TokenNameIdentifier	 Strip Line Comments
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
StripLineComments	TokenNameIdentifier	 Strip Line Comments
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setComments	TokenNameIdentifier	 set Comments
(	TokenNameLPAREN	
getComments	TokenNameIdentifier	 get Comments
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
/** * Parses the parameters to set the comment prefixes. */	TokenNameCOMMENT_JAVADOC	 Parses the parameters to set the comment prefixes. 
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
COMMENTS_KEY	TokenNameIdentifier	 COMMENTS  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comments	TokenNameIdentifier	 comments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The class that holds a comment representation. */	TokenNameCOMMENT_JAVADOC	 The class that holds a comment representation. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Comment	TokenNameIdentifier	 Comment
{	TokenNameLBRACE	
/** The prefix for a line comment. */	TokenNameCOMMENT_JAVADOC	 The prefix for a line comment. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Sets the prefix for this type of line comment. * * @param comment The prefix for a line comment of this type. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the prefix for this type of line comment. * @param comment The prefix for a line comment of this type. Must not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Comment value already set."	TokenNameStringLiteral	Comment value already set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the prefix for this type of line comment. * * @return the prefix for this type of line comment. */	TokenNameCOMMENT_JAVADOC	 Returns the prefix for this type of line comment. * @return the prefix for this type of line comment. 
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
/** * Alt. syntax to set the prefix for this type of line comment. * * @param comment The prefix for a line comment of this type. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Alt. syntax to set the prefix for this type of line comment. * @param comment The prefix for a line comment of this type. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

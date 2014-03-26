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
LineTokenizer	TokenNameIdentifier	 Line Tokenizer
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
/** * Reads the first <code>n</code> lines of a stream. * (Default is first 10 lines.) * <p> * Example: * <pre>&lt;headfilter lines=&quot;3&quot;/&gt;</pre> * Or: * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.HeadFilter&quot;&gt; * &lt;param name=&quot;lines&quot; value=&quot;3&quot;/&gt; * &lt;/filterreader&gt;</pre> * */	TokenNameCOMMENT_JAVADOC	 Reads the first <code>n</code> lines of a stream. (Default is first 10 lines.) <p> Example: <pre>&lt;headfilter lines=&quot;3&quot;/&gt;</pre> Or: <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.HeadFilter&quot;&gt; &lt;param name=&quot;lines&quot; value=&quot;3&quot;/&gt; &lt;/filterreader&gt;</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
HeadFilter	TokenNameIdentifier	 Head Filter
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** Parameter name for the number of lines to be returned. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the number of lines to be returned. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LINES_KEY	TokenNameIdentifier	 LINES  KEY
=	TokenNameEQUAL	
"lines"	TokenNameStringLiteral	lines
;	TokenNameSEMICOLON	
/** Parameter name for the number of lines to be skipped. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the number of lines to be skipped. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SKIP_KEY	TokenNameIdentifier	 SKIP  KEY
=	TokenNameEQUAL	
"skip"	TokenNameStringLiteral	skip
;	TokenNameSEMICOLON	
/** Number of lines currently read in. */	TokenNameCOMMENT_JAVADOC	 Number of lines currently read in. 
private	TokenNameprivate	
long	TokenNamelong	
linesRead	TokenNameIdentifier	 lines Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default number of lines to show */	TokenNameCOMMENT_JAVADOC	 Default number of lines to show 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_NUM_LINES	TokenNameIdentifier	 DEFAULT  NUM  LINES
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Number of lines to be returned in the filtered stream. */	TokenNameCOMMENT_JAVADOC	 Number of lines to be returned in the filtered stream. 
private	TokenNameprivate	
long	TokenNamelong	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
DEFAULT_NUM_LINES	TokenNameIdentifier	 DEFAULT  NUM  LINES
;	TokenNameSEMICOLON	
/** Number of lines to be skipped. */	TokenNameCOMMENT_JAVADOC	 Number of lines to be skipped. 
private	TokenNameprivate	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** A line tokenizer */	TokenNameCOMMENT_JAVADOC	 A line tokenizer 
private	TokenNameprivate	
LineTokenizer	TokenNameIdentifier	 Line Tokenizer
lineTokenizer	TokenNameIdentifier	 line Tokenizer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the current line from the input stream */	TokenNameCOMMENT_JAVADOC	 the current line from the input stream 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the position in the current line */	TokenNameCOMMENT_JAVADOC	 the position in the current line 
private	TokenNameprivate	
int	TokenNameint	
linePos	TokenNameIdentifier	 line Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Whether this filter is finished */	TokenNameCOMMENT_JAVADOC	 Whether this filter is finished 
private	TokenNameprivate	
boolean	TokenNameboolean	
eof	TokenNameIdentifier	 eof
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
HeadFilter	TokenNameIdentifier	 Head Filter
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
HeadFilter	TokenNameIdentifier	 Head Filter
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
lineTokenizer	TokenNameIdentifier	 line Tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
LineTokenizer	TokenNameIdentifier	 Line Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineTokenizer	TokenNameIdentifier	 line Tokenizer
.	TokenNameDOT	
setIncludeDelims	TokenNameIdentifier	 set Include Delims
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next character in the filtered stream. If the desired * number of lines have already been read, the resulting stream is * effectively at an end. Otherwise, the next character from the * underlying stream is read and returned. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream. If the desired number of lines have already been read, the resulting stream is effectively at an end. Otherwise, the next character from the underlying stream is read and returned. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
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
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lineTokenizer	TokenNameIdentifier	 line Tokenizer
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
headFilter	TokenNameIdentifier	 head Filter
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eof	TokenNameIdentifier	 eof
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
linePos	TokenNameIdentifier	 line Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
linePos	TokenNameIdentifier	 line Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
linePos	TokenNameIdentifier	 line Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linePos	TokenNameIdentifier	 line Pos
==	TokenNameEQUAL_EQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of lines to be returned in the filtered stream. * * @param lines the number of lines to be returned in the filtered stream */	TokenNameCOMMENT_JAVADOC	 Sets the number of lines to be returned in the filtered stream. * @param lines the number of lines to be returned in the filtered stream 
public	TokenNamepublic	
void	TokenNamevoid	
setLines	TokenNameIdentifier	 set Lines
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
lines	TokenNameIdentifier	 lines
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of lines to be returned in the filtered stream. * * @return the number of lines to be returned in the filtered stream */	TokenNameCOMMENT_JAVADOC	 Returns the number of lines to be returned in the filtered stream. * @return the number of lines to be returned in the filtered stream 
private	TokenNameprivate	
long	TokenNamelong	
getLines	TokenNameIdentifier	 get Lines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lines	TokenNameIdentifier	 lines
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of lines to be skipped in the filtered stream. * * @param skip the number of lines to be skipped in the filtered stream */	TokenNameCOMMENT_JAVADOC	 Sets the number of lines to be skipped in the filtered stream. * @param skip the number of lines to be skipped in the filtered stream 
public	TokenNamepublic	
void	TokenNamevoid	
setSkip	TokenNameIdentifier	 set Skip
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of lines to be skipped in the filtered stream. * * @return the number of lines to be skipped in the filtered stream */	TokenNameCOMMENT_JAVADOC	 Returns the number of lines to be skipped in the filtered stream. * @return the number of lines to be skipped in the filtered stream 
private	TokenNameprivate	
long	TokenNamelong	
getSkip	TokenNameIdentifier	 get Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new HeadFilter using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new HeadFilter using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HeadFilter	TokenNameIdentifier	 Head Filter
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
HeadFilter	TokenNameIdentifier	 Head Filter
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setLines	TokenNameIdentifier	 set Lines
(	TokenNameLPAREN	
getLines	TokenNameIdentifier	 get Lines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setSkip	TokenNameIdentifier	 set Skip
(	TokenNameLPAREN	
getSkip	TokenNameIdentifier	 get Skip
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
/** * Scans the parameters list for the "lines" parameter and uses * it to set the number of lines to be returned in the filtered stream. * also scan for skip parameter. */	TokenNameCOMMENT_JAVADOC	 Scans the parameters list for the "lines" parameter and uses it to set the number of lines to be returned in the filtered stream. also scan for skip parameter. 
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
LINES_KEY	TokenNameIdentifier	 LINES  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
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
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SKIP_KEY	TokenNameIdentifier	 SKIP  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
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
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * implements a head filter on the input stream */	TokenNameCOMMENT_JAVADOC	 implements a head filter on the input stream 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
headFilter	TokenNameIdentifier	 head Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
linesRead	TokenNameIdentifier	 lines Read
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
linesRead	TokenNameIdentifier	 lines Read
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
linesRead	TokenNameIdentifier	 lines Read
>	TokenNameGREATER	
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
+	TokenNamePLUS	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
util	TokenNameIdentifier	 util
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
ProjectComponent	TokenNameIdentifier	 Project Component
;	TokenNameSEMICOLON	
/** * Class to tokenize the input as areas separated * by white space, or by a specified list of * delim characters. Behaves like java.util.StringTokenizer. * If the stream starts with delim characters, the first * token will be an empty string (unless the treat delims * as tokens flag is set). * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Class to tokenize the input as areas separated by white space, or by a specified list of delim characters. Behaves like java.util.StringTokenizer. If the stream starts with delim characters, the first token will be an empty string (unless the treat delims as tokens flag is set). @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NOT_A_CHAR	TokenNameIdentifier	 NOT  A  CHAR
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
intraString	TokenNameIdentifier	 intra String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
NOT_A_CHAR	TokenNameIdentifier	 NOT  A  CHAR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
delims	TokenNameIdentifier	 delims
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
delimsAreTokens	TokenNameIdentifier	 delims Are Tokens
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
suppressDelims	TokenNameIdentifier	 suppress Delims
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeDelims	TokenNameIdentifier	 include Delims
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * attribute delims - the delimiter characters * @param delims a string containing the delimiter characters */	TokenNameCOMMENT_JAVADOC	 attribute delims - the delimiter characters @param delims a string containing the delimiter characters 
public	TokenNamepublic	
void	TokenNamevoid	
setDelims	TokenNameIdentifier	 set Delims
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
delims	TokenNameIdentifier	 delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delims	TokenNameIdentifier	 delims
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
resolveBackSlash	TokenNameIdentifier	 resolve Back Slash
(	TokenNameLPAREN	
delims	TokenNameIdentifier	 delims
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * attribute delimsaretokens - treat delimiters as * separate tokens. * @param delimsAreTokens true if delimiters are to be separate */	TokenNameCOMMENT_JAVADOC	 attribute delimsaretokens - treat delimiters as separate tokens. @param delimsAreTokens true if delimiters are to be separate 
public	TokenNamepublic	
void	TokenNamevoid	
setDelimsAreTokens	TokenNameIdentifier	 set Delims Are Tokens
(	TokenNameLPAREN	
boolean	TokenNameboolean	
delimsAreTokens	TokenNameIdentifier	 delims Are Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delimsAreTokens	TokenNameIdentifier	 delims Are Tokens
=	TokenNameEQUAL	
delimsAreTokens	TokenNameIdentifier	 delims Are Tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * attribute suppressdelims - suppress delimiters. * default - false * @param suppressDelims if true do not report delimiters */	TokenNameCOMMENT_JAVADOC	 attribute suppressdelims - suppress delimiters. default - false @param suppressDelims if true do not report delimiters 
public	TokenNamepublic	
void	TokenNamevoid	
setSuppressDelims	TokenNameIdentifier	 set Suppress Delims
(	TokenNameLPAREN	
boolean	TokenNameboolean	
suppressDelims	TokenNameIdentifier	 suppress Delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suppressDelims	TokenNameIdentifier	 suppress Delims
=	TokenNameEQUAL	
suppressDelims	TokenNameIdentifier	 suppress Delims
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * attribute includedelims - treat delimiters as part * of the token. * default - false * @param includeDelims if true add delimiters to the token */	TokenNameCOMMENT_JAVADOC	 attribute includedelims - treat delimiters as part of the token. default - false @param includeDelims if true add delimiters to the token 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludeDelims	TokenNameIdentifier	 set Include Delims
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeDelims	TokenNameIdentifier	 include Delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeDelims	TokenNameIdentifier	 include Delims
=	TokenNameEQUAL	
includeDelims	TokenNameIdentifier	 include Delims
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * find and return the next token * * @param in the input stream * @return the token * @exception IOException if an error occurs reading */	TokenNameCOMMENT_JAVADOC	 find and return the next token * @param in the input stream @return the token @exception IOException if an error occurs reading 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pushed	TokenNameIdentifier	 pushed
!=	TokenNameNOT_EQUAL	
NOT_A_CHAR	TokenNameIdentifier	 NOT  A  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
NOT_A_CHAR	TokenNameIdentifier	 NOT  A  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
inToken	TokenNameIdentifier	 in Token
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
intraString	TokenNameIdentifier	 intra String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
padding	TokenNameIdentifier	 padding
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDelim	TokenNameIdentifier	 is Delim
=	TokenNameEQUAL	
isDelim	TokenNameIdentifier	 is Delim
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inToken	TokenNameIdentifier	 in Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDelim	TokenNameIdentifier	 is Delim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delimsAreTokens	TokenNameIdentifier	 delims Are Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
padding	TokenNameIdentifier	 padding
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inToken	TokenNameIdentifier	 in Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDelim	TokenNameIdentifier	 is Delim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
padding	TokenNameIdentifier	 padding
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
intraString	TokenNameIdentifier	 intra String
=	TokenNameEQUAL	
padding	TokenNameIdentifier	 padding
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeDelims	TokenNameIdentifier	 include Delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intraString	TokenNameIdentifier	 intra String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the intratoken string */	TokenNameCOMMENT_JAVADOC	 @return the intratoken string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPostToken	TokenNameIdentifier	 get Post Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suppressDelims	TokenNameIdentifier	 suppress Delims
||	TokenNameOR_OR	
includeDelims	TokenNameIdentifier	 include Delims
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
intraString	TokenNameIdentifier	 intra String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isDelim	TokenNameIdentifier	 is Delim
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delims	TokenNameIdentifier	 delims
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
delims	TokenNameIdentifier	 delims
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delims	TokenNameIdentifier	 delims
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

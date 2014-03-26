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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
/** * class to tokenize the input as lines seperated * by \r (mac style), \r\n (dos/windows style) or \n (unix style) * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 class to tokenize the input as lines seperated by \r (mac style), \r\n (dos/windows style) or \n (unix style) @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
LineTokenizer	TokenNameIdentifier	 Line Tokenizer
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
lineEnd	TokenNameIdentifier	 line End
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
boolean	TokenNameboolean	
includeDelims	TokenNameIdentifier	 include Delims
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * attribute includedelims - whether to include * the line ending with the line, or to return * it in the posttoken * default false * @param includeDelims if true include /r and /n in the line */	TokenNameCOMMENT_JAVADOC	 attribute includedelims - whether to include the line ending with the line, or to return it in the posttoken default false @param includeDelims if true include /r and /n in the line 
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
/** * get the next line from the input * * @param in the input reader * @return the line excluding /r or /n, unless includedelims is set * @exception IOException if an error occurs reading */	TokenNameCOMMENT_JAVADOC	 get the next line from the input * @param in the input reader @return the line excluding /r or /n, unless includedelims is set @exception IOException if an error occurs reading 
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
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includeDelims	TokenNameIdentifier	 include Delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lineEnd	TokenNameIdentifier	 line End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the line ending character(s) for the current line */	TokenNameCOMMENT_JAVADOC	 @return the line ending character(s) for the current line 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPostToken	TokenNameIdentifier	 get Post Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includeDelims	TokenNameIdentifier	 include Delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lineEnd	TokenNameIdentifier	 line End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

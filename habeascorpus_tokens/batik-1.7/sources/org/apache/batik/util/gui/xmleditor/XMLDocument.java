/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
xmleditor	TokenNameIdentifier	 xmleditor
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributeSet	TokenNameIdentifier	 Attribute Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
PlainDocument	TokenNameIdentifier	 Plain Document
;	TokenNameSEMICOLON	
/** * A document that can be marked up using XML style. * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 A document that can be marked up using XML style. * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
XMLDocument	TokenNameIdentifier	 XML Document
extends	TokenNameextends	
PlainDocument	TokenNameIdentifier	 Plain Document
{	TokenNameLBRACE	
protected	TokenNameprotected	
XMLScanner	TokenNameIdentifier	 XML Scanner
lexer	TokenNameIdentifier	 lexer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLToken	TokenNameIdentifier	 XML Token
cacheToken	TokenNameIdentifier	 cache Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XMLDocument	TokenNameIdentifier	 XML Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
XMLContext	TokenNameIdentifier	 XML Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a new instance of XMLDocument * @param context XMLContext */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of XMLDocument @param context XMLContext 
public	TokenNamepublic	
XMLDocument	TokenNameIdentifier	 XML Document
(	TokenNameLPAREN	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//super(context); 	TokenNameCOMMENT_LINE	super(context); 
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
lexer	TokenNameIdentifier	 lexer
=	TokenNameEQUAL	
new	TokenNamenew	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return XMLToken * @param pos position * @return XMLToken */	TokenNameCOMMENT_JAVADOC	 Return XMLToken @param pos position @return XMLToken 
public	TokenNamepublic	
XMLToken	TokenNameIdentifier	 XML Token
getScannerStart	TokenNameIdentifier	 get Scanner Start
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
CHARACTER_DATA_CONTEXT	TokenNameIdentifier	 CHARACTER  DATA  CONTEXT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tokenOffset	TokenNameIdentifier	 token Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheToken	TokenNameIdentifier	 cache Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
cacheToken	TokenNameIdentifier	 cache Token
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
cacheToken	TokenNameIdentifier	 cache Token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenOffset	TokenNameIdentifier	 token Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
getDefaultRootElement	TokenNameIdentifier	 get Default Root Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
line1	TokenNameIdentifier	 line1
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getElementIndex	TokenNameIdentifier	 get Element Index
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
line2	TokenNameIdentifier	 line2
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getElementIndex	TokenNameIdentifier	 get Element Index
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if (pos - offset <= 1800 ) { 	TokenNameCOMMENT_LINE	if (pos - offset <= 1800 ) { 
if	TokenNameif	
(	TokenNameLPAREN	
line1	TokenNameIdentifier	 line1
-	TokenNameMINUS	
line2	TokenNameIdentifier	 line2
<	TokenNameLESS	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cacheToken	TokenNameIdentifier	 cache Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read until pos 	TokenNameCOMMENT_LINE	read until pos 
int	TokenNameint	
lastCtx	TokenNameIdentifier	 last Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
int	TokenNameint	
lastOffset	TokenNameIdentifier	 last Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastOffset	TokenNameIdentifier	 last Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
lastCtx	TokenNameIdentifier	 last Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
+	TokenNamePLUS	
tokenOffset	TokenNameIdentifier	 token Offset
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
getScanValue	TokenNameIdentifier	 get Scan Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cacheToken	TokenNameIdentifier	 cache Token
=	TokenNameEQUAL	
new	TokenNamenew	
XMLToken	TokenNameIdentifier	 XML Token
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
,	TokenNameCOMMA	
lastOffset	TokenNameIdentifier	 last Offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cacheToken	TokenNameIdentifier	 cache Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
insertString	TokenNameIdentifier	 insert String
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
AttributeSet	TokenNameIdentifier	 Attribute Set
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
insertString	TokenNameIdentifier	 insert String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheToken	TokenNameIdentifier	 cache Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
offs	TokenNameIdentifier	 offs
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
offs	TokenNameIdentifier	 offs
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cacheToken	TokenNameIdentifier	 cache Token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
offs	TokenNameIdentifier	 offs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheToken	TokenNameIdentifier	 cache Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Find the first occurrence of the specified String starting at the specified index. * @param str String to find * @param fromIndex * @param caseSensitive true or false * @return the offset if the string argument occurs as a substring, otherwise return -1 * @throws BadLocationException if fromIndex was not a valid part of the document */	TokenNameCOMMENT_JAVADOC	 Find the first occurrence of the specified String starting at the specified index. @param str String to find @param fromIndex @param caseSensitive true or false @return the offset if the string argument occurs as a substring, otherwise return -1 @throws BadLocationException if fromIndex was not a valid part of the document 
public	TokenNamepublic	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
rootElement	TokenNameIdentifier	 root Element
=	TokenNameEQUAL	
getDefaultRootElement	TokenNameIdentifier	 get Default Root Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elementIndex	TokenNameIdentifier	 element Index
=	TokenNameEQUAL	
rootElement	TokenNameIdentifier	 root Element
.	TokenNameDOT	
getElementIndex	TokenNameIdentifier	 get Element Index
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elementIndex	TokenNameIdentifier	 element Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set the initial charIndex 	TokenNameCOMMENT_LINE	set the initial charIndex 
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
fromIndex	TokenNameIdentifier	 from Index
-	TokenNameMINUS	
rootElement	TokenNameIdentifier	 root Element
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
elementIndex	TokenNameIdentifier	 element Index
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
elementIndex	TokenNameIdentifier	 element Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
rootElement	TokenNameIdentifier	 root Element
.	TokenNameDOT	
getElementCount	TokenNameIdentifier	 get Element Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
rootElement	TokenNameIdentifier	 root Element
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
charIndex	TokenNameIdentifier	 char Index
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// reset the charIndex 	TokenNameCOMMENT_LINE	reset the charIndex 
}	TokenNameRBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

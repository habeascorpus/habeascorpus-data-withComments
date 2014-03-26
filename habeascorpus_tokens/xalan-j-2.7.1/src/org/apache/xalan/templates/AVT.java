/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AVT.java 469221 2006-10-30 18:26:44Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AVT.java 469221 2006-10-30 18:26:44Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
/** * Class to hold an Attribute Value Template. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Class to hold an Attribute Value Template. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
AVT	TokenNameIdentifier	 AVT
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
XSLTVisitable	TokenNameIdentifier	 XSLT Visitable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5167607155517042691L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** *We are not going to use the object pool if USE_OBJECT_POOL == false. */	TokenNameCOMMENT_JAVADOC	 *We are not going to use the object pool if USE_OBJECT_POOL == false. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * INIT_BUFFER_CHUNK_BITS is used to set initial size of * of the char m_array in FastStringBuffer if USE_OBJECT_POOL == false. * size = 2^ INIT_BUFFER_CHUNK_BITS, INIT_BUFFER_CHUNK_BITS = 7 * corresponds size = 256. */	TokenNameCOMMENT_JAVADOC	 INIT_BUFFER_CHUNK_BITS is used to set initial size of of the char m_array in FastStringBuffer if USE_OBJECT_POOL == false. size = 2^ INIT_BUFFER_CHUNK_BITS, INIT_BUFFER_CHUNK_BITS = 7 corresponds size = 256. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
INIT_BUFFER_CHUNK_BITS	TokenNameIdentifier	 INIT  BUFFER  CHUNK  BITS
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If the AVT is not complex, just hold the simple string. * @serial */	TokenNameCOMMENT_JAVADOC	 If the AVT is not complex, just hold the simple string. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_simpleString	TokenNameIdentifier	 m simple String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * If the AVT is complex, hold a Vector of AVTParts. * @serial */	TokenNameCOMMENT_JAVADOC	 If the AVT is complex, hold a Vector of AVTParts. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_parts	TokenNameIdentifier	 m parts
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The name of the attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The name of the attribute. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_rawName	TokenNameIdentifier	 m raw Name
;	TokenNameSEMICOLON	
/** * Get the raw name of the attribute, with the prefix unprocessed. * * @return non-null reference to prefixed name. */	TokenNameCOMMENT_JAVADOC	 Get the raw name of the attribute, with the prefix unprocessed. * @return non-null reference to prefixed name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRawName	TokenNameIdentifier	 get Raw Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_rawName	TokenNameIdentifier	 m raw Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the raw name of the attribute, with the prefix unprocessed. * * @param rawName non-null reference to prefixed name. */	TokenNameCOMMENT_JAVADOC	 Get the raw name of the attribute, with the prefix unprocessed. * @param rawName non-null reference to prefixed name. 
public	TokenNamepublic	
void	TokenNamevoid	
setRawName	TokenNameIdentifier	 set Raw Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_rawName	TokenNameIdentifier	 m raw Name
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The name of the attribute. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** * Get the local name of the attribute. * * @return non-null reference to name string. */	TokenNameCOMMENT_JAVADOC	 Get the local name of the attribute. * @return non-null reference to name string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the local name of the attribute. * * @param name non-null reference to name string. */	TokenNameCOMMENT_JAVADOC	 Set the local name of the attribute. * @param name non-null reference to name string. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace URI of the owning attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the owning attribute. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
/** * Get the namespace URI of the attribute. * * @return non-null reference to URI, "" if null namespace. */	TokenNameCOMMENT_JAVADOC	 Get the namespace URI of the attribute. * @return non-null reference to URI, "" if null namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the namespace URI of the attribute. * * @param uri non-null reference to URI, "" if null namespace. */	TokenNameCOMMENT_JAVADOC	 Get the namespace URI of the attribute. * @param uri non-null reference to URI, "" if null namespace. 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_uri	TokenNameIdentifier	 m uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an AVT by parsing the string, and either * constructing a vector of AVTParts, or simply hold * on to the string if the AVT is simple. * * @param handler non-null reference to StylesheetHandler that is constructing. * @param uri non-null reference to URI, "" if null namespace. * @param name non-null reference to name string. * @param rawName prefixed name. * @param stringedValue non-null raw string value. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Construct an AVT by parsing the string, and either constructing a vector of AVTParts, or simply hold on to the string if the AVT is simple. * @param handler non-null reference to StylesheetHandler that is constructing. @param uri non-null reference to URI, "" if null namespace. @param name non-null reference to name string. @param rawName prefixed name. @param stringedValue non-null raw string value. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
stringedValue	TokenNameIdentifier	 stringed Value
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
m_uri	TokenNameIdentifier	 m uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
m_rawName	TokenNameIdentifier	 m raw Name
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
stringedValue	TokenNameIdentifier	 stringed Value
,	TokenNameCOMMA	
"{}"'"	TokenNameStringLiteral	{}"'
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nTokens	TokenNameIdentifier	 n Tokens
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nTokens	TokenNameIdentifier	 n Tokens
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_simpleString	TokenNameIdentifier	 m simple String
=	TokenNameEQUAL	
stringedValue	TokenNameIdentifier	 stringed Value
;	TokenNameSEMICOLON	
// then do the simple thing 	TokenNameCOMMENT_LINE	then do the simple thing 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
exprBuffer	TokenNameIdentifier	 expr Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exprBuffer	TokenNameIdentifier	 expr Buffer
=	TokenNameEQUAL	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exprBuffer	TokenNameIdentifier	 expr Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_parts	TokenNameIdentifier	 m parts
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
nTokens	TokenNameIdentifier	 n Tokens
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// base token 	TokenNameCOMMENT_LINE	base token 
String	TokenNameIdentifier	 String
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// next token 	TokenNameCOMMENT_LINE	next token 
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// if non-null, break from loop 	TokenNameCOMMENT_LINE	if non-null, break from loop 
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
lookahead	TokenNameIdentifier	 lookahead
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
case	TokenNamecase	
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// just keep on going, since we're not in an attribute template 	TokenNameCOMMENT_LINE	just keep on going, since we're not in an attribute template 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Attribute Value Template start 	TokenNameCOMMENT_LINE	Attribute Value Template start 
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Double curlys mean escape to show curly 	TokenNameCOMMENT_LINE	Double curlys mean escape to show curly 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// from switch 	TokenNameCOMMENT_LINE	from switch 
}	TokenNameRBRACE	
/* else if(lookahead.equals("\"") || lookahead.equals("\'")) { // Error. Expressions can not begin with quotes. error = "Expressions can not begin with quotes."; break; // from switch } */	TokenNameCOMMENT_BLOCK	 else if(lookahead.equals("\"") || lookahead.equals("\'")) { // Error. Expressions can not begin with quotes. error = "Expressions can not begin with quotes."; break; // from switch } 
else	TokenNameelse	
{	TokenNameLBRACE	
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
{	TokenNameLBRACE	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
AVTPartSimple	TokenNameIdentifier	 AVT Part Simple
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// String start 	TokenNameCOMMENT_LINE	String start 
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
lookahead	TokenNameIdentifier	 lookahead
;	TokenNameSEMICOLON	
// Consume stuff 'till next quote 	TokenNameCOMMENT_LINE	Consume stuff 'till next quote 
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// What's another curly doing here? 	TokenNameCOMMENT_LINE	What's another curly doing here? 
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_CURLYBRACE	TokenNameIdentifier	 ER  NO  CURLYBRACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Error: Can not have \"{\" within expression."; 	TokenNameCOMMENT_LINE	"Error: Can not have \"{\" within expression."; 
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// breaks out of inner while loop 	TokenNameCOMMENT_LINE	breaks out of inner while loop 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'}'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Proper close of attribute template. 	TokenNameCOMMENT_LINE	Proper close of attribute template. 
// Evaluate the expression. 	TokenNameCOMMENT_LINE	Evaluate the expression. 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
createXPath	TokenNameIdentifier	 create X Path
(	TokenNameLPAREN	
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
AVTPartXPath	TokenNameIdentifier	 AVT Part X Path
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// breaks out of inner while loop 	TokenNameCOMMENT_LINE	breaks out of inner while loop 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// part of the template stuff, just add it. 	TokenNameCOMMENT_LINE	part of the template stuff, just add it. 
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end inner switch 	TokenNameCOMMENT_LINE	end inner switch 
}	TokenNameRBRACE	
// end if lookahead length == 1 	TokenNameCOMMENT_LINE	end if lookahead length == 1 
else	TokenNameelse	
{	TokenNameLBRACE	
// part of the template stuff, just add it. 	TokenNameCOMMENT_LINE	part of the template stuff, just add it. 
exprBuffer	TokenNameIdentifier	 expr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end while(!lookahead.equals("}")) 	TokenNameCOMMENT_LINE	end while(!lookahead.equals("}")) 
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// from inner while loop 	TokenNameCOMMENT_LINE	from inner while loop 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
stringedValue	TokenNameIdentifier	 stringed Value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
{	TokenNameLBRACE	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Double curlys mean escape to show curly 	TokenNameCOMMENT_LINE	Double curlys mean escape to show curly 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// swallow 	TokenNameCOMMENT_LINE	swallow 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Illegal, I think... 	TokenNameCOMMENT_LINE	Illegal, I think... 
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Found \"}\" but no attribute template open!"); 	TokenNameCOMMENT_LINE	"Found \"}\" but no attribute template open!"); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// leave the lookahead to be processed by the next round. 	TokenNameCOMMENT_LINE	leave the lookahead to be processed by the next round. 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Anything else just add to string. 	TokenNameCOMMENT_LINE	Anything else just add to string. 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end switch t 	TokenNameCOMMENT_LINE	end switch t 
}	TokenNameRBRACE	
// end if length == 1 	TokenNameCOMMENT_LINE	end if length == 1 
else	TokenNameelse	
{	TokenNameLBRACE	
// Anything else just add to string. 	TokenNameCOMMENT_LINE	Anything else just add to string. 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Attr Template, "+error); 	TokenNameCOMMENT_LINE	"Attr Template, "+error); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end while(tokenizer.hasMoreTokens()) 	TokenNameCOMMENT_LINE	end while(tokenizer.hasMoreTokens()) 
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
{	TokenNameLBRACE	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
AVTPartSimple	TokenNameIdentifier	 AVT Part Simple
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
exprBuffer	TokenNameIdentifier	 expr Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
exprBuffer	TokenNameIdentifier	 expr Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end else nTokens > 1 	TokenNameCOMMENT_LINE	end else nTokens > 1 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_parts	TokenNameIdentifier	 m parts
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_simpleString	TokenNameIdentifier	 m simple String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Error? 	TokenNameCOMMENT_LINE	Error? 
m_simpleString	TokenNameIdentifier	 m simple String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the AVT as the original string. * * @return The AVT as the original string */	TokenNameCOMMENT_JAVADOC	 Get the AVT as the original string. * @return The AVT as the original string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSimpleString	TokenNameIdentifier	 get Simple String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_simpleString	TokenNameIdentifier	 m simple String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_simpleString	TokenNameIdentifier	 m simple String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_parts	TokenNameIdentifier	 m parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVTPart	TokenNameIdentifier	 AVT Part
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AVTPart	TokenNameIdentifier	 AVT Part
)	TokenNameRPAREN	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
getSimpleString	TokenNameIdentifier	 get Simple String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Evaluate the AVT and return a String. * * @param xctxt Te XPathContext to use to evaluate this. * @param context The current source tree context. * @param nsNode The current namespace context (stylesheet tree context). * * @return The AVT evaluated as a string * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate the AVT and return a String. * @param xctxt Te XPathContext to use to evaluate this. @param context The current source tree context. @param nsNode The current namespace context (stylesheet tree context). * @return The AVT evaluated as a string * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nsNode	TokenNameIdentifier	 ns Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_simpleString	TokenNameIdentifier	 m simple String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_simpleString	TokenNameIdentifier	 m simple String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_parts	TokenNameIdentifier	 m parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVTPart	TokenNameIdentifier	 AVT Part
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AVTPart	TokenNameIdentifier	 AVT Part
)	TokenNameRPAREN	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
nsNode	TokenNameIdentifier	 ns Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test whether the AVT is insensitive to the context in which * it is being evaluated. This is intended to facilitate * compilation of templates, by allowing simple AVTs to be * converted back into strings. * * Currently the only case we recognize is simple strings. * ADDED 9/5/2000 to support compilation experiment * * @return True if the m_simpleString member of this AVT is not null */	TokenNameCOMMENT_JAVADOC	 Test whether the AVT is insensitive to the context in which it is being evaluated. This is intended to facilitate compilation of templates, by allowing simple AVTs to be converted back into strings. * Currently the only case we recognize is simple strings. ADDED 9/5/2000 to support compilation experiment * @return True if the m_simpleString member of this AVT is not null 
public	TokenNamepublic	
boolean	TokenNameboolean	
isContextInsensitive	TokenNameIdentifier	 is Context Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_simpleString	TokenNameIdentifier	 m simple String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_parts	TokenNameIdentifier	 m parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVTPart	TokenNameIdentifier	 AVT Part
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AVTPart	TokenNameIdentifier	 AVT Part
)	TokenNameRPAREN	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_parts	TokenNameIdentifier	 m parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVTPart	TokenNameIdentifier	 AVT Part
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AVTPart	TokenNameIdentifier	 AVT Part
)	TokenNameRPAREN	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see XSLTVisitable#callVisitors(XSLTVisitor) */	TokenNameCOMMENT_JAVADOC	 @see XSLTVisitable#callVisitors(XSLTVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitAVT	TokenNameIdentifier	 visit AVT
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_parts	TokenNameIdentifier	 m parts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AVTPart	TokenNameIdentifier	 AVT Part
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AVTPart	TokenNameIdentifier	 AVT Part
)	TokenNameRPAREN	
m_parts	TokenNameIdentifier	 m parts
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if this AVT is simple */	TokenNameCOMMENT_JAVADOC	 Returns true if this AVT is simple 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_simpleString	TokenNameIdentifier	 m simple String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
USE_OBJECT_POOL	TokenNameIdentifier	 USE  OBJECT  POOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
INIT_BUFFER_CHUNK_BITS	TokenNameIdentifier	 INIT  BUFFER  CHUNK  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLChar	TokenNameIdentifier	 XML Char
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
/** * Implements the entity scanner methods in * the context of XML 1.1. * * @xerces.internal * * @author Michael Glavassevich, IBM * @author Neil Graham, IBM * @version $Id: XML11EntityScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Implements the entity scanner methods in the context of XML 1.1. * @xerces.internal * @author Michael Glavassevich, IBM @author Neil Graham, IBM @version $Id: XML11EntityScanner.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11EntityScanner	TokenNameIdentifier	 XM L11 Entity Scanner
extends	TokenNameextends	
XMLEntityScanner	TokenNameIdentifier	 XML Entity Scanner
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XML11EntityScanner	TokenNameIdentifier	 XM L11 Entity Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// XMLEntityScanner methods 	TokenNameCOMMENT_LINE	XMLEntityScanner methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the next character on the input. * <p> * <strong>Note:</strong> The character is <em>not</em> consumed. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Returns the next character on the input. <p> <strong>Note:</strong> The character is <em>not</em> consumed. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// peek at character 	TokenNameCOMMENT_LINE	peek at character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// return peeked character 	TokenNameCOMMENT_LINE	return peeked character 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0x85	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// peekChar():int 	TokenNameCOMMENT_LINE	peekChar():int 
/** * Returns the next character on the input. * <p> * <strong>Note:</strong> The character is consumed. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Returns the next character on the input. <p> <strong>Note:</strong> The character is consumed. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan character 	TokenNameCOMMENT_LINE	scan character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
cc	TokenNameIdentifier	 cc
!=	TokenNameNOT_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return character that was scanned 	TokenNameCOMMENT_LINE	return character that was scanned 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanChar():int 	TokenNameCOMMENT_LINE	scanChar():int 
/** * Returns a string matching the NMTOKEN production appearing immediately * on the input as a symbol, or null if NMTOKEN Name string is present. * <p> * <strong>Note:</strong> The NMTOKEN characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XML11Char#isXML11Name */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the NMTOKEN production appearing immediately on the input as a symbol, or null if NMTOKEN Name string is present. <p> <strong>Note:</strong> The NMTOKEN characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XML11Char#isXML11Name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanNmtoken	TokenNameIdentifier	 scan Nmtoken
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan nmtoken 	TokenNameCOMMENT_LINE	scan nmtoken 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return nmtoken 	TokenNameCOMMENT_LINE	return nmtoken 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanNmtoken():String 	TokenNameCOMMENT_LINE	scanNmtoken():String 
/** * Returns a string matching the Name production appearing immediately * on the input as a symbol, or null if no Name string is present. * <p> * <strong>Note:</strong> The Name characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XML11Char#isXML11Name * @see org.apache.xerces.util.XML11Char#isXML11NameStart */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the Name production appearing immediately on the input as a symbol, or null if no Name string is present. <p> <strong>Note:</strong> The Name characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XML11Char#isXML11Name @see org.apache.xerces.util.XML11Char#isXML11NameStart 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan name 	TokenNameCOMMENT_LINE	scan name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return name 	TokenNameCOMMENT_LINE	return name 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanName():String 	TokenNameCOMMENT_LINE	scanName():String 
/** * Returns a string matching the NCName production appearing immediately * on the input as a symbol, or null if no NCName string is present. * <p> * <strong>Note:</strong> The NCName characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XML11Char#isXML11NCName * @see org.apache.xerces.util.XML11Char#isXML11NCNameStart */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the NCName production appearing immediately on the input as a symbol, or null if no NCName string is present. <p> <strong>Note:</strong> The NCName characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XML11Char#isXML11NCName @see org.apache.xerces.util.XML11Char#isXML11NCNameStart 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan name 	TokenNameCOMMENT_LINE	scan name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return name 	TokenNameCOMMENT_LINE	return name 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanNCName():String 	TokenNameCOMMENT_LINE	scanNCName():String 
/** * Scans a qualified name from the input, setting the fields of the * QName structure appropriately. * <p> * <strong>Note:</strong> The qualified name characters are consumed. * <p> * <strong>Note:</strong> The strings used to set the values of the * QName structure must be symbols. The SymbolTable can be used for * this purpose. * * @param qname The qualified name structure to fill. * * @return Returns true if a qualified name appeared immediately on * the input and was scanned, false otherwise. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XML11Char#isXML11Name * @see org.apache.xerces.util.XML11Char#isXML11NameStart */	TokenNameCOMMENT_JAVADOC	 Scans a qualified name from the input, setting the fields of the QName structure appropriately. <p> <strong>Note:</strong> The qualified name characters are consumed. <p> <strong>Note:</strong> The strings used to set the values of the QName structure must be symbols. The SymbolTable can be used for this purpose. * @param qname The qualified name structure to fill. * @return Returns true if a qualified name appeared immediately on the input and was scanned, false otherwise. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XML11Char#isXML11Name @see org.apache.xerces.util.XML11Char#isXML11NameStart 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanQName	TokenNameIdentifier	 scan Q Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan qualified name 	TokenNameCOMMENT_LINE	scan qualified name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sawIncompleteSurrogatePair	TokenNameIdentifier	 saw Incomplete Surrogate Pair
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sawIncompleteSurrogatePair	TokenNameIdentifier	 saw Incomplete Surrogate Pair
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sawIncompleteSurrogatePair	TokenNameIdentifier	 saw Incomplete Surrogate Pair
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
prefixLength	TokenNameIdentifier	 prefix Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startLocal	TokenNameIdentifier	 start Local
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
startLocal	TokenNameIdentifier	 start Local
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
startLocal	TokenNameIdentifier	 start Local
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
sawIncompleteSurrogatePair	TokenNameIdentifier	 saw Incomplete Surrogate Pair
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"IllegalQName"	TokenNameStringLiteral	IllegalQName
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanQName(QName):boolean 	TokenNameCOMMENT_LINE	scanQName(QName):boolean 
/** * Scans a range of parsed character data, setting the fields of the * XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of parsed character data. This method may return * before markup due to reaching the end of the input buffer or any * other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param content The content structure to fill. * * @return Returns the next character on the input, if known. This * value may be -1 but this does <em>note</em> designate * end of file. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of parsed character data, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of parsed character data. This method may return before markup due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param content The content structure to fill. * @return Returns the next character on the input, if known. This value may be -1 but this does <em>note</em> designate end of file. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanContent	TokenNameIdentifier	 scan Content
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// inner loop, scanning for content 	TokenNameCOMMENT_LINE	inner loop, scanning for content 
if	TokenNameif	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Content	TokenNameIdentifier	 is XM L11 Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// In internal entities control characters are allowed to appear unescaped. 	TokenNameCOMMENT_LINE	In internal entities control characters are allowed to appear unescaped. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11InternalEntityContent	TokenNameIdentifier	 is XM L11 Internal Entity Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return next character 	TokenNameCOMMENT_LINE	return next character 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// REVISIT: Does this need to be updated to fix the 	TokenNameCOMMENT_LINE	REVISIT: Does this need to be updated to fix the 
// #x0D ^#x0A newline normalization problem? -Ac 	TokenNameCOMMENT_LINE	#x0D ^#x0A newline normalization problem? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanContent(XMLString):int 	TokenNameCOMMENT_LINE	scanContent(XMLString):int 
/** * Scans a range of attribute value data, setting the fields of the * XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of attribute value data. This method may return * before the quote character due to reaching the end of the input * buffer or any other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param quote The quote character that signifies the end of the * attribute value data. * @param content The content structure to fill. * * @return Returns the next character on the input, if known. This * value may be -1 but this does <em>note</em> designate * end of file. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of attribute value data, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of attribute value data. This method may return before the quote character due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param quote The quote character that signifies the end of the attribute value data. @param content The content structure to fill. * @return Returns the next character on the input, if known. This value may be -1 but this does <em>note</em> designate end of file. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
int	TokenNameint	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scan literal value 	TokenNameCOMMENT_LINE	scan literal value 
if	TokenNameif	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Content	TokenNameIdentifier	 is XM L11 Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// In internal entities control characters are allowed to appear unescaped. 	TokenNameCOMMENT_LINE	In internal entities control characters are allowed to appear unescaped. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
&&	TokenNameAND_AND	
!	TokenNameNOT	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11InternalEntityContent	TokenNameIdentifier	 is XM L11 Internal Entity Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return next character 	TokenNameCOMMENT_LINE	return next character 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// NOTE: We don't want to accidentally signal the 	TokenNameCOMMENT_LINE	NOTE: We don't want to accidentally signal the 
// end of the literal if we're expanding an 	TokenNameCOMMENT_LINE	end of the literal if we're expanding an 
// entity appearing in the literal. -Ac 	TokenNameCOMMENT_LINE	entity appearing in the literal. -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanLiteral(int,XMLString):int 	TokenNameCOMMENT_LINE	scanLiteral(int,XMLString):int 
/** * Scans a range of character data up to the specicied delimiter, * setting the fields of the XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This assumes that the internal buffer is * at least the same size, or bigger, than the length of the delimiter * and that the delimiter contains at least one character. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of character data. This method may return before * the delimiter due to reaching the end of the input buffer or any * other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param delimiter The string that signifies the end of the character * data to be scanned. * @param buffer The XMLStringBuffer to fill. * * @return Returns true if there is more data to scan, false otherwise. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of character data up to the specicied delimiter, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This assumes that the internal buffer is at least the same size, or bigger, than the length of the delimiter and that the delimiter contains at least one character. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of character data. This method may return before the delimiter due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param delimiter The string that signifies the end of the character data to be scanned. @param buffer The XMLStringBuffer to fill. * @return Returns true if there is more data to scan, false otherwise. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanData	TokenNameIdentifier	 scan Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
delimLen	TokenNameIdentifier	 delim Len
=	TokenNameEQUAL	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
charAt0	TokenNameIdentifier	 char At0
=	TokenNameEQUAL	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
bNextEntity	TokenNameIdentifier	 b Next Entity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
bNextEntity	TokenNameIdentifier	 b Next Entity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bNextEntity	TokenNameIdentifier	 b Next Entity
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// something must be wrong with the input: e.g., file ends an unterminated comment 	TokenNameCOMMENT_LINE	something must be wrong with the input: e.g., file ends an unterminated comment 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// iterate over buffer looking for delimiter 	TokenNameCOMMENT_LINE	iterate over buffer looking for delimiter 
if	TokenNameif	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
charAt0	TokenNameIdentifier	 char At0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looks like we just hit the delimiter 	TokenNameCOMMENT_LINE	looks like we just hit the delimiter 
int	TokenNameint	
delimOffset	TokenNameIdentifier	 delim Offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
delimLen	TokenNameIdentifier	 delim Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
delimOffset	TokenNameIdentifier	 delim Offset
+	TokenNamePLUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// In external entities control characters cannot appear 	TokenNameCOMMENT_LINE	In external entities control characters cannot appear 
// as literals so do not skip over them. 	TokenNameCOMMENT_LINE	as literals so do not skip over them. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
charAt0	TokenNameIdentifier	 char At0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looks like we just hit the delimiter 	TokenNameCOMMENT_LINE	looks like we just hit the delimiter 
int	TokenNameint	
delimOffset	TokenNameIdentifier	 delim Offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
delimLen	TokenNameIdentifier	 delim Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
delimOffset	TokenNameIdentifier	 delim Offset
+	TokenNamePLUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Control characters are allowed to appear as literals 	TokenNameCOMMENT_LINE	Control characters are allowed to appear as literals 
// in internal entities. 	TokenNameCOMMENT_LINE	in internal entities. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
delimLen	TokenNameIdentifier	 delim Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return true if string was skipped 	TokenNameCOMMENT_LINE	return true if string was skipped 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanData(String,XMLString) 	TokenNameCOMMENT_LINE	scanData(String,XMLString) 
/** * Skips a character appearing immediately on the input. * <p> * <strong>Note:</strong> The character is consumed only if it matches * the specified character. * * @param c The character to skip. * * @return Returns true if the character was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Skips a character appearing immediately on the input. <p> <strong>Note:</strong> The character is consumed only if it matches the specified character. * @param c The character to skip. * @return Returns true if the character was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip character 	TokenNameCOMMENT_LINE	skip character 
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ccc	TokenNameIdentifier	 ccc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ccc	TokenNameIdentifier	 ccc
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ccc	TokenNameIdentifier	 ccc
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// character was not skipped 	TokenNameCOMMENT_LINE	character was not skipped 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipChar(int):boolean 	TokenNameCOMMENT_LINE	skipChar(int):boolean 
/** * Skips space characters appearing immediately on the input. * <p> * <strong>Note:</strong> The characters are consumed only if they are * space characters. * * @return Returns true if at least one space character was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.XMLChar#isSpace * @see org.apache.xerces.util.XML11Char#isXML11Space */	TokenNameCOMMENT_JAVADOC	 Skips space characters appearing immediately on the input. <p> <strong>Note:</strong> The characters are consumed only if they are space characters. * @return Returns true if at least one space character was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.XMLChar#isSpace @see org.apache.xerces.util.XML11Char#isXML11Space 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip spaces 	TokenNameCOMMENT_LINE	skip spaces 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// External -- Match: S + 0x85 + 0x2028, and perform end of line normalization 	TokenNameCOMMENT_LINE	External -- Match: S + 0x85 + 0x2028, and perform end of line normalization 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Space	TokenNameIdentifier	 is XM L11 Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the load change the position to be 1, 	TokenNameCOMMENT_LINE	the load change the position to be 1, 
// need to restore it when entity not changed 	TokenNameCOMMENT_LINE	need to restore it when entity not changed 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Does this need to be updated to fix the 	TokenNameCOMMENT_LINE	REVISIT: Does this need to be updated to fix the 
// #x0D ^#x0A newline normalization problem? -Ac 	TokenNameCOMMENT_LINE	#x0D ^#x0A newline normalization problem? -Ac 
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
cc	TokenNameIdentifier	 cc
!=	TokenNameNOT_EQUAL	
0x85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Space	TokenNameIdentifier	 is XM L11 Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Internal -- Match: S (only) 	TokenNameCOMMENT_LINE	Internal -- Match: S (only) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the load change the position to be 1, 	TokenNameCOMMENT_LINE	the load change the position to be 1, 
// need to restore it when entity not changed 	TokenNameCOMMENT_LINE	need to restore it when entity not changed 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no spaces were found 	TokenNameCOMMENT_LINE	no spaces were found 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipSpaces():boolean 	TokenNameCOMMENT_LINE	skipSpaces():boolean 
/** * Skips the specified string appearing immediately on the input. * <p> * <strong>Note:</strong> The characters are consumed only if they are * space characters. * * @param s The string to skip. * * @return Returns true if the string was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Skips the specified string appearing immediately on the input. <p> <strong>Note:</strong> The characters are consumed only if they are space characters. * @param s The string to skip. * @return Returns true if the string was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip string 	TokenNameCOMMENT_LINE	skip string 
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: Can a string to be skipped cross an 	TokenNameCOMMENT_LINE	REVISIT: Can a string to be skipped cross an 
// entity boundary? -Ac 	TokenNameCOMMENT_LINE	entity boundary? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipString(String):boolean 	TokenNameCOMMENT_LINE	skipString(String):boolean 
}	TokenNameRBRACE	
// class XML11EntityScanner 	TokenNameCOMMENT_LINE	class XML11EntityScanner 

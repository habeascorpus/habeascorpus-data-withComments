/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
svg2svg	TokenNameIdentifier	 svg2svg
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
LexicalUnits	TokenNameIdentifier	 Lexical Units
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLException	TokenNameIdentifier	 XML Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLScanner	TokenNameIdentifier	 XML Scanner
;	TokenNameSEMICOLON	
/** * This class represents an SVG source files pretty-printer. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: PrettyPrinter.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents an SVG source files pretty-printer. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: PrettyPrinter.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PrettyPrinter	TokenNameIdentifier	 Pretty Printer
{	TokenNameLBRACE	
// The doctype options. 	TokenNameCOMMENT_LINE	The doctype options. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCTYPE_CHANGE	TokenNameIdentifier	 DOCTYPE  CHANGE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCTYPE_REMOVE	TokenNameIdentifier	 DOCTYPE  REMOVE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCTYPE_KEEP_UNCHANGED	TokenNameIdentifier	 DOCTYPE  KEEP  UNCHANGED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The document scanner. */	TokenNameCOMMENT_JAVADOC	 The document scanner. 
protected	TokenNameprotected	
XMLScanner	TokenNameIdentifier	 XML Scanner
scanner	TokenNameIdentifier	 scanner
;	TokenNameSEMICOLON	
/** * The output manager. */	TokenNameCOMMENT_JAVADOC	 The output manager. 
protected	TokenNameprotected	
OutputManager	TokenNameIdentifier	 Output Manager
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
/** * The writer used to output the document. */	TokenNameCOMMENT_JAVADOC	 The writer used to output the document. 
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * The error handler. */	TokenNameCOMMENT_JAVADOC	 The error handler. 
protected	TokenNameprotected	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
DEFAULT_ERROR_HANDLER	TokenNameIdentifier	 DEFAULT  ERROR  HANDLER
;	TokenNameSEMICOLON	
/** * The newline characters. */	TokenNameCOMMENT_JAVADOC	 The newline characters. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Whether the output must be formatted. */	TokenNameCOMMENT_JAVADOC	 Whether the output must be formatted. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The tabulation width. */	TokenNameCOMMENT_JAVADOC	 The tabulation width. 
protected	TokenNameprotected	
int	TokenNameint	
tabulationWidth	TokenNameIdentifier	 tabulation Width
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The document width. */	TokenNameCOMMENT_JAVADOC	 The document width. 
protected	TokenNameprotected	
int	TokenNameint	
documentWidth	TokenNameIdentifier	 document Width
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The doctype option. */	TokenNameCOMMENT_JAVADOC	 The doctype option. 
protected	TokenNameprotected	
int	TokenNameint	
doctypeOption	TokenNameIdentifier	 doctype Option
=	TokenNameEQUAL	
DOCTYPE_KEEP_UNCHANGED	TokenNameIdentifier	 DOCTYPE  KEEP  UNCHANGED
;	TokenNameSEMICOLON	
/** * The public id. */	TokenNameCOMMENT_JAVADOC	 The public id. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
/** * The system id. */	TokenNameCOMMENT_JAVADOC	 The system id. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** * The XML declaration. */	TokenNameCOMMENT_JAVADOC	 The XML declaration. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
xmlDeclaration	TokenNameIdentifier	 xml Declaration
;	TokenNameSEMICOLON	
/** * The type of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 The type of the current lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Sets the XML declaration text. */	TokenNameCOMMENT_JAVADOC	 Sets the XML declaration text. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLDeclaration	TokenNameIdentifier	 set XML Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlDeclaration	TokenNameIdentifier	 xml Declaration
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the doctype option. */	TokenNameCOMMENT_JAVADOC	 Sets the doctype option. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeOption	TokenNameIdentifier	 set Doctype Option
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doctypeOption	TokenNameIdentifier	 doctype Option
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the public ID. */	TokenNameCOMMENT_JAVADOC	 Sets the public ID. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the system ID. */	TokenNameCOMMENT_JAVADOC	 Sets the system ID. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the newline characters. */	TokenNameCOMMENT_JAVADOC	 Sets the newline characters. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewline	TokenNameIdentifier	 set Newline
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the newline characters. */	TokenNameCOMMENT_JAVADOC	 Returns the newline characters. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNewline	TokenNameIdentifier	 get Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newline	TokenNameIdentifier	 newline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the format attribute. */	TokenNameCOMMENT_JAVADOC	 Sets the format attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setFormat	TokenNameIdentifier	 set Format
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the output must be formatted. */	TokenNameCOMMENT_JAVADOC	 Returns whether the output must be formatted. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the tabulation width. */	TokenNameCOMMENT_JAVADOC	 Sets the tabulation width. 
public	TokenNamepublic	
void	TokenNamevoid	
setTabulationWidth	TokenNameIdentifier	 set Tabulation Width
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tabulationWidth	TokenNameIdentifier	 tabulation Width
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the tabulation width. */	TokenNameCOMMENT_JAVADOC	 Returns whether the tabulation width. 
public	TokenNamepublic	
int	TokenNameint	
getTabulationWidth	TokenNameIdentifier	 get Tabulation Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tabulationWidth	TokenNameIdentifier	 tabulation Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the document width. */	TokenNameCOMMENT_JAVADOC	 Sets the document width. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentWidth	TokenNameIdentifier	 set Document Width
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
documentWidth	TokenNameIdentifier	 document Width
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the document width. */	TokenNameCOMMENT_JAVADOC	 Returns whether the document width. 
public	TokenNamepublic	
int	TokenNameint	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentWidth	TokenNameIdentifier	 document Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an SVG document from the given reader to the given writer. */	TokenNameCOMMENT_JAVADOC	 Prints an SVG document from the given reader to the given writer. 
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Writer	TokenNameIdentifier	 Writer
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printXMLDecl	TokenNameIdentifier	 print XML Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
misc1	TokenNameIdentifier	 misc1
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printTopSpaces	TokenNameIdentifier	 print Top Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
misc1	TokenNameIdentifier	 misc1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printDoctype	TokenNameIdentifier	 print Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
misc2	TokenNameIdentifier	 misc2
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printTopSpaces	TokenNameIdentifier	 print Top Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
misc2	TokenNameIdentifier	 misc2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printElement	TokenNameIdentifier	 print Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
misc3	TokenNameIdentifier	 misc3
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printTopSpaces	TokenNameIdentifier	 print Top Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
misc3	TokenNameIdentifier	 misc3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLException	TokenNameIdentifier	 XML Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints the XML declaration. */	TokenNameCOMMENT_JAVADOC	 Prints the XML declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printXMLDecl	TokenNameIdentifier	 print XML Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xmlDeclaration	TokenNameIdentifier	 xml Declaration
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
XML_DECL_START	TokenNameIdentifier	 XML  DECL  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
VERSION_IDENTIFIER	TokenNameIdentifier	 VERSION  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
versionDelim	TokenNameIdentifier	 version Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space6	TokenNameIdentifier	 space6
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
encodingDelim	TokenNameIdentifier	 encoding Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space7	TokenNameIdentifier	 space7
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space8	TokenNameIdentifier	 space8
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space9	TokenNameIdentifier	 space9
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
standaloneDelim	TokenNameIdentifier	 standalone Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space10	TokenNameIdentifier	 space10
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENCODING_IDENTIFIER	TokenNameIdentifier	 ENCODING  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space6	TokenNameIdentifier	 space6
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodingDelim	TokenNameIdentifier	 encoding Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space7	TokenNameIdentifier	 space7
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STANDALONE_IDENTIFIER	TokenNameIdentifier	 STANDALONE  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space8	TokenNameIdentifier	 space8
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space9	TokenNameIdentifier	 space9
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
standaloneDelim	TokenNameIdentifier	 standalone Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space10	TokenNameIdentifier	 space10
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"pi.end"	TokenNameStringLiteral	pi.end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printXMLDecl	TokenNameIdentifier	 print XML Decl
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
versionDelim	TokenNameIdentifier	 version Delim
,	TokenNameCOMMA	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
space5	TokenNameIdentifier	 space5
,	TokenNameCOMMA	
space6	TokenNameIdentifier	 space6
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
encodingDelim	TokenNameIdentifier	 encoding Delim
,	TokenNameCOMMA	
space7	TokenNameIdentifier	 space7
,	TokenNameCOMMA	
space8	TokenNameIdentifier	 space8
,	TokenNameCOMMA	
space9	TokenNameIdentifier	 space9
,	TokenNameCOMMA	
standalone	TokenNameIdentifier	 standalone
,	TokenNameCOMMA	
standaloneDelim	TokenNameIdentifier	 standalone Delim
,	TokenNameCOMMA	
space10	TokenNameIdentifier	 space10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
xmlDeclaration	TokenNameIdentifier	 xml Declaration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
XML_DECL_START	TokenNameIdentifier	 XML  DECL  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Skip the XML declaraction. 	TokenNameCOMMENT_LINE	Skip the XML declaraction. 
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
VERSION_IDENTIFIER	TokenNameIdentifier	 VERSION  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENCODING_IDENTIFIER	TokenNameIdentifier	 ENCODING  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STANDALONE_IDENTIFIER	TokenNameIdentifier	 STANDALONE  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"pi.end"	TokenNameStringLiteral	pi.end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints a processing instruction. */	TokenNameCOMMENT_JAVADOC	 Prints a processing instruction. 
protected	TokenNameprotected	
void	TokenNamevoid	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_DATA	TokenNameIdentifier	 PI  DATA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"pi.data"	TokenNameStringLiteral	pi.data
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_END	TokenNameIdentifier	 PI  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"pi.end"	TokenNameStringLiteral	pi.end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the doctype. */	TokenNameCOMMENT_JAVADOC	 Prints the doctype. 
protected	TokenNameprotected	
void	TokenNamevoid	
printDoctype	TokenNameIdentifier	 print Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
doctypeOption	TokenNameIdentifier	 doctype Option
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DOCTYPE_START	TokenNameIdentifier	 DOCTYPE  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
string2Delim	TokenNameIdentifier	 string2 Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
:	TokenNameCOLON	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string2Delim	TokenNameIdentifier	 string2 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
:	TokenNameCOLON	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doctypeOption	TokenNameIdentifier	 doctype Option
==	TokenNameEQUAL_EQUAL	
DOCTYPE_CHANGE	TokenNameIdentifier	 DOCTYPE  CHANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
;	TokenNameSEMICOLON	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string2Delim	TokenNameIdentifier	 string2 Delim
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
;	TokenNameSEMICOLON	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printDoctypeStart	TokenNameIdentifier	 print Doctype Start
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
externalId	TokenNameIdentifier	 external Id
,	TokenNameCOMMA	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
string1	TokenNameIdentifier	 string1
,	TokenNameCOMMA	
string1Delim	TokenNameIdentifier	 string1 Delim
,	TokenNameCOMMA	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
string2	TokenNameIdentifier	 string2
,	TokenNameCOMMA	
string2Delim	TokenNameIdentifier	 string2 Delim
,	TokenNameCOMMA	
space5	TokenNameIdentifier	 space5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LSQUARE_BRACKET	TokenNameIdentifier	 LSQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printParameterEntityReference	TokenNameIdentifier	 print Parameter Entity Reference
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ELEMENT_DECLARATION_START	TokenNameIdentifier	 ELEMENT  DECLARATION  START
:	TokenNameCOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printElementDeclaration	TokenNameIdentifier	 print Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTLIST_START	TokenNameIdentifier	 ATTLIST  START
:	TokenNameCOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printAttlist	TokenNameIdentifier	 print Attlist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NOTATION_START	TokenNameIdentifier	 NOTATION  START
:	TokenNameCOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printNotation	TokenNameIdentifier	 print Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_START	TokenNameIdentifier	 ENTITY  START
:	TokenNameCOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEntityDeclaration	TokenNameIdentifier	 print Entity Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RSQUARE_BRACKET	TokenNameIdentifier	 RSQUARE  BRACKET
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
endSpace	TokenNameIdentifier	 end Space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endSpace	TokenNameIdentifier	 end Space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printDoctypeEnd	TokenNameIdentifier	 print Doctype End
(	TokenNameLPAREN	
endSpace	TokenNameIdentifier	 end Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doctypeOption	TokenNameIdentifier	 doctype Option
==	TokenNameEQUAL_EQUAL	
DOCTYPE_CHANGE	TokenNameIdentifier	 DOCTYPE  CHANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PUBLIC_ID	TokenNameIdentifier	 SVG  PUBLIC  ID
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SYSTEM_ID	TokenNameIdentifier	 SVG  SYSTEM  ID
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
;	TokenNameSEMICOLON	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printDoctypeStart	TokenNameIdentifier	 print Doctype Start
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'g'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
externalId	TokenNameIdentifier	 external Id
,	TokenNameCOMMA	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
string1	TokenNameIdentifier	 string1
,	TokenNameCOMMA	
'"'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
string2	TokenNameIdentifier	 string2
,	TokenNameCOMMA	
'"'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printDoctypeEnd	TokenNameIdentifier	 print Doctype End
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOCTYPE_REMOVE	TokenNameIdentifier	 DOCTYPE  REMOVE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DOCTYPE_START	TokenNameIdentifier	 DOCTYPE  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LSQUARE_BRACKET	TokenNameIdentifier	 LSQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RSQUARE_BRACKET	TokenNameIdentifier	 RSQUARE  BRACKET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints an element. */	TokenNameCOMMENT_JAVADOC	 Prints an element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
printElement	TokenNameIdentifier	 print Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameStr	TokenNameIdentifier	 name Str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attName	TokenNameIdentifier	 att Name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"="	TokenNameStringLiteral	=
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
valueDelim	TokenNameIdentifier	 value Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasEntityRef	TokenNameIdentifier	 has Entity Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
:	TokenNameCOLON	
hasEntityRef	TokenNameIdentifier	 has Entity Ref
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
hasEntityRef	TokenNameIdentifier	 has Entity Ref
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&"	TokenNameStringLiteral	&
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
.	TokenNameDOT	
AttributeInfo	TokenNameIdentifier	 Attribute Info
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
attName	TokenNameIdentifier	 att Name
,	TokenNameCOMMA	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
,	TokenNameCOMMA	
valueDelim	TokenNameIdentifier	 value Delim
,	TokenNameCOMMA	
hasEntityRef	TokenNameIdentifier	 has Entity Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printElementStart	TokenNameIdentifier	 print Element Start
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EMPTY_ELEMENT_END	TokenNameIdentifier	 EMPTY  ELEMENT  END
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printElementEnd	TokenNameIdentifier	 print Element End
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printContent	TokenNameIdentifier	 print Content
(	TokenNameLPAREN	
allowSpaceAtStart	TokenNameIdentifier	 allow Space At Start
(	TokenNameLPAREN	
nameStr	TokenNameIdentifier	 name Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_TAG	TokenNameIdentifier	 END  TAG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end.tag"	TokenNameStringLiteral	end.tag
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printElementEnd	TokenNameIdentifier	 print Element End
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nameStr	TokenNameIdentifier	 name Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
allowSpaceAtStart	TokenNameIdentifier	 allow Space At Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * This would be a real hack for SVG. This should be * driven by a configuration paramater as well as * needing to be really namespace aware... */	TokenNameCOMMENT_JAVADOC	 This would be a real hack for SVG. This should be driven by a configuration paramater as well as needing to be really namespace aware... 
// return !(tagName.equals("tspan")|| 	TokenNameCOMMENT_LINE	return !(tagName.equals("tspan")|| 
// tagName.endsWith(":tspan")); 	TokenNameCOMMENT_LINE	tagName.endsWith(":tspan")); 
}	TokenNameRBRACE	
/** * Prints the content of an element. */	TokenNameCOMMENT_JAVADOC	 Prints the content of an element. 
protected	TokenNameprotected	
void	TokenNamevoid	
printContent	TokenNameIdentifier	 print Content
(	TokenNameLPAREN	
boolean	TokenNameboolean	
spaceAtStart	TokenNameIdentifier	 space At Start
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PI_START	TokenNameIdentifier	 PI  START
:	TokenNameCOLON	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
:	TokenNameCOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacterData	TokenNameIdentifier	 print Character Data
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
spaceAtStart	TokenNameIdentifier	 space At Start
,	TokenNameCOMMA	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spaceAtStart	TokenNameIdentifier	 space At Start
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDATA_START	TokenNameIdentifier	 CDATA  START
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"character.data"	TokenNameStringLiteral	character.data
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCDATASection	TokenNameIdentifier	 print CDATA Section
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SECTION_END	TokenNameIdentifier	 SECTION  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"section.end"	TokenNameStringLiteral	section.end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
spaceAtStart	TokenNameIdentifier	 space At Start
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
START_TAG	TokenNameIdentifier	 START  TAG
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
printElement	TokenNameIdentifier	 print Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spaceAtStart	TokenNameIdentifier	 space At Start
=	TokenNameEQUAL	
allowSpaceAtStart	TokenNameIdentifier	 allow Space At Start
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacterEntityReference	TokenNameIdentifier	 print Character Entity Reference
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
spaceAtStart	TokenNameIdentifier	 space At Start
,	TokenNameCOMMA	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spaceAtStart	TokenNameIdentifier	 space At Start
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printEntityReference	TokenNameIdentifier	 print Entity Reference
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
spaceAtStart	TokenNameIdentifier	 space At Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spaceAtStart	TokenNameIdentifier	 space At Start
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
preceedingSpace	TokenNameIdentifier	 preceeding Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints a notation declaration. */	TokenNameCOMMENT_JAVADOC	 Prints a notation declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printNotation	TokenNameIdentifier	 print Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
string2Delim	TokenNameIdentifier	 string2 Delim
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"notation.definition"	TokenNameStringLiteral	notation.definition
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
:	TokenNameCOLON	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space4	TokenNameIdentifier	 space4
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
string2	TokenNameIdentifier	 string2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string2Delim	TokenNameIdentifier	 string2 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
:	TokenNameCOLON	
externalId	TokenNameIdentifier	 external Id
=	TokenNameEQUAL	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space3	TokenNameIdentifier	 space3
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string1	TokenNameIdentifier	 string1
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
string1Delim	TokenNameIdentifier	 string1 Delim
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space5	TokenNameIdentifier	 space5
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printNotation	TokenNameIdentifier	 print Notation
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
externalId	TokenNameIdentifier	 external Id
,	TokenNameCOMMA	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
string1	TokenNameIdentifier	 string1
,	TokenNameCOMMA	
string1Delim	TokenNameIdentifier	 string1 Delim
,	TokenNameCOMMA	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
string2	TokenNameIdentifier	 string2
,	TokenNameCOMMA	
string2Delim	TokenNameIdentifier	 string2 Delim
,	TokenNameCOMMA	
space5	TokenNameIdentifier	 space5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an ATTLIST declaration. */	TokenNameCOMMENT_JAVADOC	 Prints an ATTLIST declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printAttlist	TokenNameIdentifier	 print Attlist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printAttlistStart	TokenNameIdentifier	 print Attlist Start
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printAttName	TokenNameIdentifier	 print Att Name
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDATA_IDENTIFIER	TokenNameIdentifier	 CDATA  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ID_IDENTIFIER	TokenNameIdentifier	 ID  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDREF_IDENTIFIER	TokenNameIdentifier	 IDREF  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDREFS_IDENTIFIER	TokenNameIdentifier	 IDREFS  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_IDENTIFIER	TokenNameIdentifier	 ENTITY  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITIES_IDENTIFIER	TokenNameIdentifier	 ENTITIES  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKEN_IDENTIFIER	TokenNameIdentifier	 NMTOKEN  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKENS_IDENTIFIER	TokenNameIdentifier	 NMTOKENS  IDENTIFIER
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NOTATION_IDENTIFIER	TokenNameIdentifier	 NOTATION  IDENTIFIER
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"left.brace"	TokenNameStringLiteral	left.brace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
.	TokenNameDOT	
NameInfo	TokenNameIdentifier	 Name Info
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
.	TokenNameDOT	
NameInfo	TokenNameIdentifier	 Name Info
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"right.brace"	TokenNameStringLiteral	right.brace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printEnumeration	TokenNameIdentifier	 print Enumeration
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"nmtoken"	TokenNameStringLiteral	nmtoken
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
.	TokenNameDOT	
NameInfo	TokenNameIdentifier	 Name Info
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"nmtoken"	TokenNameStringLiteral	nmtoken
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OutputManager	TokenNameIdentifier	 Output Manager
.	TokenNameDOT	
NameInfo	TokenNameIdentifier	 Name Info
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"right.brace"	TokenNameStringLiteral	right.brace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printEnumeration	TokenNameIdentifier	 print Enumeration
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"default.decl"	TokenNameStringLiteral	default.decl
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
REQUIRED_IDENTIFIER	TokenNameIdentifier	 REQUIRED  IDENTIFIER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IMPLIED_IDENTIFIER	TokenNameIdentifier	 IMPLIED  IDENTIFIER
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIXED_IDENTIFIER	TokenNameIdentifier	 FIXED  IDENTIFIER
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
printAttlistEnd	TokenNameIdentifier	 print Attlist End
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an entity declaration. */	TokenNameCOMMENT_JAVADOC	 Prints an entity declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printEntityDeclaration	TokenNameIdentifier	 print Entity Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ENTITY"	TokenNameStringLiteral	<!ENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PERCENT	TokenNameIdentifier	 PERCENT
:	TokenNameCOLON	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
char	TokenNamechar	
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringDelimiter	TokenNameIdentifier	 get String Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ""	TokenNameStringLiteral	 "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"" ""	TokenNameStringLiteral	" "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ""	TokenNameStringLiteral	 "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pe	TokenNameIdentifier	 pe
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NDATA_IDENTIFIER	TokenNameIdentifier	 NDATA  IDENTIFIER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"NDATA"	TokenNameStringLiteral	NDATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an element declaration. */	TokenNameCOMMENT_JAVADOC	 Prints an element declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printElementDeclaration	TokenNameIdentifier	 print Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ELEMENT"	TokenNameStringLiteral	<!ELEMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EMPTY_IDENTIFIER	TokenNameIdentifier	 EMPTY  IDENTIFIER
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"EMPTY"	TokenNameStringLiteral	EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ANY_IDENTIFIER	TokenNameIdentifier	 ANY  IDENTIFIER
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"ANY"	TokenNameStringLiteral	ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mixed	TokenNameIdentifier	 mixed
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PCDATA_IDENTIFIER	TokenNameIdentifier	 PCDATA  IDENTIFIER
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"#PCDATA"	TokenNameStringLiteral	#PCDATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
mixed	TokenNameIdentifier	 mixed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
:	TokenNameCOLON	
printChildren	TokenNameIdentifier	 print Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"right.brace"	TokenNameStringLiteral	right.brace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STAR	TokenNameIdentifier	 STAR
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
END_CHAR	TokenNameIdentifier	 END  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the children of an element declaration. */	TokenNameCOMMENT_JAVADOC	 Prints the children of an element declaration. 
protected	TokenNameprotected	
void	TokenNamevoid	
printChildren	TokenNameIdentifier	 print Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
,	TokenNameCOMMA	
XMLException	TokenNameIdentifier	 XML Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid XML"	TokenNameStringLiteral	Invalid XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printChildren	TokenNameIdentifier	 print Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"right.brace"	TokenNameStringLiteral	right.brace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STAR	TokenNameIdentifier	 STAR
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PIPE	TokenNameIdentifier	 PIPE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
op	TokenNameIdentifier	 op
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid XML"	TokenNameStringLiteral	Invalid XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
op	TokenNameIdentifier	 op
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid XML"	TokenNameStringLiteral	Invalid XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current lexical unit value. */	TokenNameCOMMENT_JAVADOC	 Returns the current lexical unit value. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCurrentValue	TokenNameIdentifier	 get Current Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a transcoder exception. */	TokenNameCOMMENT_JAVADOC	 Creates a transcoder exception. 
protected	TokenNameprotected	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

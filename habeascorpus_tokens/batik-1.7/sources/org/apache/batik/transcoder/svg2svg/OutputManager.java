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
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
;	TokenNameSEMICOLON	
/** * This class is responsible of the output of XML constructs. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: OutputManager.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible of the output of XML constructs. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: OutputManager.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
OutputManager	TokenNameIdentifier	 Output Manager
{	TokenNameLBRACE	
/** * The pretty printer. */	TokenNameCOMMENT_JAVADOC	 The pretty printer. 
protected	TokenNameprotected	
PrettyPrinter	TokenNameIdentifier	 Pretty Printer
prettyPrinter	TokenNameIdentifier	 pretty Printer
;	TokenNameSEMICOLON	
/** * The writer used to output the tokens. */	TokenNameCOMMENT_JAVADOC	 The writer used to output the tokens. 
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * The indentation level. */	TokenNameCOMMENT_JAVADOC	 The indentation level. 
protected	TokenNameprotected	
int	TokenNameint	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
/** * The margin. */	TokenNameCOMMENT_JAVADOC	 The margin. 
protected	TokenNameprotected	
StringBuffer	TokenNameIdentifier	 String Buffer
margin	TokenNameIdentifier	 margin
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current line. */	TokenNameCOMMENT_JAVADOC	 The current line. 
protected	TokenNameprotected	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current column. */	TokenNameCOMMENT_JAVADOC	 The current column. 
protected	TokenNameprotected	
int	TokenNameint	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
/** * The xml:space values. */	TokenNameCOMMENT_JAVADOC	 The xml:space values. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
xmlSpace	TokenNameIdentifier	 xml Space
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the next markup can be indented. */	TokenNameCOMMENT_JAVADOC	 Whether the next markup can be indented. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canIndent	TokenNameIdentifier	 can Indent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The elements starting lines. */	TokenNameCOMMENT_JAVADOC	 The elements starting lines. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
startingLines	TokenNameIdentifier	 starting Lines
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the attribute layout must be done on a single line. */	TokenNameCOMMENT_JAVADOC	 Whether the attribute layout must be done on a single line. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
lineAttributes	TokenNameIdentifier	 line Attributes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates a new output manager. * @param pp The PrettyPrinter used for formatting the output. * @param w The Writer to write the output to. */	TokenNameCOMMENT_JAVADOC	 Creates a new output manager. @param pp The PrettyPrinter used for formatting the output. @param w The Writer to write the output to. 
public	TokenNamepublic	
OutputManager	TokenNameIdentifier	 Output Manager
(	TokenNameLPAREN	
PrettyPrinter	TokenNameIdentifier	 Pretty Printer
pp	TokenNameIdentifier	 pp
,	TokenNameCOMMA	
Writer	TokenNameIdentifier	 Writer
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prettyPrinter	TokenNameIdentifier	 pretty Printer
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a single character. */	TokenNameCOMMENT_JAVADOC	 Prints a single character. 
public	TokenNamepublic	
void	TokenNamevoid	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
column	TokenNameIdentifier	 column
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints a newline. */	TokenNameCOMMENT_JAVADOC	 Prints a newline. 
public	TokenNamepublic	
void	TokenNamevoid	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getNewline	TokenNameIdentifier	 get Newline
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
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a string. */	TokenNameCOMMENT_JAVADOC	 Prints a string. 
public	TokenNamepublic	
void	TokenNamevoid	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints a char array. */	TokenNameCOMMENT_JAVADOC	 Prints a char array. 
public	TokenNamepublic	
void	TokenNamevoid	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ca	TokenNameIdentifier	 ca
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints white spaces. * @param text The space text. * @param opt whether the space is optional. */	TokenNameCOMMENT_JAVADOC	 Prints white spaces. @param text The space text. @param opt whether the space is optional. 
public	TokenNamepublic	
void	TokenNamevoid	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints top level white spaces. * @param text The space text. */	TokenNameCOMMENT_JAVADOC	 Prints top level white spaces. @param text The space text. 
public	TokenNamepublic	
void	TokenNamevoid	
printTopSpaces	TokenNameIdentifier	 print Top Spaces
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
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
nl	TokenNameIdentifier	 nl
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints a comment. * @param text The comment text. */	TokenNameCOMMENT_JAVADOC	 Prints a comment. @param text The comment text. 
public	TokenNamepublic	
void	TokenNamevoid	
printComment	TokenNameIdentifier	 print Comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canIndent	TokenNameIdentifier	 can Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
<	TokenNameLESS	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
formatText	TokenNameIdentifier	 format Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
>	TokenNameGREATER	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints an XML declaration. */	TokenNameCOMMENT_JAVADOC	 Prints an XML declaration. 
public	TokenNamepublic	
void	TokenNamevoid	
printXMLDecl	TokenNameIdentifier	 print XML Decl
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
char	TokenNamechar	
versionDelim	TokenNameIdentifier	 version Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space6	TokenNameIdentifier	 space6
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
char	TokenNamechar	
encodingDelim	TokenNameIdentifier	 encoding Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space7	TokenNameIdentifier	 space7
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space8	TokenNameIdentifier	 space8
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space9	TokenNameIdentifier	 space9
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
standalone	TokenNameIdentifier	 standalone
,	TokenNameCOMMA	
char	TokenNamechar	
standaloneDelim	TokenNameIdentifier	 standalone Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space10	TokenNameIdentifier	 space10
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<?xml"	TokenNameStringLiteral	<?xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space3	TokenNameIdentifier	 space3
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
versionDelim	TokenNameIdentifier	 version Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
versionDelim	TokenNameIdentifier	 version Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"encoding"	TokenNameStringLiteral	encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space6	TokenNameIdentifier	 space6
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space6	TokenNameIdentifier	 space6
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
encodingDelim	TokenNameIdentifier	 encoding Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
encodingDelim	TokenNameIdentifier	 encoding Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space7	TokenNameIdentifier	 space7
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space7	TokenNameIdentifier	 space7
,	TokenNameCOMMA	
standalone	TokenNameIdentifier	 standalone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
standalone	TokenNameIdentifier	 standalone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"standalone"	TokenNameStringLiteral	standalone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space8	TokenNameIdentifier	 space8
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space8	TokenNameIdentifier	 space8
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space9	TokenNameIdentifier	 space9
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space9	TokenNameIdentifier	 space9
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
standaloneDelim	TokenNameIdentifier	 standalone Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
standaloneDelim	TokenNameIdentifier	 standalone Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space10	TokenNameIdentifier	 space10
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space10	TokenNameIdentifier	 space10
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a processing instruction. */	TokenNameCOMMENT_JAVADOC	 Prints a processing instruction. 
public	TokenNamepublic	
void	TokenNamevoid	
printPI	TokenNameIdentifier	 print PI
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canIndent	TokenNameIdentifier	 can Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<?"	TokenNameStringLiteral	<?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the portion of the doctype before '['. */	TokenNameCOMMENT_JAVADOC	 Prints the portion of the doctype before '['. 
public	TokenNamepublic	
void	TokenNamevoid	
printDoctypeStart	TokenNameIdentifier	 print Doctype Start
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
externalId	TokenNameIdentifier	 external Id
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string1	TokenNameIdentifier	 string1
,	TokenNameCOMMA	
char	TokenNamechar	
string1Delim	TokenNameIdentifier	 string1 Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string2	TokenNameIdentifier	 string2
,	TokenNameCOMMA	
char	TokenNamechar	
string2Delim	TokenNameIdentifier	 string2 Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<!DOCTYPE"	TokenNameStringLiteral	<!DOCTYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
externalId	TokenNameIdentifier	 external Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
string1	TokenNameIdentifier	 string1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
string2	TokenNameIdentifier	 string2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
>	TokenNameGREATER	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
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
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getTabulationWidth	TokenNameIdentifier	 get Tabulation Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<!DOCTYPE"	TokenNameStringLiteral	<!DOCTYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
externalId	TokenNameIdentifier	 external Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
string1	TokenNameIdentifier	 string1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
string2	TokenNameIdentifier	 string2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints the portion of the doctype after ']'. */	TokenNameCOMMENT_JAVADOC	 Prints the portion of the doctype after ']'. 
public	TokenNamepublic	
void	TokenNamevoid	
printDoctypeEnd	TokenNameIdentifier	 print Doctype End
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a parameter entity reference. */	TokenNameCOMMENT_JAVADOC	 Prints a parameter entity reference. 
public	TokenNamepublic	
void	TokenNamevoid	
printParameterEntityReference	TokenNameIdentifier	 print Parameter Entity Reference
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an entity reference. */	TokenNameCOMMENT_JAVADOC	 Prints an entity reference. 
public	TokenNamepublic	
void	TokenNamevoid	
printEntityReference	TokenNameIdentifier	 print Entity Reference
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a character entity reference. */	TokenNameCOMMENT_JAVADOC	 Prints a character entity reference. 
public	TokenNamepublic	
void	TokenNamevoid	
printCharacterEntityReference	TokenNameIdentifier	 print Character Entity Reference
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endCol	TokenNameIdentifier	 end Col
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endCol	TokenNameIdentifier	 end Col
>	TokenNameGREATER	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the start of an element. */	TokenNameCOMMENT_JAVADOC	 Prints the start of an element. 
public	TokenNamepublic	
void	TokenNamevoid	
printElementStart	TokenNameIdentifier	 print Element Start
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startingLines	TokenNameIdentifier	 starting Lines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canIndent	TokenNameIdentifier	 can Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeInfo	TokenNameIdentifier	 Attribute Info
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeInfo	TokenNameIdentifier	 Attribute Info
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeInfo	TokenNameIdentifier	 Attribute Info
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeInfo	TokenNameIdentifier	 Attribute Info
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineAttributes	TokenNameIdentifier	 line Attributes
||	TokenNameOR_OR	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
column	TokenNameIdentifier	 column
>	TokenNameGREATER	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeInfo	TokenNameIdentifier	 Attribute Info
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeInfo	TokenNameIdentifier	 Attribute Info
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
level	TokenNameIdentifier	 level
++	TokenNamePLUS_PLUS	
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
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getTabulationWidth	TokenNameIdentifier	 get Tabulation Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
canIndent	TokenNameIdentifier	 can Indent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the end of an element. */	TokenNameCOMMENT_JAVADOC	 Prints the end of an element. 
public	TokenNamepublic	
void	TokenNamevoid	
printElementEnd	TokenNameIdentifier	 print Element End
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getTabulationWidth	TokenNameIdentifier	 get Tabulation Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
level	TokenNameIdentifier	 level
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
startingLines	TokenNameIdentifier	 starting Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startingLines	TokenNameIdentifier	 starting Lines
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the character data of an element content. */	TokenNameCOMMENT_JAVADOC	 Prints the character data of an element content. 
public	TokenNamepublic	
boolean	TokenNameboolean	
printCharacterData	TokenNameIdentifier	 print Character Data
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
canIndent	TokenNameIdentifier	 can Indent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
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
nl	TokenNameIdentifier	 nl
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xmlSpace	TokenNameIdentifier	 xml Space
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
canIndent	TokenNameIdentifier	 can Indent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatText	TokenNameIdentifier	 format Text
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a CDATA section. */	TokenNameCOMMENT_JAVADOC	 Prints a CDATA section. 
public	TokenNamepublic	
void	TokenNamevoid	
printCDATASection	TokenNameIdentifier	 print CDATA Section
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"<![CDATA["	TokenNameStringLiteral	<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCharacters	TokenNameIdentifier	 print Characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints a notation declaration. */	TokenNameCOMMENT_JAVADOC	 Prints a notation declaration. 
public	TokenNamepublic	
void	TokenNamevoid	
printNotation	TokenNameIdentifier	 print Notation
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
externalId	TokenNameIdentifier	 external Id
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string1	TokenNameIdentifier	 string1
,	TokenNameCOMMA	
char	TokenNamechar	
string1Delim	TokenNameIdentifier	 string1 Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string2	TokenNameIdentifier	 string2
,	TokenNameCOMMA	
char	TokenNamechar	
string2Delim	TokenNameIdentifier	 string2 Delim
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space5	TokenNameIdentifier	 space5
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!NOTATION"	TokenNameStringLiteral	<!NOTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
externalId	TokenNameIdentifier	 external Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space3	TokenNameIdentifier	 space3
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string1	TokenNameIdentifier	 string1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string1Delim	TokenNameIdentifier	 string1 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space4	TokenNameIdentifier	 space4
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string2	TokenNameIdentifier	 string2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string2Delim	TokenNameIdentifier	 string2 Delim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space5	TokenNameIdentifier	 space5
,	TokenNameCOMMA	
true	TokenNametrue	
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
}	TokenNameRBRACE	
/** * Prints an attribute list declaration start. */	TokenNameCOMMENT_JAVADOC	 Prints an attribute list declaration start. 
public	TokenNamepublic	
void	TokenNamevoid	
printAttlistStart	TokenNameIdentifier	 print Attlist Start
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ATTLIST"	TokenNameStringLiteral	<!ATTLIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an attribute list declaration end. */	TokenNameCOMMENT_JAVADOC	 Prints an attribute list declaration end. 
public	TokenNamepublic	
void	TokenNamevoid	
printAttlistEnd	TokenNameIdentifier	 print Attlist End
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
,	TokenNameCOMMA	
false	TokenNamefalse	
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
}	TokenNameRBRACE	
/** * Prints an attribute declaration start. */	TokenNameCOMMENT_JAVADOC	 Prints an attribute declaration start. 
public	TokenNamepublic	
void	TokenNamevoid	
printAttName	TokenNameIdentifier	 print Att Name
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an enumeration. */	TokenNameCOMMENT_JAVADOC	 Prints an enumeration. 
public	TokenNamepublic	
void	TokenNamevoid	
printEnumeration	TokenNameIdentifier	 print Enumeration
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NameInfo	TokenNameIdentifier	 Name Info
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameInfo	TokenNameIdentifier	 Name Info
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameInfo	TokenNameIdentifier	 Name Info
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space1	TokenNameIdentifier	 space1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printSpaces	TokenNameIdentifier	 print Spaces
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
space2	TokenNameIdentifier	 space2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of newlines in the given char array. */	TokenNameCOMMENT_JAVADOC	 Returns the number of newlines in the given char array. 
protected	TokenNameprotected	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given character represents white spaces. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given character represents white spaces. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats the given text. */	TokenNameCOMMENT_JAVADOC	 Formats the given text. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
formatText	TokenNameIdentifier	 format Text
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
margin	TokenNameIdentifier	 margin
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preceedingSpace	TokenNameIdentifier	 preceeding Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
startsWithSpace	TokenNameIdentifier	 starts With Space
=	TokenNameEQUAL	
preceedingSpace	TokenNameIdentifier	 preceeding Space
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startsWithSpace	TokenNameIdentifier	 starts With Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startsWithSpace	TokenNameIdentifier	 starts With Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWithSpace	TokenNameIdentifier	 starts With Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Consider reformatting ws so things look nicer. 	TokenNameCOMMENT_LINE	Consider reformatting ws so things look nicer. 
int	TokenNameint	
endCol	TokenNameIdentifier	 end Col
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endCol	TokenNameIdentifier	 end Col
>=	TokenNameGREATER_EQUAL	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
prettyPrinter	TokenNameIdentifier	 pretty Printer
.	TokenNameDOT	
getDocumentWidth	TokenNameIdentifier	 get Document Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNewline	TokenNameIdentifier	 print Newline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
>	TokenNameGREATER	
margin	TokenNameIdentifier	 margin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't print space at start of new line. 	TokenNameCOMMENT_LINE	Don't print space at start of new line. 
printCharacter	TokenNameIdentifier	 print Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printString	TokenNameIdentifier	 print String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startsWithSpace	TokenNameIdentifier	 starts With Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
startsWithSpace	TokenNameIdentifier	 starts With Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To store the informations about a name. */	TokenNameCOMMENT_JAVADOC	 To store the informations about a name. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NameInfo	TokenNameIdentifier	 Name Info
{	TokenNameLBRACE	
/** * The space before the name. */	TokenNameCOMMENT_JAVADOC	 The space before the name. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
;	TokenNameSEMICOLON	
/** * The name. */	TokenNameCOMMENT_JAVADOC	 The name. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * The space after the name */	TokenNameCOMMENT_JAVADOC	 The space after the name 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
;	TokenNameSEMICOLON	
/** * Creates a new NameInfo. */	TokenNameCOMMENT_JAVADOC	 Creates a new NameInfo. 
public	TokenNamepublic	
NameInfo	TokenNameIdentifier	 Name Info
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sp1	TokenNameIdentifier	 sp1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nm	TokenNameIdentifier	 nm
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sp2	TokenNameIdentifier	 sp2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
sp1	TokenNameIdentifier	 sp1
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
nm	TokenNameIdentifier	 nm
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
sp2	TokenNameIdentifier	 sp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To store the informations about an attribute. */	TokenNameCOMMENT_JAVADOC	 To store the informations about an attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AttributeInfo	TokenNameIdentifier	 Attribute Info
{	TokenNameLBRACE	
/** * The space before the name. */	TokenNameCOMMENT_JAVADOC	 The space before the name. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
;	TokenNameSEMICOLON	
/** * The attribute name. */	TokenNameCOMMENT_JAVADOC	 The attribute name. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * The space before '='. */	TokenNameCOMMENT_JAVADOC	 The space before '='. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space1	TokenNameIdentifier	 space1
;	TokenNameSEMICOLON	
/** * The space after '='. */	TokenNameCOMMENT_JAVADOC	 The space after '='. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space2	TokenNameIdentifier	 space2
;	TokenNameSEMICOLON	
/** * The attribute value. */	TokenNameCOMMENT_JAVADOC	 The attribute value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The attribute value delimiter. */	TokenNameCOMMENT_JAVADOC	 The attribute value delimiter. 
public	TokenNamepublic	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
;	TokenNameSEMICOLON	
/** * Whether the attribute value contains entity references. */	TokenNameCOMMENT_JAVADOC	 Whether the attribute value contains entity references. 
public	TokenNamepublic	
boolean	TokenNameboolean	
entityReferences	TokenNameIdentifier	 entity References
;	TokenNameSEMICOLON	
/** * Creates a new AttributeInfo. */	TokenNameCOMMENT_JAVADOC	 Creates a new AttributeInfo. 
public	TokenNamepublic	
AttributeInfo	TokenNameIdentifier	 Attribute Info
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sp1	TokenNameIdentifier	 sp1
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sp2	TokenNameIdentifier	 sp2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
char	TokenNamechar	
delim	TokenNameIdentifier	 delim
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
space1	TokenNameIdentifier	 space1
=	TokenNameEQUAL	
sp1	TokenNameIdentifier	 sp1
;	TokenNameSEMICOLON	
space2	TokenNameIdentifier	 space2
=	TokenNameEQUAL	
sp2	TokenNameIdentifier	 sp2
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
delimiter	TokenNameIdentifier	 delimiter
=	TokenNameEQUAL	
delim	TokenNameIdentifier	 delim
;	TokenNameSEMICOLON	
entityReferences	TokenNameIdentifier	 entity References
=	TokenNameEQUAL	
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the name of the attribute represented by this class * equals the given string. */	TokenNameCOMMENT_JAVADOC	 Tells whether the name of the attribute represented by this class equals the given string. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

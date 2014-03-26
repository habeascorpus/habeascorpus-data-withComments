/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
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
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
/** * Extends {@link Printer} and adds support for indentation and line * wrapping. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 Extends {@link Printer} and adds support for indentation and line wrapping. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
public	TokenNamepublic	
class	TokenNameclass	
IndentPrinter	TokenNameIdentifier	 Indent Printer
extends	TokenNameextends	
Printer	TokenNameIdentifier	 Printer
{	TokenNameLBRACE	
/** * Holds the currently accumulating text line. This buffer will constantly * be reused by deleting its contents instead of reallocating it. */	TokenNameCOMMENT_JAVADOC	 Holds the currently accumulating text line. This buffer will constantly be reused by deleting its contents instead of reallocating it. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
_line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
/** * Holds the currently accumulating text that follows {@link #_line}. * When the end of the part is identified by a call to {@link #printSpace} * or {@link #breakLine}, this part is added to the accumulated line. */	TokenNameCOMMENT_JAVADOC	 Holds the currently accumulating text that follows {@link #_line}. When the end of the part is identified by a call to {@link #printSpace} or {@link #breakLine}, this part is added to the accumulated line. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
_text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * Counts how many white spaces come between the accumulated line and the * current accumulated text. Multiple spaces at the end of the a line * will not be printed. */	TokenNameCOMMENT_JAVADOC	 Counts how many white spaces come between the accumulated line and the current accumulated text. Multiple spaces at the end of the a line will not be printed. 
private	TokenNameprivate	
int	TokenNameint	
_spaces	TokenNameIdentifier	 spaces
;	TokenNameSEMICOLON	
/** * Holds the indentation for the current line that is now accumulating in * memory and will be sent for printing shortly. */	TokenNameCOMMENT_JAVADOC	 Holds the indentation for the current line that is now accumulating in memory and will be sent for printing shortly. 
private	TokenNameprivate	
int	TokenNameint	
_thisIndent	TokenNameIdentifier	 this Indent
;	TokenNameSEMICOLON	
/** * Holds the indentation for the next line to be printed. After this line is * printed, {@link #_nextIndent} is assigned to {@link #_thisIndent}. */	TokenNameCOMMENT_JAVADOC	 Holds the indentation for the next line to be printed. After this line is printed, {@link #_nextIndent} is assigned to {@link #_thisIndent}. 
private	TokenNameprivate	
int	TokenNameint	
_nextIndent	TokenNameIdentifier	 next Indent
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndentPrinter	TokenNameIdentifier	 Indent Printer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initialize everything for a first/second run. 	TokenNameCOMMENT_LINE	Initialize everything for a first/second run. 
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_spaces	TokenNameIdentifier	 spaces
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_thisIndent	TokenNameIdentifier	 this Indent
=	TokenNameEQUAL	
_nextIndent	TokenNameIdentifier	 next Indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by any of the DTD handlers to enter DTD mode. * Once entered, all output will be accumulated in a string * that can be printed as part of the document's DTD. * This method may be called any number of time but will only * have affect the first time it's called. To exist DTD state * and get the accumulated DTD, call {@link #leaveDTD}. */	TokenNameCOMMENT_JAVADOC	 Called by any of the DTD handlers to enter DTD mode. Once entered, all output will be accumulated in a string that can be printed as part of the document's DTD. This method may be called any number of time but will only have affect the first time it's called. To exist DTD state and get the accumulated DTD, call {@link #leaveDTD}. 
public	TokenNamepublic	
void	TokenNamevoid	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can only enter DTD state once. Once we're out of DTD 	TokenNameCOMMENT_LINE	Can only enter DTD state once. Once we're out of DTD 
// state, can no longer re-enter it. 	TokenNameCOMMENT_LINE	state, can no longer re-enter it. 
if	TokenNameif	
(	TokenNameLPAREN	
_dtdWriter	TokenNameIdentifier	 dtd Writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_dtdWriter	TokenNameIdentifier	 dtd Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
_writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
_dtdWriter	TokenNameIdentifier	 dtd Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called by the root element to leave DTD mode and if any * DTD parts were printer, will return a string with their * textual content. */	TokenNameCOMMENT_JAVADOC	 Called by the root element to leave DTD mode and if any DTD parts were printer, will return a string with their textual content. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
leaveDTD	TokenNameIdentifier	 leave DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only works if we're going out of DTD mode. 	TokenNameCOMMENT_LINE	Only works if we're going out of DTD mode. 
if	TokenNameif	
(	TokenNameLPAREN	
_writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
_dtdWriter	TokenNameIdentifier	 dtd Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
_docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_dtdWriter	TokenNameIdentifier	 dtd Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called to print additional text. Each time this method is called * it accumulates more text. When a space is printed ({@link * #printSpace}) all the accumulated text becomes one part and is * added to the accumulate line. When a line is long enough, it can * be broken at its text boundary. * * @param text The text to print */	TokenNameCOMMENT_JAVADOC	 Called to print additional text. Each time this method is called it accumulates more text. When a space is printed ({@link #printSpace}) all the accumulated text becomes one part and is added to the accumulate line. When a line is long enough, it can be broken at its text boundary. * @param text The text to print 
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called to print a single space between text parts that may be * broken into separate lines. Must not be called to print a space * when preserving spaces. The text accumulated so far with {@link * #printText} will be added to the accumulated line, and a space * separator will be counted. If the line accumulated so far is * long enough, it will be printed. */	TokenNameCOMMENT_JAVADOC	 Called to print a single space between text parts that may be broken into separate lines. Must not be called to print a space when preserving spaces. The text accumulated so far with {@link #printText} will be added to the accumulated line, and a space separator will be counted. If the line accumulated so far is long enough, it will be printed. 
public	TokenNamepublic	
void	TokenNamevoid	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The line consists of the text accumulated in _line, 	TokenNameCOMMENT_LINE	The line consists of the text accumulated in _line, 
// followed by one or more spaces as counted by _spaces, 	TokenNameCOMMENT_LINE	followed by one or more spaces as counted by _spaces, 
// followed by more space accumulated in _text: 	TokenNameCOMMENT_LINE	followed by more space accumulated in _text: 
// - Text is printed and accumulated into _text. 	TokenNameCOMMENT_LINE	- Text is printed and accumulated into _text. 
// - A space is printed, so _text is added to _line and 	TokenNameCOMMENT_LINE	- A space is printed, so _text is added to _line and 
// a space is counted. 	TokenNameCOMMENT_LINE	a space is counted. 
// - More text is printed and accumulated into _text. 	TokenNameCOMMENT_LINE	- More text is printed and accumulated into _text. 
// - A space is printed, the previous spaces are added 	TokenNameCOMMENT_LINE	- A space is printed, the previous spaces are added 
// to _line, the _text is added to _line, and a new 	TokenNameCOMMENT_LINE	to _line, the _text is added to _line, and a new 
// space is counted. 	TokenNameCOMMENT_LINE	space is counted. 
// If text was accumulated with printText(), then the space 	TokenNameCOMMENT_LINE	If text was accumulated with printText(), then the space 
// means we have to move that text into the line and 	TokenNameCOMMENT_LINE	means we have to move that text into the line and 
// start accumulating new text with printText(). 	TokenNameCOMMENT_LINE	start accumulating new text with printText(). 
if	TokenNameif	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the text breaks a line bounary, wrap to the next line. 	TokenNameCOMMENT_LINE	If the text breaks a line bounary, wrap to the next line. 
// The printed line size consists of the indentation we're going 	TokenNameCOMMENT_LINE	The printed line size consists of the indentation we're going 
// to use next, the accumulated line so far, some spaces and the 	TokenNameCOMMENT_LINE	to use next, the accumulated line so far, some spaces and the 
// accumulated text so far. 	TokenNameCOMMENT_LINE	accumulated text so far. 
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
_thisIndent	TokenNameIdentifier	 this Indent
+	TokenNamePLUS	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
_spaces	TokenNameIdentifier	 spaces
+	TokenNamePLUS	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Print line and new line, then zero the line contents. 	TokenNameCOMMENT_LINE	Print line and new line, then zero the line contents. 
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineSeparator	TokenNameIdentifier	 get Line Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't throw an exception, but hold it 	TokenNameCOMMENT_LINE	We don't throw an exception, but hold it 
// until the end of the document. 	TokenNameCOMMENT_LINE	until the end of the document. 
if	TokenNameif	
(	TokenNameLPAREN	
_exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Add as many spaces as we accumulaed before. 	TokenNameCOMMENT_LINE	Add as many spaces as we accumulaed before. 
// At the end of this loop, _spaces is zero. 	TokenNameCOMMENT_LINE	At the end of this loop, _spaces is zero. 
while	TokenNamewhile	
(	TokenNameLPAREN	
_spaces	TokenNameIdentifier	 spaces
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
_spaces	TokenNameIdentifier	 spaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Starting a new word: accumulate the text between the line 	TokenNameCOMMENT_LINE	Starting a new word: accumulate the text between the line 
// and this new word; not a new word: just add another space. 	TokenNameCOMMENT_LINE	and this new word; not a new word: just add another space. 
++	TokenNamePLUS_PLUS	
_spaces	TokenNameIdentifier	 spaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called to print a line consisting of the text accumulated so * far. This is equivalent to calling {@link #printSpace} but * forcing the line to print and starting a new line ({@link * #printSpace} will only start a new line if the current line * is long enough). */	TokenNameCOMMENT_JAVADOC	 Called to print a line consisting of the text accumulated so far. This is equivalent to calling {@link #printSpace} but forcing the line to print and starting a new line ({@link #printSpace} will only start a new line if the current line is long enough). 
public	TokenNamepublic	
void	TokenNamevoid	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Equivalent to calling printSpace and forcing a flushLine. 	TokenNameCOMMENT_LINE	Equivalent to calling printSpace and forcing a flushLine. 
if	TokenNameif	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_spaces	TokenNameIdentifier	 spaces
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
_spaces	TokenNameIdentifier	 spaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Print line and new line, then zero the line contents. 	TokenNameCOMMENT_LINE	Print line and new line, then zero the line contents. 
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineSeparator	TokenNameIdentifier	 get Line Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't throw an exception, but hold it 	TokenNameCOMMENT_LINE	We don't throw an exception, but hold it 
// until the end of the document. 	TokenNameCOMMENT_LINE	until the end of the document. 
if	TokenNameif	
(	TokenNameLPAREN	
_exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flushes the line accumulated so far to the writer and get ready * to accumulate the next line. This method is called by {@link * #printText} and {@link #printSpace} when the accumulated line plus * accumulated text are two long to fit on a given line. At the end of * this method _line is empty and _spaces is zero. */	TokenNameCOMMENT_JAVADOC	 Flushes the line accumulated so far to the writer and get ready to accumulate the next line. This method is called by {@link #printText} and {@link #printSpace} when the accumulated line plus accumulated text are two long to fit on a given line. At the end of this method _line is empty and _spaces is zero. 
public	TokenNamepublic	
void	TokenNamevoid	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getIndenting	TokenNameIdentifier	 get Indenting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure the indentation does not blow us away. 	TokenNameCOMMENT_LINE	Make sure the indentation does not blow us away. 
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
_thisIndent	TokenNameIdentifier	 this Indent
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
>	TokenNameGREATER	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Print the indentation as spaces and set the current 	TokenNameCOMMENT_LINE	Print the indentation as spaces and set the current 
// indentation to the next expected indentation. 	TokenNameCOMMENT_LINE	indentation to the next expected indentation. 
while	TokenNamewhile	
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_thisIndent	TokenNameIdentifier	 this Indent
=	TokenNameEQUAL	
_nextIndent	TokenNameIdentifier	 next Indent
;	TokenNameSEMICOLON	
// There is no need to print the spaces at the end of the line, 	TokenNameCOMMENT_LINE	There is no need to print the spaces at the end of the line, 
// they are simply stripped and replaced with a single line 	TokenNameCOMMENT_LINE	they are simply stripped and replaced with a single line 
// separator. 	TokenNameCOMMENT_LINE	separator. 
_spaces	TokenNameIdentifier	 spaces
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't throw an exception, but hold it 	TokenNameCOMMENT_LINE	We don't throw an exception, but hold it 
// until the end of the document. 	TokenNameCOMMENT_LINE	until the end of the document. 
if	TokenNameif	
(	TokenNameLPAREN	
_exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flush the output stream. Must be called when done printing * the document, otherwise some text might be buffered. */	TokenNameCOMMENT_JAVADOC	 Flush the output stream. Must be called when done printing the document, otherwise some text might be buffered. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't throw an exception, but hold it 	TokenNameCOMMENT_LINE	We don't throw an exception, but hold it 
// until the end of the document. 	TokenNameCOMMENT_LINE	until the end of the document. 
if	TokenNameif	
(	TokenNameLPAREN	
_exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Increment the indentation for the next line. */	TokenNameCOMMENT_JAVADOC	 Increment the indentation for the next line. 
public	TokenNamepublic	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nextIndent	TokenNameIdentifier	 next Indent
+=	TokenNamePLUS_EQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decrement the indentation for the next line. */	TokenNameCOMMENT_JAVADOC	 Decrement the indentation for the next line. 
public	TokenNamepublic	
void	TokenNamevoid	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nextIndent	TokenNameIdentifier	 next Indent
-=	TokenNameMINUS_EQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nextIndent	TokenNameIdentifier	 next Indent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_nextIndent	TokenNameIdentifier	 next Indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If there is no current line and we're de-identing then 	TokenNameCOMMENT_LINE	If there is no current line and we're de-identing then 
// this indentation level is actually the next level. 	TokenNameCOMMENT_LINE	this indentation level is actually the next level. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
_spaces	TokenNameIdentifier	 spaces
+	TokenNamePLUS	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_thisIndent	TokenNameIdentifier	 this Indent
=	TokenNameEQUAL	
_nextIndent	TokenNameIdentifier	 next Indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNextIndent	TokenNameIdentifier	 get Next Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_nextIndent	TokenNameIdentifier	 next Indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextIndent	TokenNameIdentifier	 set Next Indent
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nextIndent	TokenNameIdentifier	 next Indent
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThisIndent	TokenNameIdentifier	 set This Indent
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_thisIndent	TokenNameIdentifier	 this Indent
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

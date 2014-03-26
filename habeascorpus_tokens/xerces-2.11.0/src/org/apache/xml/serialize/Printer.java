/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed serializer to report IO exception directly, instead at 	TokenNameCOMMENT_LINE	Fixed serializer to report IO exception directly, instead at 
// the end of document processing. 	TokenNameCOMMENT_LINE	the end of document processing. 
// Reported by Patrick Higgins <phiggins@transzap.com> 	TokenNameCOMMENT_LINE	Reported by Patrick Higgins <phiggins@transzap.com> 
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
/** * The printer is responsible for sending text to the output stream * or writer. This class performs direct writing for efficiency. * {@link IndentPrinter} supports indentation and line wrapping by * extending this class. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 The printer is responsible for sending text to the output stream or writer. This class performs direct writing for efficiency. {@link IndentPrinter} supports indentation and line wrapping by extending this class. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
public	TokenNamepublic	
class	TokenNameclass	
Printer	TokenNameIdentifier	 Printer
{	TokenNameLBRACE	
/** * The output format associated with this serializer. This will never * be a null reference. If no format was passed to the constructor, * the default one for this document type will be used. The format * object is never changed by the serializer. */	TokenNameCOMMENT_JAVADOC	 The output format associated with this serializer. This will never be a null reference. If no format was passed to the constructor, the default one for this document type will be used. The format object is never changed by the serializer. 
protected	TokenNameprotected	
final	TokenNamefinal	
OutputFormat	TokenNameIdentifier	 Output Format
_format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
/** * The writer to which the document is written. */	TokenNameCOMMENT_JAVADOC	 The writer to which the document is written. 
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
_writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * The DTD writer. When we switch to DTD mode, all output is * accumulated in this DTD writer. When we switch out of it, * the output is obtained as a string. Must not be reset to * null until we're done with the document. */	TokenNameCOMMENT_JAVADOC	 The DTD writer. When we switch to DTD mode, all output is accumulated in this DTD writer. When we switch out of it, the output is obtained as a string. Must not be reset to null until we're done with the document. 
protected	TokenNameprotected	
StringWriter	TokenNameIdentifier	 String Writer
_dtdWriter	TokenNameIdentifier	 dtd Writer
;	TokenNameSEMICOLON	
/** * Holds a reference to the document writer while we are * in DTD mode. */	TokenNameCOMMENT_JAVADOC	 Holds a reference to the document writer while we are in DTD mode. 
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
_docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
/** * Holds the exception thrown by the serializer. Exceptions do not cause * the serializer to quit, but are held and one is thrown at the end. */	TokenNameCOMMENT_JAVADOC	 Holds the exception thrown by the serializer. Exceptions do not cause the serializer to quit, but are held and one is thrown at the end. 
protected	TokenNameprotected	
IOException	TokenNameIdentifier	 IO Exception
_exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * The size of the output buffer. */	TokenNameCOMMENT_JAVADOC	 The size of the output buffer. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BufferSize	TokenNameIdentifier	 Buffer Size
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Output buffer. */	TokenNameCOMMENT_JAVADOC	 Output buffer. 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BufferSize	TokenNameIdentifier	 Buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Position within the output buffer. */	TokenNameCOMMENT_JAVADOC	 Position within the output buffer. 
private	TokenNameprivate	
int	TokenNameint	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Printer	TokenNameIdentifier	 Printer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
_exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_dtdWriter	TokenNameIdentifier	 dtd Writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IOException	TokenNameIdentifier	 IO Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by any of the DTD handlers to enter DTD mode. * Once entered, all output will be accumulated in a string * that can be printed as part of the document's DTD. * This method may be called any number of time but will only * have affect the first time it's called. To exist DTD state * and get the accumulated DTD, call {@link #leaveDTD}. */	TokenNameCOMMENT_JAVADOC	 Called by any of the DTD handlers to enter DTD mode. Once entered, all output will be accumulated in a string that can be printed as part of the document's DTD. This method may be called any number of time but will only have affect the first time it's called. To exist DTD state and get the accumulated DTD, call {@link #leaveDTD}. 
public	TokenNamepublic	
void	TokenNamevoid	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Only works if we're going out of DTD mode. 	TokenNameCOMMENT_LINE	Only works if we're going out of DTD mode. 
if	TokenNameif	
(	TokenNameLPAREN	
_writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
_dtdWriter	TokenNameIdentifier	 dtd Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
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
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
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
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
BufferSize	TokenNameIdentifier	 Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
_pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flushLine	TokenNameIdentifier	 flush Line
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Write anything left in the buffer into the writer. 	TokenNameCOMMENT_LINE	Write anything left in the buffer into the writer. 
try	TokenNametry	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_pos	TokenNameIdentifier	 pos
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
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush the output stream. Must be called when done printing * the document, otherwise some text might be buffered. */	TokenNameCOMMENT_JAVADOC	 Flush the output stream. Must be called when done printing the document, otherwise some text might be buffered. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
_buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
throw	TokenNamethrow	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOOP 	TokenNameCOMMENT_LINE	NOOP 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOOP 	TokenNameCOMMENT_LINE	NOOP 
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNextIndent	TokenNameIdentifier	 get Next Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThisIndent	TokenNameIdentifier	 set This Indent
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

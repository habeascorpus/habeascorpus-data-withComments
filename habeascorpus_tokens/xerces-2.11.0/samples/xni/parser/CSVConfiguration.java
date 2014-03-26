/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
NamespaceSupport	TokenNameIdentifier	 Namespace Support
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
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
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
XMLAttributes	TokenNameIdentifier	 XML Attributes
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
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * This example is a very simple parser configuration that can * parse files with comma-separated values (CSV) to generate XML * events. For example, the following CSV document: * <pre> * Andy Clark,16 Jan 1973,Cincinnati * </pre> * produces the following XML "document" as represented by the * XNI streaming document information: * <pre> * &lt;?xml version='1.0' encoding='UTF-8' standalone='true'?&gt; * &lt;!DOCTYPE csv [ * &lt;!ELEMENT csv (row)*&gt; * &lt;!ELEMENT row (col)*&gt; * &lt;!ELEMENT col (#PCDATA)&gt; * ]&gt; * &lt;csv&gt; * &lt;row&gt; * &lt;col&gt;Andy Clark&lt;/col&gt; * &lt;col&gt;16 Jan 1973&lt;/col&gt; * &lt;col&gt;Cincinnati&lt;/col&gt; * &lt;/row&gt; * &lt;/csv&gt; * </pre> * * @author Andy Clark, IBM * * @version $Id: CSVConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This example is a very simple parser configuration that can parse files with comma-separated values (CSV) to generate XML events. For example, the following CSV document: <pre> Andy Clark,16 Jan 1973,Cincinnati </pre> produces the following XML "document" as represented by the XNI streaming document information: <pre> &lt;?xml version='1.0' encoding='UTF-8' standalone='true'?&gt; &lt;!DOCTYPE csv [ &lt;!ELEMENT csv (row)*&gt; &lt;!ELEMENT row (col)*&gt; &lt;!ELEMENT col (#PCDATA)&gt; ]&gt; &lt;csv&gt; &lt;row&gt; &lt;col&gt;Andy Clark&lt;/col&gt; &lt;col&gt;16 Jan 1973&lt;/col&gt; &lt;col&gt;Cincinnati&lt;/col&gt; &lt;/row&gt; &lt;/csv&gt; </pre> * @author Andy Clark, IBM * @version $Id: CSVConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CSVConfiguration	TokenNameIdentifier	 CSV Configuration
extends	TokenNameextends	
AbstractConfiguration	TokenNameIdentifier	 Abstract Configuration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** A QName for the &lt;csv&gt; element name. */	TokenNameCOMMENT_JAVADOC	 A QName for the &lt;csv&gt; element name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
CSV	TokenNameIdentifier	 CSV
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"csv"	TokenNameStringLiteral	csv
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A QName for the &lt;row&gt; element name. */	TokenNameCOMMENT_JAVADOC	 A QName for the &lt;row&gt; element name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
ROW	TokenNameIdentifier	 ROW
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"row"	TokenNameStringLiteral	row
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A QName for the &lt;col&gt; element name. */	TokenNameCOMMENT_JAVADOC	 A QName for the &lt;col&gt; element name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
COL	TokenNameIdentifier	 COL
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"col"	TokenNameStringLiteral	col
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** An empty list of attributes. */	TokenNameCOMMENT_JAVADOC	 An empty list of attributes. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
XMLAttributes	TokenNameIdentifier	 XML Attributes
EMPTY_ATTRS	TokenNameIdentifier	 EMPTY  ATTRS
=	TokenNameEQUAL	
new	TokenNamenew	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A newline XMLString. */	TokenNameCOMMENT_JAVADOC	 A newline XMLString. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLString	TokenNameIdentifier	 XML String
NEWLINE	TokenNameIdentifier	 NEWLINE
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A newline + one space XMLString. */	TokenNameCOMMENT_JAVADOC	 A newline + one space XMLString. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLString	TokenNameIdentifier	 XML String
NEWLINE_ONE_SPACE	TokenNameIdentifier	 NEWLINE  ONE  SPACE
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A newline + two spaces XMLString. */	TokenNameCOMMENT_JAVADOC	 A newline + two spaces XMLString. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLString	TokenNameIdentifier	 XML String
NEWLINE_TWO_SPACES	TokenNameIdentifier	 NEWLINE  TWO  SPACES
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * A string buffer for use in copying string into an XMLString * object for passing to the characters method. */	TokenNameCOMMENT_JAVADOC	 A string buffer for use in copying string into an XMLString object for passing to the characters method. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
fStringBuffer	TokenNameIdentifier	 f String Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// XMLParserConfiguration methods 	TokenNameCOMMENT_LINE	XMLParserConfiguration methods 
// 	TokenNameCOMMENT_LINE	 
/** * Parse an XML document. * <p> * The parser can use this method to instruct this configuration * to begin parsing an XML document from any valid input source * (a character stream, a byte stream, or a URI). * <p> * Parsers may not invoke this method while a parse is in progress. * Once a parse is complete, the parser may then parse another XML * document. * <p> * This method is synchronous: it will not return until parsing * has ended. If a client application wants to terminate * parsing early, it should throw an exception. * * @param source The input source for the top-level of the * XML document. * * @exception XNIException Any XNI exception, possibly wrapping * another exception. * @exception IOException An IO exception from the parser, possibly * from a byte stream or character stream * supplied by the parser. */	TokenNameCOMMENT_JAVADOC	 Parse an XML document. <p> The parser can use this method to instruct this configuration to begin parsing an XML document from any valid input source (a character stream, a byte stream, or a URI). <p> Parsers may not invoke this method while a parse is in progress. Once a parse is complete, the parser may then parse another XML document. <p> This method is synchronous: it will not return until parsing has ended. If a client application wants to terminate parsing early, it should throw an exception. * @param source The input source for the top-level of the XML document. * @exception XNIException Any XNI exception, possibly wrapping another exception. @exception IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the parser. 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// get reader 	TokenNameCOMMENT_LINE	get reader 
openInputSourceStream	TokenNameIdentifier	 open Input Source Stream
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start document 	TokenNameCOMMENT_LINE	start document 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
,	TokenNameCOMMA	
new	TokenNamenew	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
xmlDecl	TokenNameIdentifier	 xml Decl
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
doctypeDecl	TokenNameIdentifier	 doctype Decl
(	TokenNameLPAREN	
"csv"	TokenNameStringLiteral	csv
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
"csv"	TokenNameStringLiteral	csv
,	TokenNameCOMMA	
"(row)*"	TokenNameStringLiteral	(row)*
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
"row"	TokenNameStringLiteral	row
,	TokenNameCOMMA	
"(col)*"	TokenNameStringLiteral	(col)*
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
"col"	TokenNameStringLiteral	col
,	TokenNameCOMMA	
"(#PCDATA)"	TokenNameStringLiteral	(#PCDATA)
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
"csv"	TokenNameStringLiteral	csv
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startGroup	TokenNameIdentifier	 start Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
element	TokenNameIdentifier	 element
(	TokenNameLPAREN	
"row"	TokenNameStringLiteral	row
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endGroup	TokenNameIdentifier	 end Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
csvOccurs	TokenNameIdentifier	 csv Occurs
=	TokenNameEQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
OCCURS_ZERO_OR_MORE	TokenNameIdentifier	 OCCURS  ZERO  OR  MORE
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
occurrence	TokenNameIdentifier	 occurrence
(	TokenNameLPAREN	
csvOccurs	TokenNameIdentifier	 csv Occurs
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
"row"	TokenNameStringLiteral	row
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startGroup	TokenNameIdentifier	 start Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
element	TokenNameIdentifier	 element
(	TokenNameLPAREN	
"col"	TokenNameStringLiteral	col
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endGroup	TokenNameIdentifier	 end Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
rowOccurs	TokenNameIdentifier	 row Occurs
=	TokenNameEQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
OCCURS_ZERO_OR_MORE	TokenNameIdentifier	 OCCURS  ZERO  OR  MORE
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
occurrence	TokenNameIdentifier	 occurrence
(	TokenNameLPAREN	
rowOccurs	TokenNameIdentifier	 row Occurs
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
"col"	TokenNameStringLiteral	col
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
startGroup	TokenNameIdentifier	 start Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
pcdata	TokenNameIdentifier	 pcdata
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endGroup	TokenNameIdentifier	 end Group
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDContentModelHandler	TokenNameIdentifier	 f DTD Content Model Handler
.	TokenNameDOT	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
CSV	TokenNameIdentifier	 CSV
,	TokenNameCOMMA	
EMPTY_ATTRS	TokenNameIdentifier	 EMPTY  ATTRS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read lines 	TokenNameCOMMENT_LINE	read lines 
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
NEWLINE_ONE_SPACE	TokenNameIdentifier	 NEWLINE  ONE  SPACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
ROW	TokenNameIdentifier	 ROW
,	TokenNameCOMMA	
EMPTY_ATTRS	TokenNameIdentifier	 EMPTY  ATTRS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
NEWLINE_TWO_SPACES	TokenNameIdentifier	 NEWLINE  TWO  SPACES
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
COL	TokenNameIdentifier	 COL
,	TokenNameCOMMA	
EMPTY_ATTRS	TokenNameIdentifier	 EMPTY  ATTRS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
COL	TokenNameIdentifier	 COL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
NEWLINE_ONE_SPACE	TokenNameIdentifier	 NEWLINE  ONE  SPACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
ROW	TokenNameIdentifier	 ROW
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// end document 	TokenNameCOMMENT_LINE	end document 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
NEWLINE	TokenNameIdentifier	 NEWLINE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
CSV	TokenNameIdentifier	 CSV
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// parse(XMLInputSource) 	TokenNameCOMMENT_LINE	parse(XMLInputSource) 
// NOTE: The following methods are overloaded to ignore setting 	TokenNameCOMMENT_LINE	NOTE: The following methods are overloaded to ignore setting 
// of parser state so that this configuration does not 	TokenNameCOMMENT_LINE	of parser state so that this configuration does not 
// throw configuration exceptions for features and properties 	TokenNameCOMMENT_LINE	throw configuration exceptions for features and properties 
// that it doesn't care about. 	TokenNameCOMMENT_LINE	that it doesn't care about. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class CSVConfiguration 	TokenNameCOMMENT_LINE	class CSVConfiguration 

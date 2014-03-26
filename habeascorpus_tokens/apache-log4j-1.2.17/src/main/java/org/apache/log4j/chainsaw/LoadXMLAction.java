/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
AbstractAction	TokenNameIdentifier	 Abstract Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFileChooser	TokenNameIdentifier	 J File Chooser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFrame	TokenNameIdentifier	 J Frame
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JOptionPane	TokenNameIdentifier	 J Option Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * Encapsulates the action to load an XML file. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 Encapsulates the action to load an XML file. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> @version 1.0 
class	TokenNameclass	
LoadXMLAction	TokenNameIdentifier	 Load XML Action
extends	TokenNameextends	
AbstractAction	TokenNameIdentifier	 Abstract Action
{	TokenNameLBRACE	
/** use to log messages **/	TokenNameCOMMENT_JAVADOC	 use to log messages *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
LoadXMLAction	TokenNameIdentifier	 Load XML Action
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** the parent frame **/	TokenNameCOMMENT_JAVADOC	 the parent frame *
private	TokenNameprivate	
final	TokenNamefinal	
JFrame	TokenNameIdentifier	 J Frame
mParent	TokenNameIdentifier	 m Parent
;	TokenNameSEMICOLON	
/** * the file chooser - configured to allow only the selection of a * single file. */	TokenNameCOMMENT_JAVADOC	 the file chooser - configured to allow only the selection of a single file. 
private	TokenNameprivate	
final	TokenNamefinal	
JFileChooser	TokenNameIdentifier	 J File Chooser
mChooser	TokenNameIdentifier	 m Chooser
=	TokenNameEQUAL	
new	TokenNamenew	
JFileChooser	TokenNameIdentifier	 J File Chooser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
mChooser	TokenNameIdentifier	 m Chooser
.	TokenNameDOT	
setMultiSelectionEnabled	TokenNameIdentifier	 set Multi Selection Enabled
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mChooser	TokenNameIdentifier	 m Chooser
.	TokenNameDOT	
setFileSelectionMode	TokenNameIdentifier	 set File Selection Mode
(	TokenNameLPAREN	
JFileChooser	TokenNameIdentifier	 J File Chooser
.	TokenNameDOT	
FILES_ONLY	TokenNameIdentifier	 FILES  ONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** parser to read XML files **/	TokenNameCOMMENT_JAVADOC	 parser to read XML files *
private	TokenNameprivate	
final	TokenNamefinal	
XMLReader	TokenNameIdentifier	 XML Reader
mParser	TokenNameIdentifier	 m Parser
;	TokenNameSEMICOLON	
/** the content handler **/	TokenNameCOMMENT_JAVADOC	 the content handler *
private	TokenNameprivate	
final	TokenNamefinal	
XMLFileHandler	TokenNameIdentifier	 XML File Handler
mHandler	TokenNameIdentifier	 m Handler
;	TokenNameSEMICOLON	
/** * Creates a new <code>LoadXMLAction</code> instance. * * @param aParent the parent frame * @param aModel the model to add events to * @exception SAXException if an error occurs * @throws ParserConfigurationException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>LoadXMLAction</code> instance. * @param aParent the parent frame @param aModel the model to add events to @exception SAXException if an error occurs @throws ParserConfigurationException if an error occurs 
LoadXMLAction	TokenNameIdentifier	 Load XML Action
(	TokenNameLPAREN	
JFrame	TokenNameIdentifier	 J Frame
aParent	TokenNameIdentifier	 a Parent
,	TokenNameCOMMA	
MyTableModel	TokenNameIdentifier	 My Table Model
aModel	TokenNameIdentifier	 a Model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
{	TokenNameLBRACE	
mParent	TokenNameIdentifier	 m Parent
=	TokenNameEQUAL	
aParent	TokenNameIdentifier	 a Parent
;	TokenNameSEMICOLON	
mHandler	TokenNameIdentifier	 m Handler
=	TokenNameEQUAL	
new	TokenNamenew	
XMLFileHandler	TokenNameIdentifier	 XML File Handler
(	TokenNameLPAREN	
aModel	TokenNameIdentifier	 a Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mParser	TokenNameIdentifier	 m Parser
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mParser	TokenNameIdentifier	 m Parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
mHandler	TokenNameIdentifier	 m Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prompts the user for a file to load events from. * @param aIgnore an <code>ActionEvent</code> value */	TokenNameCOMMENT_JAVADOC	 Prompts the user for a file to load events from. @param aIgnore an <code>ActionEvent</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
aIgnore	TokenNameIdentifier	 a Ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"load file called"	TokenNameStringLiteral	load file called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mChooser	TokenNameIdentifier	 m Chooser
.	TokenNameDOT	
showOpenDialog	TokenNameIdentifier	 show Open Dialog
(	TokenNameLPAREN	
mParent	TokenNameIdentifier	 m Parent
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
JFileChooser	TokenNameIdentifier	 J File Chooser
.	TokenNameDOT	
APPROVE_OPTION	TokenNameIdentifier	 APPROVE  OPTION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Need to load a file"	TokenNameStringLiteral	Need to load a file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
chosen	TokenNameIdentifier	 chosen
=	TokenNameEQUAL	
mChooser	TokenNameIdentifier	 m Chooser
.	TokenNameDOT	
getSelectedFile	TokenNameIdentifier	 get Selected File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"loading the contents of "	TokenNameStringLiteral	loading the contents of 
+	TokenNamePLUS	
chosen	TokenNameIdentifier	 chosen
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
chosen	TokenNameIdentifier	 chosen
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showMessageDialog	TokenNameIdentifier	 show Message Dialog
(	TokenNameLPAREN	
mParent	TokenNameIdentifier	 m Parent
,	TokenNameCOMMA	
"Loaded "	TokenNameStringLiteral	Loaded 
+	TokenNamePLUS	
num	TokenNameIdentifier	 num
+	TokenNamePLUS	
" events."	TokenNameStringLiteral	 events.
,	TokenNameCOMMA	
"CHAINSAW"	TokenNameStringLiteral	CHAINSAW
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
INFORMATION_MESSAGE	TokenNameIdentifier	 INFORMATION  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"caught an exception loading the file"	TokenNameStringLiteral	caught an exception loading the file
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showMessageDialog	TokenNameIdentifier	 show Message Dialog
(	TokenNameLPAREN	
mParent	TokenNameIdentifier	 m Parent
,	TokenNameCOMMA	
"Error parsing file - "	TokenNameStringLiteral	Error parsing file - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"CHAINSAW"	TokenNameStringLiteral	CHAINSAW
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
ERROR_MESSAGE	TokenNameIdentifier	 ERROR  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Loads the contents of file into the model * * @param aFile the file to extract events from * @return the number of events loaded * @throws SAXException if an error occurs * @throws IOException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Loads the contents of file into the model * @param aFile the file to extract events from @return the number of events loaded @throws SAXException if an error occurs @throws IOException if an error occurs 
private	TokenNameprivate	
int	TokenNameint	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aFile	TokenNameIdentifier	 a File
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mParser	TokenNameIdentifier	 m Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a dummy document to parse the file 	TokenNameCOMMENT_LINE	Create a dummy document to parse the file 
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<?xml version="1.0" standalone="yes"?> "	TokenNameStringLiteral	<?xml version="1.0" standalone="yes"?> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<!DOCTYPE log4j:eventSet "	TokenNameStringLiteral	<!DOCTYPE log4j:eventSet 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"[<!ENTITY data SYSTEM "file:///"	TokenNameStringLiteral	[<!ENTITY data SYSTEM "file:///
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
aFile	TokenNameIdentifier	 a File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">]> "	TokenNameStringLiteral	">]> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:eventSet xmlns:log4j="Claira"> "	TokenNameStringLiteral	<log4j:eventSet xmlns:log4j="Claira"> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&data; "	TokenNameStringLiteral	&data; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</log4j:eventSet> "	TokenNameStringLiteral	</log4j:eventSet> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InputSource	TokenNameIdentifier	 Input Source
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mParser	TokenNameIdentifier	 m Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mHandler	TokenNameIdentifier	 m Handler
.	TokenNameDOT	
getNumEvents	TokenNameIdentifier	 get Num Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JEditorPane	TokenNameIdentifier	 J Editor Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
UndoableEditEvent	TokenNameIdentifier	 Undoable Edit Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
UndoableEditListener	TokenNameIdentifier	 Undoable Edit Listener
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
undo	TokenNameIdentifier	 undo
.	TokenNameDOT	
CannotRedoException	TokenNameIdentifier	 Cannot Redo Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
.	TokenNameDOT	
CannotUndoException	TokenNameIdentifier	 Cannot Undo Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
.	TokenNameDOT	
UndoManager	TokenNameIdentifier	 Undo Manager
;	TokenNameSEMICOLON	
/** * Simple Text Component to edit xml document with integrated undo / redo behaviour. * If you looking for how to create editor component with syntax highlight, * just create any JEditorPane and supply it with XMLEditoKit eg: * <pre> * JEditorPane editor = new JEditorPane(); * editor.setEditorKitForContentType(XMLEditorKit.XML_MIME_TYPE, new XMLEditorKit(); * editor.setContentType(XMLEditorKit.XML_MIME_TYPE); * </pre> * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Simple Text Component to edit xml document with integrated undo / redo behaviour. If you looking for how to create editor component with syntax highlight, just create any JEditorPane and supply it with XMLEditoKit eg: <pre> JEditorPane editor = new JEditorPane(); editor.setEditorKitForContentType(XMLEditorKit.XML_MIME_TYPE, new XMLEditorKit(); editor.setContentType(XMLEditorKit.XML_MIME_TYPE); </pre> * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
XMLTextEditor	TokenNameIdentifier	 XML Text Editor
extends	TokenNameextends	
JEditorPane	TokenNameIdentifier	 J Editor Pane
{	TokenNameLBRACE	
protected	TokenNameprotected	
UndoManager	TokenNameIdentifier	 Undo Manager
undoManager	TokenNameIdentifier	 undo Manager
;	TokenNameSEMICOLON	
/** Creates a new instance of XMLEditorPane */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of XMLEditorPane 
public	TokenNamepublic	
XMLTextEditor	TokenNameIdentifier	 XML Text Editor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
kit	TokenNameIdentifier	 kit
=	TokenNameEQUAL	
new	TokenNamenew	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEditorKitForContentType	TokenNameIdentifier	 set Editor Kit For Content Type
(	TokenNameLPAREN	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
.	TokenNameDOT	
XML_MIME_TYPE	TokenNameIdentifier	 XML  MIME  TYPE
,	TokenNameCOMMA	
kit	TokenNameIdentifier	 kit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
.	TokenNameDOT	
XML_MIME_TYPE	TokenNameIdentifier	 XML  MIME  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
white	TokenNameIdentifier	 white
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//setFont(new Font("Monospaced", Font.PLAIN, 12)); 	TokenNameCOMMENT_LINE	setFont(new Font("Monospaced", Font.PLAIN, 12)); 
// add undoable edit 	TokenNameCOMMENT_LINE	add undoable edit 
undoManager	TokenNameIdentifier	 undo Manager
=	TokenNameEQUAL	
new	TokenNamenew	
UndoManager	TokenNameIdentifier	 Undo Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UndoableEditListener	TokenNameIdentifier	 Undoable Edit Listener
undoableEditHandler	TokenNameIdentifier	 undoable Edit Handler
=	TokenNameEQUAL	
new	TokenNamenew	
UndoableEditListener	TokenNameIdentifier	 Undoable Edit Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undoableEditHappened	TokenNameIdentifier	 undoable Edit Happened
(	TokenNameLPAREN	
UndoableEditEvent	TokenNameIdentifier	 Undoable Edit Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
undoManager	TokenNameIdentifier	 undo Manager
.	TokenNameDOT	
addEdit	TokenNameIdentifier	 add Edit
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getEdit	TokenNameIdentifier	 get Edit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addUndoableEditListener	TokenNameIdentifier	 add Undoable Edit Listener
(	TokenNameLPAREN	
undoableEditHandler	TokenNameIdentifier	 undoable Edit Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
undoManager	TokenNameIdentifier	 undo Manager
.	TokenNameDOT	
discardAllEdits	TokenNameIdentifier	 discard All Edits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Undo */	TokenNameCOMMENT_JAVADOC	 Undo 
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
undoManager	TokenNameIdentifier	 undo Manager
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CannotUndoException	TokenNameIdentifier	 Cannot Undo Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Redo */	TokenNameCOMMENT_JAVADOC	 Redo 
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
undoManager	TokenNameIdentifier	 undo Manager
.	TokenNameDOT	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CannotRedoException	TokenNameIdentifier	 Cannot Redo Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Move the cursor to the specified line * if exception occur cursor not change * @param line the specified line number */	TokenNameCOMMENT_JAVADOC	 Move the cursor to the specified line if exception occur cursor not change @param line the specified line number 
public	TokenNamepublic	
void	TokenNamevoid	
gotoLine	TokenNameIdentifier	 goto Line
(	TokenNameLPAREN	
int	TokenNameint	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultRootElement	TokenNameIdentifier	 get Default Root Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCaretPosition	TokenNameIdentifier	 set Caret Position
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

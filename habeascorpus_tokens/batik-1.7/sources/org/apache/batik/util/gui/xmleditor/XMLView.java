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
Graphics	TokenNameIdentifier	 Graphics
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
PlainView	TokenNameIdentifier	 Plain View
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Utilities	TokenNameIdentifier	 Utilities
;	TokenNameSEMICOLON	
/** * View that uses the lexical information to determine the * style characteristics of the text that it renders. This * simply colorizes the various tokens and assumes a constant * font family and size. * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 View that uses the lexical information to determine the style characteristics of the text that it renders. This simply colorizes the various tokens and assumes a constant font family and size. * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
XMLView	TokenNameIdentifier	 XML View
extends	TokenNameextends	
PlainView	TokenNameIdentifier	 Plain View
{	TokenNameLBRACE	
protected	TokenNameprotected	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLScanner	TokenNameIdentifier	 XML Scanner
lexer	TokenNameIdentifier	 lexer
=	TokenNameEQUAL	
new	TokenNamenew	
XMLScanner	TokenNameIdentifier	 XML Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
tabSize	TokenNameIdentifier	 tab Size
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct a simple colorized view of XML * text. */	TokenNameCOMMENT_JAVADOC	 Construct a simple colorized view of XML text. 
public	TokenNamepublic	
XMLView	TokenNameIdentifier	 XML View
(	TokenNameLPAREN	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
int	TokenNameint	
getTabSize	TokenNameIdentifier	 get Tab Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tabSize	TokenNameIdentifier	 tab Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
int	TokenNameint	
drawUnselectedText	TokenNameIdentifier	 draw Unselected Text
(	TokenNameLPAREN	
Graphics	TokenNameIdentifier	 Graphics
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
p0	TokenNameIdentifier	 p0
,	TokenNameCOMMA	
int	TokenNameint	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
XMLDocument	TokenNameIdentifier	 XML Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLDocument	TokenNameIdentifier	 XML Document
)	TokenNameRPAREN	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLToken	TokenNameIdentifier	 XML Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getScannerStart	TokenNameIdentifier	 get Scanner Start
(	TokenNameLPAREN	
p0	TokenNameIdentifier	 p0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
-	TokenNameMINUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
// read until p0 	TokenNameCOMMENT_LINE	read until p0 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastCtx	TokenNameIdentifier	 last Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
p0	TokenNameIdentifier	 p0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastCtx	TokenNameIdentifier	 last Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
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
int	TokenNameint	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
p0	TokenNameIdentifier	 p0
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
!=	TokenNameNOT_EQUAL	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//syntax = context.getSyntaxName(lastCtx); 	TokenNameCOMMENT_LINE	syntax = context.getSyntaxName(lastCtx); 
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSyntaxForeground	TokenNameIdentifier	 get Syntax Foreground
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getLineBuffer	TokenNameIdentifier	 get Line Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
mark	TokenNameIdentifier	 mark
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Utilities	TokenNameIdentifier	 Utilities
.	TokenNameDOT	
drawTabbedText	TokenNameIdentifier	 draw Tabbed Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastCtx	TokenNameIdentifier	 last Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
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
// flush remaining 	TokenNameCOMMENT_LINE	flush remaining 
//syntax = context.getSyntaxName(lastCtx); 	TokenNameCOMMENT_LINE	syntax = context.getSyntaxName(lastCtx); 
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSyntaxForeground	TokenNameIdentifier	 get Syntax Foreground
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
lastCtx	TokenNameIdentifier	 last Ctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getLineBuffer	TokenNameIdentifier	 get Line Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
-	TokenNameMINUS	
mark	TokenNameIdentifier	 mark
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Utilities	TokenNameIdentifier	 Utilities
.	TokenNameDOT	
drawTabbedText	TokenNameIdentifier	 draw Tabbed Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX Reinstate this when Java 1.4 is required: 	TokenNameCOMMENT_LINE	XXX Reinstate this when Java 1.4 is required: 
// 	TokenNameCOMMENT_LINE	 
// http://mail-archives.apache.org/mod_mbox/xmlgraphics-batik-dev/200711.mbox/%3cf75892d60711301037j5abc6760h37ee4491037f1b4a@mail.gmail.com%3e 	TokenNameCOMMENT_LINE	http://mail-archives.apache.org/mod_mbox/xmlgraphics-batik-dev/200711.mbox/%3cf75892d60711301037j5abc6760h37ee4491037f1b4a@mail.gmail.com%3e 
// 	TokenNameCOMMENT_LINE	 
// /** Overriden to handle multi line node 	TokenNameCOMMENT_LINE	/** Overriden to handle multi line node 
// * {@inheritDoc} 	TokenNameCOMMENT_LINE	* {@inheritDoc} 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected void updateDamage(javax.swing.event.DocumentEvent changes, 	TokenNameCOMMENT_LINE	protected void updateDamage(javax.swing.event.DocumentEvent changes, 
// Shape a, 	TokenNameCOMMENT_LINE	Shape a, 
// ViewFactory f) { 	TokenNameCOMMENT_LINE	ViewFactory f) { 
// super.updateDamage(changes, a, f); 	TokenNameCOMMENT_LINE	super.updateDamage(changes, a, f); 
// java.awt.Component host = getContainer(); 	TokenNameCOMMENT_LINE	java.awt.Component host = getContainer(); 
// host.repaint(); 	TokenNameCOMMENT_LINE	host.repaint(); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	

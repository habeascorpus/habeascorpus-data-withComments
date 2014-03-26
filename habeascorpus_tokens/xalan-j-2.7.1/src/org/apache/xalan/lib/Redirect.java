/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Redirect.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Redirect.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
OutputProperties	TokenNameIdentifier	 Output Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * Implements three extension elements to allow an XSLT transformation to * redirect its output to multiple output files. * * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:redirect="http://xml.apache.org/xalan/redirect" * </pre> * * <p>You can either just use redirect:write, in which case the file will be * opened and immediately closed after the write, or you can bracket the * write calls by redirect:open and redirect:close, in which case the * file will be kept open for multiple writes until the close call is * encountered. Calls can be nested. * * <p>Calls can take a 'file' attribute * and/or a 'select' attribute in order to get the filename. If a select * attribute is encountered, it will evaluate that expression for a string * that indicates the filename. If the string evaluates to empty, it will * attempt to use the 'file' attribute as a default. Filenames can be relative * or absolute. If they are relative, the base directory will be the same as * the base directory for the output document. This is obtained by calling * getOutputTarget() on the TransformerImpl. You can set this base directory * by calling TransformerImpl.setOutputTarget() or it is automatically set * when using the two argument form of transform() or transformNode(). * * <p>Calls to redirect:write and redirect:open also take an optional * attribute append="true|yes", which will attempt to simply append * to an existing file instead of always opening a new file. The * default behavior of always overwriting the file still happens * if you do not specify append. * <p><b>Note:</b> this may give unexpected results when using xml * or html output methods, since this is <b>not</b> coordinated * with the serializers - hence, you may get extra xml decls in * the middle of your file after appending to it. * * <p>Example:</p> * <PRE> * &lt;?xml version="1.0"?> * &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" * version="1.0" * xmlns:redirect="http://xml.apache.org/xalan/redirect" * extension-element-prefixes="redirect"> * * &lt;xsl:template match="/"> * &lt;out> * default output. * &lt;/out> * &lt;redirect:open file="doc3.out"/> * &lt;redirect:write file="doc3.out"> * &lt;out> * &lt;redirect:write file="doc1.out"> * &lt;out> * doc1 output. * &lt;redirect:write file="doc3.out"> * Some text to doc3 * &lt;/redirect:write> * &lt;/out> * &lt;/redirect:write> * &lt;redirect:write file="doc2.out"> * &lt;out> * doc2 output. * &lt;redirect:write file="doc3.out"> * Some more text to doc3 * &lt;redirect:write select="doc/foo"> * text for doc4 * &lt;/redirect:write> * &lt;/redirect:write> * &lt;/out> * &lt;/redirect:write> * &lt;/out> * &lt;/redirect:write> * &lt;redirect:close file="doc3.out"/> * &lt;/xsl:template> * * &lt;/xsl:stylesheet> * </PRE> * * @author Scott Boag * @version 1.0 * @see <a href="../../../../../../extensions.html#ex-redirect" target="_top">Example with Redirect extension</a> */	TokenNameCOMMENT_JAVADOC	 Implements three extension elements to allow an XSLT transformation to redirect its output to multiple output files. * It is accessed by specifying a namespace URI as follows: <pre> xmlns:redirect="http://xml.apache.org/xalan/redirect" </pre> * <p>You can either just use redirect:write, in which case the file will be opened and immediately closed after the write, or you can bracket the write calls by redirect:open and redirect:close, in which case the file will be kept open for multiple writes until the close call is encountered. Calls can be nested. * <p>Calls can take a 'file' attribute and/or a 'select' attribute in order to get the filename. If a select attribute is encountered, it will evaluate that expression for a string that indicates the filename. If the string evaluates to empty, it will attempt to use the 'file' attribute as a default. Filenames can be relative or absolute. If they are relative, the base directory will be the same as the base directory for the output document. This is obtained by calling getOutputTarget() on the TransformerImpl. You can set this base directory by calling TransformerImpl.setOutputTarget() or it is automatically set when using the two argument form of transform() or transformNode(). * <p>Calls to redirect:write and redirect:open also take an optional attribute append="true|yes", which will attempt to simply append to an existing file instead of always opening a new file. The default behavior of always overwriting the file still happens if you do not specify append. <p><b>Note:</b> this may give unexpected results when using xml or html output methods, since this is <b>not</b> coordinated with the serializers - hence, you may get extra xml decls in the middle of your file after appending to it. * <p>Example:</p> <PRE> &lt;?xml version="1.0"?> &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:redirect="http://xml.apache.org/xalan/redirect" extension-element-prefixes="redirect"> * &lt;xsl:template match="/"> &lt;out> default output. &lt;/out> &lt;redirect:open file="doc3.out"/> &lt;redirect:write file="doc3.out"> &lt;out> &lt;redirect:write file="doc1.out"> &lt;out> doc1 output. &lt;redirect:write file="doc3.out"> Some text to doc3 &lt;/redirect:write> &lt;/out> &lt;/redirect:write> &lt;redirect:write file="doc2.out"> &lt;out> doc2 output. &lt;redirect:write file="doc3.out"> Some more text to doc3 &lt;redirect:write select="doc/foo"> text for doc4 &lt;/redirect:write> &lt;/redirect:write> &lt;/out> &lt;/redirect:write> &lt;/out> &lt;/redirect:write> &lt;redirect:close file="doc3.out"/> &lt;/xsl:template> * &lt;/xsl:stylesheet> </PRE> * @author Scott Boag @version 1.0 @see <a href="../../../../../../extensions.html#ex-redirect" target="_top">Example with Redirect extension</a> 
public	TokenNamepublic	
class	TokenNameclass	
Redirect	TokenNameIdentifier	 Redirect
{	TokenNameLBRACE	
/** * List of formatter listeners indexed by filename. */	TokenNameCOMMENT_JAVADOC	 List of formatter listeners indexed by filename. 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List of output streams indexed by filename. */	TokenNameCOMMENT_JAVADOC	 List of output streams indexed by filename. 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
m_outputStreams	TokenNameIdentifier	 m output Streams
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default append mode for bare open calls. * False for backwards compatibility (I think). */	TokenNameCOMMENT_JAVADOC	 Default append mode for bare open calls. False for backwards compatibility (I think). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_APPEND_OPEN	TokenNameIdentifier	 DEFAULT  APPEND  OPEN
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default append mode for bare write calls. * False for backwards compatibility. */	TokenNameCOMMENT_JAVADOC	 Default append mode for bare write calls. False for backwards compatibility. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_APPEND_WRITE	TokenNameIdentifier	 DEFAULT  APPEND  WRITE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Open the given file and put it in the XML, HTML, or Text formatter listener's table. */	TokenNameCOMMENT_JAVADOC	 Open the given file and put it in the XML, HTML, or Text formatter listener's table. 
public	TokenNamepublic	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
flistener	TokenNameIdentifier	 flistener
=	TokenNameEQUAL	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
flistener	TokenNameIdentifier	 flistener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"mkdirs"	TokenNameStringLiteral	mkdirs
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mkdirs	TokenNameIdentifier	 mkdirs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
||	TokenNameOR_OR	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Whether to append to existing files or not, <jpvdm@iafrica.com> 	TokenNameCOMMENT_LINE	Whether to append to existing files or not, <jpvdm@iafrica.com> 
String	TokenNameIdentifier	 String
appendExpr	TokenNameIdentifier	 append Expr
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"append"	TokenNameStringLiteral	append
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
(	TokenNameLPAREN	
appendExpr	TokenNameIdentifier	 append Expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
appendExpr	TokenNameIdentifier	 append Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
||	TokenNameOR_OR	
appendExpr	TokenNameIdentifier	 append Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DEFAULT_APPEND_OPEN	TokenNameIdentifier	 DEFAULT  APPEND  OPEN
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ignored	TokenNameIdentifier	 ignored
=	TokenNameEQUAL	
makeFormatterListener	TokenNameIdentifier	 make Formatter Listener
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
mkdirs	TokenNameIdentifier	 mkdirs
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write the evalutation of the element children to the given file. Then close the file * unless it was opened with the open extension element and is in the formatter listener's table. */	TokenNameCOMMENT_JAVADOC	 Write the evalutation of the element children to the given file. Then close the file unless it was opened with the open extension element and is in the formatter listener's table. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
flObject	TokenNameIdentifier	 fl Object
=	TokenNameEQUAL	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContentHandler	TokenNameIdentifier	 Content Handler
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inTable	TokenNameIdentifier	 in Table
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
flObject	TokenNameIdentifier	 fl Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"mkdirs"	TokenNameStringLiteral	mkdirs
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mkdirs	TokenNameIdentifier	 mkdirs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
||	TokenNameOR_OR	
mkdirsExpr	TokenNameIdentifier	 mkdirs Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Whether to append to existing files or not, <jpvdm@iafrica.com> 	TokenNameCOMMENT_LINE	Whether to append to existing files or not, <jpvdm@iafrica.com> 
String	TokenNameIdentifier	 String
appendExpr	TokenNameIdentifier	 append Expr
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"append"	TokenNameStringLiteral	append
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
(	TokenNameLPAREN	
appendExpr	TokenNameIdentifier	 append Expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
appendExpr	TokenNameIdentifier	 append Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
||	TokenNameOR_OR	
appendExpr	TokenNameIdentifier	 append Expr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DEFAULT_APPEND_WRITE	TokenNameIdentifier	 DEFAULT  APPEND  WRITE
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
makeFormatterListener	TokenNameIdentifier	 make Formatter Listener
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
mkdirs	TokenNameIdentifier	 mkdirs
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inTable	TokenNameIdentifier	 in Table
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
flObject	TokenNameIdentifier	 fl Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transf	TokenNameIdentifier	 transf
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startRedirection	TokenNameIdentifier	 start Redirection
(	TokenNameLPAREN	
transf	TokenNameIdentifier	 transf
,	TokenNameCOMMA	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for tracing only 	TokenNameCOMMENT_LINE	for tracing only 
transf	TokenNameIdentifier	 transf
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endRedirection	TokenNameIdentifier	 end Redirection
(	TokenNameLPAREN	
transf	TokenNameIdentifier	 transf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for tracing only 	TokenNameCOMMENT_LINE	for tracing only 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inTable	TokenNameIdentifier	 in Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
)	TokenNameRPAREN	
m_outputStreams	TokenNameIdentifier	 m output Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
ostream	TokenNameIdentifier	 ostream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputStreams	TokenNameIdentifier	 m output Streams
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close the given file and remove it from the formatter listener's table. */	TokenNameCOMMENT_JAVADOC	 Close the given file and remove it from the formatter listener's table. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
formatterObj	TokenNameIdentifier	 formatter Obj
=	TokenNameEQUAL	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
formatterObj	TokenNameIdentifier	 formatter Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContentHandler	TokenNameIdentifier	 Content Handler
fl	TokenNameIdentifier	 fl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
formatterObj	TokenNameIdentifier	 formatter Obj
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fl	TokenNameIdentifier	 fl
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
)	TokenNameRPAREN	
m_outputStreams	TokenNameIdentifier	 m output Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ostream	TokenNameIdentifier	 ostream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputStreams	TokenNameIdentifier	 m output Streams
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the filename from the 'select' or the 'file' attribute. */	TokenNameCOMMENT_JAVADOC	 Get the filename from the 'select' or the 'file' attribute. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileNameExpr	TokenNameIdentifier	 file Name Expr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
fileNameExpr	TokenNameIdentifier	 file Name Expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
myxpath	TokenNameIdentifier	 myxpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
fileNameExpr	TokenNameIdentifier	 file Name Expr
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
myxpath	TokenNameIdentifier	 myxpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Redirect extension: Could not get filename - file or select attribute must return vald string."); 	TokenNameCOMMENT_LINE	"Redirect extension: Could not get filename - file or select attribute must return vald string."); 
}	TokenNameRBRACE	
return	TokenNamereturn	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// yuck. 	TokenNameCOMMENT_LINE	yuck. 
// Note: this is not the best way to do this, and may not even 	TokenNameCOMMENT_LINE	Note: this is not the best way to do this, and may not even 
// be fully correct! Patches (with test cases) welcomed. -sc 	TokenNameCOMMENT_LINE	be fully correct! Patches (with test cases) welcomed. -sc 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
urlToFileName	TokenNameIdentifier	 url To File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:////"	TokenNameStringLiteral	file:////
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:///"	TokenNameStringLiteral	file:///
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file://"	TokenNameStringLiteral	file://
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// absolute? 	TokenNameCOMMENT_LINE	absolute? 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new ContentHandler, based on attributes of the current ContentHandler. */	TokenNameCOMMENT_JAVADOC	 Create a new ContentHandler, based on attributes of the current ContentHandler. 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
makeFormatterListener	TokenNameIdentifier	 make Formatter Listener
(	TokenNameLPAREN	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldPutInTable	TokenNameIdentifier	 should Put In Table
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mkdirs	TokenNameIdentifier	 mkdirs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
// Base URI to use for relative paths 	TokenNameCOMMENT_LINE	Base URI to use for relative paths 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This code is attributed to Jon Grov <jon@linpro.no>. A relative file name 	TokenNameCOMMENT_LINE	This code is attributed to Jon Grov <jon@linpro.no>. A relative file name 
// is relative to the Result used to kick off the transform. If no such 	TokenNameCOMMENT_LINE	is relative to the Result used to kick off the transform. If no such 
// Result was supplied, the filename is relative to the source document. 	TokenNameCOMMENT_LINE	Result was supplied, the filename is relative to the source document. 
// When transforming with a SAXResult or DOMResult, call 	TokenNameCOMMENT_LINE	When transforming with a SAXResult or DOMResult, call 
// TransformerImpl.setOutputTarget() to set the desired Result base. 	TokenNameCOMMENT_LINE	TransformerImpl.setOutputTarget() to set the desired Result base. 
// String base = urlToFileName(elem.getStylesheet().getSystemId()); 	TokenNameCOMMENT_LINE	String base = urlToFileName(elem.getStylesheet().getSystemId()); 
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getOutputTarget	TokenNameIdentifier	 get Output Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
outputTarget	TokenNameIdentifier	 output Target
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
urlToFileName	TokenNameIdentifier	 url To File Name
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
urlToFileName	TokenNameIdentifier	 url To File Name
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getBaseURLOfSource	TokenNameIdentifier	 get Base URL Of Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
baseFile	TokenNameIdentifier	 base File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
baseFile	TokenNameIdentifier	 base File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("file is: "+file.toString()); 	TokenNameCOMMENT_LINE	System.out.println("file is: "+file.toString()); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mkdirs	TokenNameIdentifier	 mkdirs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dirStr	TokenNameIdentifier	 dir Str
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dirStr	TokenNameIdentifier	 dir Str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dirStr	TokenNameIdentifier	 dir Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dirStr	TokenNameIdentifier	 dir Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This should be worked on so that the output format can be 	TokenNameCOMMENT_LINE	This should be worked on so that the output format can be 
// defined by a first child of the redirect element. 	TokenNameCOMMENT_LINE	defined by a first child of the redirect element. 
OutputProperties	TokenNameIdentifier	 Output Properties
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// FileOutputStream ostream = new FileOutputStream(file); 	TokenNameCOMMENT_LINE	FileOutputStream ostream = new FileOutputStream(file); 
// Patch from above line to below by <jpvdm@iafrica.com> 	TokenNameCOMMENT_LINE	Patch from above line to below by <jpvdm@iafrica.com> 
// Note that in JDK 1.2.2 at least, FileOutputStream(File) 	TokenNameCOMMENT_LINE	Note that in JDK 1.2.2 at least, FileOutputStream(File) 
// is implemented as a call to 	TokenNameCOMMENT_LINE	is implemented as a call to 
// FileOutputStream(File.getPath, append), thus this should be 	TokenNameCOMMENT_LINE	FileOutputStream(File.getPath, append), thus this should be 
// the equivalent instead of getAbsolutePath() 	TokenNameCOMMENT_LINE	the equivalent instead of getAbsolutePath() 
FileOutputStream	TokenNameIdentifier	 File Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
flistener	TokenNameIdentifier	 flistener
=	TokenNameEQUAL	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
ostream	TokenNameIdentifier	 ostream
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
flistener	TokenNameIdentifier	 flistener
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
shouldPutInTable	TokenNameIdentifier	 should Put In Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputStreams	TokenNameIdentifier	 m output Streams
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_formatterListeners	TokenNameIdentifier	 m formatter Listeners
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
flistener	TokenNameIdentifier	 flistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
flistener	TokenNameIdentifier	 flistener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A class that extends this class can over-ride this public method and recieve * a callback that redirection is about to start * @param transf The transformer. * @param formatter The handler that receives the redirected output */	TokenNameCOMMENT_JAVADOC	 A class that extends this class can over-ride this public method and recieve a callback that redirection is about to start @param transf The transformer. @param formatter The handler that receives the redirected output 
public	TokenNamepublic	
void	TokenNamevoid	
startRedirection	TokenNameIdentifier	 start Redirection
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transf	TokenNameIdentifier	 transf
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A class that extends this class could provide a method body 	TokenNameCOMMENT_LINE	A class that extends this class could provide a method body 
}	TokenNameRBRACE	
/** * A class that extends this class can over-ride this public method and receive * a callback that redirection to the ContentHandler specified in the startRedirection() * call has ended * @param transf The transformer. */	TokenNameCOMMENT_JAVADOC	 A class that extends this class can over-ride this public method and receive a callback that redirection to the ContentHandler specified in the startRedirection() call has ended @param transf The transformer. 
public	TokenNamepublic	
void	TokenNamevoid	
endRedirection	TokenNameIdentifier	 end Redirection
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transf	TokenNameIdentifier	 transf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A class that extends this class could provide a method body 	TokenNameCOMMENT_LINE	A class that extends this class could provide a method body 
}	TokenNameRBRACE	
/** * A class that extends this one could over-ride this public method and receive * a callback for the creation of the serializer used in the redirection. * @param transformer The transformer * @param ostream The output stream that the serializer wraps * @param file The file associated with the ostream * @param format The format parameter used to create the serializer * @return the serializer that the redirection will go to. * * @throws java.io.IOException * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 A class that extends this one could over-ride this public method and receive a callback for the creation of the serializer used in the redirection. @param transformer The transformer @param ostream The output stream that the serializer wraps @param file The file associated with the ostream @param format The format parameter used to create the serializer @return the serializer that the redirection will go to. * @throws java.io.IOException @throws TransformerException 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
FileOutputStream	TokenNameIdentifier	 File Output Stream
ostream	TokenNameIdentifier	 ostream
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
OutputProperties	TokenNameIdentifier	 Output Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

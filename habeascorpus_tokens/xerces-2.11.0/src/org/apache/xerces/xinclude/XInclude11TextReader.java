/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xinclude	TokenNameIdentifier	 xinclude
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * This class is used for reading resources requested in &lt;include&gt; elements in * XML 1.1 entities, when the parse attribute of the &lt;include&gt; element is "text". * Using this class will open the location, detect the encoding, and discard the * byte order mark, if applicable. * * @author Michael Glavassevich, IBM * * @version $Id: XInclude11TextReader.java 447243 2006-09-18 05:15:27Z mrglavas $ * * @see XIncludeHandler */	TokenNameCOMMENT_JAVADOC	 This class is used for reading resources requested in &lt;include&gt; elements in XML 1.1 entities, when the parse attribute of the &lt;include&gt; element is "text". Using this class will open the location, detect the encoding, and discard the byte order mark, if applicable. * @author Michael Glavassevich, IBM * @version $Id: XInclude11TextReader.java 447243 2006-09-18 05:15:27Z mrglavas $ * @see XIncludeHandler 
public	TokenNamepublic	
class	TokenNameclass	
XInclude11TextReader	TokenNameIdentifier	 X Include11 Text Reader
extends	TokenNameextends	
XIncludeTextReader	TokenNameIdentifier	 X Include Text Reader
{	TokenNameLBRACE	
/** * Construct the XIncludeReader using the XMLInputSource and XIncludeHandler. * * @param source The XMLInputSource to use. * @param handler The XIncludeHandler to use. * @param bufferSize The size of this text reader's buffer. */	TokenNameCOMMENT_JAVADOC	 Construct the XIncludeReader using the XMLInputSource and XIncludeHandler. * @param source The XMLInputSource to use. @param handler The XIncludeHandler to use. @param bufferSize The size of this text reader's buffer. 
public	TokenNamepublic	
XInclude11TextReader	TokenNameIdentifier	 X Include11 Text Reader
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
XIncludeHandler	TokenNameIdentifier	 X Include Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified character is a valid XML character * as per the rules of XML 1.1. * * @param ch The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid XML character as per the rules of XML 1.1. * @param ch The character to check. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

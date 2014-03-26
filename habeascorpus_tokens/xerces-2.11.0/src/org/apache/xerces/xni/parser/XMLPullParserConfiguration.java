/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Represents a parser configuration that can be used as the * configuration for a "pull" parser. A pull parser allows the * application to drive the parser instead of having document * information events "pushed" to the registered handlers. * <p> * A pull parser using this type of configuration first calls * the <code>setInputSource</code> method. After the input * source is set, the pull parser repeatedly calls the * <code>parse(boolean):boolean</code> method. This method * returns a value of true if there is more to parse in the * document. * <p> * Calling the <code>parse(XMLInputSource)</code> is equivalent * to setting the input source and calling the * <code>parse(boolean):boolean</code> method with a "complete" * value of <code>true</code>. * * @author Andy Clark, IBM * * @version $Id: XMLPullParserConfiguration.java 447244 2006-09-18 05:20:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represents a parser configuration that can be used as the configuration for a "pull" parser. A pull parser allows the application to drive the parser instead of having document information events "pushed" to the registered handlers. <p> A pull parser using this type of configuration first calls the <code>setInputSource</code> method. After the input source is set, the pull parser repeatedly calls the <code>parse(boolean):boolean</code> method. This method returns a value of true if there is more to parse in the document. <p> Calling the <code>parse(XMLInputSource)</code> is equivalent to setting the input source and calling the <code>parse(boolean):boolean</code> method with a "complete" value of <code>true</code>. * @author Andy Clark, IBM * @version $Id: XMLPullParserConfiguration.java 447244 2006-09-18 05:20:40Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLPullParserConfiguration	TokenNameIdentifier	 XML Pull Parser Configuration
extends	TokenNameextends	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLPullParserConfiguration methods 	TokenNameCOMMENT_LINE	XMLPullParserConfiguration methods 
// 	TokenNameCOMMENT_LINE	 
// parsing 	TokenNameCOMMENT_LINE	parsing 
/** * Sets the input source for the document to parse. * * @param inputSource The document's input source. * * @exception XMLConfigurationException Thrown if there is a * configuration error when initializing the * parser. * @exception IOException Thrown on I/O error. * * @see #parse(boolean) */	TokenNameCOMMENT_JAVADOC	 Sets the input source for the document to parse. * @param inputSource The document's input source. * @exception XMLConfigurationException Thrown if there is a configuration error when initializing the parser. @exception IOException Thrown on I/O error. * @see #parse(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setInputSource	TokenNameIdentifier	 set Input Source
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parses the document in a pull parsing fashion. * * @param complete True if the pull parser should parse the * remaining document completely. * * @return True if there is more document to parse. * * @exception XNIException Any XNI exception, possibly wrapping * another exception. * @exception IOException An IO exception from the parser, possibly * from a byte stream or character stream * supplied by the parser. * * @see #setInputSource */	TokenNameCOMMENT_JAVADOC	 Parses the document in a pull parsing fashion. * @param complete True if the pull parser should parse the remaining document completely. * @return True if there is more document to parse. * @exception XNIException Any XNI exception, possibly wrapping another exception. @exception IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the parser. * @see #setInputSource 
public	TokenNamepublic	
boolean	TokenNameboolean	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * If the application decides to terminate parsing before the xml document * is fully parsed, the application should call this method to free any * resource allocated during parsing. For example, close all opened streams. */	TokenNameCOMMENT_JAVADOC	 If the application decides to terminate parsing before the xml document is fully parsed, the application should call this method to free any resource allocated during parsing. For example, close all opened streams. 
public	TokenNamepublic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLPullParserConfiguration 	TokenNameCOMMENT_LINE	interface XMLPullParserConfiguration 

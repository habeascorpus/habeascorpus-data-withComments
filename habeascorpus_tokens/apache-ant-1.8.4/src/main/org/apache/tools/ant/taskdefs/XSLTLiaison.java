/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Proxy interface for XSLT processors. * * @see XSLTProcess * @since Ant 1.1 */	TokenNameCOMMENT_JAVADOC	 Proxy interface for XSLT processors. * @see XSLTProcess @since Ant 1.1 
public	TokenNamepublic	
interface	TokenNameinterface	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
{	TokenNameLBRACE	
/** * the file protocol prefix for systemid. * This file protocol must be appended to an absolute path. * Typically: <tt>FILE_PROTOCOL_PREFIX + file.getAbsolutePath()</tt> * Note that on Windows, an extra '/' must be appended to the * protocol prefix so that there is always 3 consecutive slashes. * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 the file protocol prefix for systemid. This file protocol must be appended to an absolute path. Typically: <tt>FILE_PROTOCOL_PREFIX + file.getAbsolutePath()</tt> Note that on Windows, an extra '/' must be appended to the protocol prefix so that there is always 3 consecutive slashes. @since Ant 1.4 
String	TokenNameIdentifier	 String
FILE_PROTOCOL_PREFIX	TokenNameIdentifier	 FILE  PROTOCOL  PREFIX
=	TokenNameEQUAL	
"file://"	TokenNameStringLiteral	file://
;	TokenNameSEMICOLON	
/** * set the stylesheet to use for the transformation. * @param stylesheet the stylesheet to be used for transformation. * @throws Exception thrown if any problems happens. * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 set the stylesheet to use for the transformation. @param stylesheet the stylesheet to be used for transformation. @throws Exception thrown if any problems happens. @since Ant 1.4 
void	TokenNamevoid	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Add a parameter to be set during the XSL transformation. * @param name the parameter name. * @param expression the parameter value as an expression string. * @throws Exception thrown if any problems happens. * @since Ant 1.3 */	TokenNameCOMMENT_JAVADOC	 Add a parameter to be set during the XSL transformation. @param name the parameter name. @param expression the parameter value as an expression string. @throws Exception thrown if any problems happens. @since Ant 1.3 
void	TokenNamevoid	
addParam	TokenNameIdentifier	 add Param
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Perform the transformation of a file into another. * @param infile the input file, probably an XML one. :-) * @param outfile the output file resulting from the transformation * @throws Exception thrown if any problems happens. * @see #setStylesheet(File) * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Perform the transformation of a file into another. @param infile the input file, probably an XML one. :-) @param outfile the output file resulting from the transformation @throws Exception thrown if any problems happens. @see #setStylesheet(File) @since Ant 1.4 
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
infile	TokenNameIdentifier	 infile
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
outfile	TokenNameIdentifier	 outfile
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-- XSLTLiaison 	TokenNameCOMMENT_LINE	-- XSLTLiaison 

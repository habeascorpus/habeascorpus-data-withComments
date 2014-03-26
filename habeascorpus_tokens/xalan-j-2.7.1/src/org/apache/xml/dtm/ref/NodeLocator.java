/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeLocator.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeLocator.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
/** * <code>NodeLocator</code> maintains information on an XML source * node. * * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a> * @since May 23, 2001 */	TokenNameCOMMENT_JAVADOC	 <code>NodeLocator</code> maintains information on an XML source node. * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a> @since May 23, 2001 
public	TokenNamepublic	
class	TokenNameclass	
NodeLocator	TokenNameIdentifier	 Node Locator
implements	TokenNameimplements	
SourceLocator	TokenNameIdentifier	 Source Locator
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_publicId	TokenNameIdentifier	 m public Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_systemId	TokenNameIdentifier	 m system Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
m_lineNumber	TokenNameIdentifier	 m line Number
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
m_columnNumber	TokenNameIdentifier	 m column Number
;	TokenNameSEMICOLON	
/** * Creates a new <code>NodeLocator</code> instance. * * @param publicId a <code>String</code> value * @param systemId a <code>String</code> value * @param lineNumber an <code>int</code> value * @param columnNumber an <code>int</code> value */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>NodeLocator</code> instance. * @param publicId a <code>String</code> value @param systemId a <code>String</code> value @param lineNumber an <code>int</code> value @param columnNumber an <code>int</code> value 
public	TokenNamepublic	
NodeLocator	TokenNameIdentifier	 Node Locator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_publicId	TokenNameIdentifier	 m public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_systemId	TokenNameIdentifier	 m system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_lineNumber	TokenNameIdentifier	 m line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_columnNumber	TokenNameIdentifier	 m column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>getPublicId</code> returns the public ID of the node. * * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>getPublicId</code> returns the public ID of the node. * @return a <code>String</code> value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_publicId	TokenNameIdentifier	 m public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>getSystemId</code> returns the system ID of the node. * * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>getSystemId</code> returns the system ID of the node. * @return a <code>String</code> value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_systemId	TokenNameIdentifier	 m system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>getLineNumber</code> returns the line number of the node. * * @return an <code>int</code> value */	TokenNameCOMMENT_JAVADOC	 <code>getLineNumber</code> returns the line number of the node. * @return an <code>int</code> value 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lineNumber	TokenNameIdentifier	 m line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>getColumnNumber</code> returns the column number of the * node. * * @return an <code>int</code> value */	TokenNameCOMMENT_JAVADOC	 <code>getColumnNumber</code> returns the column number of the node. * @return an <code>int</code> value 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_columnNumber	TokenNameIdentifier	 m column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>toString</code> returns a string representation of this * NodeLocator instance. * * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>toString</code> returns a string representation of this NodeLocator instance. * @return a <code>String</code> value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"file '"	TokenNameStringLiteral	file '
+	TokenNamePLUS	
m_systemId	TokenNameIdentifier	 m system Id
+	TokenNamePLUS	
"', line #"	TokenNameStringLiteral	', line #
+	TokenNamePLUS	
m_lineNumber	TokenNameIdentifier	 m line Number
+	TokenNamePLUS	
", column #"	TokenNameStringLiteral	, column #
+	TokenNamePLUS	
m_columnNumber	TokenNameIdentifier	 m column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

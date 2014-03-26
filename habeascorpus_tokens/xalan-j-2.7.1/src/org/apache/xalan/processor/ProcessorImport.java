/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorImport.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorImport.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
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
/** * This class processes parse events for an xsl:import element. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class processes parse events for an xsl:import element. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorImport	TokenNameIdentifier	 Processor Import
extends	TokenNameextends	
ProcessorInclude	TokenNameIdentifier	 Processor Include
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8247537698214245237L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Get the stylesheet type associated with an imported stylesheet * * @return the type of the stylesheet */	TokenNameCOMMENT_JAVADOC	 Get the stylesheet type associated with an imported stylesheet * @return the type of the stylesheet 
protected	TokenNameprotected	
int	TokenNameint	
getStylesheetType	TokenNameIdentifier	 get Stylesheet Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
.	TokenNameDOT	
STYPE_IMPORT	TokenNameIdentifier	 STYPE  IMPORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the error number associated with this type of stylesheet importing itself * * @return the appropriate error number */	TokenNameCOMMENT_JAVADOC	 Get the error number associated with this type of stylesheet importing itself * @return the appropriate error number 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getStylesheetInclErr	TokenNameIdentifier	 get Stylesheet Incl Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

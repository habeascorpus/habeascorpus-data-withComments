/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
XMLNamespaceBinder	TokenNameIdentifier	 XML Namespace Binder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
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
XMLComponent	TokenNameIdentifier	 XML Component
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
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
;	TokenNameSEMICOLON	
/** * Non-validating parser configuration. * * @see XMLComponent * @see XMLParserConfiguration * * @author Andy Clark, IBM * * @version $Id: NonValidatingParserConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Non-validating parser configuration. * @see XMLComponent @see XMLParserConfiguration * @author Andy Clark, IBM * @version $Id: NonValidatingParserConfiguration.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
NonValidatingParserConfiguration	TokenNameIdentifier	 Non Validating Parser Configuration
extends	TokenNameextends	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// components (configurable) 	TokenNameCOMMENT_LINE	components (configurable) 
/** Namespace binder. */	TokenNameCOMMENT_JAVADOC	 Namespace binder. 
protected	TokenNameprotected	
XMLNamespaceBinder	TokenNameIdentifier	 XML Namespace Binder
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a document parser using the default symbol table and grammar * pool or the ones specified by the application (through the properties). */	TokenNameCOMMENT_JAVADOC	 Constructs a document parser using the default symbol table and grammar pool or the ones specified by the application (through the properties). 
public	TokenNamepublic	
NonValidatingParserConfiguration	TokenNameIdentifier	 Non Validating Parser Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create and register missing components 	TokenNameCOMMENT_LINE	create and register missing components 
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
=	TokenNameEQUAL	
new	TokenNamenew	
XMLNamespaceBinder	TokenNameIdentifier	 XML Namespace Binder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Configures the pipeline. */	TokenNameCOMMENT_JAVADOC	 Configures the pipeline. 
protected	TokenNameprotected	
void	TokenNamevoid	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: This should be better designed. In other words, we 	TokenNameCOMMENT_LINE	REVISIT: This should be better designed. In other words, we 
// need to figure out what is the best way for people to 	TokenNameCOMMENT_LINE	need to figure out what is the best way for people to 
// re-use *most* of the standard configuration but do 	TokenNameCOMMENT_LINE	re-use *most* of the standard configuration but do 
// common things such as remove a component (e.g.the 	TokenNameCOMMENT_LINE	common things such as remove a component (e.g.the 
// validator), insert a new component (e.g. XInclude), 	TokenNameCOMMENT_LINE	validator), insert a new component (e.g. XInclude), 
// etc... -Ac 	TokenNameCOMMENT_LINE	etc... -Ac 
// setup document pipeline 	TokenNameCOMMENT_LINE	setup document pipeline 
fScanner	TokenNameIdentifier	 f Scanner
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fScanner	TokenNameIdentifier	 f Scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// configurePipeline() 	TokenNameCOMMENT_LINE	configurePipeline() 
// factory methods 	TokenNameCOMMENT_LINE	factory methods 
/** Create a null validator. */	TokenNameCOMMENT_JAVADOC	 Create a null validator. 
protected	TokenNameprotected	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
createDTDValidator	TokenNameIdentifier	 create DTD Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createDTDValidator():XMLDTDValidator 	TokenNameCOMMENT_LINE	createDTDValidator():XMLDTDValidator 
}	TokenNameRBRACE	
// class NonValidatingParserConfiguration 	TokenNameCOMMENT_LINE	class NonValidatingParserConfiguration 

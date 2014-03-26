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
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
AbstractSAXParser	TokenNameIdentifier	 Abstract SAX Parser
;	TokenNameSEMICOLON	
/** * This parser class implements a SAX parser that includes DTDValidator, NamespaceBinder * XMLSchemaValidator and PSVI writer in the pipeline. The parser generates output in * psvi_output.xml file. * <strong>Note:</strong> PSVI follow as a consequence of validation and/or assessment, thus * the following features must be turned on: * <ul> * <li>http://xml.org/sax/features/namespaces</li> * <li>http://xml.org/sax/features/validation</li> * <li>http://apache.org/xml/features/validation/schema</li> * </ul> * * @author Elena Litani,IBM * @version $Id: PSVIParser.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This parser class implements a SAX parser that includes DTDValidator, NamespaceBinder XMLSchemaValidator and PSVI writer in the pipeline. The parser generates output in psvi_output.xml file. <strong>Note:</strong> PSVI follow as a consequence of validation and/or assessment, thus the following features must be turned on: <ul> <li>http://xml.org/sax/features/namespaces</li> <li>http://xml.org/sax/features/validation</li> <li>http://apache.org/xml/features/validation/schema</li> </ul> * @author Elena Litani,IBM @version $Id: PSVIParser.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
PSVIParser	TokenNameIdentifier	 PSVI Parser
extends	TokenNameextends	
AbstractSAXParser	TokenNameIdentifier	 Abstract SAX Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a SAX like parser using the PSVI configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX like parser using the PSVI configuration. 
public	TokenNamepublic	
PSVIParser	TokenNameIdentifier	 PSVI Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
PSVIConfiguration	TokenNameIdentifier	 PSVI Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
}	TokenNameRBRACE	
// class CSVParser 	TokenNameCOMMENT_LINE	class CSVParser 

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
/** * This parser class implements a SAX parser that can parse simple * comma-separated value (CSV) files. * * @author Andy Clark, IBM * * @version $Id: CSVParser.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This parser class implements a SAX parser that can parse simple comma-separated value (CSV) files. * @author Andy Clark, IBM * @version $Id: CSVParser.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CSVParser	TokenNameIdentifier	 CSV Parser
extends	TokenNameextends	
AbstractSAXParser	TokenNameIdentifier	 Abstract SAX Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a SAX like parser using the CSV configuration. */	TokenNameCOMMENT_JAVADOC	 Constructs a SAX like parser using the CSV configuration. 
public	TokenNamepublic	
CSVParser	TokenNameIdentifier	 CSV Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
CSVConfiguration	TokenNameIdentifier	 CSV Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
}	TokenNameRBRACE	
// class CSVParser 	TokenNameCOMMENT_LINE	class CSVParser 

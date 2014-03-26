/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** * An interface for factory objects than can create {@link Interpreter} * instances for a particular script language. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: InterpreterFactory.java 482913 2006-12-06 05:57:52Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for factory objects than can create {@link Interpreter} instances for a particular script language. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: InterpreterFactory.java 482913 2006-12-06 05:57:52Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
{	TokenNameLBRACE	
/** * Returns the mime-types to register this interpereter with. */	TokenNameCOMMENT_JAVADOC	 Returns the mime-types to register this interpereter with. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMimeTypes	TokenNameIdentifier	 get Mime Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method should create an instance of <code>Interpreter</code> * interface implementation. * * @param documentURL the url for the document which will be scripted * @param svg12 whether the document is an SVG 1.2 document */	TokenNameCOMMENT_JAVADOC	 This method should create an instance of <code>Interpreter</code> interface implementation. * @param documentURL the url for the document which will be scripted @param svg12 whether the document is an SVG 1.2 document 
Interpreter	TokenNameIdentifier	 Interpreter
createInterpreter	TokenNameIdentifier	 create Interpreter
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
,	TokenNameCOMMA	
boolean	TokenNameboolean	
svg12	TokenNameIdentifier	 svg12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

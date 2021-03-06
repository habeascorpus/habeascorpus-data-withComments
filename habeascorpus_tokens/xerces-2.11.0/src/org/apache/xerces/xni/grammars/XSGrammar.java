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
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSModel	TokenNameIdentifier	 XS Model
;	TokenNameSEMICOLON	
/** * Representing a schema grammar. It contains declaration/definitions from * a certain namespace. When a grammar is preparsed, and its grammar type is * XML Schema, it can be casted to this interface. Objects of this interface * can be converted to XSModel, from which further information about components * in this grammar can be obtained. * * @author Sandy Gao, IBM * * @version $Id: XSGrammar.java 570135 2007-08-27 14:15:35Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Representing a schema grammar. It contains declaration/definitions from a certain namespace. When a grammar is preparsed, and its grammar type is XML Schema, it can be casted to this interface. Objects of this interface can be converted to XSModel, from which further information about components in this grammar can be obtained. * @author Sandy Gao, IBM * @version $Id: XSGrammar.java 570135 2007-08-27 14:15:35Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XSGrammar	TokenNameIdentifier	 XS Grammar
extends	TokenNameextends	
Grammar	TokenNameIdentifier	 Grammar
{	TokenNameLBRACE	
/** * Return an <code>XSModel</code> that represents components in this schema * grammar and any schema grammars that are imported by this grammar * directly or indirectly. * * @return an <code>XSModel</code> representing this schema grammar */	TokenNameCOMMENT_JAVADOC	 Return an <code>XSModel</code> that represents components in this schema grammar and any schema grammars that are imported by this grammar directly or indirectly. * @return an <code>XSModel</code> representing this schema grammar 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return an <code>XSModel</code> that represents components in this schema * grammar and the grammars in the <code>grammars</code>parameter, * any schema grammars that are imported by them directly or indirectly. * * @return an <code>XSModel</code> representing these schema grammars */	TokenNameCOMMENT_JAVADOC	 Return an <code>XSModel</code> that represents components in this schema grammar and the grammars in the <code>grammars</code>parameter, any schema grammars that are imported by them directly or indirectly. * @return an <code>XSModel</code> representing these schema grammars 
public	TokenNamepublic	
XSModel	TokenNameIdentifier	 XS Model
toXSModel	TokenNameIdentifier	 to XS Model
(	TokenNameLPAREN	
XSGrammar	TokenNameIdentifier	 XS Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XSGrammar 	TokenNameCOMMENT_LINE	interface XSGrammar 

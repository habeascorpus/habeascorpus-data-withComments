/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
/** * XPath exception. * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: XPathException.java 572107 2007-09-02 18:40:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 XPath exception. * @xerces.internal * @author Andy Clark, IBM * @version $Id: XPathException.java 572107 2007-09-02 18:40:40Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XPathException	TokenNameIdentifier	 X Path Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
948482312169512085L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// Data 	TokenNameCOMMENT_LINE	Data 
// hold the value of the key this Exception refers to. 	TokenNameCOMMENT_LINE	hold the value of the key this Exception refers to. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an exception. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** Constructs an exception with the specified key. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the specified key. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String) 	TokenNameCOMMENT_LINE	<init>(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getKey(): String 	TokenNameCOMMENT_LINE	getKey(): String 
}	TokenNameRBRACE	
// class XPathException 	TokenNameCOMMENT_LINE	class XPathException 

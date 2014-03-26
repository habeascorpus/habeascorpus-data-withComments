/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Very simple abstract base class for ParsedURLProtocolHandlers. * Just handles the 'what protocol part'. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: AbstractParsedURLProtocolHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Very simple abstract base class for ParsedURLProtocolHandlers. Just handles the 'what protocol part'. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: AbstractParsedURLProtocolHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractParsedURLProtocolHandler	TokenNameIdentifier	 Abstract Parsed URL Protocol Handler
implements	TokenNameimplements	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
/** * Constrcut a ProtocolHandler for <tt>protocol</tt> */	TokenNameCOMMENT_JAVADOC	 Constrcut a ProtocolHandler for <tt>protocol</tt> 
public	TokenNamepublic	
AbstractParsedURLProtocolHandler	TokenNameIdentifier	 Abstract Parsed URL Protocol Handler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the protocol to be handled by this class. * The protocol must _always_ be the part of the URL before the * first ':'. */	TokenNameCOMMENT_JAVADOC	 Returns the protocol to be handled by this class. The protocol must _always_ be the part of the URL before the first ':'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProtocolHandled	TokenNameIdentifier	 get Protocol Handled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

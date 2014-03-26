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
/** * Provider interface for new url protocols, used by the ParsedURL class. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: ParsedURLProtocolHandler.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Provider interface for new url protocols, used by the ParsedURL class. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: ParsedURLProtocolHandler.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
{	TokenNameLBRACE	
/** * Returns the protocol to be handled by this class. * The protocol must _always_ be the part of the URL before the * first ':'. */	TokenNameCOMMENT_JAVADOC	 Returns the protocol to be handled by this class. The protocol must _always_ be the part of the URL before the first ':'. 
String	TokenNameIdentifier	 String
getProtocolHandled	TokenNameIdentifier	 get Protocol Handled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse an absolute url string. */	TokenNameCOMMENT_JAVADOC	 Parse an absolute url string. 
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse a relative url string of this protocol. */	TokenNameCOMMENT_JAVADOC	 Parse a relative url string of this protocol. 
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
basepurl	TokenNameIdentifier	 basepurl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

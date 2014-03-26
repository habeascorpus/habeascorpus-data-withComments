/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
;	TokenNameSEMICOLON	
/** * Like the Unix uniq(1) command, only returns tokens that are * different from their ancestor token. * * <p>This filter is probably most useful if used together with a * sortfilter.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Like the Unix uniq(1) command, only returns tokens that are different from their ancestor token. * <p>This filter is probably most useful if used together with a sortfilter.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
UniqFilter	TokenNameIdentifier	 Uniq Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
.	TokenNameDOT	
ChainableReaderFilter	TokenNameIdentifier	 Chainable Reader Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lastLine	TokenNameIdentifier	 last Line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastLine	TokenNameIdentifier	 last Line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
lastLine	TokenNameIdentifier	 last Line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
lastLine	TokenNameIdentifier	 last Line
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

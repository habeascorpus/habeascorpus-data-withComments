/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
mail	TokenNameIdentifier	 mail
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Specialized IOException that get thrown if SMPT's QUIT command fails. * * <p>This seems to happen with some version of MS Exchange that * doesn't respond with a 221 code immediately. See <a * href="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=5273">Bug * report 5273</a>.</p> * */	TokenNameCOMMENT_JAVADOC	 Specialized IOException that get thrown if SMPT's QUIT command fails. * <p>This seems to happen with some version of MS Exchange that doesn't respond with a 221 code immediately. See <a href="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=5273">Bug report 5273</a>.</p> 
public	TokenNamepublic	
class	TokenNameclass	
ErrorInQuitException	TokenNameIdentifier	 Error In Quit Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** * Initialise from an IOException * * @param e the IO Exception. */	TokenNameCOMMENT_JAVADOC	 Initialise from an IOException * @param e the IO Exception. 
public	TokenNamepublic	
ErrorInQuitException	TokenNameIdentifier	 Error In Quit Exception
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

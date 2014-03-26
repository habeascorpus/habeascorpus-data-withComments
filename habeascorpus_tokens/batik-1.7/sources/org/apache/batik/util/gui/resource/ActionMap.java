/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
Action	TokenNameIdentifier	 Action
;	TokenNameSEMICOLON	
/** * This interface represents an object which maps actions to strings * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ActionMap.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents an object which maps actions to strings * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ActionMap.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ActionMap	TokenNameIdentifier	 Action Map
{	TokenNameLBRACE	
/** * Returns the action associated with the given string * or null on error * @param key the key mapped with the action to get * @throws MissingListenerException if the action is not found */	TokenNameCOMMENT_JAVADOC	 Returns the action associated with the given string or null on error @param key the key mapped with the action to get @throws MissingListenerException if the action is not found 
Action	TokenNameIdentifier	 Action
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

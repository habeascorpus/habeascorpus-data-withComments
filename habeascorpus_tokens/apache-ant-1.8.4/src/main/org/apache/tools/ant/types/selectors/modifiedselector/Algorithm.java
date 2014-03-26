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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * The <i>Algorithm</i> defines how a value for a file is computed. * It must be sure that multiple calls for the same file results in the * same value. * The implementing class should implement a useful toString() method. * * @version 2003-09-13 * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 The <i>Algorithm</i> defines how a value for a file is computed. It must be sure that multiple calls for the same file results in the same value. The implementing class should implement a useful toString() method. * @version 2003-09-13 @since Ant 1.6 
public	TokenNamepublic	
interface	TokenNameinterface	
Algorithm	TokenNameIdentifier	 Algorithm
{	TokenNameLBRACE	
/** * Checks its prerequisites. * @return <i>true</i> if all is ok, otherwise <i>false</i>. */	TokenNameCOMMENT_JAVADOC	 Checks its prerequisites. @return <i>true</i> if all is ok, otherwise <i>false</i>. 
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the value for a file. * @param file File object for which the value should be evaluated. * @return The value for that file */	TokenNameCOMMENT_JAVADOC	 Get the value for a file. @param file File object for which the value should be evaluated. @return The value for that file 
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

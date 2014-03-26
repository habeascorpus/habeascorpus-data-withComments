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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
native2ascii	TokenNameIdentifier	 native2ascii
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
Native2Ascii	TokenNameIdentifier	 Native2 Ascii
;	TokenNameSEMICOLON	
/** * Interface for an adapter to a native2ascii implementation. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Interface for an adapter to a native2ascii implementation. * @since Ant 1.6.3 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
public	TokenNamepublic	
interface	TokenNameinterface	
Native2AsciiAdapter	TokenNameIdentifier	 Native2 Ascii Adapter
{	TokenNameLBRACE	
/** * Convert the encoding of srcFile writing to destFile. * * @param args Task that holds command line arguments and allows * the implementation to send messages to Ant's logging system * @param srcFile the source to convert * @param destFile where to send output to * @return whether the conversion has been successful. * @throws BuildException if there was a problem. */	TokenNameCOMMENT_JAVADOC	 Convert the encoding of srcFile writing to destFile. * @param args Task that holds command line arguments and allows the implementation to send messages to Ant's logging system @param srcFile the source to convert @param destFile where to send output to @return whether the conversion has been successful. @throws BuildException if there was a problem. 
boolean	TokenNameboolean	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
Native2Ascii	TokenNameIdentifier	 Native2 Ascii
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

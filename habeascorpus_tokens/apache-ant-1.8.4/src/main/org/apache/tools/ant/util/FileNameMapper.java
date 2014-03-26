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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Interface to be used by SourceFileScanner. * * <p>Used to find the name of the target file(s) corresponding to a * source file.</p> * * <p>The rule by which the file names are transformed is specified * via the setFrom and setTo methods. The exact meaning of these is * implementation dependent.</p> * */	TokenNameCOMMENT_JAVADOC	 Interface to be used by SourceFileScanner. * <p>Used to find the name of the target file(s) corresponding to a source file.</p> * <p>The rule by which the file names are transformed is specified via the setFrom and setTo methods. The exact meaning of these is implementation dependent.</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
/** * Sets the from part of the transformation rule. * @param from a string. */	TokenNameCOMMENT_JAVADOC	 Sets the from part of the transformation rule. @param from a string. 
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the to part of the transformation rule. * @param to a string. */	TokenNameCOMMENT_JAVADOC	 Sets the to part of the transformation rule. @param to a string. 
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an array containing the target filename(s) for the * given source file. * * <p>if the given rule doesn't apply to the source file, * implementation must return null. SourceFileScanner will then * omit the source file in question.</p> * * @param sourceFileName the name of the source file relative to * some given basedirectory. * @return an array of strings if the rule applies to the source file, or * null if it does not. */	TokenNameCOMMENT_JAVADOC	 Returns an array containing the target filename(s) for the given source file. * <p>if the given rule doesn't apply to the source file, implementation must return null. SourceFileScanner will then omit the source file in question.</p> * @param sourceFileName the name of the source file relative to some given basedirectory. @return an array of strings if the rule applies to the source file, or null if it does not. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

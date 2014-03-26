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
cvslib	TokenNameIdentifier	 cvslib
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
;	TokenNameSEMICOLON	
/** * A dummy stream that just passes stuff to the parser. */	TokenNameCOMMENT_JAVADOC	 A dummy stream that just passes stuff to the parser. 
class	TokenNameclass	
RedirectingOutputStream	TokenNameIdentifier	 Redirecting Output Stream
extends	TokenNameextends	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * Creates a new instance of this class. * * @param parser the parser to which output is sent. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of this class. * @param parser the parser to which output is sent. 
public	TokenNamepublic	
RedirectingOutputStream	TokenNameIdentifier	 Redirecting Output Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a line to the log system of ant. * * @param line the line to log. */	TokenNameCOMMENT_JAVADOC	 Logs a line to the log system of ant. * @param line the line to log. 
protected	TokenNameprotected	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
listener	TokenNameIdentifier	 listener
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
DefaultLogger	TokenNameIdentifier	 Default Logger
;	TokenNameSEMICOLON	
/** * Like a normal logger, except with timed outputs */	TokenNameCOMMENT_JAVADOC	 Like a normal logger, except with timed outputs 
public	TokenNamepublic	
class	TokenNameclass	
TimestampedLogger	TokenNameIdentifier	 Timestamped Logger
extends	TokenNameextends	
DefaultLogger	TokenNameIdentifier	 Default Logger
{	TokenNameLBRACE	
/** * what appears between the old message and the new */	TokenNameCOMMENT_JAVADOC	 what appears between the old message and the new 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SPACER	TokenNameIdentifier	 SPACER
=	TokenNameEQUAL	
" - at "	TokenNameStringLiteral	 - at 
;	TokenNameSEMICOLON	
/** * This is an override point: the message that indicates whether a build failed. * Subclasses can change/enhance the message. * * @return The classic "BUILD FAILED" plus a timestamp */	TokenNameCOMMENT_JAVADOC	 This is an override point: the message that indicates whether a build failed. Subclasses can change/enhance the message. * @return The classic "BUILD FAILED" plus a timestamp 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBuildFailedMessage	TokenNameIdentifier	 get Build Failed Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getBuildFailedMessage	TokenNameIdentifier	 get Build Failed Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SPACER	TokenNameIdentifier	 SPACER
+	TokenNamePLUS	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is an override point: the message that indicates that a build succeeded. * Subclasses can change/enhance the message. * * @return The classic "BUILD SUCCESSFUL" plus a timestamp */	TokenNameCOMMENT_JAVADOC	 This is an override point: the message that indicates that a build succeeded. Subclasses can change/enhance the message. * @return The classic "BUILD SUCCESSFUL" plus a timestamp 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBuildSuccessfulMessage	TokenNameIdentifier	 get Build Successful Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getBuildSuccessfulMessage	TokenNameIdentifier	 get Build Successful Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SPACER	TokenNameIdentifier	 SPACER
+	TokenNamePLUS	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

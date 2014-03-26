/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
AbstractAction	TokenNameIdentifier	 Abstract Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * Encapsulates the action to exit. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 Encapsulates the action to exit. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> @version 1.0 
class	TokenNameclass	
ExitAction	TokenNameIdentifier	 Exit Action
extends	TokenNameextends	
AbstractAction	TokenNameIdentifier	 Abstract Action
{	TokenNameLBRACE	
/** use to log messages **/	TokenNameCOMMENT_JAVADOC	 use to log messages *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ExitAction	TokenNameIdentifier	 Exit Action
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The instance to share **/	TokenNameCOMMENT_JAVADOC	 The instance to share *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ExitAction	TokenNameIdentifier	 Exit Action
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
ExitAction	TokenNameIdentifier	 Exit Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Stop people creating instances **/	TokenNameCOMMENT_JAVADOC	 Stop people creating instances *
private	TokenNameprivate	
ExitAction	TokenNameIdentifier	 Exit Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Will shutdown the application. * @param aIgnore ignored */	TokenNameCOMMENT_JAVADOC	 Will shutdown the application. @param aIgnore ignored 
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
aIgnore	TokenNameIdentifier	 a Ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"shutting down"	TokenNameStringLiteral	shutting down
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

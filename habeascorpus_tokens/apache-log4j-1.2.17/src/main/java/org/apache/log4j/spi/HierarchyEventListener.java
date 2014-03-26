/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Appender	TokenNameIdentifier	 Appender
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Category	TokenNameIdentifier	 Category
;	TokenNameSEMICOLON	
/** Listen to events occuring within a {@link org.apache.log4j.Hierarchy Hierarchy}. @author Ceki G&uuml;lc&uuml; @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Listen to events occuring within a {@link org.apache.log4j.Hierarchy Hierarchy}. @author Ceki G&uuml;lc&uuml; @since 1.2 
public	TokenNamepublic	
interface	TokenNameinterface	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
{	TokenNameLBRACE	
//public 	TokenNameCOMMENT_LINE	public 
//void categoryCreationEvent(Category cat); 	TokenNameCOMMENT_LINE	void categoryCreationEvent(Category cat); 
public	TokenNamepublic	
void	TokenNamevoid	
addAppenderEvent	TokenNameIdentifier	 add Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
removeAppenderEvent	TokenNameIdentifier	 remove Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

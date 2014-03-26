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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** Interface for attaching appenders to objects. @author Ceki G&uuml;lc&uuml; @since 0.9.1 */	TokenNameCOMMENT_JAVADOC	 Interface for attaching appenders to objects. @author Ceki G&uuml;lc&uuml; @since 0.9.1 
public	TokenNamepublic	
interface	TokenNameinterface	
AppenderAttachable	TokenNameIdentifier	 Appender Attachable
{	TokenNameLBRACE	
/** Add an appender. */	TokenNameCOMMENT_JAVADOC	 Add an appender. 
public	TokenNamepublic	
void	TokenNamevoid	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
newAppender	TokenNameIdentifier	 new Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get all previously added appenders as an Enumeration. */	TokenNameCOMMENT_JAVADOC	 Get all previously added appenders as an Enumeration. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get an appender by name. */	TokenNameCOMMENT_JAVADOC	 Get an appender by name. 
public	TokenNamepublic	
Appender	TokenNameIdentifier	 Appender
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns <code>true</code> if the specified appender is in list of attached attached, <code>false</code> otherwise. @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the specified appender is in list of attached attached, <code>false</code> otherwise. @since 1.2 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttached	TokenNameIdentifier	 is Attached
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Remove all previously added appenders. */	TokenNameCOMMENT_JAVADOC	 Remove all previously added appenders. 
void	TokenNamevoid	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Remove the appender passed as parameter from the list of appenders. */	TokenNameCOMMENT_JAVADOC	 Remove the appender passed as parameter from the list of appenders. 
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Remove the appender with the name passed as parameter from the list of appenders. */	TokenNameCOMMENT_JAVADOC	 Remove the appender with the name passed as parameter from the list of appenders. 
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

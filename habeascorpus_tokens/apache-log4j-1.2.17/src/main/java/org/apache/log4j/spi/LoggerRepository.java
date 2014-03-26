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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
/** A <code>LoggerRepository</code> is used to create and retrieve <code>Loggers</code>. The relation between loggers in a repository depends on the repository but typically loggers are arranged in a named hierarchy. <p>In addition to the creational methods, a <code>LoggerRepository</code> can be queried for existing loggers, can act as a point of registry for events related to loggers. @author Ceki G&uuml;lc&uuml; @since 1.2 */	TokenNameCOMMENT_JAVADOC	 A <code>LoggerRepository</code> is used to create and retrieve <code>Loggers</code>. The relation between loggers in a repository depends on the repository but typically loggers are arranged in a named hierarchy. <p>In addition to the creational methods, a <code>LoggerRepository</code> can be queried for existing loggers, can act as a point of registry for events related to loggers. @author Ceki G&uuml;lc&uuml; @since 1.2 
public	TokenNamepublic	
interface	TokenNameinterface	
LoggerRepository	TokenNameIdentifier	 Logger Repository
{	TokenNameLBRACE	
/** Add a {@link HierarchyEventListener} event to the repository. */	TokenNameCOMMENT_JAVADOC	 Add a {@link HierarchyEventListener} event to the repository. 
public	TokenNamepublic	
void	TokenNamevoid	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns whether this repository is disabled for a given level. The answer depends on the repository threshold and the <code>level</code> parameter. See also {@link #setThreshold} method. */	TokenNameCOMMENT_JAVADOC	 Returns whether this repository is disabled for a given level. The answer depends on the repository threshold and the <code>level</code> parameter. See also {@link #setThreshold} method. 
boolean	TokenNameboolean	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the repository-wide threshold. All logging requests below the threshold are immediately dropped. By default, the threshold is set to <code>Level.ALL</code> which has the lowest possible rank. */	TokenNameCOMMENT_JAVADOC	 Set the repository-wide threshold. All logging requests below the threshold are immediately dropped. By default, the threshold is set to <code>Level.ALL</code> which has the lowest possible rank. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Another form of {@link #setThreshold(Level)} accepting a string parameter instead of a <code>Level</code>. */	TokenNameCOMMENT_JAVADOC	 Another form of {@link #setThreshold(Level)} accepting a string parameter instead of a <code>Level</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
emitNoAppenderWarning	TokenNameIdentifier	 emit No Appender Warning
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the repository-wide threshold. See {@link #setThreshold(Level)} for an explanation. */	TokenNameCOMMENT_JAVADOC	 Get the repository-wide threshold. See {@link #setThreshold(Level)} for an explanation. 
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
LoggerFactory	TokenNameIdentifier	 Logger Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
Logger	TokenNameIdentifier	 Logger
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Deprecated. Please use {@link #getCurrentLoggers} instead. */	TokenNameCOMMENT_JAVADOC	 Deprecated. Please use {@link #getCurrentLoggers} instead. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getCurrentCategories	TokenNameIdentifier	 get Current Categories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
fireAddAppenderEvent	TokenNameIdentifier	 fire Add Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

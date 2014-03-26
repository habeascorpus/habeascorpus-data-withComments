/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** Implement this interface for your own strategies for outputting log statements. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Implement this interface for your own strategies for outputting log statements. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
interface	TokenNameinterface	
Appender	TokenNameIdentifier	 Appender
{	TokenNameLBRACE	
/** Add a filter to the end of the filter list. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Add a filter to the end of the filter list. @since 0.9.0 
void	TokenNamevoid	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
newFilter	TokenNameIdentifier	 new Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the head Filter. The Filters are organized in a linked list and so all Filters on this Appender are available through the result. @return the head Filter or null, if no Filters are present @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns the head Filter. The Filters are organized in a linked list and so all Filters on this Appender are available through the result. @return the head Filter or null, if no Filters are present @since 1.1 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Clear the list of filters by removing all the filters in it. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Clear the list of filters by removing all the filters in it. @since 0.9.0 
public	TokenNamepublic	
void	TokenNamevoid	
clearFilters	TokenNameIdentifier	 clear Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Release any resources allocated within the appender such as file handles, network connections, etc. <p>It is a programming error to append to a closed appender. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Release any resources allocated within the appender such as file handles, network connections, etc. <p>It is a programming error to append to a closed appender. @since 0.8.4 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Log in <code>Appender</code> specific way. When appropriate, Loggers will call the <code>doAppend</code> method of appender implementations in order to log. */	TokenNameCOMMENT_JAVADOC	 Log in <code>Appender</code> specific way. When appropriate, Loggers will call the <code>doAppend</code> method of appender implementations in order to log. 
public	TokenNamepublic	
void	TokenNamevoid	
doAppend	TokenNameIdentifier	 do Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the name of this appender. @return name, may be null.*/	TokenNameCOMMENT_JAVADOC	 Get the name of this appender. @return name, may be null.
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the {@link ErrorHandler} for this appender. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Set the {@link ErrorHandler} for this appender. @since 0.9.0 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the {@link ErrorHandler} for this appender. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns the {@link ErrorHandler} for this appender. @since 1.1 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the {@link Layout} for this appender. @since 0.8.1 */	TokenNameCOMMENT_JAVADOC	 Set the {@link Layout} for this appender. @since 0.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns this appenders layout. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns this appenders layout. @since 1.1 
public	TokenNamepublic	
Layout	TokenNameIdentifier	 Layout
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the name of this appender. The name is used by other components to identify this appender. @since 0.8.1 */	TokenNameCOMMENT_JAVADOC	 Set the name of this appender. The name is used by other components to identify this appender. @since 0.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Configurators call this method to determine if the appender requires a layout. If this method returns <code>true</code>, meaning that layout is required, then the configurator will configure an layout using the configuration information at its disposal. If this method returns <code>false</code>, meaning that a layout is not required, then layout configuration will be skipped even if there is available layout configuration information at the disposal of the configurator.. <p>In the rather exceptional case, where the appender implementation admits a layout but can also work without it, then the appender should return <code>true</code>. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Configurators call this method to determine if the appender requires a layout. If this method returns <code>true</code>, meaning that layout is required, then the configurator will configure an layout using the configuration information at its disposal. If this method returns <code>false</code>, meaning that a layout is not required, then layout configuration will be skipped even if there is available layout configuration information at the disposal of the configurator.. <p>In the rather exceptional case, where the appender implementation admits a layout but can also work without it, then the appender should return <code>true</code>. @since 0.8.4 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

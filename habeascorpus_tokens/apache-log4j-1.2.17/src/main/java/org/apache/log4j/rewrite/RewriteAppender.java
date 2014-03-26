/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
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
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
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
AppenderAttachable	TokenNameIdentifier	 Appender Attachable
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
OptionHandler	TokenNameIdentifier	 Option Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
UnrecognizedElementHandler	TokenNameIdentifier	 Unrecognized Element Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * This appender forwards a logging request to another * appender after possibly rewriting the logging event. * * This appender (with the appropriate policy) * replaces the MapFilter, PropertyFilter and ReflectionFilter * from log4j 1.3. */	TokenNameCOMMENT_JAVADOC	 This appender forwards a logging request to another appender after possibly rewriting the logging event. * This appender (with the appropriate policy) replaces the MapFilter, PropertyFilter and ReflectionFilter from log4j 1.3. 
public	TokenNamepublic	
class	TokenNameclass	
RewriteAppender	TokenNameIdentifier	 Rewrite Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
implements	TokenNameimplements	
AppenderAttachable	TokenNameIdentifier	 Appender Attachable
,	TokenNameCOMMA	
UnrecognizedElementHandler	TokenNameIdentifier	 Unrecognized Element Handler
{	TokenNameLBRACE	
/** * Rewrite policy. */	TokenNameCOMMENT_JAVADOC	 Rewrite policy. 
private	TokenNameprivate	
RewritePolicy	TokenNameIdentifier	 Rewrite Policy
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
/** * Nested appenders. */	TokenNameCOMMENT_JAVADOC	 Nested appenders. 
private	TokenNameprivate	
final	TokenNamefinal	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
appenders	TokenNameIdentifier	 appenders
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RewriteAppender	TokenNameIdentifier	 Rewrite Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
=	TokenNameEQUAL	
new	TokenNamenew	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
rewritten	TokenNameIdentifier	 rewritten
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rewritten	TokenNameIdentifier	 rewritten
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
appendLoopOnAppenders	TokenNameIdentifier	 append Loop On Appenders
(	TokenNameLPAREN	
rewritten	TokenNameIdentifier	 rewritten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add appender. * * @param newAppender appender to add, may not be null. */	TokenNameCOMMENT_JAVADOC	 Add appender. * @param newAppender appender to add, may not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
newAppender	TokenNameIdentifier	 new Appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
newAppender	TokenNameIdentifier	 new Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get iterator over attached appenders. * @return iterator or null if no attached appenders. */	TokenNameCOMMENT_JAVADOC	 Get iterator over attached appenders. @return iterator or null if no attached appenders. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get appender by name. * * @param name name, may not be null. * @return matching appender or null. */	TokenNameCOMMENT_JAVADOC	 Get appender by name. * @param name name, may not be null. @return matching appender or null. 
public	TokenNamepublic	
Appender	TokenNameIdentifier	 Appender
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close this <code>AsyncAppender</code> by interrupting the dispatcher * thread which will process all pending events before exiting. */	TokenNameCOMMENT_JAVADOC	 Close this <code>AsyncAppender</code> by interrupting the dispatcher thread which will process all pending events before exiting. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// close all attached appenders. 	TokenNameCOMMENT_LINE	close all attached appenders. 
// 	TokenNameCOMMENT_LINE	 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
instanceof	TokenNameinstanceof	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines if specified appender is attached. * @param appender appender. * @return true if attached. */	TokenNameCOMMENT_JAVADOC	 Determines if specified appender is attached. @param appender appender. @return true if attached. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttached	TokenNameIdentifier	 is Attached
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
isAttached	TokenNameIdentifier	 is Attached
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes and closes all attached appenders. */	TokenNameCOMMENT_JAVADOC	 Removes and closes all attached appenders. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes an appender. * @param appender appender to remove. */	TokenNameCOMMENT_JAVADOC	 Removes an appender. @param appender appender to remove. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Remove appender by name. * @param name name. */	TokenNameCOMMENT_JAVADOC	 Remove appender by name. @param name name. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRewritePolicy	TokenNameIdentifier	 set Rewrite Policy
(	TokenNameLPAREN	
final	TokenNamefinal	
RewritePolicy	TokenNameIdentifier	 Rewrite Policy
rewritePolicy	TokenNameIdentifier	 rewrite Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
rewritePolicy	TokenNameIdentifier	 rewrite Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
parseUnrecognizedElement	TokenNameIdentifier	 parse Unrecognized Element
(	TokenNameLPAREN	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"rewritePolicy"	TokenNameStringLiteral	rewritePolicy
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
rewritePolicy	TokenNameIdentifier	 rewrite Policy
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
DOMConfigurator	TokenNameIdentifier	 DOM Configurator
.	TokenNameDOT	
parseElement	TokenNameIdentifier	 parse Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
,	TokenNameCOMMA	
RewritePolicy	TokenNameIdentifier	 Rewrite Policy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rewritePolicy	TokenNameIdentifier	 rewrite Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rewritePolicy	TokenNameIdentifier	 rewrite Policy
instanceof	TokenNameinstanceof	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
rewritePolicy	TokenNameIdentifier	 rewrite Policy
)	TokenNameRPAREN	
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setRewritePolicy	TokenNameIdentifier	 set Rewrite Policy
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RewritePolicy	TokenNameIdentifier	 Rewrite Policy
)	TokenNameRPAREN	
rewritePolicy	TokenNameIdentifier	 rewrite Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

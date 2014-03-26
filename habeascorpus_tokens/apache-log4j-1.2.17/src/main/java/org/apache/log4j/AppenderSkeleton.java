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
OptionHandler	TokenNameIdentifier	 Option Handler
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OnlyOnceErrorHandler	TokenNameIdentifier	 Only Once Error Handler
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
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
/** * Abstract superclass of the other appenders in the package. * * This class provides the code for common functionality, such as * support for threshold filtering and support for general filters. * * @since 0.8.1 * @author Ceki G&uuml;lc&uuml; * */	TokenNameCOMMENT_JAVADOC	 Abstract superclass of the other appenders in the package. * This class provides the code for common functionality, such as support for threshold filtering and support for general filters. * @since 0.8.1 @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
implements	TokenNameimplements	
Appender	TokenNameIdentifier	 Appender
,	TokenNameCOMMA	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
/** The layout variable does not need to be set if the appender implementation has its own layout. */	TokenNameCOMMENT_JAVADOC	 The layout variable does not need to be set if the appender implementation has its own layout. 
protected	TokenNameprotected	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
/** Appenders are named. */	TokenNameCOMMENT_JAVADOC	 Appenders are named. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** There is no level threshold filtering by default. */	TokenNameCOMMENT_JAVADOC	 There is no level threshold filtering by default. 
protected	TokenNameprotected	
Priority	TokenNameIdentifier	 Priority
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
/** It is assumed and enforced that errorHandler is never null. */	TokenNameCOMMENT_JAVADOC	 It is assumed and enforced that errorHandler is never null. 
protected	TokenNameprotected	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
OnlyOnceErrorHandler	TokenNameIdentifier	 Only Once Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The first filter in the filter chain. Set to <code>null</code> initially. */	TokenNameCOMMENT_JAVADOC	 The first filter in the filter chain. Set to <code>null</code> initially. 
protected	TokenNameprotected	
Filter	TokenNameIdentifier	 Filter
headFilter	TokenNameIdentifier	 head Filter
;	TokenNameSEMICOLON	
/** The last filter in the filter chain. */	TokenNameCOMMENT_JAVADOC	 The last filter in the filter chain. 
protected	TokenNameprotected	
Filter	TokenNameIdentifier	 Filter
tailFilter	TokenNameIdentifier	 tail Filter
;	TokenNameSEMICOLON	
/** Is this appender closed? */	TokenNameCOMMENT_JAVADOC	 Is this appender closed? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new instance. * Provided for compatibility with log4j 1.3. * * @param isActive true if appender is ready for use upon construction. * Not used in log4j 1.2.x. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Create new instance. Provided for compatibility with log4j 1.3. * @param isActive true if appender is ready for use upon construction. Not used in log4j 1.2.x. @since 1.2.15 
protected	TokenNameprotected	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Derived appenders should override this method if option structure requires it. */	TokenNameCOMMENT_JAVADOC	 Derived appenders should override this method if option structure requires it. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Add a filter to end of the filter list. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Add a filter to end of the filter list. @since 0.9.0 
public	TokenNamepublic	
void	TokenNamevoid	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
newFilter	TokenNameIdentifier	 new Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
headFilter	TokenNameIdentifier	 head Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
headFilter	TokenNameIdentifier	 head Filter
=	TokenNameEQUAL	
tailFilter	TokenNameIdentifier	 tail Filter
=	TokenNameEQUAL	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tailFilter	TokenNameIdentifier	 tail Filter
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
newFilter	TokenNameIdentifier	 new Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tailFilter	TokenNameIdentifier	 tail Filter
=	TokenNameEQUAL	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Subclasses of <code>AppenderSkeleton</code> should implement this method to perform actual logging. See also {@link #doAppend AppenderSkeleton.doAppend} method. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Subclasses of <code>AppenderSkeleton</code> should implement this method to perform actual logging. See also {@link #doAppend AppenderSkeleton.doAppend} method. @since 0.9.0 
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Clear the filters chain. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Clear the filters chain. @since 0.9.0 
public	TokenNamepublic	
void	TokenNamevoid	
clearFilters	TokenNameIdentifier	 clear Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
headFilter	TokenNameIdentifier	 head Filter
=	TokenNameEQUAL	
tailFilter	TokenNameIdentifier	 tail Filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Finalize this appender by calling the derived class' <code>close</code> method. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Finalize this appender by calling the derived class' <code>close</code> method. @since 0.8.4 
public	TokenNamepublic	
void	TokenNamevoid	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// An appender might be closed then garbage collected. There is no 	TokenNameCOMMENT_LINE	An appender might be closed then garbage collected. There is no 
// point in closing twice. 	TokenNameCOMMENT_LINE	point in closing twice. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Finalizing appender named ["	TokenNameStringLiteral	Finalizing appender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the currently set {@link ErrorHandler} for this Appender. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Return the currently set {@link ErrorHandler} for this Appender. @since 0.9.0 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the head Filter. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns the head Filter. @since 1.1 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
headFilter	TokenNameIdentifier	 head Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the first filter in the filter chain for this Appender. The return value may be <code>null</code> if no is filter is set. */	TokenNameCOMMENT_JAVADOC	 Return the first filter in the filter chain for this Appender. The return value may be <code>null</code> if no is filter is set. 
public	TokenNamepublic	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
getFirstFilter	TokenNameIdentifier	 get First Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
headFilter	TokenNameIdentifier	 head Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the layout of this appender. The value may be null. */	TokenNameCOMMENT_JAVADOC	 Returns the layout of this appender. The value may be null. 
public	TokenNamepublic	
Layout	TokenNameIdentifier	 Layout
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the name of this appender. @return name, may be null. */	TokenNameCOMMENT_JAVADOC	 Returns the name of this appender. @return name, may be null. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns this appenders threshold level. See the {@link #setThreshold} method for the meaning of this option. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns this appenders threshold level. See the {@link #setThreshold} method for the meaning of this option. @since 1.1 
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Check whether the message level is below the appender's threshold. If there is no threshold set, then the return value is always <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Check whether the message level is below the appender's threshold. If there is no threshold set, then the return value is always <code>true</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAsSevereAsThreshold	TokenNameIdentifier	 is As Severe As Threshold
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
threshold	TokenNameIdentifier	 threshold
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
priority	TokenNameIdentifier	 priority
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method performs threshold checks and invokes filters before * delegating actual logging to the subclasses specific {@link * AppenderSkeleton#append} method. * */	TokenNameCOMMENT_JAVADOC	 This method performs threshold checks and invokes filters before delegating actual logging to the subclasses specific {@link AppenderSkeleton#append} method. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
doAppend	TokenNameIdentifier	 do Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Attempted to append to closed appender named ["	TokenNameStringLiteral	Attempted to append to closed appender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAsSevereAsThreshold	TokenNameIdentifier	 is As Severe As Threshold
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
headFilter	TokenNameIdentifier	 head Filter
;	TokenNameSEMICOLON	
FILTER_LOOP	TokenNameIdentifier	 FILTER  LOOP
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
decide	TokenNameIdentifier	 decide
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
:	TokenNameCOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ACCEPT	TokenNameIdentifier	 ACCEPT
:	TokenNameCOLON	
break	TokenNamebreak	
FILTER_LOOP	TokenNameIdentifier	 FILTER  LOOP
;	TokenNameSEMICOLON	
case	TokenNamecase	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the {@link ErrorHandler} for this Appender. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Set the {@link ErrorHandler} for this Appender. @since 0.9.0 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We do not throw exception here since the cause is probably a 	TokenNameCOMMENT_LINE	We do not throw exception here since the cause is probably a 
// bad config file. 	TokenNameCOMMENT_LINE	bad config file. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"You have tried to set a null error-handler."	TokenNameStringLiteral	You have tried to set a null error-handler.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
eh	TokenNameIdentifier	 eh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the layout for this appender. Note that some appenders have their own (fixed) layouts or do not use one. For example, the {@link org.apache.log4j.net.SocketAppender} ignores the layout set here. */	TokenNameCOMMENT_JAVADOC	 Set the layout for this appender. Note that some appenders have their own (fixed) layouts or do not use one. For example, the {@link org.apache.log4j.net.SocketAppender} ignores the layout set here. 
public	TokenNamepublic	
void	TokenNamevoid	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the name of this Appender. */	TokenNameCOMMENT_JAVADOC	 Set the name of this Appender. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the threshold level. All log events with lower level than the threshold level are ignored by the appender. <p>In configuration files this option is specified by setting the value of the <b>Threshold</b> option to a level string, such as "DEBUG", "INFO" and so on. @since 0.8.3 */	TokenNameCOMMENT_JAVADOC	 Set the threshold level. All log events with lower level than the threshold level are ignored by the appender. <p>In configuration files this option is specified by setting the value of the <b>Threshold</b> option to a level string, such as "DEBUG", "INFO" and so on. @since 0.8.3 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

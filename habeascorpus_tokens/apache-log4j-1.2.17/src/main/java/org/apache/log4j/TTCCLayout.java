/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Christopher Williams 	TokenNameCOMMENT_LINE	Contributors: Christopher Williams 
// Mathias Bogaert 	TokenNameCOMMENT_LINE	Mathias Bogaert 
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DateLayout	TokenNameIdentifier	 Date Layout
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
/** TTCC layout format consists of time, thread, category and nested diagnostic context information, hence the name. <p>Each of the four fields can be individually enabled or disabled. The time format depends on the <code>DateFormat</code> used. <p>Here is an example TTCCLayout output with the {@link org.apache.log4j.helpers.RelativeTimeDateFormat}. <pre> 176 [main] INFO org.apache.log4j.examples.Sort - Populating an array of 2 elements in reverse order. 225 [main] INFO org.apache.log4j.examples.SortAlgo - Entered the sort method. 262 [main] DEBUG org.apache.log4j.examples.SortAlgo.OUTER i=1 - Outer loop. 276 [main] DEBUG org.apache.log4j.examples.SortAlgo.SWAP i=1 j=0 - Swapping intArray[0] = 1 and intArray[1] = 0 290 [main] DEBUG org.apache.log4j.examples.SortAlgo.OUTER i=0 - Outer loop. 304 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Dump of interger array: 317 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Element [0] = 0 331 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Element [1] = 1 343 [main] INFO org.apache.log4j.examples.Sort - The next log statement should be an error message. 346 [main] ERROR org.apache.log4j.examples.SortAlgo.DUMP - Tried to dump an uninitialized array. at org.apache.log4j.examples.SortAlgo.dump(SortAlgo.java:58) at org.apache.log4j.examples.Sort.main(Sort.java:64) 467 [main] INFO org.apache.log4j.examples.Sort - Exiting main method. </pre> <p>The first field is the number of milliseconds elapsed since the start of the program. The second field is the thread outputting the log statement. The third field is the level, the fourth field is the category to which the statement belongs. <p>The fifth field (just before the '-') is the nested diagnostic context. Note the nested diagnostic context may be empty as in the first two statements. The text after the '-' is the message of the statement. <p><b>WARNING</b> Do not use the same TTCCLayout instance from within different appenders. The TTCCLayout is not thread safe when used in his way. However, it is perfectly safe to use a TTCCLayout instance from just one appender. <p>{@link PatternLayout} offers a much more flexible alternative. @author Ceki G&uuml;lc&uuml; @author <A HREF="mailto:heinz.richter@ecmwf.int">Heinz Richter</a> */	TokenNameCOMMENT_JAVADOC	 TTCC layout format consists of time, thread, category and nested diagnostic context information, hence the name. <p>Each of the four fields can be individually enabled or disabled. The time format depends on the <code>DateFormat</code> used. <p>Here is an example TTCCLayout output with the {@link org.apache.log4j.helpers.RelativeTimeDateFormat}. <pre> 176 [main] INFO org.apache.log4j.examples.Sort - Populating an array of 2 elements in reverse order. 225 [main] INFO org.apache.log4j.examples.SortAlgo - Entered the sort method. 262 [main] DEBUG org.apache.log4j.examples.SortAlgo.OUTER i=1 - Outer loop. 276 [main] DEBUG org.apache.log4j.examples.SortAlgo.SWAP i=1 j=0 - Swapping intArray[0] = 1 and intArray[1] = 0 290 [main] DEBUG org.apache.log4j.examples.SortAlgo.OUTER i=0 - Outer loop. 304 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Dump of interger array: 317 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Element [0] = 0 331 [main] INFO org.apache.log4j.examples.SortAlgo.DUMP - Element [1] = 1 343 [main] INFO org.apache.log4j.examples.Sort - The next log statement should be an error message. 346 [main] ERROR org.apache.log4j.examples.SortAlgo.DUMP - Tried to dump an uninitialized array. at org.apache.log4j.examples.SortAlgo.dump(SortAlgo.java:58) at org.apache.log4j.examples.Sort.main(Sort.java:64) 467 [main] INFO org.apache.log4j.examples.Sort - Exiting main method. </pre> <p>The first field is the number of milliseconds elapsed since the start of the program. The second field is the thread outputting the log statement. The third field is the level, the fourth field is the category to which the statement belongs. <p>The fifth field (just before the '-') is the nested diagnostic context. Note the nested diagnostic context may be empty as in the first two statements. The text after the '-' is the message of the statement. <p><b>WARNING</b> Do not use the same TTCCLayout instance from within different appenders. The TTCCLayout is not thread safe when used in his way. However, it is perfectly safe to use a TTCCLayout instance from just one appender. <p>{@link PatternLayout} offers a much more flexible alternative. @author Ceki G&uuml;lc&uuml; @author <A HREF="mailto:heinz.richter@ecmwf.int">Heinz Richter</a> 
public	TokenNamepublic	
class	TokenNameclass	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
extends	TokenNameextends	
DateLayout	TokenNameIdentifier	 Date Layout
{	TokenNameLBRACE	
// Internal representation of options 	TokenNameCOMMENT_LINE	Internal representation of options 
private	TokenNameprivate	
boolean	TokenNameboolean	
threadPrinting	TokenNameIdentifier	 thread Printing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
contextPrinting	TokenNameIdentifier	 context Printing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Instantiate a TTCCLayout object with {@link org.apache.log4j.helpers.RelativeTimeDateFormat} as the date formatter in the local time zone. @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Instantiate a TTCCLayout object with {@link org.apache.log4j.helpers.RelativeTimeDateFormat} as the date formatter in the local time zone. @since 0.7.5 
public	TokenNamepublic	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
RELATIVE_TIME_DATE_FORMAT	TokenNameIdentifier	 RELATIVE  TIME  DATE  FORMAT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a TTCCLayout object using the local time zone. The DateFormat used will depend on the <code>dateFormatType</code>. <p>This constructor just calls the {@link DateLayout#setDateFormat} method. */	TokenNameCOMMENT_JAVADOC	 Instantiate a TTCCLayout object using the local time zone. The DateFormat used will depend on the <code>dateFormatType</code>. <p>This constructor just calls the {@link DateLayout#setDateFormat} method. 
public	TokenNamepublic	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateFormatType	TokenNameIdentifier	 date Format Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>ThreadPrinting</b> option specifies whether the name of the current thread is part of log output or not. This is true by default. */	TokenNameCOMMENT_JAVADOC	 The <b>ThreadPrinting</b> option specifies whether the name of the current thread is part of log output or not. This is true by default. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadPrinting	TokenNameIdentifier	 set Thread Printing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
threadPrinting	TokenNameIdentifier	 thread Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
threadPrinting	TokenNameIdentifier	 thread Printing
=	TokenNameEQUAL	
threadPrinting	TokenNameIdentifier	 thread Printing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>ThreadPrinting</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>ThreadPrinting</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getThreadPrinting	TokenNameIdentifier	 get Thread Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threadPrinting	TokenNameIdentifier	 thread Printing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>CategoryPrefixing</b> option specifies whether {@link Category} name is part of log output or not. This is true by default. */	TokenNameCOMMENT_JAVADOC	 The <b>CategoryPrefixing</b> option specifies whether {@link Category} name is part of log output or not. This is true by default. 
public	TokenNamepublic	
void	TokenNamevoid	
setCategoryPrefixing	TokenNameIdentifier	 set Category Prefixing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
=	TokenNameEQUAL	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>CategoryPrefixing</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>CategoryPrefixing</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCategoryPrefixing	TokenNameIdentifier	 get Category Prefixing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>ContextPrinting</b> option specifies log output will include the nested context information belonging to the current thread. This is true by default. */	TokenNameCOMMENT_JAVADOC	 The <b>ContextPrinting</b> option specifies log output will include the nested context information belonging to the current thread. This is true by default. 
public	TokenNamepublic	
void	TokenNamevoid	
setContextPrinting	TokenNameIdentifier	 set Context Printing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
contextPrinting	TokenNameIdentifier	 context Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
contextPrinting	TokenNameIdentifier	 context Printing
=	TokenNameEQUAL	
contextPrinting	TokenNameIdentifier	 context Printing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>ContextPrinting</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>ContextPrinting</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getContextPrinting	TokenNameIdentifier	 get Context Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contextPrinting	TokenNameIdentifier	 context Printing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** In addition to the level of the statement and message, the returned byte array includes time, thread, category and {@link NDC} information. <p>Time, thread, category and diagnostic context are printed depending on options. @param event The event to format */	TokenNameCOMMENT_JAVADOC	 In addition to the level of the statement and message, the returned byte array includes time, thread, category and {@link NDC} information. <p>Time, thread, category and diagnostic context are printed depending on options. @param event The event to format 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reset buf 	TokenNameCOMMENT_LINE	Reset buf 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
threadPrinting	TokenNameIdentifier	 thread Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
categoryPrefixing	TokenNameIdentifier	 category Prefixing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
contextPrinting	TokenNameIdentifier	 context Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ndc	TokenNameIdentifier	 ndc
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ndc	TokenNameIdentifier	 ndc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ndc	TokenNameIdentifier	 ndc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"- "	TokenNameStringLiteral	- 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The TTCCLayout does not handle the throwable contained within {@link LoggingEvent LoggingEvents}. Thus, it returns <code>true</code>. @since version 0.8.4 */	TokenNameCOMMENT_JAVADOC	 The TTCCLayout does not handle the throwable contained within {@link LoggingEvent LoggingEvents}. Thus, it returns <code>true</code>. @since version 0.8.4 
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

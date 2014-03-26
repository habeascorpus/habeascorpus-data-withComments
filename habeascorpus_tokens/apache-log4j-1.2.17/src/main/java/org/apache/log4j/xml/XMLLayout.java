/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Mathias Bogaert 	TokenNameCOMMENT_LINE	Contributors: Mathias Bogaert 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
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
Transform	TokenNameIdentifier	 Transform
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
LocationInfo	TokenNameIdentifier	 Location Info
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * The output of the XMLLayout consists of a series of log4j:event * elements as defined in the <a * href="log4j.dtd">log4j.dtd</a>. It does not output a * complete well-formed XML file. The output is designed to be * included as an <em>external entity</em> in a separate file to form * a correct XML file. * * <p>For example, if <code>abc</code> is the name of the file where * the XMLLayout ouput goes, then a well-formed XML file would be: * <pre> &lt;?xml version="1.0" ?&gt; &lt;!DOCTYPE log4j:eventSet PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "log4j.dtd" [&lt;!ENTITY data SYSTEM "abc"&gt;]&gt; &lt;log4j:eventSet version="1.2" xmlns:log4j="http://jakarta.apache.org/log4j/"&gt; &nbsp;&nbsp;&data; &lt;/log4j:eventSet&gt; </pre> * <p>This approach enforces the independence of the XMLLayout and the * appender where it is embedded. * * <p>The <code>version</code> attribute helps components to correctly * intrepret output generated by XMLLayout. The value of this * attribute should be "1.1" for output generated by log4j versions * prior to log4j 1.2 (final release) and "1.2" for relase 1.2 and * later. * * Appenders using this layout should have their encoding * set to UTF-8 or UTF-16, otherwise events containing * non ASCII characters could result in corrupted * log files. * * @author Ceki G&uuml;lc&uuml; * @since 0.9.0 * */	TokenNameCOMMENT_JAVADOC	 The output of the XMLLayout consists of a series of log4j:event elements as defined in the <a href="log4j.dtd">log4j.dtd</a>. It does not output a complete well-formed XML file. The output is designed to be included as an <em>external entity</em> in a separate file to form a correct XML file. * <p>For example, if <code>abc</code> is the name of the file where the XMLLayout ouput goes, then a well-formed XML file would be: <pre> &lt;?xml version="1.0" ?&gt; &lt;!DOCTYPE log4j:eventSet PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "log4j.dtd" [&lt;!ENTITY data SYSTEM "abc"&gt;]&gt; &lt;log4j:eventSet version="1.2" xmlns:log4j="http://jakarta.apache.org/log4j/"&gt; &nbsp;&nbsp;&data; &lt;/log4j:eventSet&gt; </pre> <p>This approach enforces the independence of the XMLLayout and the appender where it is embedded. * <p>The <code>version</code> attribute helps components to correctly intrepret output generated by XMLLayout. The value of this attribute should be "1.1" for output generated by log4j versions prior to log4j 1.2 (final release) and "1.2" for relase 1.2 and later. * Appenders using this layout should have their encoding set to UTF-8 or UTF-16, otherwise events containing non ASCII characters could result in corrupted log files. * @author Ceki G&uuml;lc&uuml; @since 0.9.0 
public	TokenNamepublic	
class	TokenNameclass	
XMLLayout	TokenNameIdentifier	 XML Layout
extends	TokenNameextends	
Layout	TokenNameIdentifier	 Layout
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
UPPER_LIMIT	TokenNameIdentifier	 UPPER  LIMIT
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The <b>LocationInfo</b> option takes a boolean value. By default, * it is set to false which means there will be no location * information output by this layout. If the the option is set to * true, then the file name and line number of the statement at the * origin of the log statement will be output. * * <p>If you are embedding this layout within an {@link * org.apache.log4j.net.SMTPAppender} then make sure to set the * <b>LocationInfo</b> option of that appender as well. * */	TokenNameCOMMENT_JAVADOC	 The <b>LocationInfo</b> option takes a boolean value. By default, it is set to false which means there will be no location information output by this layout. If the the option is set to true, then the file name and line number of the statement at the origin of the log statement will be output. * <p>If you are embedding this layout within an {@link org.apache.log4j.net.SMTPAppender} then make sure to set the <b>LocationInfo</b> option of that appender as well. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current value of the <b>LocationInfo</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the current value of the <b>LocationInfo</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether MDC key-value pairs should be output, default false. * @param flag new value. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Sets whether MDC key-value pairs should be output, default false. @param flag new value. @since 1.2.15 
public	TokenNamepublic	
void	TokenNamevoid	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets whether MDC key-value pairs should be output. * @return true if MDC key-value pairs are output. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Gets whether MDC key-value pairs should be output. @return true if MDC key-value pairs are output. @since 1.2.15 
public	TokenNamepublic	
boolean	TokenNameboolean	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** No options to activate. */	TokenNameCOMMENT_JAVADOC	 No options to activate. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Formats a {@link org.apache.log4j.spi.LoggingEvent} in conformance with the log4j.dtd. * */	TokenNameCOMMENT_JAVADOC	 Formats a {@link org.apache.log4j.spi.LoggingEvent} in conformance with the log4j.dtd. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reset working buffer. If the buffer is too large, then we need a new 	TokenNameCOMMENT_LINE	Reset working buffer. If the buffer is too large, then we need a new 
// one in order to avoid the penalty of creating a large array. 	TokenNameCOMMENT_LINE	one in order to avoid the penalty of creating a large array. 
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
UPPER_LIMIT	TokenNameIdentifier	 UPPER  LIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We yield to the \r\n heresy. 	TokenNameCOMMENT_LINE	We yield to the \r\n heresy. 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:event logger=""	TokenNameStringLiteral	<log4j:event logger="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" timestamp=""	TokenNameStringLiteral	" timestamp="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" level=""	TokenNameStringLiteral	" level="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" thread=""	TokenNameStringLiteral	" thread="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""> "	TokenNameStringLiteral	"> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:message><![CDATA["	TokenNameStringLiteral	<log4j:message><![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append the rendered message. Also make sure to escape any 	TokenNameCOMMENT_LINE	Append the rendered message. Also make sure to escape any 
// existing CDATA sections. 	TokenNameCOMMENT_LINE	existing CDATA sections. 
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
appendEscapingCDATA	TokenNameIdentifier	 append Escaping CDATA
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
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
"]]></log4j:message> "	TokenNameStringLiteral	]]></log4j:message> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"<log4j:NDC><![CDATA["	TokenNameStringLiteral	<log4j:NDC><![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
appendEscapingCDATA	TokenNameIdentifier	 append Escaping CDATA
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
ndc	TokenNameIdentifier	 ndc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]]></log4j:NDC> "	TokenNameStringLiteral	]]></log4j:NDC> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:throwable><![CDATA["	TokenNameStringLiteral	<log4j:throwable><![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
appendEscapingCDATA	TokenNameIdentifier	 append Escaping CDATA
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]]></log4j:throwable> "	TokenNameStringLiteral	]]></log4j:throwable> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocationInfo	TokenNameIdentifier	 Location Info
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:locationInfo class=""	TokenNameStringLiteral	<log4j:locationInfo class="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" method=""	TokenNameStringLiteral	" method="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" file=""	TokenNameStringLiteral	" file="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" line=""	TokenNameStringLiteral	" line="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""/> "	TokenNameStringLiteral	"/> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPropertyKeySet	TokenNameIdentifier	 get Property Key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keySet	TokenNameIdentifier	 key Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:properties> "	TokenNameStringLiteral	<log4j:properties> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
keySet	TokenNameIdentifier	 key Set
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMDC	TokenNameIdentifier	 get MDC
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<log4j:data name=""	TokenNameStringLiteral	<log4j:data name="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" value=""	TokenNameStringLiteral	" value="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Transform	TokenNameIdentifier	 Transform
.	TokenNameDOT	
escapeTags	TokenNameIdentifier	 escape Tags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""/> "	TokenNameStringLiteral	"/> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</log4j:properties> "	TokenNameStringLiteral	</log4j:properties> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</log4j:event> "	TokenNameStringLiteral	</log4j:event> 
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
/** The XMLLayout prints and does not ignore exceptions. Hence the return value <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 The XMLLayout prints and does not ignore exceptions. Hence the return value <code>false</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
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
PatternConverter	TokenNameIdentifier	 Pattern Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
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
// Contributors: Nelson Minar <nelson@monkey.org> 	TokenNameCOMMENT_LINE	Contributors: Nelson Minar <nelson@monkey.org> 
// Anders Kristensen <akristensen@dynamicsoft.com> 	TokenNameCOMMENT_LINE	Anders Kristensen <akristensen@dynamicsoft.com> 
/** * This class is an enhanced version of org.apache.log4j.PatternLayout * which was originally developed as part of the abandoned log4j 1.3 * effort and has been available in the extras companion. * This pattern layout should be used in preference to * org.apache.log4j.PatternLayout except when compatibility * where PatternLayout has been extended either through subclassing * or alternative pattern parsers. * * * <p>A flexible layout configurable with pattern string. The goal of this class * is to {@link #format format} a {@link LoggingEvent} and return the results * in a {@link StringBuffer}. The format of the result depends on the * <em>conversion pattern</em>. * <p> * * <p>The conversion pattern is closely related to the conversion * pattern of the printf function in C. A conversion pattern is * composed of literal text and format control expressions called * <em>conversion specifiers</em>. * * <p><i>Note that you are free to insert any literal text within the * conversion pattern.</i> * </p> <p>Each conversion specifier starts with a percent sign (%) and is followed by optional <em>format modifiers</em> and a <em>conversion character</em>. The conversion character specifies the type of data, e.g. category, priority, date, thread name. The format modifiers control such things as field width, padding, left and right justification. The following is a simple example. <p>Let the conversion pattern be <b>"%-5p [%t]: %m%n"</b> and assume that the log4j environment was set to use a EnhancedPatternLayout. Then the statements <pre> Category root = Category.getRoot(); root.debug("Message 1"); root.warn("Message 2"); </pre> would yield the output <pre> DEBUG [main]: Message 1 WARN [main]: Message 2 </pre> <p>Note that there is no explicit separator between text and conversion specifiers. The pattern parser knows when it has reached the end of a conversion specifier when it reads a conversion character. In the example above the conversion specifier <b>%-5p</b> means the priority of the logging event should be left justified to a width of five characters. The recognized conversion characters are <p> <table border="1" CELLPADDING="8"> <th>Conversion Character</th> <th>Effect</th> <tr> <td align=center><b>c</b></td> <td>Used to output the category of the logging event. The category conversion specifier can be optionally followed by NameAbbreviator pattern. <p>For example, for the category name "alpha.beta.gamma" the pattern <b>%c{2}</b> will output the last two elements ("beta.gamma"), <b>%c{-2}</b> will remove two elements leaving "gamma", <b>%c{1.}</b> will output "a.b.gamma". </td> </tr> <tr> <td align=center><b>C</b></td> <td>Used to output the fully qualified class name of the caller issuing the logging request. This conversion specifier can be optionally followed by <em>precision specifier</em>, that is a decimal constant in brackets. <td>Used to output the category of the logging event. The category conversion specifier can be optionally followed by NameAbbreviator pattern. <p>For example, for the category name "alpha.beta.gamma" the pattern <b>%c{2}</b> will output the last two elements ("beta.gamma"), <b>%c{-2}</b> will remove two elements leaving "gamma", <b>%c{1.}</b> will output "a.b.gamma". <p><b>WARNING</b> Generating the caller class information is slow. Thus, its use should be avoided unless execution speed is not an issue. </td> </tr> <tr> <td align=center><b>d</b></td> <td>Used to output the date of the logging event. The date conversion specifier may be followed by a set of braces containing a date and time pattern strings {@link java.text.SimpleDateFormat}, <em>ABSOLUTE</em>, <em>DATE</em> or <em>ISO8601</em> and a set of braces containing a time zone id per {@link java.util.TimeZone#getTimeZone(String)}. For example, <b>%d{HH:mm:ss,SSS}</b>, <b>%d{dd&nbsp;MMM&nbsp;yyyy&nbsp;HH:mm:ss,SSS}</b>, <b>%d{DATE}</b> or <b>%d{HH:mm:ss}{GMT+0}</b>. If no date format specifier is given then ISO8601 format is assumed. </td> </tr> <tr> <td align=center><b>F</b></td> <td>Used to output the file name where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>l</b></td> <td>Used to output location information of the caller which generated the logging event. <p>The location information depends on the JVM implementation but usually consists of the fully qualified name of the calling method followed by the callers source the file name and line number between parentheses. <p>The location information can be very useful. However, its generation is <em>extremely</em> slow and should be avoided unless execution speed is not an issue. </td> </tr> <tr> <td align=center><b>L</b></td> <td>Used to output the line number from where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>m</b></td> <td>Used to output the application supplied message associated with the logging event.</td> </tr> <tr> <td align=center><b>M</b></td> <td>Used to output the method name where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>n</b></td> <td>Outputs the platform dependent line separator character or characters. <p>This conversion character offers practically the same performance as using non-portable line separator strings such as "\n", or "\r\n". Thus, it is the preferred way of specifying a line separator. </tr> <tr> <td align=center><b>p</b></td> <td>Used to output the priority of the logging event.</td> </tr> <tr> <td align=center><b>r</b></td> <td>Used to output the number of milliseconds elapsed since the construction of the layout until the creation of the logging event.</td> </tr> <tr> <td align=center><b>t</b></td> <td>Used to output the name of the thread that generated the logging event.</td> </tr> <tr> <td align=center><b>x</b></td> <td>Used to output the NDC (nested diagnostic context) associated with the thread that generated the logging event. </td> </tr> <tr> <td align=center><b>X</b></td> <td> <p>Used to output the MDC (mapped diagnostic context) associated with the thread that generated the logging event. The <b>X</b> conversion character can be followed by the key for the map placed between braces, as in <b>%X{clientNumber}</b> where <code>clientNumber</code> is the key. The value in the MDC corresponding to the key will be output. If no additional sub-option is specified, then the entire contents of the MDC key value pair set is output using a format {{key1,val1},{key2,val2}}</p> <p>See {@link MDC} class for more details. </p> </td> </tr> <tr> <td align=center><b>properties</b></td> <td> <p>Used to output the Properties associated with the logging event. The <b>properties</b> conversion word can be followed by the key for the map placed between braces, as in <b>%properties{application}</b> where <code>application</code> is the key. The value in the Properties bundle corresponding to the key will be output. If no additional sub-option is specified, then the entire contents of the Properties key value pair set is output using a format {{key1,val1},{key2,val2}}</p> </td> </tr> <tr> <td align=center><b>throwable</b></td> <td> <p>Used to output the Throwable trace that has been bound to the LoggingEvent, by default this will output the full trace as one would normally find by a call to Throwable.printStackTrace(). <b>%throwable{short}</b> or <b>%throwable{1}</b> will output the first line of stack trace. <b>throwable{none}</b> or <b>throwable{0}</b> will suppress the stack trace. <b>%throwable{n}</b> will output n lines of stack trace if a positive integer or omit the last -n lines if a negative integer. If no %throwable pattern is specified, the appender will take responsibility to output the stack trace as it sees fit.</p> </td> </tr> <tr> <td align=center><b>%</b></td> <td>The sequence %% outputs a single percent sign. </td> </tr> </table> <p>By default the relevant information is output as is. However, with the aid of format modifiers it is possible to change the minimum field width, the maximum field width and justification. <p>The optional format modifier is placed between the percent sign and the conversion character. <p>The first optional format modifier is the <em>left justification flag</em> which is just the minus (-) character. Then comes the optional <em>minimum field width</em> modifier. This is a decimal constant that represents the minimum number of characters to output. If the data item requires fewer characters, it is padded on either the left or the right until the minimum width is reached. The default is to pad on the left (right justify) but you can specify right padding with the left justification flag. The padding character is space. If the data item is larger than the minimum field width, the field is expanded to accommodate the data. The value is never truncated. <p>This behavior can be changed using the <em>maximum field width</em> modifier which is designated by a period followed by a decimal constant. If the data item is longer than the maximum field, then the extra characters are removed from the <em>beginning</em> of the data item and not from the end. For example, it the maximum field width is eight and the data item is ten characters long, then the first two characters of the data item are dropped. This behavior deviates from the printf function in C where truncation is done from the end. <p>Below are various format modifier examples for the category conversion specifier. <p> <TABLE BORDER=1 CELLPADDING=8> <th>Format modifier <th>left justify <th>minimum width <th>maximum width <th>comment <tr> <td align=center>%20c</td> <td align=center>false</td> <td align=center>20</td> <td align=center>none</td> <td>Left pad with spaces if the category name is less than 20 characters long. <tr> <td align=center>%-20c</td> <td align=center>true</td> <td align=center>20</td> <td align=center>none</td> <td>Right pad with spaces if the category name is less than 20 characters long. <tr> <td align=center>%.30c</td> <td align=center>NA</td> <td align=center>none</td> <td align=center>30</td> <td>Truncate from the beginning if the category name is longer than 30 characters. <tr> <td align=center>%20.30c</td> <td align=center>false</td> <td align=center>20</td> <td align=center>30</td> <td>Left pad with spaces if the category name is shorter than 20 characters. However, if category name is longer than 30 characters, then truncate from the beginning. <tr> <td align=center>%-20.30c</td> <td align=center>true</td> <td align=center>20</td> <td align=center>30</td> <td>Right pad with spaces if the category name is shorter than 20 characters. However, if category name is longer than 30 characters, then truncate from the beginning. </table> <p>Below are some examples of conversion patterns. <dl> <p><dt><b>%r [%t] %-5p %c %x - %m%n</b> <p><dd>This is essentially the TTCC layout. <p><dt><b>%-6r [%15.15t] %-5p %30.30c %x - %m%n</b> <p><dd>Similar to the TTCC layout except that the relative time is right padded if less than 6 digits, thread name is right padded if less than 15 characters and truncated if longer and the category name is left padded if shorter than 30 characters and truncated if longer. </dl> <p>The above text is largely inspired from Peter A. Darnell and Philip E. Margolis' highly recommended book "C -- a Software Engineering Approach", ISBN 0-387-97389-3. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 This class is an enhanced version of org.apache.log4j.PatternLayout which was originally developed as part of the abandoned log4j 1.3 effort and has been available in the extras companion. This pattern layout should be used in preference to org.apache.log4j.PatternLayout except when compatibility where PatternLayout has been extended either through subclassing or alternative pattern parsers. * <p>A flexible layout configurable with pattern string. The goal of this class is to {@link #format format} a {@link LoggingEvent} and return the results in a {@link StringBuffer}. The format of the result depends on the <em>conversion pattern</em>. <p> * <p>The conversion pattern is closely related to the conversion pattern of the printf function in C. A conversion pattern is composed of literal text and format control expressions called <em>conversion specifiers</em>. * <p><i>Note that you are free to insert any literal text within the conversion pattern.</i> </p> <p>Each conversion specifier starts with a percent sign (%) and is followed by optional <em>format modifiers</em> and a <em>conversion character</em>. The conversion character specifies the type of data, e.g. category, priority, date, thread name. The format modifiers control such things as field width, padding, left and right justification. The following is a simple example. <p>Let the conversion pattern be <b>"%-5p [%t]: %m%n"</b> and assume that the log4j environment was set to use a EnhancedPatternLayout. Then the statements <pre> Category root = Category.getRoot(); root.debug("Message 1"); root.warn("Message 2"); </pre> would yield the output <pre> DEBUG [main]: Message 1 WARN [main]: Message 2 </pre> <p>Note that there is no explicit separator between text and conversion specifiers. The pattern parser knows when it has reached the end of a conversion specifier when it reads a conversion character. In the example above the conversion specifier <b>%-5p</b> means the priority of the logging event should be left justified to a width of five characters. The recognized conversion characters are <p> <table border="1" CELLPADDING="8"> <th>Conversion Character</th> <th>Effect</th> <tr> <td align=center><b>c</b></td> <td>Used to output the category of the logging event. The category conversion specifier can be optionally followed by NameAbbreviator pattern. <p>For example, for the category name "alpha.beta.gamma" the pattern <b>%c{2}</b> will output the last two elements ("beta.gamma"), <b>%c{-2}</b> will remove two elements leaving "gamma", <b>%c{1.}</b> will output "a.b.gamma". </td> </tr> <tr> <td align=center><b>C</b></td> <td>Used to output the fully qualified class name of the caller issuing the logging request. This conversion specifier can be optionally followed by <em>precision specifier</em>, that is a decimal constant in brackets. <td>Used to output the category of the logging event. The category conversion specifier can be optionally followed by NameAbbreviator pattern. <p>For example, for the category name "alpha.beta.gamma" the pattern <b>%c{2}</b> will output the last two elements ("beta.gamma"), <b>%c{-2}</b> will remove two elements leaving "gamma", <b>%c{1.}</b> will output "a.b.gamma". <p><b>WARNING</b> Generating the caller class information is slow. Thus, its use should be avoided unless execution speed is not an issue. </td> </tr> <tr> <td align=center><b>d</b></td> <td>Used to output the date of the logging event. The date conversion specifier may be followed by a set of braces containing a date and time pattern strings {@link java.text.SimpleDateFormat}, <em>ABSOLUTE</em>, <em>DATE</em> or <em>ISO8601</em> and a set of braces containing a time zone id per {@link java.util.TimeZone#getTimeZone(String)}. For example, <b>%d{HH:mm:ss,SSS}</b>, <b>%d{dd&nbsp;MMM&nbsp;yyyy&nbsp;HH:mm:ss,SSS}</b>, <b>%d{DATE}</b> or <b>%d{HH:mm:ss}{GMT+0}</b>. If no date format specifier is given then ISO8601 format is assumed. </td> </tr> <tr> <td align=center><b>F</b></td> <td>Used to output the file name where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>l</b></td> <td>Used to output location information of the caller which generated the logging event. <p>The location information depends on the JVM implementation but usually consists of the fully qualified name of the calling method followed by the callers source the file name and line number between parentheses. <p>The location information can be very useful. However, its generation is <em>extremely</em> slow and should be avoided unless execution speed is not an issue. </td> </tr> <tr> <td align=center><b>L</b></td> <td>Used to output the line number from where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>m</b></td> <td>Used to output the application supplied message associated with the logging event.</td> </tr> <tr> <td align=center><b>M</b></td> <td>Used to output the method name where the logging request was issued. <p><b>WARNING</b> Generating caller location information is extremely slow and should be avoided unless execution speed is not an issue. </tr> <tr> <td align=center><b>n</b></td> <td>Outputs the platform dependent line separator character or characters. <p>This conversion character offers practically the same performance as using non-portable line separator strings such as "\n", or "\r\n". Thus, it is the preferred way of specifying a line separator. </tr> <tr> <td align=center><b>p</b></td> <td>Used to output the priority of the logging event.</td> </tr> <tr> <td align=center><b>r</b></td> <td>Used to output the number of milliseconds elapsed since the construction of the layout until the creation of the logging event.</td> </tr> <tr> <td align=center><b>t</b></td> <td>Used to output the name of the thread that generated the logging event.</td> </tr> <tr> <td align=center><b>x</b></td> <td>Used to output the NDC (nested diagnostic context) associated with the thread that generated the logging event. </td> </tr> <tr> <td align=center><b>X</b></td> <td> <p>Used to output the MDC (mapped diagnostic context) associated with the thread that generated the logging event. The <b>X</b> conversion character can be followed by the key for the map placed between braces, as in <b>%X{clientNumber}</b> where <code>clientNumber</code> is the key. The value in the MDC corresponding to the key will be output. If no additional sub-option is specified, then the entire contents of the MDC key value pair set is output using a format {{key1,val1},{key2,val2}}</p> <p>See {@link MDC} class for more details. </p> </td> </tr> <tr> <td align=center><b>properties</b></td> <td> <p>Used to output the Properties associated with the logging event. The <b>properties</b> conversion word can be followed by the key for the map placed between braces, as in <b>%properties{application}</b> where <code>application</code> is the key. The value in the Properties bundle corresponding to the key will be output. If no additional sub-option is specified, then the entire contents of the Properties key value pair set is output using a format {{key1,val1},{key2,val2}}</p> </td> </tr> <tr> <td align=center><b>throwable</b></td> <td> <p>Used to output the Throwable trace that has been bound to the LoggingEvent, by default this will output the full trace as one would normally find by a call to Throwable.printStackTrace(). <b>%throwable{short}</b> or <b>%throwable{1}</b> will output the first line of stack trace. <b>throwable{none}</b> or <b>throwable{0}</b> will suppress the stack trace. <b>%throwable{n}</b> will output n lines of stack trace if a positive integer or omit the last -n lines if a negative integer. If no %throwable pattern is specified, the appender will take responsibility to output the stack trace as it sees fit.</p> </td> </tr> <tr> <td align=center><b>%</b></td> <td>The sequence %% outputs a single percent sign. </td> </tr> </table> <p>By default the relevant information is output as is. However, with the aid of format modifiers it is possible to change the minimum field width, the maximum field width and justification. <p>The optional format modifier is placed between the percent sign and the conversion character. <p>The first optional format modifier is the <em>left justification flag</em> which is just the minus (-) character. Then comes the optional <em>minimum field width</em> modifier. This is a decimal constant that represents the minimum number of characters to output. If the data item requires fewer characters, it is padded on either the left or the right until the minimum width is reached. The default is to pad on the left (right justify) but you can specify right padding with the left justification flag. The padding character is space. If the data item is larger than the minimum field width, the field is expanded to accommodate the data. The value is never truncated. <p>This behavior can be changed using the <em>maximum field width</em> modifier which is designated by a period followed by a decimal constant. If the data item is longer than the maximum field, then the extra characters are removed from the <em>beginning</em> of the data item and not from the end. For example, it the maximum field width is eight and the data item is ten characters long, then the first two characters of the data item are dropped. This behavior deviates from the printf function in C where truncation is done from the end. <p>Below are various format modifier examples for the category conversion specifier. <p> <TABLE BORDER=1 CELLPADDING=8> <th>Format modifier <th>left justify <th>minimum width <th>maximum width <th>comment <tr> <td align=center>%20c</td> <td align=center>false</td> <td align=center>20</td> <td align=center>none</td> <td>Left pad with spaces if the category name is less than 20 characters long. <tr> <td align=center>%-20c</td> <td align=center>true</td> <td align=center>20</td> <td align=center>none</td> <td>Right pad with spaces if the category name is less than 20 characters long. <tr> <td align=center>%.30c</td> <td align=center>NA</td> <td align=center>none</td> <td align=center>30</td> <td>Truncate from the beginning if the category name is longer than 30 characters. <tr> <td align=center>%20.30c</td> <td align=center>false</td> <td align=center>20</td> <td align=center>30</td> <td>Left pad with spaces if the category name is shorter than 20 characters. However, if category name is longer than 30 characters, then truncate from the beginning. <tr> <td align=center>%-20.30c</td> <td align=center>true</td> <td align=center>20</td> <td align=center>30</td> <td>Right pad with spaces if the category name is shorter than 20 characters. However, if category name is longer than 30 characters, then truncate from the beginning. </table> <p>Below are some examples of conversion patterns. <dl> <p><dt><b>%r [%t] %-5p %c %x - %m%n</b> <p><dd>This is essentially the TTCC layout. <p><dt><b>%-6r [%15.15t] %-5p %30.30c %x - %m%n</b> <p><dd>Similar to the TTCC layout except that the relative time is right padded if less than 6 digits, thread name is right padded if less than 15 characters and truncated if longer and the category name is left padded if shorter than 30 characters and truncated if longer. </dl> <p>The above text is largely inspired from Peter A. Darnell and Philip E. Margolis' highly recommended book "C -- a Software Engineering Approach", ISBN 0-387-97389-3. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 1.2.16 
public	TokenNamepublic	
class	TokenNameclass	
EnhancedPatternLayout	TokenNameIdentifier	 Enhanced Pattern Layout
extends	TokenNameextends	
Layout	TokenNameIdentifier	 Layout
{	TokenNameLBRACE	
/** Default pattern string for log output. Currently set to the string <b>"%m%n"</b> which just prints the application supplied message. */	TokenNameCOMMENT_JAVADOC	 Default pattern string for log output. Currently set to the string <b>"%m%n"</b> which just prints the application supplied message. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
=	TokenNameEQUAL	
"%m%n"	TokenNameStringLiteral	%m%n
;	TokenNameSEMICOLON	
/** A conversion pattern equivalent to the TTCCCLayout. Current value is <b>%r [%t] %p %c %x - %m%n</b>. */	TokenNameCOMMENT_JAVADOC	 A conversion pattern equivalent to the TTCCCLayout. Current value is <b>%r [%t] %p %c %x - %m%n</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TTCC_CONVERSION_PATTERN	TokenNameIdentifier	 TTCC  CONVERSION  PATTERN
=	TokenNameEQUAL	
"%r [%t] %p %c %x - %m%n"	TokenNameStringLiteral	%r [%t] %p %c %x - %m%n
;	TokenNameSEMICOLON	
/** * Initial size of internal buffer, no longer used. * @deprecated since 1.3 */	TokenNameCOMMENT_JAVADOC	 Initial size of internal buffer, no longer used. @deprecated since 1.3 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
BUF_SIZE	TokenNameIdentifier	 BUF  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Maximum capacity of internal buffer, no longer used. * @deprecated since 1.3 */	TokenNameCOMMENT_JAVADOC	 Maximum capacity of internal buffer, no longer used. @deprecated since 1.3 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
MAX_CAPACITY	TokenNameIdentifier	 MAX  CAPACITY
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Customized pattern conversion rules are stored under this key in the * {@link org.apache.log4j.spi.LoggerRepository LoggerRepository} object store. */	TokenNameCOMMENT_JAVADOC	 Customized pattern conversion rules are stored under this key in the {@link org.apache.log4j.spi.LoggerRepository LoggerRepository} object store. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATTERN_RULE_REGISTRY	TokenNameIdentifier	 PATTERN  RULE  REGISTRY
=	TokenNameEQUAL	
"PATTERN_RULE_REGISTRY"	TokenNameStringLiteral	PATTERN_RULE_REGISTRY
;	TokenNameSEMICOLON	
/** * Initial converter for pattern. */	TokenNameCOMMENT_JAVADOC	 Initial converter for pattern. 
private	TokenNameprivate	
PatternConverter	TokenNameIdentifier	 Pattern Converter
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
/** * Conversion pattern. */	TokenNameCOMMENT_JAVADOC	 Conversion pattern. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
conversionPattern	TokenNameIdentifier	 conversion Pattern
;	TokenNameSEMICOLON	
/** * True if any element in pattern formats information from exceptions. */	TokenNameCOMMENT_JAVADOC	 True if any element in pattern formats information from exceptions. 
private	TokenNameprivate	
boolean	TokenNameboolean	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
;	TokenNameSEMICOLON	
/** Constructs a EnhancedPatternLayout using the DEFAULT_LAYOUT_PATTERN. The default pattern just produces the application supplied message. */	TokenNameCOMMENT_JAVADOC	 Constructs a EnhancedPatternLayout using the DEFAULT_LAYOUT_PATTERN. The default pattern just produces the application supplied message. 
public	TokenNamepublic	
EnhancedPatternLayout	TokenNameIdentifier	 Enhanced Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a EnhancedPatternLayout using the supplied conversion pattern. * @param pattern conversion pattern. */	TokenNameCOMMENT_JAVADOC	 Constructs a EnhancedPatternLayout using the supplied conversion pattern. @param pattern conversion pattern. 
public	TokenNamepublic	
EnhancedPatternLayout	TokenNameIdentifier	 Enhanced Pattern Layout
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
conversionPattern	TokenNameIdentifier	 conversion Pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
createPatternParser	TokenNameIdentifier	 create Pattern Parser
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
:	TokenNameCOLON	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
instanceof	TokenNameinstanceof	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
=	TokenNameEQUAL	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
.	TokenNameDOT	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the <b>ConversionPattern</b> option. This is the string which * controls formatting and consists of a mix of literal content and * conversion specifiers. * * @param conversionPattern conversion pattern. */	TokenNameCOMMENT_JAVADOC	 Set the <b>ConversionPattern</b> option. This is the string which controls formatting and consists of a mix of literal content and conversion specifiers. * @param conversionPattern conversion pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
conversionPattern	TokenNameIdentifier	 conversion Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
conversionPattern	TokenNameIdentifier	 conversion Pattern
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
convertSpecialChars	TokenNameIdentifier	 convert Special Chars
(	TokenNameLPAREN	
conversionPattern	TokenNameIdentifier	 conversion Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
createPatternParser	TokenNameIdentifier	 create Pattern Parser
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
conversionPattern	TokenNameIdentifier	 conversion Pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
instanceof	TokenNameinstanceof	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
=	TokenNameEQUAL	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
.	TokenNameDOT	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the value of the <b>ConversionPattern</b> option. * @return conversion pattern. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>ConversionPattern</b> option. @return conversion pattern. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getConversionPattern	TokenNameIdentifier	 get Conversion Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conversionPattern	TokenNameIdentifier	 conversion Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns PatternParser used to parse the conversion string. Subclasses may override this to return a subclass of PatternParser which recognize custom conversion characters. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Returns PatternParser used to parse the conversion string. Subclasses may override this to return a subclass of PatternParser which recognize custom conversion characters. @since 0.9.0 
protected	TokenNameprotected	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PatternParser	TokenNameIdentifier	 Pattern Parser
createPatternParser	TokenNameIdentifier	 create Pattern Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
BridgePatternParser	TokenNameIdentifier	 Bridge Pattern Parser
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Activates the conversion pattern. Do not forget to call this method after you change the parameters of the EnhancedPatternLayout instance. */	TokenNameCOMMENT_JAVADOC	 Activates the conversion pattern. Do not forget to call this method after you change the parameters of the EnhancedPatternLayout instance. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do. 	TokenNameCOMMENT_LINE	nothing to do. 
}	TokenNameRBRACE	
/** * Formats a logging event to a writer. * @param event logging event to be formatted. */	TokenNameCOMMENT_JAVADOC	 Formats a logging event to a writer. @param event logging event to be formatted. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Will return false if any of the conversion specifiers in the pattern * handles {@link Exception Exceptions}. * @return true if the pattern formats any information from exceptions. */	TokenNameCOMMENT_JAVADOC	 Will return false if any of the conversion specifiers in the pattern handles {@link Exception Exceptions}. @return true if the pattern formats any information from exceptions. 
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

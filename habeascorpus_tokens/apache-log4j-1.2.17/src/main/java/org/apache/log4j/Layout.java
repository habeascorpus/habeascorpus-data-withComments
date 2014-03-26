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
/** Extend this abstract class to create your own log layout format. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Extend this abstract class to create your own log layout format. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Layout	TokenNameIdentifier	 Layout
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
// Note that the line.separator property can be looked up even by 	TokenNameCOMMENT_LINE	Note that the line.separator property can be looked up even by 
// applets. 	TokenNameCOMMENT_LINE	applets. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LINE_SEP	TokenNameIdentifier	 LINE  SEP
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
LINE_SEP_LEN	TokenNameIdentifier	 LINE  SEP  LEN
=	TokenNameEQUAL	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Implement this method to create your own layout format. */	TokenNameCOMMENT_JAVADOC	 Implement this method to create your own layout format. 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the content type output by this layout. The base class returns "text/plain". */	TokenNameCOMMENT_JAVADOC	 Returns the content type output by this layout. The base class returns "text/plain". 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"text/plain"	TokenNameStringLiteral	text/plain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the header for the layout format. The base class returns <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the header for the layout format. The base class returns <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the footer for the layout format. The base class returns <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the footer for the layout format. The base class returns <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the layout handles the throwable object contained within {@link LoggingEvent}, then the layout should return <code>false</code>. Otherwise, if the layout ignores throwable object, then the layout should return <code>true</code>. If ignoresThrowable is true, the appender is responsible for rendering the throwable. <p>The {@link SimpleLayout}, {@link TTCCLayout}, {@link PatternLayout} all return <code>true</code>. The {@link org.apache.log4j.xml.XMLLayout} returns <code>false</code>. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 If the layout handles the throwable object contained within {@link LoggingEvent}, then the layout should return <code>false</code>. Otherwise, if the layout ignores throwable object, then the layout should return <code>true</code>. If ignoresThrowable is true, the appender is responsible for rendering the throwable. <p>The {@link SimpleLayout}, {@link TTCCLayout}, {@link PatternLayout} all return <code>true</code>. The {@link org.apache.log4j.xml.XMLLayout} returns <code>false</code>. @since 0.8.4 
abstract	TokenNameabstract	
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
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
/** * LoggingEventPatternConverter is a base class for pattern converters * that can format information from instances of LoggingEvent. * * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 LoggingEventPatternConverter is a base class for pattern converters that can format information from instances of LoggingEvent. * @author Curt Arnold 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
/** * Constructs an instance of LoggingEventPatternConverter. * @param name name of converter. * @param style CSS style for output. */	TokenNameCOMMENT_JAVADOC	 Constructs an instance of LoggingEventPatternConverter. @param name name of converter. @param style CSS style for output. 
protected	TokenNameprotected	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats an event into a string buffer. * @param event event to format, may not be null. * @param toAppendTo string buffer to which the formatted event will be appended. May not be null. */	TokenNameCOMMENT_JAVADOC	 Formats an event into a string buffer. @param event event to format, may not be null. @param toAppendTo string buffer to which the formatted event will be appended. May not be null. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Normally pattern converters are not meant to handle Exceptions although * few pattern converters might. * * By examining the return values for this method, the containing layout will * determine whether it handles throwables or not. * @return true if this PatternConverter handles throwables */	TokenNameCOMMENT_JAVADOC	 Normally pattern converters are not meant to handle Exceptions although few pattern converters might. * By examining the return values for this method, the containing layout will determine whether it handles throwables or not. @return true if this PatternConverter handles throwables 
public	TokenNamepublic	
boolean	TokenNameboolean	
handlesThrowable	TokenNameIdentifier	 handles Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

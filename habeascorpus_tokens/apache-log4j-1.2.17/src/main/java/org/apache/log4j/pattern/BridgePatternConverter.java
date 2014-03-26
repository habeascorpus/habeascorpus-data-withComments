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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * The class implements the pre log4j 1.3 org.apache.log4j.helpers.PatternConverter * contract by delegating to the log4j 1.3 pattern implementation. * * * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 The class implements the pre log4j 1.3 org.apache.log4j.helpers.PatternConverter contract by delegating to the log4j 1.3 pattern implementation. * @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
/** * Pattern converters. */	TokenNameCOMMENT_JAVADOC	 Pattern converters. 
private	TokenNameprivate	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patternConverters	TokenNameIdentifier	 pattern Converters
;	TokenNameSEMICOLON	
/** * Field widths and alignment corresponding to pattern converters. */	TokenNameCOMMENT_JAVADOC	 Field widths and alignment corresponding to pattern converters. 
private	TokenNameprivate	
FormattingInfo	TokenNameIdentifier	 Formatting Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patternFields	TokenNameIdentifier	 pattern Fields
;	TokenNameSEMICOLON	
/** * Does pattern process exceptions. */	TokenNameCOMMENT_JAVADOC	 Does pattern process exceptions. 
private	TokenNameprivate	
boolean	TokenNameboolean	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
;	TokenNameSEMICOLON	
/** * Create a new instance. * @param pattern pattern, may not be null. */	TokenNameCOMMENT_JAVADOC	 Create a new instance. @param pattern pattern, may not be null. 
public	TokenNamepublic	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
converters	TokenNameIdentifier	 converters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
converterRegistry	TokenNameIdentifier	 converter Registry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
converters	TokenNameIdentifier	 converters
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
getPatternLayoutRules	TokenNameIdentifier	 get Pattern Layout Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternConverters	TokenNameIdentifier	 pattern Converters
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
[	TokenNameLBRACKET	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
patternFields	TokenNameIdentifier	 pattern Fields
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
[	TokenNameLBRACKET	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
converterIter	TokenNameIdentifier	 converter Iter
=	TokenNameEQUAL	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
fieldIter	TokenNameIdentifier	 field Iter
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
converterIter	TokenNameIdentifier	 converter Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
converter	TokenNameIdentifier	 converter
=	TokenNameEQUAL	
converterIter	TokenNameIdentifier	 converter Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
converter	TokenNameIdentifier	 converter
instanceof	TokenNameinstanceof	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
)	TokenNameRPAREN	
converter	TokenNameIdentifier	 converter
;	TokenNameSEMICOLON	
handlesExceptions	TokenNameIdentifier	 handles Exceptions
|=	TokenNameOR_EQUAL	
patternConverters	TokenNameIdentifier	 pattern Converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
handlesThrowable	TokenNameIdentifier	 handles Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldIter	TokenNameIdentifier	 field Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patternFields	TokenNameIdentifier	 pattern Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
)	TokenNameRPAREN	
fieldIter	TokenNameIdentifier	 field Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
patternFields	TokenNameIdentifier	 pattern Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// code should be unreachable. 	TokenNameCOMMENT_LINE	code should be unreachable. 
// 	TokenNameCOMMENT_LINE	 
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Format event to string buffer. @param sbuf string buffer to receive formatted event, may not be null. @param e event to format, may not be null. */	TokenNameCOMMENT_JAVADOC	 Format event to string buffer. @param sbuf string buffer to receive formatted event, may not be null. @param e event to format, may not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startField	TokenNameIdentifier	 start Field
=	TokenNameEQUAL	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternConverters	TokenNameIdentifier	 pattern Converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternFields	TokenNameIdentifier	 pattern Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
startField	TokenNameIdentifier	 start Field
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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

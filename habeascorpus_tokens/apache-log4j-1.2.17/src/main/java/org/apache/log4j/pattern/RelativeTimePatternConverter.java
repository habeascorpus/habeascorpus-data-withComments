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
/** * Return the relative time in milliseconds since loading of the LoggingEvent * class. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Return the relative time in milliseconds since loading of the LoggingEvent class. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * Cached formatted timestamp. */	TokenNameCOMMENT_JAVADOC	 Cached formatted timestamp. 
private	TokenNameprivate	
CachedTimestamp	TokenNameIdentifier	 Cached Timestamp
lastTimestamp	TokenNameIdentifier	 last Timestamp
=	TokenNameEQUAL	
new	TokenNamenew	
CachedTimestamp	TokenNameIdentifier	 Cached Timestamp
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
public	TokenNamepublic	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Time"	TokenNameStringLiteral	Time
,	TokenNameCOMMA	
"time"	TokenNameStringLiteral	time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of RelativeTimePatternConverter. * @param options options, currently ignored, may be null. * @return instance of RelativeTimePatternConverter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of RelativeTimePatternConverter. @param options options, currently ignored, may be null. @return instance of RelativeTimePatternConverter. 
public	TokenNamepublic	
static	TokenNamestatic	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lastTimestamp	TokenNameIdentifier	 last Timestamp
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
-	TokenNameMINUS	
LoggingEvent	TokenNameIdentifier	 Logging Event
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toAppendTo	TokenNameIdentifier	 to Append To
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatted	TokenNameIdentifier	 formatted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastTimestamp	TokenNameIdentifier	 last Timestamp
=	TokenNameEQUAL	
new	TokenNamenew	
CachedTimestamp	TokenNameIdentifier	 Cached Timestamp
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cached timestamp and formatted value. */	TokenNameCOMMENT_JAVADOC	 Cached timestamp and formatted value. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CachedTimestamp	TokenNameIdentifier	 Cached Timestamp
{	TokenNameLBRACE	
/** * Cached timestamp. */	TokenNameCOMMENT_JAVADOC	 Cached timestamp. 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
/** * Cached formatted timestamp. */	TokenNameCOMMENT_JAVADOC	 Cached formatted timestamp. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
;	TokenNameSEMICOLON	
/** * Creates a new instance. * @param timestamp timestamp. * @param formatted formatted timestamp. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance. @param timestamp timestamp. @param formatted formatted timestamp. 
public	TokenNamepublic	
CachedTimestamp	TokenNameIdentifier	 Cached Timestamp
(	TokenNameLPAREN	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
formatted	TokenNameIdentifier	 formatted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends the cached formatted timestamp to the buffer if timestamps match. * @param newTimestamp requested timestamp. * @param toAppendTo buffer to append formatted timestamp. * @return true if requested timestamp matched cached timestamp. */	TokenNameCOMMENT_JAVADOC	 Appends the cached formatted timestamp to the buffer if timestamps match. @param newTimestamp requested timestamp. @param toAppendTo buffer to append formatted timestamp. @return true if requested timestamp matched cached timestamp. 
public	TokenNamepublic	
boolean	TokenNameboolean	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
long	TokenNamelong	
newTimestamp	TokenNameIdentifier	 new Timestamp
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newTimestamp	TokenNameIdentifier	 new Timestamp
==	TokenNameEQUAL_EQUAL	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toAppendTo	TokenNameIdentifier	 to Append To
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatted	TokenNameIdentifier	 formatted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

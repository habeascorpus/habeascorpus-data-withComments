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
/** * Format the event's line location information. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Format the event's line location information. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * Singleton. */	TokenNameCOMMENT_JAVADOC	 Singleton. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
private	TokenNameprivate	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Full Location"	TokenNameStringLiteral	Full Location
,	TokenNameCOMMA	
"fullLocation"	TokenNameStringLiteral	fullLocation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of pattern converter. * @param options options, may be null. * @return instance of pattern converter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of pattern converter. @param options options, may be null. @return instance of pattern converter. 
public	TokenNamepublic	
static	TokenNamestatic	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
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
INSTANCE	TokenNameIdentifier	 INSTANCE
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
output	TokenNameIdentifier	 output
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
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

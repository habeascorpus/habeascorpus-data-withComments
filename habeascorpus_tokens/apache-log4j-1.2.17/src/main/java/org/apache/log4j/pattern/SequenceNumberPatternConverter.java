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
/** * Formats the event sequence number. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Formats the event sequence number. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * Singleton. */	TokenNameCOMMENT_JAVADOC	 Singleton. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
private	TokenNameprivate	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Sequence Number"	TokenNameStringLiteral	Sequence Number
,	TokenNameCOMMA	
"sn"	TokenNameStringLiteral	sn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of SequencePatternConverter. * @param options options, currently ignored, may be null. * @return instance of SequencePatternConverter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of SequencePatternConverter. @param options options, currently ignored, may be null. @return instance of SequencePatternConverter. 
public	TokenNamepublic	
static	TokenNamestatic	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
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
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toAppendTo	TokenNameIdentifier	 to Append To
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
/** * * Base class for other pattern converters which can return only parts of their name. * * @author Ceki G&uuml;lc&uuml; * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 * Base class for other pattern converters which can return only parts of their name. * @author Ceki G&uuml;lc&uuml; @author Curt Arnold 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NamePatternConverter	TokenNameIdentifier	 Name Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * Abbreviator. */	TokenNameCOMMENT_JAVADOC	 Abbreviator. 
private	TokenNameprivate	
final	TokenNamefinal	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbreviator	TokenNameIdentifier	 abbreviator
;	TokenNameSEMICOLON	
/** * Constructor. * @param name name of converter. * @param style style name for associated output. * @param options options, may be null, first element will be interpreted as an abbreviation pattern. */	TokenNameCOMMENT_JAVADOC	 Constructor. @param name name of converter. @param style style name for associated output. @param options options, may be null, first element will be interpreted as an abbreviation pattern. 
protected	TokenNameprotected	
NamePatternConverter	TokenNameIdentifier	 Name Pattern Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
abbreviator	TokenNameIdentifier	 abbreviator
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
abbreviator	TokenNameIdentifier	 abbreviator
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getDefaultAbbreviator	TokenNameIdentifier	 get Default Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Abbreviate name in string buffer. * @param nameStart starting position of name to abbreviate. * @param buf string buffer containing name. */	TokenNameCOMMENT_JAVADOC	 Abbreviate name in string buffer. @param nameStart starting position of name to abbreviate. @param buf string buffer containing name. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
abbreviator	TokenNameIdentifier	 abbreviator
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

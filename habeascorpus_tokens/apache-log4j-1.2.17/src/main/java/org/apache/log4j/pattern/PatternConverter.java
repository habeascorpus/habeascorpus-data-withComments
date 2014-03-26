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
/** <p>PatternConverter is an abstract class that provides the formatting functionality that derived classes need. <p>Conversion specifiers in a conversion patterns are parsed to individual PatternConverters. Each of which is responsible for converting an object in a converter specific manner. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @author Chris Nokes @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 <p>PatternConverter is an abstract class that provides the formatting functionality that derived classes need. <p>Conversion specifiers in a conversion patterns are parsed to individual PatternConverters. Each of which is responsible for converting an object in a converter specific manner. @author <a href="mailto:cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @author Chris Nokes @author Curt Arnold 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
/** * Converter name. */	TokenNameCOMMENT_JAVADOC	 Converter name. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Converter style name. */	TokenNameCOMMENT_JAVADOC	 Converter style name. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
/** * Create a new pattern converter. * @param name name for pattern converter. * @param style CSS style for formatted output. */	TokenNameCOMMENT_JAVADOC	 Create a new pattern converter. @param name name for pattern converter. @param style CSS style for formatted output. 
protected	TokenNameprotected	
PatternConverter	TokenNameIdentifier	 Pattern Converter
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
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
style	TokenNameIdentifier	 style
=	TokenNameEQUAL	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats an object into a string buffer. * @param obj event to format, may not be null. * @param toAppendTo string buffer to which the formatted event will be appended. May not be null. */	TokenNameCOMMENT_JAVADOC	 Formats an object into a string buffer. @param obj event to format, may not be null. @param toAppendTo string buffer to which the formatted event will be appended. May not be null. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method returns the name of the conversion pattern. * * The name can be useful to certain Layouts such as HTMLLayout. * * @return the name of the conversion pattern */	TokenNameCOMMENT_JAVADOC	 This method returns the name of the conversion pattern. * The name can be useful to certain Layouts such as HTMLLayout. * @return the name of the conversion pattern 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method returns the CSS style class that should be applied to * the LoggingEvent passed as parameter, which can be null. * * This information is currently used only by HTMLLayout. * * @param e null values are accepted * @return the name of the conversion pattern */	TokenNameCOMMENT_JAVADOC	 This method returns the CSS style class that should be applied to the LoggingEvent passed as parameter, which can be null. * This information is currently used only by HTMLLayout. * @param e null values are accepted @return the name of the conversion pattern 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStyleClass	TokenNameIdentifier	 get Style Class
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

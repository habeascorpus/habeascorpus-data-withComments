/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * This interface is used to connect the XML pattern file parser to the * hyphenation tree. * * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. */	TokenNameCOMMENT_JAVADOC	 This interface is used to connect the XML pattern file parser to the hyphenation tree. * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. 
public	TokenNamepublic	
interface	TokenNameinterface	
PatternConsumer	TokenNameIdentifier	 Pattern Consumer
{	TokenNameLBRACE	
/** * Add a character class. A character class defines characters that are * considered equivalent for the purpose of hyphenation (e.g. "aA"). It * usually means to ignore case. * * @param chargroup character group */	TokenNameCOMMENT_JAVADOC	 Add a character class. A character class defines characters that are considered equivalent for the purpose of hyphenation (e.g. "aA"). It usually means to ignore case. * @param chargroup character group 
void	TokenNamevoid	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chargroup	TokenNameIdentifier	 chargroup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a hyphenation exception. An exception replaces the result obtained by * the algorithm for cases for which this fails or the user wants to provide * his own hyphenation. A hyphenatedword is a vector of alternating String's * and {@link Hyphen Hyphen} instances */	TokenNameCOMMENT_JAVADOC	 Add a hyphenation exception. An exception replaces the result obtained by the algorithm for cases for which this fails or the user wants to provide his own hyphenation. A hyphenatedword is a vector of alternating String's and {@link Hyphen Hyphen} instances 
void	TokenNamevoid	
addException	TokenNameIdentifier	 add Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
hyphenatedword	TokenNameIdentifier	 hyphenatedword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add hyphenation patterns. * * @param pattern the pattern * @param values interletter values expressed as a string of digit characters. */	TokenNameCOMMENT_JAVADOC	 Add hyphenation patterns. * @param pattern the pattern @param values interletter values expressed as a string of digit characters. 
void	TokenNamevoid	
addPattern	TokenNameIdentifier	 add Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

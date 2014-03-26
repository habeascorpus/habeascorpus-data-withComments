package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
Consts	TokenNameIdentifier	 Consts
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FULL	TokenNameIdentifier	 FULL
=	TokenNameEQUAL	
"$full_path$"	TokenNameStringLiteral	$full_path$
;	TokenNameSEMICOLON	
/** * A {@link #FULL} {@link Term} - use it for creating new terms instead of * calling {@link Term#Term(String, String)}, by calling * {@link Term#createTerm(String)} -- the latter does not do string interning. */	TokenNameCOMMENT_JAVADOC	 A {@link #FULL} {@link Term} - use it for creating new terms instead of calling {@link Term#Term(String, String)}, by calling {@link Term#createTerm(String)} -- the latter does not do string interning. 
static	TokenNamestatic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
FULL_TERM	TokenNameIdentifier	 FULL  TERM
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FULL	TokenNameIdentifier	 FULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELD_PAYLOADS	TokenNameIdentifier	 FIELD  PAYLOADS
=	TokenNameEQUAL	
"$payloads$"	TokenNameStringLiteral	$payloads$
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PAYLOAD_PARENT	TokenNameIdentifier	 PAYLOAD  PARENT
=	TokenNameEQUAL	
"p"	TokenNameStringLiteral	p
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
PAYLOAD_PARENT_CHARS	TokenNameIdentifier	 PAYLOAD  PARENT  CHARS
=	TokenNameEQUAL	
PAYLOAD_PARENT	TokenNameIdentifier	 PAYLOAD  PARENT
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The following is a "field selector", an object which tells Lucene to * extract only a single field rather than a whole document. */	TokenNameCOMMENT_JAVADOC	 The following is a "field selector", an object which tells Lucene to extract only a single field rather than a whole document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FieldSelector	TokenNameIdentifier	 Field Selector
fullPathSelector	TokenNameIdentifier	 full Path Selector
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSelector	TokenNameIdentifier	 Field Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FULL	TokenNameIdentifier	 FULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD_AND_BREAK	TokenNameIdentifier	 LOAD  AND  BREAK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Delimiter used for creating the full path of a category from the list of * its labels from root. It is forbidden for labels to contain this * character. * <P> * Originally, we used ??	TokenNameCOMMENT_JAVADOC	 
//static final char DEFAULT_DELIMITER = '?	TokenNameCOMMENT_LINE	static final char DEFAULT_DELIMITER = '?
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

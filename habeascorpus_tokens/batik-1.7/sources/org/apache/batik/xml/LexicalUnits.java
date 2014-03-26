/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
;	TokenNameSEMICOLON	
/** * This interface defines the constants that represent XML lexical units. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LexicalUnits.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface defines the constants that represent XML lexical units. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LexicalUnits.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
LexicalUnits	TokenNameIdentifier	 Lexical Units
{	TokenNameLBRACE	
/** * Represents the EOF lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the EOF lexical unit. 
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the S (space) lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the S (space) lexical unit. 
int	TokenNameint	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an XML declaration start lexical unit, i&#x2e;e&#x2e; '&lt;&#x3f;xml'. */	TokenNameCOMMENT_JAVADOC	 Represents an XML declaration start lexical unit, i&#x2e;e&#x2e; '&lt;&#x3f;xml'. 
int	TokenNameint	
XML_DECL_START	TokenNameIdentifier	 XML  DECL  START
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a doctype start lexical unit, i&#x2e;e&#x2e; &lt;&#x21;DOCTYPE. */	TokenNameCOMMENT_JAVADOC	 Represents a doctype start lexical unit, i&#x2e;e&#x2e; &lt;&#x21;DOCTYPE. 
int	TokenNameint	
DOCTYPE_START	TokenNameIdentifier	 DOCTYPE  START
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a comment lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a comment lexical unit. 
int	TokenNameint	
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a PI start lexical unit, i&#x2e;e&#x2e; '&lt;&#x3f;Name'. */	TokenNameCOMMENT_JAVADOC	 Represents a PI start lexical unit, i&#x2e;e&#x2e; '&lt;&#x3f;Name'. 
int	TokenNameint	
PI_START	TokenNameIdentifier	 PI  START
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a PI data lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a PI data lexical unit. 
int	TokenNameint	
PI_DATA	TokenNameIdentifier	 PI  DATA
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a PI end lexical unit, i&#x2e;e&#x2e; '&#x3f;&gt;'. */	TokenNameCOMMENT_JAVADOC	 Represents a PI end lexical unit, i&#x2e;e&#x2e; '&#x3f;&gt;'. 
int	TokenNameint	
PI_END	TokenNameIdentifier	 PI  END
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a character data lexical unit, i&#x2e;e&#x2e; the content of * an element. */	TokenNameCOMMENT_JAVADOC	 Represents a character data lexical unit, i&#x2e;e&#x2e; the content of an element. 
int	TokenNameint	
CHARACTER_DATA	TokenNameIdentifier	 CHARACTER  DATA
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a start tag lexical unit, i&#x2e;e&#x2e; '&lt;Name'. */	TokenNameCOMMENT_JAVADOC	 Represents a start tag lexical unit, i&#x2e;e&#x2e; '&lt;Name'. 
int	TokenNameint	
START_TAG	TokenNameIdentifier	 START  TAG
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an end tag lexical unit, i&#x2e;e&#x2e; '&lt;/Name'. */	TokenNameCOMMENT_JAVADOC	 Represents an end tag lexical unit, i&#x2e;e&#x2e; '&lt;/Name'. 
int	TokenNameint	
END_TAG	TokenNameIdentifier	 END  TAG
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a CDATA section start lexical unit, i&#x2e;e&#x2e; * '&lt;&#x21;[CDATA['. */	TokenNameCOMMENT_JAVADOC	 Represents a CDATA section start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;[CDATA['. 
int	TokenNameint	
CDATA_START	TokenNameIdentifier	 CDATA  START
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a character reference lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a character reference lexical unit. 
int	TokenNameint	
CHARACTER_REFERENCE	TokenNameIdentifier	 CHARACTER  REFERENCE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an entity reference lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents an entity reference lexical unit. 
int	TokenNameint	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a name lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a name lexical unit. 
int	TokenNameint	
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents '=' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents '=' lexical unit. 
int	TokenNameint	
EQ	TokenNameIdentifier	 EQ
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a first attribute fragment lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a first attribute fragment lexical unit. 
int	TokenNameint	
FIRST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 FIRST  ATTRIBUTE  FRAGMENT
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an attribute fragment lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents an attribute fragment lexical unit. 
int	TokenNameint	
ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 ATTRIBUTE  FRAGMENT
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a last attribute fragment lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a last attribute fragment lexical unit. 
int	TokenNameint	
LAST_ATTRIBUTE_FRAGMENT	TokenNameIdentifier	 LAST  ATTRIBUTE  FRAGMENT
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an empty element end lexical unit, i&#x2e;e&#x2e; '/&gt;'. */	TokenNameCOMMENT_JAVADOC	 Represents an empty element end lexical unit, i&#x2e;e&#x2e; '/&gt;'. 
int	TokenNameint	
EMPTY_ELEMENT_END	TokenNameIdentifier	 EMPTY  ELEMENT  END
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a end character lexical unit, i&#x2e;e&#x2e; '&gt;'. */	TokenNameCOMMENT_JAVADOC	 Represents a end character lexical unit, i&#x2e;e&#x2e; '&gt;'. 
int	TokenNameint	
END_CHAR	TokenNameIdentifier	 END  CHAR
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a section end lexical unit, i&#x2e;e&#x2e; ']]&gt;'. */	TokenNameCOMMENT_JAVADOC	 Represents a section end lexical unit, i&#x2e;e&#x2e; ']]&gt;'. 
int	TokenNameint	
SECTION_END	TokenNameIdentifier	 SECTION  END
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'version' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'version' lexical unit. 
int	TokenNameint	
VERSION_IDENTIFIER	TokenNameIdentifier	 VERSION  IDENTIFIER
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'encoding' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'encoding' lexical unit. 
int	TokenNameint	
ENCODING_IDENTIFIER	TokenNameIdentifier	 ENCODING  IDENTIFIER
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'standalone' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'standalone' lexical unit. 
int	TokenNameint	
STANDALONE_IDENTIFIER	TokenNameIdentifier	 STANDALONE  IDENTIFIER
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a string lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a string lexical unit. 
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'SYSTEM' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'SYSTEM' lexical unit. 
int	TokenNameint	
SYSTEM_IDENTIFIER	TokenNameIdentifier	 SYSTEM  IDENTIFIER
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'PUBLIC' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'PUBLIC' lexical unit. 
int	TokenNameint	
PUBLIC_IDENTIFIER	TokenNameIdentifier	 PUBLIC  IDENTIFIER
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '[' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '[' lexical unit. 
int	TokenNameint	
LSQUARE_BRACKET	TokenNameIdentifier	 LSQUARE  BRACKET
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a ']' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a ']' lexical unit. 
int	TokenNameint	
RSQUARE_BRACKET	TokenNameIdentifier	 RSQUARE  BRACKET
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a element declaration start lexical unit, i&#x2e;e&#x2e; * '&lt;&#x21;ELEMENT'. */	TokenNameCOMMENT_JAVADOC	 Represents a element declaration start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;ELEMENT'. 
int	TokenNameint	
ELEMENT_DECLARATION_START	TokenNameIdentifier	 ELEMENT  DECLARATION  START
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an ATTLIST declaration start lexical unit, i&#x2e;e&#x2e; * '&lt;&#x21;ATTLIST'. */	TokenNameCOMMENT_JAVADOC	 Represents an ATTLIST declaration start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;ATTLIST'. 
int	TokenNameint	
ATTLIST_START	TokenNameIdentifier	 ATTLIST  START
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an entity start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;ENTITY'. */	TokenNameCOMMENT_JAVADOC	 Represents an entity start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;ENTITY'. 
int	TokenNameint	
ENTITY_START	TokenNameIdentifier	 ENTITY  START
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a notation start lexical unit, i&#x2e;e&#x2e; * '&lt;&#x21;NOTATION'. */	TokenNameCOMMENT_JAVADOC	 Represents a notation start lexical unit, i&#x2e;e&#x2e; '&lt;&#x21;NOTATION'. 
int	TokenNameint	
NOTATION_START	TokenNameIdentifier	 NOTATION  START
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a parameter entity reference lexical unit, i&#x2e;e&#x2e; * '%Name;'. */	TokenNameCOMMENT_JAVADOC	 Represents a parameter entity reference lexical unit, i&#x2e;e&#x2e; '%Name;'. 
int	TokenNameint	
PARAMETER_ENTITY_REFERENCE	TokenNameIdentifier	 PARAMETER  ENTITY  REFERENCE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'EMPTY' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'EMPTY' lexical unit. 
int	TokenNameint	
EMPTY_IDENTIFIER	TokenNameIdentifier	 EMPTY  IDENTIFIER
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'ANY' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'ANY' lexical unit. 
int	TokenNameint	
ANY_IDENTIFIER	TokenNameIdentifier	 ANY  IDENTIFIER
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '&#x3f;' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '&#x3f;' lexical unit. 
int	TokenNameint	
QUESTION	TokenNameIdentifier	 QUESTION
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '+' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '+' lexical unit. 
int	TokenNameint	
PLUS	TokenNameIdentifier	 PLUS
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '*' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '*' lexical unit. 
int	TokenNameint	
STAR	TokenNameIdentifier	 STAR
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '(' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '(' lexical unit. 
int	TokenNameint	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a ')' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a ')' lexical unit. 
int	TokenNameint	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '|' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '|' lexical unit. 
int	TokenNameint	
PIPE	TokenNameIdentifier	 PIPE
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a ',' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a ',' lexical unit. 
int	TokenNameint	
COMMA	TokenNameIdentifier	 COMMA
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '#PCDATA' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '#PCDATA' lexical unit. 
int	TokenNameint	
PCDATA_IDENTIFIER	TokenNameIdentifier	 PCDATA  IDENTIFIER
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'CDATA' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'CDATA' lexical unit. 
int	TokenNameint	
CDATA_IDENTIFIER	TokenNameIdentifier	 CDATA  IDENTIFIER
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'ID' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'ID' lexical unit. 
int	TokenNameint	
ID_IDENTIFIER	TokenNameIdentifier	 ID  IDENTIFIER
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'IDREF' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'IDREF' lexical unit. 
int	TokenNameint	
IDREF_IDENTIFIER	TokenNameIdentifier	 IDREF  IDENTIFIER
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'IDREFS' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'IDREFS' lexical unit. 
int	TokenNameint	
IDREFS_IDENTIFIER	TokenNameIdentifier	 IDREFS  IDENTIFIER
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'NMTOKEN' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'NMTOKEN' lexical unit. 
int	TokenNameint	
NMTOKEN_IDENTIFIER	TokenNameIdentifier	 NMTOKEN  IDENTIFIER
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'NMTOKENS' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'NMTOKENS' lexical unit. 
int	TokenNameint	
NMTOKENS_IDENTIFIER	TokenNameIdentifier	 NMTOKENS  IDENTIFIER
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'ENTITY' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'ENTITY' lexical unit. 
int	TokenNameint	
ENTITY_IDENTIFIER	TokenNameIdentifier	 ENTITY  IDENTIFIER
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'ENTITIES' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'ENTITIES' lexical unit. 
int	TokenNameint	
ENTITIES_IDENTIFIER	TokenNameIdentifier	 ENTITIES  IDENTIFIER
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '#REQUIRED' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '#REQUIRED' lexical unit. 
int	TokenNameint	
REQUIRED_IDENTIFIER	TokenNameIdentifier	 REQUIRED  IDENTIFIER
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '#IMPLIED' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '#IMPLIED' lexical unit. 
int	TokenNameint	
IMPLIED_IDENTIFIER	TokenNameIdentifier	 IMPLIED  IDENTIFIER
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '#FIXED' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '#FIXED' lexical unit. 
int	TokenNameint	
FIXED_IDENTIFIER	TokenNameIdentifier	 FIXED  IDENTIFIER
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a Nmtoken lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a Nmtoken lexical unit. 
int	TokenNameint	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
=	TokenNameEQUAL	
56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'NOTATION' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'NOTATION' lexical unit. 
int	TokenNameint	
NOTATION_IDENTIFIER	TokenNameIdentifier	 NOTATION  IDENTIFIER
=	TokenNameEQUAL	
57	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a '%' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a '%' lexical unit. 
int	TokenNameint	
PERCENT	TokenNameIdentifier	 PERCENT
=	TokenNameEQUAL	
58	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'NDATA' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'NDATA' lexical unit. 
int	TokenNameint	
NDATA_IDENTIFIER	TokenNameIdentifier	 NDATA  IDENTIFIER
=	TokenNameEQUAL	
59	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

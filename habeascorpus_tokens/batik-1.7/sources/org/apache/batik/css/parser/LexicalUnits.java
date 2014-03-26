/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * This interface defines the constants that represent CSS lexical units. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LexicalUnits.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface defines the constants that represent CSS lexical units. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LexicalUnits.java 475477 2006-11-15 22:44:28Z cam $ 
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
/** * Represents the '{' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '{' lexical unit. 
int	TokenNameint	
LEFT_CURLY_BRACE	TokenNameIdentifier	 LEFT  CURLY  BRACE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '}' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '}' lexical unit. 
int	TokenNameint	
RIGHT_CURLY_BRACE	TokenNameIdentifier	 RIGHT  CURLY  BRACE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '=' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '=' lexical unit. 
int	TokenNameint	
EQUAL	TokenNameIdentifier	 EQUAL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '+' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '+' lexical unit. 
int	TokenNameint	
PLUS	TokenNameIdentifier	 PLUS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '-' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '-' lexical unit. 
int	TokenNameint	
MINUS	TokenNameIdentifier	 MINUS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the ',' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the ',' lexical unit. 
int	TokenNameint	
COMMA	TokenNameIdentifier	 COMMA
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '.' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '.' lexical unit. 
int	TokenNameint	
DOT	TokenNameIdentifier	 DOT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the ';' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the ';' lexical unit. 
int	TokenNameint	
SEMI_COLON	TokenNameIdentifier	 SEMI  COLON
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '&gt;' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '&gt;' lexical unit. 
int	TokenNameint	
PRECEDE	TokenNameIdentifier	 PRECEDE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '/' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '/' lexical unit. 
int	TokenNameint	
DIVIDE	TokenNameIdentifier	 DIVIDE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '[' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '[' lexical unit. 
int	TokenNameint	
LEFT_BRACKET	TokenNameIdentifier	 LEFT  BRACKET
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the ']' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the ']' lexical unit. 
int	TokenNameint	
RIGHT_BRACKET	TokenNameIdentifier	 RIGHT  BRACKET
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '*' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '*' lexical unit. 
int	TokenNameint	
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '(' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '(' lexical unit. 
int	TokenNameint	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the ')' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the ')' lexical unit. 
int	TokenNameint	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the ':' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the ':' lexical unit. 
int	TokenNameint	
COLON	TokenNameIdentifier	 COLON
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the white space lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the white space lexical unit. 
int	TokenNameint	
SPACE	TokenNameIdentifier	 SPACE
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the comment lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the comment lexical unit. 
int	TokenNameint	
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the string lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the string lexical unit. 
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the identifier lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the identifier lexical unit. 
int	TokenNameint	
IDENTIFIER	TokenNameIdentifier	 IDENTIFIER
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '&lt;&#x21;--' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '&lt;&#x21;--' lexical unit. 
int	TokenNameint	
CDO	TokenNameIdentifier	 CDO
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '--&gt;' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '--&gt;' lexical unit. 
int	TokenNameint	
CDC	TokenNameIdentifier	 CDC
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '&#x21;important' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '&#x21;important' lexical unit. 
int	TokenNameint	
IMPORTANT_SYMBOL	TokenNameIdentifier	 IMPORTANT  SYMBOL
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an integer. */	TokenNameCOMMENT_JAVADOC	 Represents an integer. 
int	TokenNameint	
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '|=' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '|=' lexical unit. 
int	TokenNameint	
DASHMATCH	TokenNameIdentifier	 DASHMATCH
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '~=' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '~=' lexical unit. 
int	TokenNameint	
INCLUDES	TokenNameIdentifier	 INCLUDES
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '#name' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '#name' lexical unit. 
int	TokenNameint	
HASH	TokenNameIdentifier	 HASH
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@import' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@import' lexical unit. 
int	TokenNameint	
IMPORT_SYMBOL	TokenNameIdentifier	 IMPORT  SYMBOL
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@ident' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@ident' lexical unit. 
int	TokenNameint	
AT_KEYWORD	TokenNameIdentifier	 AT  KEYWORD
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@charset' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@charset' lexical unit. 
int	TokenNameint	
CHARSET_SYMBOL	TokenNameIdentifier	 CHARSET  SYMBOL
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@font-face' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@font-face' lexical unit. 
int	TokenNameint	
FONT_FACE_SYMBOL	TokenNameIdentifier	 FONT  FACE  SYMBOL
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@media' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@media' lexical unit. 
int	TokenNameint	
MEDIA_SYMBOL	TokenNameIdentifier	 MEDIA  SYMBOL
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents the '@page' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents the '@page' lexical unit. 
int	TokenNameint	
PAGE_SYMBOL	TokenNameIdentifier	 PAGE  SYMBOL
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a dimension lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a dimension lexical unit. 
int	TokenNameint	
DIMENSION	TokenNameIdentifier	 DIMENSION
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a ex lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a ex lexical unit. 
int	TokenNameint	
EX	TokenNameIdentifier	 EX
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a em lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a em lexical unit. 
int	TokenNameint	
EM	TokenNameIdentifier	 EM
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a cm lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a cm lexical unit. 
int	TokenNameint	
CM	TokenNameIdentifier	 CM
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a mm lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a mm lexical unit. 
int	TokenNameint	
MM	TokenNameIdentifier	 MM
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a in lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a in lexical unit. 
int	TokenNameint	
IN	TokenNameIdentifier	 IN
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a ms lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a ms lexical unit. 
int	TokenNameint	
MS	TokenNameIdentifier	 MS
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a hz lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a hz lexical unit. 
int	TokenNameint	
HZ	TokenNameIdentifier	 HZ
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a % lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a % lexical unit. 
int	TokenNameint	
PERCENTAGE	TokenNameIdentifier	 PERCENTAGE
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a s lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a s lexical unit. 
int	TokenNameint	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a pc lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a pc lexical unit. 
int	TokenNameint	
PC	TokenNameIdentifier	 PC
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a pt lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a pt lexical unit. 
int	TokenNameint	
PT	TokenNameIdentifier	 PT
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a px lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a px lexical unit. 
int	TokenNameint	
PX	TokenNameIdentifier	 PX
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a deg lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a deg lexical unit. 
int	TokenNameint	
DEG	TokenNameIdentifier	 DEG
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a rad lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a rad lexical unit. 
int	TokenNameint	
RAD	TokenNameIdentifier	 RAD
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a grad lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a grad lexical unit. 
int	TokenNameint	
GRAD	TokenNameIdentifier	 GRAD
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a khz lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a khz lexical unit. 
int	TokenNameint	
KHZ	TokenNameIdentifier	 KHZ
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'url(URI)' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'url(URI)' lexical unit. 
int	TokenNameint	
URI	TokenNameIdentifier	 URI
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a 'ident(' lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a 'ident(' lexical unit. 
int	TokenNameint	
FUNCTION	TokenNameIdentifier	 FUNCTION
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a unicode range lexical unit. */	TokenNameCOMMENT_JAVADOC	 Represents a unicode range lexical unit. 
int	TokenNameint	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * represents a real number. */	TokenNameCOMMENT_JAVADOC	 represents a real number. 
int	TokenNameint	
REAL	TokenNameIdentifier	 REAL
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

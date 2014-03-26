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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
CSSException	TokenNameIdentifier	 CSS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SACMediaList	TokenNameIdentifier	 SAC Media List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SelectorList	TokenNameIdentifier	 Selector List
;	TokenNameSEMICOLON	
/** * This class implements the {@link org.w3c.css.sac.Parser} interface plus a * set of custom methods. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ExtendedParser.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.css.sac.Parser} interface plus a set of custom methods. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ExtendedParser.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ExtendedParser	TokenNameIdentifier	 Extended Parser
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** * Parse a CSS style declaration (without '{' and '}'). * * @param source The declaration. * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS style declaration (without '{' and '}'). * @param source The declaration. @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
void	TokenNamevoid	
parseStyleDeclaration	TokenNameIdentifier	 parse Style Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parse a CSS rule. * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS rule. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
void	TokenNamevoid	
parseRule	TokenNameIdentifier	 parse Rule
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parse a comma separated list of selectors. * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a comma separated list of selectors. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
SelectorList	TokenNameIdentifier	 Selector List
parseSelectors	TokenNameIdentifier	 parse Selectors
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parse a CSS property value. * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS property value. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
LexicalUnit	TokenNameIdentifier	 Lexical Unit
parsePropertyValue	TokenNameIdentifier	 parse Property Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parse a CSS media value. * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS media value. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
SACMediaList	TokenNameIdentifier	 SAC Media List
parseMedia	TokenNameIdentifier	 parse Media
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediaText	TokenNameIdentifier	 media Text
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Parse a CSS priority value (e&#x2e;g&#x2e; "&#x21;important"). * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS priority value (e&#x2e;g&#x2e; "&#x21;important"). * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
boolean	TokenNameboolean	
parsePriority	TokenNameIdentifier	 parse Priority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

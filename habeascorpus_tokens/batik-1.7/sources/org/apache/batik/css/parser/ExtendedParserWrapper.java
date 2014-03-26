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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
ConditionFactory	TokenNameIdentifier	 Condition Factory
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
DocumentHandler	TokenNameIdentifier	 Document Handler
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
ErrorHandler	TokenNameIdentifier	 Error Handler
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
InputSource	TokenNameIdentifier	 Input Source
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
Parser	TokenNameIdentifier	 Parser
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
SelectorFactory	TokenNameIdentifier	 Selector Factory
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
/** * This class implements the {@link org.apache.batik.css.parser.ExtendedParser} * interface by wrapping a standard {@link org.w3c.css.sac.Parser}. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ExtendedParserWrapper.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.apache.batik.css.parser.ExtendedParser} interface by wrapping a standard {@link org.w3c.css.sac.Parser}. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ExtendedParserWrapper.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ExtendedParserWrapper	TokenNameIdentifier	 Extended Parser Wrapper
implements	TokenNameimplements	
ExtendedParser	TokenNameIdentifier	 Extended Parser
{	TokenNameLBRACE	
/** * This converts a standard @link org.w3c.css.sac.Parser into * an Extended Parser. If it is already an ExtendedParser * it will simply cast it and return, otherwise it will wrap it * and return the result. * @param p Parser to wrap. * @return p as an ExtendedParser. */	TokenNameCOMMENT_JAVADOC	 This converts a standard @link org.w3c.css.sac.Parser into an Extended Parser. If it is already an ExtendedParser it will simply cast it and return, otherwise it will wrap it and return the result. @param p Parser to wrap. @return p as an ExtendedParser. 
public	TokenNamepublic	
static	TokenNamestatic	
ExtendedParser	TokenNameIdentifier	 Extended Parser
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
instanceof	TokenNameinstanceof	
ExtendedParser	TokenNameIdentifier	 Extended Parser
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ExtendedParser	TokenNameIdentifier	 Extended Parser
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ExtendedParserWrapper	TokenNameIdentifier	 Extended Parser Wrapper
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExtendedParserWrapper	TokenNameIdentifier	 Extended Parser Wrapper
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#getParserVersion()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#getParserVersion()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getParserVersion	TokenNameIdentifier	 get Parser Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getParserVersion	TokenNameIdentifier	 get Parser Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setLocale(Locale)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setLocale(Locale)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#setDocumentHandler(DocumentHandler)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setDocumentHandler(DocumentHandler)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
DocumentHandler	TokenNameIdentifier	 Document Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#setSelectorFactory(SelectorFactory)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setSelectorFactory(SelectorFactory)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelectorFactory	TokenNameIdentifier	 set Selector Factory
(	TokenNameLPAREN	
SelectorFactory	TokenNameIdentifier	 Selector Factory
selectorFactory	TokenNameIdentifier	 selector Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setSelectorFactory	TokenNameIdentifier	 set Selector Factory
(	TokenNameLPAREN	
selectorFactory	TokenNameIdentifier	 selector Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#setConditionFactory(ConditionFactory)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setConditionFactory(ConditionFactory)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setConditionFactory	TokenNameIdentifier	 set Condition Factory
(	TokenNameLPAREN	
ConditionFactory	TokenNameIdentifier	 Condition Factory
conditionFactory	TokenNameIdentifier	 condition Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setConditionFactory	TokenNameIdentifier	 set Condition Factory
(	TokenNameLPAREN	
conditionFactory	TokenNameIdentifier	 condition Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#setErrorHandler(ErrorHandler)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#setErrorHandler(ErrorHandler)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#parseStyleSheet(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseStyleSheet(InputSource)}. 
public	TokenNamepublic	
void	TokenNamevoid	
parseStyleSheet	TokenNameIdentifier	 parse Style Sheet
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseStyleSheet	TokenNameIdentifier	 parse Style Sheet
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a CSS document from a URI. * * <p>This method is a shortcut for the common case of reading a document * from a URI. It is the exact equivalent of the following:</p> * * <pre> * parse(new InputSource(uri)); * </pre> * * <p>The URI must be fully resolved by the application before it is passed * to the parser.</p> * * @param uri The URI. * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. * @see #parseStyleSheet(InputSource) */	TokenNameCOMMENT_JAVADOC	 Parse a CSS document from a URI. * <p>This method is a shortcut for the common case of reading a document from a URI. It is the exact equivalent of the following:</p> * <pre> parse(new InputSource(uri)); </pre> * <p>The URI must be fully resolved by the application before it is passed to the parser.</p> * @param uri The URI. @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. @see #parseStyleSheet(InputSource) 
public	TokenNamepublic	
void	TokenNamevoid	
parseStyleSheet	TokenNameIdentifier	 parse Style Sheet
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseStyleSheet	TokenNameIdentifier	 parse Style Sheet
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Parser#parseStyleDeclaration(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseStyleDeclaration(InputSource)}. 
public	TokenNamepublic	
void	TokenNamevoid	
parseStyleDeclaration	TokenNameIdentifier	 parse Style Declaration
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseStyleDeclaration	TokenNameIdentifier	 parse Style Declaration
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a CSS style declaration (without '{' and '}'). * * @param source The declaration. * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS style declaration (without '{' and '}'). * @param source The declaration. @exception CSSException Any CSS exception, possibly wrapping another exception. @exception IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseStyleDeclaration	TokenNameIdentifier	 parse Style Declaration
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseRule(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseRule(InputSource)}. 
public	TokenNamepublic	
void	TokenNamevoid	
parseRule	TokenNameIdentifier	 parse Rule
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseRule	TokenNameIdentifier	 parse Rule
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a CSS rule. * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS rule. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseRule	TokenNameIdentifier	 parse Rule
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseSelectors(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parseSelectors(InputSource)}. 
public	TokenNamepublic	
SelectorList	TokenNameIdentifier	 Selector List
parseSelectors	TokenNameIdentifier	 parse Selectors
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseSelectors	TokenNameIdentifier	 parse Selectors
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a comma separated list of selectors. * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a comma separated list of selectors. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseSelectors	TokenNameIdentifier	 parse Selectors
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements * {@link org.w3c.css.sac.Parser#parsePropertyValue(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parsePropertyValue(InputSource)}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
parsePropertyValue	TokenNameIdentifier	 parse Property Value
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parsePropertyValue	TokenNameIdentifier	 parse Property Value
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a CSS property value. * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS property value. * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parsePropertyValue	TokenNameIdentifier	 parse Property Value
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements * {@link org.w3c.css.sac.Parser#parsePriority(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Parser#parsePriority(InputSource)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
parsePriority	TokenNameIdentifier	 parse Priority
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parsePriority	TokenNameIdentifier	 parse Priority
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ExtendedParser#parseMedia(String)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ExtendedParser#parseMedia(String)}. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
CSSSACMediaList	TokenNameIdentifier	 CSSSAC Media List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
CSSSACMediaList	TokenNameIdentifier	 CSSSAC Media List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"all"	TokenNameStringLiteral	all
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
mediaText	TokenNameIdentifier	 media Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
mediaText	TokenNameIdentifier	 media Text
,	TokenNameCOMMA	
" ,"	TokenNameStringLiteral	 ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a CSS priority value (e&#x2e;g&#x2e; "&#x21;important"). * * * @exception CSSException Any CSS exception, possibly * wrapping another exception. * @exception java.io.IOException An IO exception from the parser, * possibly from a byte stream or character stream * supplied by the application. */	TokenNameCOMMENT_JAVADOC	 Parse a CSS priority value (e&#x2e;g&#x2e; "&#x21;important"). * @exception CSSException Any CSS exception, possibly wrapping another exception. @exception java.io.IOException An IO exception from the parser, possibly from a byte stream or character stream supplied by the application. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parsePriority	TokenNameIdentifier	 parse Priority
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

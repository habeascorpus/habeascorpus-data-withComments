/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
RelaxedExternalResourceSecurity	TokenNameIdentifier	 Relaxed External Resource Security
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
RelaxedScriptSecurity	TokenNameIdentifier	 Relaxed Script Security
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
ScriptSecurity	TokenNameIdentifier	 Script Security
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/* import org.apache.batik.bridge.DefaultExternalResourceSecurity; import org.apache.batik.bridge.DefaultScriptSecurity; import org.apache.batik.bridge.EmbededExternalResourceSecurity; import org.apache.batik.bridge.EmbededScriptSecurity; import org.apache.batik.bridge.ExternalResourceSecurity; import org.apache.batik.bridge.NoLoadExternalResourceSecurity; import org.apache.batik.bridge.NoLoadScriptSecurity; */	TokenNameCOMMENT_BLOCK	 import org.apache.batik.bridge.DefaultExternalResourceSecurity; import org.apache.batik.bridge.DefaultScriptSecurity; import org.apache.batik.bridge.EmbededExternalResourceSecurity; import org.apache.batik.bridge.EmbededScriptSecurity; import org.apache.batik.bridge.ExternalResourceSecurity; import org.apache.batik.bridge.NoLoadExternalResourceSecurity; import org.apache.batik.bridge.NoLoadScriptSecurity; 
/** * This Implements the SVGUserAgent interface to provide a very simple * version of client services to the JSVGComponent. * * This implementation does not require any GUI interaction to work. * This implementation is particularly bad about user interaction * most of the alert,prompt,etc methods are totally useless. * In a GUI environment you probably want to use SVGUserAgentGUIAdapter. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: SVGUserAgentAdapter.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This Implements the SVGUserAgent interface to provide a very simple version of client services to the JSVGComponent. * This implementation does not require any GUI interaction to work. This implementation is particularly bad about user interaction most of the alert,prompt,etc methods are totally useless. In a GUI environment you probably want to use SVGUserAgentGUIAdapter. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: SVGUserAgentAdapter.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGUserAgentAdapter	TokenNameIdentifier	 SVG User Agent Adapter
implements	TokenNameimplements	
SVGUserAgent	TokenNameIdentifier	 SVG User Agent
{	TokenNameLBRACE	
public	TokenNamepublic	
SVGUserAgentAdapter	TokenNameIdentifier	 SVG User Agent Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Displays an error message. */	TokenNameCOMMENT_JAVADOC	 Displays an error message. 
public	TokenNamepublic	
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Displays an error resulting from the specified Exception. */	TokenNameCOMMENT_JAVADOC	 Displays an error resulting from the specified Exception. 
public	TokenNamepublic	
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Displays a message in the User Agent interface. * The given message is typically displayed in a status bar. */	TokenNameCOMMENT_JAVADOC	 Displays a message in the User Agent interface. The given message is typically displayed in a status bar. 
public	TokenNamepublic	
void	TokenNamevoid	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows an alert dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows an alert dialog box. 
public	TokenNamepublic	
void	TokenNamevoid	
showAlert	TokenNameIdentifier	 show Alert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a confirm dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a confirm dialog box. 
public	TokenNamepublic	
boolean	TokenNameboolean	
showConfirm	TokenNameIdentifier	 show Confirm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.26458333333333333333333333333333f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// 96dpi 	TokenNameCOMMENT_LINE	96dpi 
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the default font family. */	TokenNameCOMMENT_JAVADOC	 Returns the default font family. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDefaultFontFamily	TokenNameIdentifier	 get Default Font Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Serif"	TokenNameStringLiteral	Serif
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the medium font size. */	TokenNameCOMMENT_JAVADOC	 Returns the medium font size. 
public	TokenNamepublic	
float	TokenNamefloat	
getMediumFontSize	TokenNameIdentifier	 get Medium Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 9pt (72pt == 1in) 	TokenNameCOMMENT_LINE	9pt (72pt == 1in) 
return	TokenNamereturn	
9f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
72f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a lighter font-weight. */	TokenNameCOMMENT_JAVADOC	 Returns a lighter font-weight. 
public	TokenNamepublic	
float	TokenNamefloat	
getLighterFontWeight	TokenNameIdentifier	 get Lighter Font Weight
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Round f to nearest 100... 	TokenNameCOMMENT_LINE	Round f to nearest 100... 
int	TokenNameint	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
100	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
200	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
300	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
400	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
300	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
500	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
600	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
700	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
800	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
900	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Bad Font Weight: "	TokenNameStringLiteral	Bad Font Weight: 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a bolder font-weight. */	TokenNameCOMMENT_JAVADOC	 Returns a bolder font-weight. 
public	TokenNamepublic	
float	TokenNamefloat	
getBolderFontWeight	TokenNameIdentifier	 get Bolder Font Weight
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Round f to nearest 100... 	TokenNameCOMMENT_LINE	Round f to nearest 100... 
int	TokenNameint	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
100	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
200	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
300	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
400	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
500	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
600	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
700	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
700	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
800	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
900	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
900	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
900	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Bad Font Weight: "	TokenNameStringLiteral	Bad Font Weight: 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the language settings. */	TokenNameCOMMENT_JAVADOC	 Returns the language settings. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguages	TokenNameIdentifier	 get Languages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"en"	TokenNameStringLiteral	en
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the user stylesheet uri. * @return null if no user style sheet was specified. */	TokenNameCOMMENT_JAVADOC	 Returns the user stylesheet uri. @return null if no user style sheet was specified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserStyleSheetURI	TokenNameIdentifier	 get User Style Sheet URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the class name of the XML parser. */	TokenNameCOMMENT_JAVADOC	 Returns the class name of the XML parser. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
.	TokenNameDOT	
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the XML parser must be in validation mode, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the XML parser must be in validation mode, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isXMLParserValidating	TokenNameIdentifier	 is XML Parser Validating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns this user agent's CSS media. */	TokenNameCOMMENT_JAVADOC	 Returns this user agent's CSS media. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"screen"	TokenNameStringLiteral	screen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns this user agent's alternate style-sheet title. */	TokenNameCOMMENT_JAVADOC	 Returns this user agent's alternate style-sheet title. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAlternateStyleSheet	TokenNameIdentifier	 get Alternate Style Sheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens a link. * @param uri The document URI. * @param newc Whether the link should be activated in a new component. */	TokenNameCOMMENT_JAVADOC	 Opens a link. @param uri The document URI. @param newc Whether the link should be activated in a new component. 
public	TokenNamepublic	
void	TokenNamevoid	
openLink	TokenNameIdentifier	 open Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newc	TokenNameIdentifier	 newc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Tells whether the given extension is supported by this * user agent. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given extension is supported by this user agent. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportExtension	TokenNameIdentifier	 support Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the security settings for the given script * type, script url and document url * * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 Returns the security settings for the given script type, script url and document url * @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
public	TokenNamepublic	
ScriptSecurity	TokenNameIdentifier	 Script Security
getScriptSecurity	TokenNameIdentifier	 get Script Security
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scriptType	TokenNameIdentifier	 script Type
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
scriptURL	TokenNameIdentifier	 script URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RelaxedScriptSecurity	TokenNameIdentifier	 Relaxed Script Security
(	TokenNameLPAREN	
scriptType	TokenNameIdentifier	 script Type
,	TokenNameCOMMA	
scriptURL	TokenNameIdentifier	 script URL
,	TokenNameCOMMA	
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* return new DefaultScriptSecurity(scriptType, scriptURL, docURL); return new EmbededScriptSecurity(scriptType, scriptURL, docURL); return new NoLoadScriptSecurity(scriptType); */	TokenNameCOMMENT_BLOCK	 return new DefaultScriptSecurity(scriptType, scriptURL, docURL); return new EmbededScriptSecurity(scriptType, scriptURL, docURL); return new NoLoadScriptSecurity(scriptType); 
}	TokenNameRBRACE	
/** * This method throws a SecurityException if the script * of given type, found at url and referenced from docURL * should not be loaded. * * This is a convenience method to call checkLoadScript * on the ScriptSecurity strategy returned by * getScriptSecurity. * * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 This method throws a SecurityException if the script of given type, found at url and referenced from docURL should not be loaded. * This is a convenience method to call checkLoadScript on the ScriptSecurity strategy returned by getScriptSecurity. * @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadScript	TokenNameIdentifier	 check Load Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scriptType	TokenNameIdentifier	 script Type
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
scriptURL	TokenNameIdentifier	 script URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
throws	TokenNamethrows	
SecurityException	TokenNameIdentifier	 Security Exception
{	TokenNameLBRACE	
ScriptSecurity	TokenNameIdentifier	 Script Security
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getScriptSecurity	TokenNameIdentifier	 get Script Security
(	TokenNameLPAREN	
scriptType	TokenNameIdentifier	 script Type
,	TokenNameCOMMA	
scriptURL	TokenNameIdentifier	 script URL
,	TokenNameCOMMA	
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
checkLoadScript	TokenNameIdentifier	 check Load Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the security settings for the given * resource url and document url * * @param resourceURL url for the resource, as defined in * the resource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * resource was found. */	TokenNameCOMMENT_JAVADOC	 Returns the security settings for the given resource url and document url * @param resourceURL url for the resource, as defined in the resource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the resource was found. 
public	TokenNamepublic	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
getExternalResourceSecurity	TokenNameIdentifier	 get External Resource Security
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
resourceURL	TokenNameIdentifier	 resource URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RelaxedExternalResourceSecurity	TokenNameIdentifier	 Relaxed External Resource Security
(	TokenNameLPAREN	
resourceURL	TokenNameIdentifier	 resource URL
,	TokenNameCOMMA	
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* return new DefaultExternalResourceSecurity(resourceURL, docURL); return new EmbededExternalResourceSecurity(resourceURL); return new NoLoadExternalResourceSecurity(); */	TokenNameCOMMENT_BLOCK	 return new DefaultExternalResourceSecurity(resourceURL, docURL); return new EmbededExternalResourceSecurity(resourceURL); return new NoLoadExternalResourceSecurity(); 
}	TokenNameRBRACE	
/** * This method throws a SecurityException if the resource * found at url and referenced from docURL * should not be loaded. * * This is a convenience method to call checkLoadExternalResource * on the ExternalResourceSecurity strategy returned by * getExternalResourceSecurity. * * @param resourceURL url for the resource, as defined in * the resource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * resource was found. */	TokenNameCOMMENT_JAVADOC	 This method throws a SecurityException if the resource found at url and referenced from docURL should not be loaded. * This is a convenience method to call checkLoadExternalResource on the ExternalResourceSecurity strategy returned by getExternalResourceSecurity. * @param resourceURL url for the resource, as defined in the resource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the resource was found. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
resourceURL	TokenNameIdentifier	 resource URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
throws	TokenNamethrows	
SecurityException	TokenNameIdentifier	 Security Exception
{	TokenNameLBRACE	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getExternalResourceSecurity	TokenNameIdentifier	 get External Resource Security
(	TokenNameLPAREN	
resourceURL	TokenNameIdentifier	 resource URL
,	TokenNameCOMMA	
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

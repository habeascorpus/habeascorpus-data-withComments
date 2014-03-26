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
/** * This interface must be implemented to provide client services to * a JSVGComponent. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGUserAgent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented to provide client services to a JSVGComponent. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGUserAgent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGUserAgent	TokenNameIdentifier	 SVG User Agent
{	TokenNameLBRACE	
/** * Displays an error message. */	TokenNameCOMMENT_JAVADOC	 Displays an error message. 
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Displays an error resulting from the specified Exception. */	TokenNameCOMMENT_JAVADOC	 Displays an error resulting from the specified Exception. 
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Displays a message in the User Agent interface. * The given message is typically displayed in a status bar. */	TokenNameCOMMENT_JAVADOC	 Displays a message in the User Agent interface. The given message is typically displayed in a status bar. 
void	TokenNamevoid	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Shows an alert dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows an alert dialog box. 
void	TokenNamevoid	
showAlert	TokenNameIdentifier	 show Alert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Shows a confirm dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a confirm dialog box. 
boolean	TokenNameboolean	
showConfirm	TokenNameIdentifier	 show Confirm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the default font family. */	TokenNameCOMMENT_JAVADOC	 Returns the default font family. 
String	TokenNameIdentifier	 String
getDefaultFontFamily	TokenNameIdentifier	 get Default Font Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the medium font size. */	TokenNameCOMMENT_JAVADOC	 Returns the medium font size. 
float	TokenNamefloat	
getMediumFontSize	TokenNameIdentifier	 get Medium Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a lighter font-weight. */	TokenNameCOMMENT_JAVADOC	 Returns a lighter font-weight. 
float	TokenNamefloat	
getLighterFontWeight	TokenNameIdentifier	 get Lighter Font Weight
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a bolder font-weight. */	TokenNameCOMMENT_JAVADOC	 Returns a bolder font-weight. 
float	TokenNamefloat	
getBolderFontWeight	TokenNameIdentifier	 get Bolder Font Weight
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the language settings. */	TokenNameCOMMENT_JAVADOC	 Returns the language settings. 
String	TokenNameIdentifier	 String
getLanguages	TokenNameIdentifier	 get Languages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the user stylesheet uri. * @return null if no user style sheet was specified. */	TokenNameCOMMENT_JAVADOC	 Returns the user stylesheet uri. @return null if no user style sheet was specified. 
String	TokenNameIdentifier	 String
getUserStyleSheetURI	TokenNameIdentifier	 get User Style Sheet URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the class name of the XML parser. */	TokenNameCOMMENT_JAVADOC	 Returns the class name of the XML parser. 
String	TokenNameIdentifier	 String
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the XML parser must be in validation mode, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the XML parser must be in validation mode, false otherwise. 
boolean	TokenNameboolean	
isXMLParserValidating	TokenNameIdentifier	 is XML Parser Validating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns this user agent's CSS media. */	TokenNameCOMMENT_JAVADOC	 Returns this user agent's CSS media. 
String	TokenNameIdentifier	 String
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns this user agent's alternate style-sheet title. */	TokenNameCOMMENT_JAVADOC	 Returns this user agent's alternate style-sheet title. 
String	TokenNameIdentifier	 String
getAlternateStyleSheet	TokenNameIdentifier	 get Alternate Style Sheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Opens a link in a new component. * @param uri The document URI. * @param newc Whether the link should be activated in a new component. */	TokenNameCOMMENT_JAVADOC	 Opens a link in a new component. @param uri The document URI. @param newc Whether the link should be activated in a new component. 
void	TokenNamevoid	
openLink	TokenNameIdentifier	 open Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newc	TokenNameIdentifier	 newc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells whether the given extension is supported by this * user agent. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given extension is supported by this user agent. 
boolean	TokenNameboolean	
supportExtension	TokenNameIdentifier	 support Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notifies the UserAgent that the input element * has been found in the document. This is sometimes * called, for example, to handle &lt;a&gt; or * &lt;title&gt; elements in a UserAgent-dependant * way. */	TokenNameCOMMENT_JAVADOC	 Notifies the UserAgent that the input element has been found in the document. This is sometimes called, for example, to handle &lt;a&gt; or &lt;title&gt; elements in a UserAgent-dependant way. 
void	TokenNamevoid	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the security settings for the given script * type, script url and document url * * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 Returns the security settings for the given script type, script url and document url * @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
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
;	TokenNameSEMICOLON	
/** * This method throws a SecurityException if the script * of given type, found at url and referenced from docURL * should not be loaded. * * This is a convenience method to call checkLoadScript * on the ScriptSecurity strategy returned by * getScriptSecurity. * * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 This method throws a SecurityException if the script of given type, found at url and referenced from docURL should not be loaded. * This is a convenience method to call checkLoadScript on the ScriptSecurity strategy returned by getScriptSecurity. * @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
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
;	TokenNameSEMICOLON	
/** * Returns the security settings for the given * resource url and document url * * @param resourceURL url for the resource, as defined in * the resource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * resource was found. */	TokenNameCOMMENT_JAVADOC	 Returns the security settings for the given resource url and document url * @param resourceURL url for the resource, as defined in the resource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the resource was found. 
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
getExternalResourceSecurity	TokenNameIdentifier	 get External Resource Security
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
resourceURL	TokenNameIdentifier	 resource URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method throws a SecurityException if the resource * found at url and referenced from docURL * should not be loaded. * * This is a convenience method to call checkLoadExternalResource * on the ExternalResourceSecurity strategy returned by * getExternalResourceSecurity. * * @param resourceURL url for the script, as defined in * the resource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * resource was found. */	TokenNameCOMMENT_JAVADOC	 This method throws a SecurityException if the resource found at url and referenced from docURL should not be loaded. * This is a convenience method to call checkLoadExternalResource on the ExternalResourceSecurity strategy returned by getExternalResourceSecurity. * @param resourceURL url for the script, as defined in the resource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the resource was found. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

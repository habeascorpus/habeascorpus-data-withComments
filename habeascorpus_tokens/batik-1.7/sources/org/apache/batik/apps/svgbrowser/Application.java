/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
Action	TokenNameIdentifier	 Action
;	TokenNameSEMICOLON	
/** * This interface represents a SVG viewer application. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Application.java 498290 2007-01-21 11:44:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents a SVG viewer application. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Application.java 498290 2007-01-21 11:44:05Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Application	TokenNameIdentifier	 Application
{	TokenNameLBRACE	
/** * Creates and shows a new viewer frame. */	TokenNameCOMMENT_JAVADOC	 Creates and shows a new viewer frame. 
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
createAndShowJSVGViewerFrame	TokenNameIdentifier	 create And Show JSVG Viewer Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Closes the given viewer frame. */	TokenNameCOMMENT_JAVADOC	 Closes the given viewer frame. 
void	TokenNamevoid	
closeJSVGViewerFrame	TokenNameIdentifier	 close JSVG Viewer Frame
(	TokenNameLPAREN	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an action to exit the application. */	TokenNameCOMMENT_JAVADOC	 Creates an action to exit the application. 
Action	TokenNameIdentifier	 Action
createExitAction	TokenNameIdentifier	 create Exit Action
(	TokenNameLPAREN	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
vf	TokenNameIdentifier	 vf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Opens the given link in a new window. */	TokenNameCOMMENT_JAVADOC	 Opens the given link in a new window. 
void	TokenNamevoid	
openLink	TokenNameIdentifier	 open Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the XML parser class name. */	TokenNameCOMMENT_JAVADOC	 Returns the XML parser class name. 
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
/** * Shows the preference dialog. */	TokenNameCOMMENT_JAVADOC	 Shows the preference dialog. 
void	TokenNamevoid	
showPreferenceDialog	TokenNameIdentifier	 show Preference Dialog
(	TokenNameLPAREN	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the user languages. */	TokenNameCOMMENT_JAVADOC	 Returns the user languages. 
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
/** * Returns the default value for the CSS * "font-family" property */	TokenNameCOMMENT_JAVADOC	 Returns the default value for the CSS "font-family" property 
String	TokenNameIdentifier	 String
getDefaultFontFamily	TokenNameIdentifier	 get Default Font Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS media to use. * @return empty string if no CSS media was specified. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS media to use. @return empty string if no CSS media was specified. 
String	TokenNameIdentifier	 String
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the selection overlay is painted in XOR mode, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the selection overlay is painted in XOR mode, false otherwise. 
boolean	TokenNameboolean	
isSelectionOverlayXORMode	TokenNameIdentifier	 is Selection Overlay XOR Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the input scriptType can be loaded in * this application. */	TokenNameCOMMENT_JAVADOC	 Returns true if the input scriptType can be loaded in this application. 
boolean	TokenNameboolean	
canLoadScriptType	TokenNameIdentifier	 can Load Script Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scriptType	TokenNameIdentifier	 script Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the allowed origins for scripts. * @see ResourceOrigin */	TokenNameCOMMENT_JAVADOC	 Returns the allowed origins for scripts. @see ResourceOrigin 
int	TokenNameint	
getAllowedScriptOrigin	TokenNameIdentifier	 get Allowed Script Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the allowed origins for external * resources. * * @see ResourceOrigin */	TokenNameCOMMENT_JAVADOC	 Returns the allowed origins for external resources. * @see ResourceOrigin 
int	TokenNameint	
getAllowedExternalResourceOrigin	TokenNameIdentifier	 get Allowed External Resource Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notifies Application of recently visited URI */	TokenNameCOMMENT_JAVADOC	 Notifies Application of recently visited URI 
void	TokenNamevoid	
addVisitedURI	TokenNameIdentifier	 add Visited URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Asks Application for a list of recently visited URI */	TokenNameCOMMENT_JAVADOC	 Asks Application for a list of recently visited URI 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getVisitedURIs	TokenNameIdentifier	 get Visited UR Is
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the UI resource specialization to use. */	TokenNameCOMMENT_JAVADOC	 Returns the UI resource specialization to use. 
String	TokenNameIdentifier	 String
getUISpecialization	TokenNameIdentifier	 get UI Specialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

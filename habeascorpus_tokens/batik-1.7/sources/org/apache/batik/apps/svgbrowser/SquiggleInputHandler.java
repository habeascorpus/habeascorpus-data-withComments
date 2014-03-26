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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
/** * This is the interface expected from classes which can handle specific * types of input for the Squiggle SVG browser. The simplest implementation * will simply handle SVG documents. Other, more sophisticated implementations * will handle other types of documents and convert them into SVG before * displaying them in an SVG canvas. * * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: SquiggleInputHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is the interface expected from classes which can handle specific types of input for the Squiggle SVG browser. The simplest implementation will simply handle SVG documents. Other, more sophisticated implementations will handle other types of documents and convert them into SVG before displaying them in an SVG canvas. * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: SquiggleInputHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SquiggleInputHandler	TokenNameIdentifier	 Squiggle Input Handler
{	TokenNameLBRACE	
/** * Returns the list of mime types handled by this handler. */	TokenNameCOMMENT_JAVADOC	 Returns the list of mime types handled by this handler. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHandledMimeTypes	TokenNameIdentifier	 get Handled Mime Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the list of file extensions handled by this handler */	TokenNameCOMMENT_JAVADOC	 Returns the list of file extensions handled by this handler 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHandledExtensions	TokenNameIdentifier	 get Handled Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a description for this handler */	TokenNameCOMMENT_JAVADOC	 Returns a description for this handler 
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the input file can be handled by the handler */	TokenNameCOMMENT_JAVADOC	 Returns true if the input file can be handled by the handler 
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the input URI can be handled by the handler * @param purl URL describing the candidate input */	TokenNameCOMMENT_JAVADOC	 Returns true if the input URI can be handled by the handler @param purl URL describing the candidate input 
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handles the given input for the given JSVGViewerFrame */	TokenNameCOMMENT_JAVADOC	 Handles the given input for the given JSVGViewerFrame 
void	TokenNamevoid	
handle	TokenNameIdentifier	 handle
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
svgFrame	TokenNameIdentifier	 svg Frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

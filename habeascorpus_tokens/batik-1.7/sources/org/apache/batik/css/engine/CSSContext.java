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
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
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
/** * This interface allows the user of a CSSEngine to provide contextual * informations. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSContext.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface allows the user of a CSSEngine to provide contextual informations. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSContext.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSContext	TokenNameIdentifier	 CSS Context
{	TokenNameLBRACE	
/** * Returns the Value corresponding to the given system color. */	TokenNameCOMMENT_JAVADOC	 Returns the Value corresponding to the given system color. 
Value	TokenNameIdentifier	 Value
getSystemColor	TokenNameIdentifier	 get System Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the value corresponding to the default font-family. */	TokenNameCOMMENT_JAVADOC	 Returns the value corresponding to the default font-family. 
Value	TokenNameIdentifier	 Value
getDefaultFontFamily	TokenNameIdentifier	 get Default Font Family
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
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
float	TokenNamefloat	
getPixelToMillimeter	TokenNameIdentifier	 get Pixel To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the medium font size. */	TokenNameCOMMENT_JAVADOC	 Returns the medium font size. 
float	TokenNamefloat	
getMediumFontSize	TokenNameIdentifier	 get Medium Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the width of the block which directly contains the * given element. */	TokenNameCOMMENT_JAVADOC	 Returns the width of the block which directly contains the given element. 
float	TokenNamefloat	
getBlockWidth	TokenNameIdentifier	 get Block Width
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the height of the block which directly contains the * given element. */	TokenNameCOMMENT_JAVADOC	 Returns the height of the block which directly contains the given element. 
float	TokenNamefloat	
getBlockHeight	TokenNameIdentifier	 get Block Height
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method should throw a SecurityException if the resource * found at url and referenced from docURL should not be loaded. * * @param resourceURL url for the resource, as defined in * the resource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * resource was found. */	TokenNameCOMMENT_JAVADOC	 This method should throw a SecurityException if the resource found at url and referenced from docURL should not be loaded. * @param resourceURL url for the resource, as defined in the resource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the resource was found. 
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
/** * Returns true if the document is dynamic, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the document is dynamic, false otherwise. 
boolean	TokenNameboolean	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the document is interactive, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the document is interactive, false otherwise. 
boolean	TokenNameboolean	
isInteractive	TokenNameIdentifier	 is Interactive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS engine associated with given element. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS engine associated with given element. 
CSSEngine	TokenNameIdentifier	 CSS Engine
getCSSEngineForElement	TokenNameIdentifier	 get CSS Engine For Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

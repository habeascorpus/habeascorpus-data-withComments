/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
png	TokenNameIdentifier	 png
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * A class representing the fields of a PNG suggested palette entry. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: PNGSuggestedPaletteEntry.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing the fields of a PNG suggested palette entry. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: PNGSuggestedPaletteEntry.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** The name of the entry. */	TokenNameCOMMENT_JAVADOC	 The name of the entry. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** The depth of the color samples. */	TokenNameCOMMENT_JAVADOC	 The depth of the color samples. 
public	TokenNamepublic	
int	TokenNameint	
sampleDepth	TokenNameIdentifier	 sample Depth
;	TokenNameSEMICOLON	
/** The red color value of the entry. */	TokenNameCOMMENT_JAVADOC	 The red color value of the entry. 
public	TokenNamepublic	
int	TokenNameint	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
/** The green color value of the entry. */	TokenNameCOMMENT_JAVADOC	 The green color value of the entry. 
public	TokenNamepublic	
int	TokenNameint	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
/** The blue color value of the entry. */	TokenNameCOMMENT_JAVADOC	 The blue color value of the entry. 
public	TokenNamepublic	
int	TokenNameint	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
/** The alpha opacity value of the entry. */	TokenNameCOMMENT_JAVADOC	 The alpha opacity value of the entry. 
public	TokenNamepublic	
int	TokenNameint	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
/** The probable frequency of the color in the image. */	TokenNameCOMMENT_JAVADOC	 The probable frequency of the color in the image. 
public	TokenNamepublic	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

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
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Image	TokenNameIdentifier	 Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
/** * This interface is to be used to provide alternate ways of * generating a placeholder image when the ImageTagRegistry * fails to handle a given reference. * * @version $Id: BrokenLinkProvider.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface is to be used to provide alternate ways of generating a placeholder image when the ImageTagRegistry fails to handle a given reference. * @version $Id: BrokenLinkProvider.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BrokenLinkProvider	TokenNameIdentifier	 Broken Link Provider
{	TokenNameLBRACE	
/** * The image returned by getBrokenLinkImage should always * return some value when queried for the BROKEN_LINK_PROPERTY. * This allows code the determine if the image is the 'real' * image or the broken link image, which may be important for * the application of profiles etc. */	TokenNameCOMMENT_JAVADOC	 The image returned by getBrokenLinkImage should always return some value when queried for the BROKEN_LINK_PROPERTY. This allows code the determine if the image is the 'real' image or the broken link image, which may be important for the application of profiles etc. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BROKEN_LINK_PROPERTY	TokenNameIdentifier	 BROKEN  LINK  PROPERTY
=	TokenNameEQUAL	
"org.apache.batik.BrokenLinkImage"	TokenNameStringLiteral	org.apache.batik.BrokenLinkImage
;	TokenNameSEMICOLON	
/** * This method is responsbile for constructing an image that will * represent the missing image in the document. This method * recives information about the reason a broken link image is * being requested in the <tt>code</tt> and <tt>params</tt> * parameters. These parameters may be used to generate nicely * localized messages for insertion into the broken link image, or * for selecting the broken link image returned. * * @param base The object to use for Message decoding. * @param code This is the reason the image is unavailable should * be taken from ErrorConstants. * @param params This is more detailed information about * the circumstances of the failure. */	TokenNameCOMMENT_JAVADOC	 This method is responsbile for constructing an image that will represent the missing image in the document. This method recives information about the reason a broken link image is being requested in the <tt>code</tt> and <tt>params</tt> parameters. These parameters may be used to generate nicely localized messages for insertion into the broken link image, or for selecting the broken link image returned. * @param base The object to use for Message decoding. @param code This is the reason the image is unavailable should be taken from ErrorConstants. @param params This is more detailed information about the circumstances of the failure. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Filter	TokenNameIdentifier	 Filter
getBrokenLinkImage	TokenNameIdentifier	 get Broken Link Image
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasBrokenLinkProperty	TokenNameIdentifier	 has Broken Link Property
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
BROKEN_LINK_PROPERTY	TokenNameIdentifier	 BROKEN  LINK  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
Image	TokenNameIdentifier	 Image
.	TokenNameDOT	
UndefinedProperty	TokenNameIdentifier	 Undefined Property
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

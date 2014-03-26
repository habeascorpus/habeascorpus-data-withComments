/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
/** * The error code. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: ErrorConstants.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The error code. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: ErrorConstants.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * The error code when a required attribute is missing. * <pre> * {0} = the name of the attribute * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when a required attribute is missing. <pre> {0} = the name of the attribute </pre> 
String	TokenNameIdentifier	 String
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier	 ERR  ATTRIBUTE  MISSING
=	TokenNameEQUAL	
"attribute.missing"	TokenNameStringLiteral	attribute.missing
;	TokenNameSEMICOLON	
/** * The error code when an attribute has a syntax error. * <pre> * {0} = the name of the attribute * {1} = the wrong value * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when an attribute has a syntax error. <pre> {0} = the name of the attribute {1} = the wrong value </pre> 
String	TokenNameIdentifier	 String
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
=	TokenNameEQUAL	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
;	TokenNameSEMICOLON	
/** * The error code when a length, which must be positive, is negative. * <pre> * {0} = the name of the attribute * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when a length, which must be positive, is negative. <pre> {0} = the name of the attribute </pre> 
String	TokenNameIdentifier	 String
ERR_LENGTH_NEGATIVE	TokenNameIdentifier	 ERR  LENGTH  NEGATIVE
=	TokenNameEQUAL	
"length.negative"	TokenNameStringLiteral	length.negative
;	TokenNameSEMICOLON	
/** * The error code when a CSS length is negative. * <pre> * {0} = property * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when a CSS length is negative. <pre> {0} = property </pre> 
String	TokenNameIdentifier	 String
ERR_CSS_LENGTH_NEGATIVE	TokenNameIdentifier	 ERR  CSS  LENGTH  NEGATIVE
=	TokenNameEQUAL	
"css.length.negative"	TokenNameStringLiteral	css.length.negative
;	TokenNameSEMICOLON	
/** * The error code when a URI specified in a CSS property * referenced a bad element. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when a URI specified in a CSS property referenced a bad element. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_CSS_URI_BAD_TARGET	TokenNameIdentifier	 ERR  CSS  URI  BAD  TARGET
=	TokenNameEQUAL	
"css.uri.badTarget"	TokenNameStringLiteral	css.uri.badTarget
;	TokenNameSEMICOLON	
/** * The error code when a specified URI references a bad element. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when a specified URI references a bad element. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_URI_BAD_TARGET	TokenNameIdentifier	 ERR  URI  BAD  TARGET
=	TokenNameEQUAL	
"uri.badTarget"	TokenNameStringLiteral	uri.badTarget
;	TokenNameSEMICOLON	
/** * The error code when the bridge detected circular dependencies * while resolving a list of URI. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge detected circular dependencies while resolving a list of URI. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_XLINK_HREF_CIRCULAR_DEPENDENCIES	TokenNameIdentifier	 ERR  XLINK  HREF  CIRCULAR  DEPENDENCIES
=	TokenNameEQUAL	
"xlink.href.circularDependencies"	TokenNameStringLiteral	xlink.href.circularDependencies
;	TokenNameSEMICOLON	
/** * The error code when the bridge try to load a URI * {0} = the uri */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge try to load a URI {0} = the uri 
String	TokenNameIdentifier	 String
ERR_URI_MALFORMED	TokenNameIdentifier	 ERR  URI  MALFORMED
=	TokenNameEQUAL	
"uri.malformed"	TokenNameStringLiteral	uri.malformed
;	TokenNameSEMICOLON	
/** * The error code when the bridge encoutered an I/O error while * loading a URI. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge encoutered an I/O error while loading a URI. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_URI_IO	TokenNameIdentifier	 ERR  URI  IO
=	TokenNameEQUAL	
"uri.io"	TokenNameStringLiteral	uri.io
;	TokenNameSEMICOLON	
/** * The error code when the bridge encountered a SecurityException * while loading a URI * {0} = the uri */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge encountered a SecurityException while loading a URI {0} = the uri 
String	TokenNameIdentifier	 String
ERR_URI_UNSECURE	TokenNameIdentifier	 ERR  URI  UNSECURE
=	TokenNameEQUAL	
"uri.unsecure"	TokenNameStringLiteral	uri.unsecure
;	TokenNameSEMICOLON	
/** * The error code when the bridge tries to referenced an invalid * node inside a document. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge tries to referenced an invalid node inside a document. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_URI_REFERENCE_A_DOCUMENT	TokenNameIdentifier	 ERR  URI  REFERENCE  A  DOCUMENT
=	TokenNameEQUAL	
"uri.referenceDocument"	TokenNameStringLiteral	uri.referenceDocument
;	TokenNameSEMICOLON	
/** * The error code when the bridge tries to an image and the image * format is not supported. * <pre> * {0} = the uri * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge tries to an image and the image format is not supported. <pre> {0} = the uri </pre> 
String	TokenNameIdentifier	 String
ERR_URI_IMAGE_INVALID	TokenNameIdentifier	 ERR  URI  IMAGE  INVALID
=	TokenNameEQUAL	
"uri.image.invalid"	TokenNameStringLiteral	uri.image.invalid
;	TokenNameSEMICOLON	
/** * The error code when the bridge tries to read an image and the image * url can't be opened or the contents aren't usable. * <pre> * {0} = the uri * {1} = the reason it can't be opened. * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge tries to read an image and the image url can't be opened or the contents aren't usable. <pre> {0} = the uri {1} = the reason it can't be opened. </pre> 
String	TokenNameIdentifier	 String
ERR_URI_IMAGE_BROKEN	TokenNameIdentifier	 ERR  URI  IMAGE  BROKEN
=	TokenNameEQUAL	
"uri.image.broken"	TokenNameStringLiteral	uri.image.broken
;	TokenNameSEMICOLON	
/** * The error code when the bridge tries to read an image and the image * url can't be opened: * <pre> * {0} = the reason it can't be opened. * </pre> */	TokenNameCOMMENT_JAVADOC	 The error code when the bridge tries to read an image and the image url can't be opened: <pre> {0} = the reason it can't be opened. </pre> 
String	TokenNameIdentifier	 String
URI_IMAGE_ERROR	TokenNameIdentifier	 URI  IMAGE  ERROR
=	TokenNameEQUAL	
"uri.image.error"	TokenNameStringLiteral	uri.image.error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

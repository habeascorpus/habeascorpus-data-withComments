/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Image	TokenNameIdentifier	 Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
SimpleBeanInfo	TokenNameIdentifier	 Simple Bean Info
;	TokenNameSEMICOLON	
/** * A <tt>BeanInfo</tt> for the <tt>JSVGCanvas</tt>. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: JSVGCanvasBeanInfo.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A <tt>BeanInfo</tt> for the <tt>JSVGCanvas</tt>. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: JSVGCanvasBeanInfo.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JSVGCanvasBeanInfo	TokenNameIdentifier	 JSVG Canvas Bean Info
extends	TokenNameextends	
SimpleBeanInfo	TokenNameIdentifier	 Simple Bean Info
{	TokenNameLBRACE	
/** A color 16x16 icon. */	TokenNameCOMMENT_JAVADOC	 A color 16x16 icon. 
protected	TokenNameprotected	
Image	TokenNameIdentifier	 Image
iconColor16x16	TokenNameIdentifier	 icon Color16x16
;	TokenNameSEMICOLON	
/** A greyscale 16x16 icon. */	TokenNameCOMMENT_JAVADOC	 A greyscale 16x16 icon. 
protected	TokenNameprotected	
Image	TokenNameIdentifier	 Image
iconMono16x16	TokenNameIdentifier	 icon Mono16x16
;	TokenNameSEMICOLON	
/** A color 32x32 icon. */	TokenNameCOMMENT_JAVADOC	 A color 32x32 icon. 
protected	TokenNameprotected	
Image	TokenNameIdentifier	 Image
iconColor32x32	TokenNameIdentifier	 icon Color32x32
;	TokenNameSEMICOLON	
/** A greyscale 32x32 icon. */	TokenNameCOMMENT_JAVADOC	 A greyscale 32x32 icon. 
protected	TokenNameprotected	
Image	TokenNameIdentifier	 Image
iconMono32x32	TokenNameIdentifier	 icon Mono32x32
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>BeanInfo</tt> for a <tt>JSVGCanvas</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>BeanInfo</tt> for a <tt>JSVGCanvas</tt>. 
public	TokenNamepublic	
JSVGCanvasBeanInfo	TokenNameIdentifier	 JSVG Canvas Bean Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iconColor16x16	TokenNameIdentifier	 icon Color16x16
=	TokenNameEQUAL	
loadImage	TokenNameIdentifier	 load Image
(	TokenNameLPAREN	
"resources/batikColor16x16.gif"	TokenNameStringLiteral	resources/batikColor16x16.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iconMono16x16	TokenNameIdentifier	 icon Mono16x16
=	TokenNameEQUAL	
loadImage	TokenNameIdentifier	 load Image
(	TokenNameLPAREN	
"resources/batikMono16x16.gif"	TokenNameStringLiteral	resources/batikMono16x16.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iconColor32x32	TokenNameIdentifier	 icon Color32x32
=	TokenNameEQUAL	
loadImage	TokenNameIdentifier	 load Image
(	TokenNameLPAREN	
"resources/batikColor32x32.gif"	TokenNameStringLiteral	resources/batikColor32x32.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iconMono32x32	TokenNameIdentifier	 icon Mono32x32
=	TokenNameEQUAL	
loadImage	TokenNameIdentifier	 load Image
(	TokenNameLPAREN	
"resources/batikMono32x32.gif"	TokenNameStringLiteral	resources/batikMono32x32.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an icon for the specified type. */	TokenNameCOMMENT_JAVADOC	 Returns an icon for the specified type. 
public	TokenNamepublic	
Image	TokenNameIdentifier	 Image
getIcon	TokenNameIdentifier	 get Icon
(	TokenNameLPAREN	
int	TokenNameint	
iconType	TokenNameIdentifier	 icon Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
iconType	TokenNameIdentifier	 icon Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ICON_COLOR_16x16	TokenNameIdentifier	 ICON  COLOR 16x16
:	TokenNameCOLON	
return	TokenNamereturn	
iconColor16x16	TokenNameIdentifier	 icon Color16x16
;	TokenNameSEMICOLON	
case	TokenNamecase	
ICON_MONO_16x16	TokenNameIdentifier	 ICON  MONO 16x16
:	TokenNameCOLON	
return	TokenNamereturn	
iconMono16x16	TokenNameIdentifier	 icon Mono16x16
;	TokenNameSEMICOLON	
case	TokenNamecase	
ICON_COLOR_32x32	TokenNameIdentifier	 ICON  COLOR 32x32
:	TokenNameCOLON	
return	TokenNamereturn	
iconColor32x32	TokenNameIdentifier	 icon Color32x32
;	TokenNameSEMICOLON	
case	TokenNamecase	
ICON_MONO_32x32	TokenNameIdentifier	 ICON  MONO 32x32
:	TokenNameCOLON	
return	TokenNamereturn	
iconMono32x32	TokenNameIdentifier	 icon Mono32x32
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

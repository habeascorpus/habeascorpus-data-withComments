/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Composite	TokenNameIdentifier	 Composite
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Stroke	TokenNameIdentifier	 Stroke
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * This class contains all non graphical contextual information that * are needed by the {@link org.apache.batik.svggen.SVGGraphics2D} to * generate SVG from Java 2D primitives. * You can subclass it to change the defaults. * * @see org.apache.batik.svggen.SVGGraphics2D#SVGGraphics2D(SVGGeneratorContext,boolean) * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: SVGGeneratorContext.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class contains all non graphical contextual information that are needed by the {@link org.apache.batik.svggen.SVGGraphics2D} to generate SVG from Java 2D primitives. You can subclass it to change the defaults. * @see org.apache.batik.svggen.SVGGraphics2D#SVGGraphics2D(SVGGeneratorContext,boolean) @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: SVGGeneratorContext.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
implements	TokenNameimplements	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
// this fields are package access for read-only purpose 	TokenNameCOMMENT_LINE	this fields are package access for read-only purpose 
/** * Factory used by this Graphics2D to create Elements * that make the SVG DOM Tree */	TokenNameCOMMENT_JAVADOC	 Factory used by this Graphics2D to create Elements that make the SVG DOM Tree 
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
/** * Handler that defines how images are referenced in the * generated SVG fragment. This allows different strategies * to be used to handle images. * @see org.apache.batik.svggen.ImageHandler * @see org.apache.batik.svggen.ImageHandlerBase64Encoder * @see org.apache.batik.svggen.ImageHandlerPNGEncoder * @see org.apache.batik.svggen.ImageHandlerJPEGEncoder */	TokenNameCOMMENT_JAVADOC	 Handler that defines how images are referenced in the generated SVG fragment. This allows different strategies to be used to handle images. @see org.apache.batik.svggen.ImageHandler @see org.apache.batik.svggen.ImageHandlerBase64Encoder @see org.apache.batik.svggen.ImageHandlerPNGEncoder @see org.apache.batik.svggen.ImageHandlerJPEGEncoder 
ImageHandler	TokenNameIdentifier	 Image Handler
imageHandler	TokenNameIdentifier	 image Handler
;	TokenNameSEMICOLON	
/** * Generic image handler. This allows more sophisticated * image handling strategies than the <tt>ImageHandler</tt> * interfaces. */	TokenNameCOMMENT_JAVADOC	 Generic image handler. This allows more sophisticated image handling strategies than the <tt>ImageHandler</tt> interfaces. 
GenericImageHandler	TokenNameIdentifier	 Generic Image Handler
genericImageHandler	TokenNameIdentifier	 generic Image Handler
;	TokenNameSEMICOLON	
/** * To deal with Java 2D extension (custom java.awt.Paint for example). */	TokenNameCOMMENT_JAVADOC	 To deal with Java 2D extension (custom java.awt.Paint for example). 
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extensionHandler	TokenNameIdentifier	 extension Handler
;	TokenNameSEMICOLON	
/** * To generate consitent ids. */	TokenNameCOMMENT_JAVADOC	 To generate consitent ids. 
SVGIDGenerator	TokenNameIdentifier	 SVGID Generator
idGenerator	TokenNameIdentifier	 id Generator
;	TokenNameSEMICOLON	
/** * To set style. */	TokenNameCOMMENT_JAVADOC	 To set style. 
StyleHandler	TokenNameIdentifier	 Style Handler
styleHandler	TokenNameIdentifier	 style Handler
;	TokenNameSEMICOLON	
/** * The comment to insert at generation time. */	TokenNameCOMMENT_JAVADOC	 The comment to insert at generation time. 
String	TokenNameIdentifier	 String
generatorComment	TokenNameIdentifier	 generator Comment
;	TokenNameSEMICOLON	
/** * The error handler. */	TokenNameCOMMENT_JAVADOC	 The error handler. 
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
/** * Do we accept SVG Fonts generation? */	TokenNameCOMMENT_JAVADOC	 Do we accept SVG Fonts generation? 
boolean	TokenNameboolean	
svgFont	TokenNameIdentifier	 svg Font
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * GraphicContextDefaults */	TokenNameCOMMENT_JAVADOC	 GraphicContextDefaults 
GraphicContextDefaults	TokenNameIdentifier	 Graphic Context Defaults
gcDefaults	TokenNameIdentifier	 gc Defaults
;	TokenNameSEMICOLON	
/** * Number of decimal places to use in output values. * 3 decimal places are used by default. */	TokenNameCOMMENT_JAVADOC	 Number of decimal places to use in output values. 3 decimal places are used by default. 
int	TokenNameint	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Current double value formatter */	TokenNameCOMMENT_JAVADOC	 Current double value formatter 
protected	TokenNameprotected	
DecimalFormat	TokenNameIdentifier	 Decimal Format
decimalFormat	TokenNameIdentifier	 decimal Format
=	TokenNameEQUAL	
decimalFormats	TokenNameIdentifier	 decimal Formats
[	TokenNameLBRACKET	
precision	TokenNameIdentifier	 precision
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Class to describe the GraphicContext defaults to * be used. Note that this class does *not* contain * a default for the initial transform, as this * transform *has to be identity* for the SVGGraphics2D * to operate (the TransformStacks operation is based * on that assumption. See the DOMTreeManager class). */	TokenNameCOMMENT_JAVADOC	 Class to describe the GraphicContext defaults to be used. Note that this class does *not* contain a default for the initial transform, as this transform *has to be identity* for the SVGGraphics2D to operate (the TransformStacks operation is based on that assumption. See the DOMTreeManager class). 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
GraphicContextDefaults	TokenNameIdentifier	 Graphic Context Defaults
{	TokenNameLBRACE	
protected	TokenNameprotected	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Stroke	TokenNameIdentifier	 Stroke
stroke	TokenNameIdentifier	 stroke
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Composite	TokenNameIdentifier	 Composite
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
clip	TokenNameIdentifier	 clip
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
Stroke	TokenNameIdentifier	 Stroke
stroke	TokenNameIdentifier	 stroke
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stroke	TokenNameIdentifier	 stroke
=	TokenNameEQUAL	
stroke	TokenNameIdentifier	 stroke
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
getStroke	TokenNameIdentifier	 get Stroke
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stroke	TokenNameIdentifier	 stroke
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
Composite	TokenNameIdentifier	 Composite
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Composite	TokenNameIdentifier	 Composite
getComposite	TokenNameIdentifier	 get Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
clip	TokenNameIdentifier	 clip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clip	TokenNameIdentifier	 clip
=	TokenNameEQUAL	
clip	TokenNameIdentifier	 clip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getClip	TokenNameIdentifier	 get Clip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clip	TokenNameIdentifier	 clip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderingHints	TokenNameIdentifier	 Rendering Hints
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Font	TokenNameIdentifier	 Font
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
background	TokenNameIdentifier	 background
=	TokenNameEQUAL	
background	TokenNameIdentifier	 background
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getBackground	TokenNameIdentifier	 get Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
background	TokenNameIdentifier	 background
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Builds an instance of <code>SVGGeneratorContext</code> with the given * <code>domFactory</code> but let the user set later the other contextual * information. Please note that none of the parameter below should be * <code>null</code>. * @see #setIDGenerator * @see #setExtensionHandler * @see #setImageHandler * @see #setStyleHandler * @see #setErrorHandler */	TokenNameCOMMENT_JAVADOC	 Builds an instance of <code>SVGGeneratorContext</code> with the given <code>domFactory</code> but let the user set later the other contextual information. Please note that none of the parameter below should be <code>null</code>. @see #setIDGenerator @see #setExtensionHandler @see #setImageHandler @see #setStyleHandler @see #setErrorHandler 
protected	TokenNameprotected	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDOMFactory	TokenNameIdentifier	 set DOM Factory
(	TokenNameLPAREN	
domFactory	TokenNameIdentifier	 dom Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an instance of <code>SVGGeneratorContext</code> with the * given <code>domFactory</code> and with the default values for the * other information. * @see org.apache.batik.svggen.SVGIDGenerator * @see org.apache.batik.svggen.DefaultExtensionHandler * @see org.apache.batik.svggen.ImageHandlerBase64Encoder * @see org.apache.batik.svggen.DefaultStyleHandler * @see org.apache.batik.svggen.DefaultErrorHandler */	TokenNameCOMMENT_JAVADOC	 Creates an instance of <code>SVGGeneratorContext</code> with the given <code>domFactory</code> and with the default values for the other information. @see org.apache.batik.svggen.SVGIDGenerator @see org.apache.batik.svggen.DefaultExtensionHandler @see org.apache.batik.svggen.ImageHandlerBase64Encoder @see org.apache.batik.svggen.DefaultStyleHandler @see org.apache.batik.svggen.DefaultErrorHandler 
public	TokenNamepublic	
static	TokenNamestatic	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
createDefault	TokenNameIdentifier	 create Default
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
new	TokenNamenew	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
(	TokenNameLPAREN	
domFactory	TokenNameIdentifier	 dom Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setIDGenerator	TokenNameIdentifier	 set ID Generator
(	TokenNameLPAREN	
new	TokenNamenew	
SVGIDGenerator	TokenNameIdentifier	 SVGID Generator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setExtensionHandler	TokenNameIdentifier	 set Extension Handler
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultExtensionHandler	TokenNameIdentifier	 Default Extension Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setImageHandler	TokenNameIdentifier	 set Image Handler
(	TokenNameLPAREN	
new	TokenNamenew	
ImageHandlerBase64Encoder	TokenNameIdentifier	 Image Handler Base64 Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setStyleHandler	TokenNameIdentifier	 set Style Handler
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultStyleHandler	TokenNameIdentifier	 Default Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
"Generated by the Batik Graphics2D SVG Generator"	TokenNameStringLiteral	Generated by the Batik Graphics2D SVG Generator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of defaults which should be used for the * GraphicContext. */	TokenNameCOMMENT_JAVADOC	 Returns the set of defaults which should be used for the GraphicContext. 
public	TokenNamepublic	
final	TokenNamefinal	
GraphicContextDefaults	TokenNameIdentifier	 Graphic Context Defaults
getGraphicContextDefaults	TokenNameIdentifier	 get Graphic Context Defaults
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gcDefaults	TokenNameIdentifier	 gc Defaults
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default to be used for the graphic context. * Note that gcDefaults may be null and that any of its attributes * may be null. */	TokenNameCOMMENT_JAVADOC	 Sets the default to be used for the graphic context. Note that gcDefaults may be null and that any of its attributes may be null. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setGraphicContextDefaults	TokenNameIdentifier	 set Graphic Context Defaults
(	TokenNameLPAREN	
GraphicContextDefaults	TokenNameIdentifier	 Graphic Context Defaults
gcDefaults	TokenNameIdentifier	 gc Defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gcDefaults	TokenNameIdentifier	 gc Defaults
=	TokenNameEQUAL	
gcDefaults	TokenNameIdentifier	 gc Defaults
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.batik.svggen.SVGIDGenerator} that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.batik.svggen.SVGIDGenerator} that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
SVGIDGenerator	TokenNameIdentifier	 SVGID Generator
getIDGenerator	TokenNameIdentifier	 get ID Generator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idGenerator	TokenNameIdentifier	 id Generator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.SVGIDGenerator} * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.SVGIDGenerator} to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setIDGenerator	TokenNameIdentifier	 set ID Generator
(	TokenNameLPAREN	
SVGIDGenerator	TokenNameIdentifier	 SVGID Generator
idGenerator	TokenNameIdentifier	 id Generator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idGenerator	TokenNameIdentifier	 id Generator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_ID_GENERATOR_NULL	TokenNameIdentifier	 ERR  ID  GENERATOR  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
=	TokenNameEQUAL	
idGenerator	TokenNameIdentifier	 id Generator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the DOM Factory that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the DOM Factory that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DOM Factory * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the DOM Factory to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setDOMFactory	TokenNameIdentifier	 set DOM Factory
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
domFactory	TokenNameIdentifier	 dom Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_DOM_FACTORY_NULL	TokenNameIdentifier	 ERR  DOM  FACTORY  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.batik.svggen.ExtensionHandler} that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.batik.svggen.ExtensionHandler} that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
getExtensionHandler	TokenNameIdentifier	 get Extension Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extensionHandler	TokenNameIdentifier	 extension Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.ExtensionHandler} * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.ExtensionHandler} to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setExtensionHandler	TokenNameIdentifier	 set Extension Handler
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extensionHandler	TokenNameIdentifier	 extension Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extensionHandler	TokenNameIdentifier	 extension Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_EXTENSION_HANDLER_NULL	TokenNameIdentifier	 ERR  EXTENSION  HANDLER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extensionHandler	TokenNameIdentifier	 extension Handler
=	TokenNameEQUAL	
extensionHandler	TokenNameIdentifier	 extension Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.batik.svggen.ImageHandler} that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.batik.svggen.ImageHandler} that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
ImageHandler	TokenNameIdentifier	 Image Handler
getImageHandler	TokenNameIdentifier	 get Image Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
imageHandler	TokenNameIdentifier	 image Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.ImageHandler} * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.ImageHandler} to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setImageHandler	TokenNameIdentifier	 set Image Handler
(	TokenNameLPAREN	
ImageHandler	TokenNameIdentifier	 Image Handler
imageHandler	TokenNameIdentifier	 image Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
imageHandler	TokenNameIdentifier	 image Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_HANDLER_NULL	TokenNameIdentifier	 ERR  IMAGE  HANDLER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
imageHandler	TokenNameIdentifier	 image Handler
=	TokenNameEQUAL	
imageHandler	TokenNameIdentifier	 image Handler
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleImageHandler	TokenNameIdentifier	 Simple Image Handler
(	TokenNameLPAREN	
imageHandler	TokenNameIdentifier	 image Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.GenericImageHandler} * to be used. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.GenericImageHandler} to be used. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setGenericImageHandler	TokenNameIdentifier	 set Generic Image Handler
(	TokenNameLPAREN	
GenericImageHandler	TokenNameIdentifier	 Generic Image Handler
genericImageHandler	TokenNameIdentifier	 generic Image Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_HANDLER_NULL	TokenNameIdentifier	 ERR  IMAGE  HANDLER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
imageHandler	TokenNameIdentifier	 image Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
=	TokenNameEQUAL	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.batik.svggen.StyleHandler} that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.batik.svggen.StyleHandler} that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
StyleHandler	TokenNameIdentifier	 Style Handler
getStyleHandler	TokenNameIdentifier	 get Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
styleHandler	TokenNameIdentifier	 style Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.StyleHandler} * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.StyleHandler} to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setStyleHandler	TokenNameIdentifier	 set Style Handler
(	TokenNameLPAREN	
StyleHandler	TokenNameIdentifier	 Style Handler
styleHandler	TokenNameIdentifier	 style Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
styleHandler	TokenNameIdentifier	 style Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_STYLE_HANDLER_NULL	TokenNameIdentifier	 ERR  STYLE  HANDLER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
styleHandler	TokenNameIdentifier	 style Handler
=	TokenNameEQUAL	
styleHandler	TokenNameIdentifier	 style Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the comment to be generated in the SVG file. */	TokenNameCOMMENT_JAVADOC	 Returns the comment to be generated in the SVG file. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorComment	TokenNameIdentifier	 generator Comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the comment to be used. It can be <code>null</code> if you * want to disable it. */	TokenNameCOMMENT_JAVADOC	 Sets the comment to be used. It can be <code>null</code> if you want to disable it. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
generatorComment	TokenNameIdentifier	 generator Comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
generatorComment	TokenNameIdentifier	 generator Comment
=	TokenNameEQUAL	
generatorComment	TokenNameIdentifier	 generator Comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link org.apache.batik.svggen.ErrorHandler} that * has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link org.apache.batik.svggen.ErrorHandler} that has been set. 
public	TokenNamepublic	
final	TokenNamefinal	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link org.apache.batik.svggen.ErrorHandler} * to be used. It should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link org.apache.batik.svggen.ErrorHandler} to be used. It should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_ERROR_HANDLER_NULL	TokenNameIdentifier	 ERR  ERROR  HANDLER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
errorHandler	TokenNameIdentifier	 error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if we should generate SVG Fonts for * texts. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if we should generate SVG Fonts for texts. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEmbeddedFontsOn	TokenNameIdentifier	 is Embedded Fonts On
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgFont	TokenNameIdentifier	 svg Font
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets if we should generate SVG Fonts for texts. Default value * is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 Sets if we should generate SVG Fonts for texts. Default value is <code>false</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setEmbeddedFontsOn	TokenNameIdentifier	 set Embedded Fonts On
(	TokenNameLPAREN	
boolean	TokenNameboolean	
svgFont	TokenNameIdentifier	 svg Font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
svgFont	TokenNameIdentifier	 svg Font
=	TokenNameEQUAL	
svgFont	TokenNameIdentifier	 svg Font
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current precision used by this context */	TokenNameCOMMENT_JAVADOC	 Returns the current precision used by this context 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
precision	TokenNameIdentifier	 precision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the precision used by this context. The precision controls * the number of decimal places used in floating point values * output by the SVGGraphics2D generator. * Note that the precision is clipped to the [0,12] range. */	TokenNameCOMMENT_JAVADOC	 Sets the precision used by this context. The precision controls the number of decimal places used in floating point values output by the SVGGraphics2D generator. Note that the precision is clipped to the [0,12] range. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setPrecision	TokenNameIdentifier	 set Precision
(	TokenNameLPAREN	
int	TokenNameint	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
precision	TokenNameIdentifier	 precision
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
precision	TokenNameIdentifier	 precision
>	TokenNameGREATER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
precision	TokenNameIdentifier	 precision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
decimalFormat	TokenNameIdentifier	 decimal Format
=	TokenNameEQUAL	
decimalFormats	TokenNameIdentifier	 decimal Formats
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
precision	TokenNameIdentifier	 precision
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the input double value to a string with a number of * decimal places controlled by the precision attribute. */	TokenNameCOMMENT_JAVADOC	 Converts the input double value to a string with a number of decimal places controlled by the precision attribute. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
absvalue	TokenNameIdentifier	 absvalue
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// above 10e7 we do not output decimals as anyway 	TokenNameCOMMENT_LINE	above 10e7 we do not output decimals as anyway 
// in scientific notation they were not available 	TokenNameCOMMENT_LINE	in scientific notation they were not available 
if	TokenNameif	
(	TokenNameLPAREN	
absvalue	TokenNameIdentifier	 absvalue
>=	TokenNameGREATER_EQUAL	
10e7	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// under 10e-3 we have to put decimals 	TokenNameCOMMENT_LINE	under 10e-3 we have to put decimals 
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
decimalFormat	TokenNameIdentifier	 decimal Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
dsf	TokenNameIdentifier	 dsf
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
DecimalFormat	TokenNameIdentifier	 Decimal Format
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decimalFormats	TokenNameIdentifier	 decimal Formats
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
[	TokenNameLBRACKET	
13	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
decimalFormats	TokenNameIdentifier	 decimal Formats
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
,	TokenNameCOMMA	
dsf	TokenNameIdentifier	 dsf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"#."	TokenNameStringLiteral	#.
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
decimalFormats	TokenNameIdentifier	 decimal Formats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
+=	TokenNamePLUS_EQUAL	
"#"	TokenNameStringLiteral	#
;	TokenNameSEMICOLON	
decimalFormats	TokenNameIdentifier	 decimal Formats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
dsf	TokenNameIdentifier	 dsf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
Composite	TokenNameIdentifier	 Composite
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
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
/** * Utility class that converts an custom Composite object into * a set of SVG properties and definitions. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGCustomComposite.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.svggen.SVGComposite */	TokenNameCOMMENT_JAVADOC	 Utility class that converts an custom Composite object into a set of SVG properties and definitions. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGCustomComposite.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.svggen.SVGComposite 
public	TokenNamepublic	
class	TokenNameclass	
SVGCustomComposite	TokenNameIdentifier	 SVG Custom Composite
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * @param generatorContext for use by SVGCustomComposite to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext for use by SVGCustomComposite to build Elements 
public	TokenNamepublic	
SVGCustomComposite	TokenNameIdentifier	 SVG Custom Composite
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getComposite	TokenNameIdentifier	 get Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param composite the Composite object to convert to SVG * @return an SVGCompositeDescriptor mapping the SVG * composite equivalent to the input Composite. */	TokenNameCOMMENT_JAVADOC	 @param composite the Composite object to convert to SVG @return an SVGCompositeDescriptor mapping the SVG composite equivalent to the input Composite. 
public	TokenNamepublic	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Composite	TokenNameIdentifier	 Composite
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
compositeDesc	TokenNameIdentifier	 composite Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compositeDesc	TokenNameIdentifier	 composite Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time this composite is used. Request handler 	TokenNameCOMMENT_LINE	First time this composite is used. Request handler 
// to do the convertion 	TokenNameCOMMENT_LINE	to do the convertion 
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
extensionHandler	TokenNameIdentifier	 extension Handler
.	TokenNameDOT	
handleComposite	TokenNameIdentifier	 handle Composite
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getDef	TokenNameIdentifier	 get Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
compositeDesc	TokenNameIdentifier	 composite Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

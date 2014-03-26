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
AlphaComposite	TokenNameIdentifier	 Alpha Composite
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
/** * Utility class that converts a Composite object into * a set of SVG properties and definitions. * <p>Here is how Composites are mapped to SVG:</p> * <ul> * <li>AlphaComposite.SRC_OVER with extra alpha is mapped * to the opacity attribute</li> * <li>AlphaComposite's other rules are translated into * predefined filter effects.</li> * <li>Custom Composite implementations are handled by the * extension mechanism.</li> * </ul> * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGComposite.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.svggen.SVGAlphaComposite */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Composite object into a set of SVG properties and definitions. <p>Here is how Composites are mapped to SVG:</p> <ul> <li>AlphaComposite.SRC_OVER with extra alpha is mapped to the opacity attribute</li> <li>AlphaComposite's other rules are translated into predefined filter effects.</li> <li>Custom Composite implementations are handled by the extension mechanism.</li> </ul> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGComposite.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.svggen.SVGAlphaComposite 
public	TokenNamepublic	
class	TokenNameclass	
SVGComposite	TokenNameIdentifier	 SVG Composite
implements	TokenNameimplements	
SVGConverter	TokenNameIdentifier	 SVG Converter
{	TokenNameLBRACE	
/** * All AlphaComposite convertion is handed to svgAlphaComposite */	TokenNameCOMMENT_JAVADOC	 All AlphaComposite convertion is handed to svgAlphaComposite 
private	TokenNameprivate	
SVGAlphaComposite	TokenNameIdentifier	 SVG Alpha Composite
svgAlphaComposite	TokenNameIdentifier	 svg Alpha Composite
;	TokenNameSEMICOLON	
/** * All custom Composite convertion is handed to svgCustomComposite */	TokenNameCOMMENT_JAVADOC	 All custom Composite convertion is handed to svgCustomComposite 
private	TokenNameprivate	
SVGCustomComposite	TokenNameIdentifier	 SVG Custom Composite
svgCustomComposite	TokenNameIdentifier	 svg Custom Composite
;	TokenNameSEMICOLON	
/** * @param generatorContext The generator context used for handling * custom and alpha composites */	TokenNameCOMMENT_JAVADOC	 @param generatorContext The generator context used for handling custom and alpha composites 
public	TokenNamepublic	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
svgAlphaComposite	TokenNameIdentifier	 svg Alpha Composite
=	TokenNameEQUAL	
new	TokenNamenew	
SVGAlphaComposite	TokenNameIdentifier	 SVG Alpha Composite
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
svgCustomComposite	TokenNameIdentifier	 svg Custom Composite
=	TokenNameEQUAL	
new	TokenNamenew	
SVGCustomComposite	TokenNameIdentifier	 SVG Custom Composite
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Set of filter Elements defining the composites this * Converter has processed since it was created. */	TokenNameCOMMENT_JAVADOC	 @return Set of filter Elements defining the composites this Converter has processed since it was created. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
compositeDefs	TokenNameIdentifier	 composite Defs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
svgAlphaComposite	TokenNameIdentifier	 svg Alpha Composite
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefs	TokenNameIdentifier	 composite Defs
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
svgCustomComposite	TokenNameIdentifier	 svg Custom Composite
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compositeDefs	TokenNameIdentifier	 composite Defs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGAlphaComposite	TokenNameIdentifier	 SVG Alpha Composite
getAlphaCompositeConverter	TokenNameIdentifier	 get Alpha Composite Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgAlphaComposite	TokenNameIdentifier	 svg Alpha Composite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGCustomComposite	TokenNameIdentifier	 SVG Custom Composite
getCustomCompositeConverter	TokenNameIdentifier	 get Custom Composite Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgCustomComposite	TokenNameIdentifier	 svg Custom Composite
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
/** * @param composite Composite to be converted to SVG * @return an SVGCompositeDescriptor mapping the SVG composite * equivalent of the input Composite */	TokenNameCOMMENT_JAVADOC	 @param composite Composite to be converted to SVG @return an SVGCompositeDescriptor mapping the SVG composite equivalent of the input Composite 
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
instanceof	TokenNameinstanceof	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
)	TokenNameRPAREN	
return	TokenNamereturn	
svgAlphaComposite	TokenNameIdentifier	 svg Alpha Composite
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
)	TokenNameRPAREN	
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
svgCustomComposite	TokenNameIdentifier	 svg Custom Composite
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

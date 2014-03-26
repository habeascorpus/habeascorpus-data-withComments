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
/** * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGGraphicObjectConverter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGGraphicObjectConverter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
/** * Used by converters to create Elements and other DOM objects. */	TokenNameCOMMENT_JAVADOC	 Used by converters to create Elements and other DOM objects. 
protected	TokenNameprotected	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
/** * @param generatorContext can be used by the SVGGraphicObjectConverter * extentions to create Elements and other types of DOM objects. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext can be used by the SVGGraphicObjectConverter extentions to create Elements and other types of DOM objects. 
public	TokenNamepublic	
SVGGraphicObjectConverter	TokenNameIdentifier	 SVG Graphic Object Converter
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_CONTEXT_NULL	TokenNameIdentifier	 ERR  CONTEXT  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
generatorContext	TokenNameIdentifier	 generator Context
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for subclasses. */	TokenNameCOMMENT_JAVADOC	 Utility method for subclasses. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImageOp	TokenNameIdentifier	 Buffered Image Op
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Defines the interface for classes that are able to convert * a BufferedImageOp filter. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGFilterConverter.java 478176 2006-11-22 14:50:50Z dvholten $ * @see org.apache.batik.svggen.SVGFilterDescriptor */	TokenNameCOMMENT_JAVADOC	 Defines the interface for classes that are able to convert a BufferedImageOp filter. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGFilterConverter.java 478176 2006-11-22 14:50:50Z dvholten $ @see org.apache.batik.svggen.SVGFilterDescriptor 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGFilterConverter	TokenNameIdentifier	 SVG Filter Converter
extends	TokenNameextends	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
/** * Converts a Java 2D API BufferedImageOp into * a set of attribute/value pairs and related definitions * * @param filter BufferedImageOp filter to be converted * @param filterRect Rectangle, in device space, that defines the area * to which filtering applies. May be null, meaning that the * area is undefined. * @return descriptor of the attributes required to represent * the input filter * @see org.apache.batik.svggen.SVGFilterDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts a Java 2D API BufferedImageOp into a set of attribute/value pairs and related definitions * @param filter BufferedImageOp filter to be converted @param filterRect Rectangle, in device space, that defines the area to which filtering applies. May be null, meaning that the area is undefined. @return descriptor of the attributes required to represent the input filter @see org.apache.batik.svggen.SVGFilterDescriptor 
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
BufferedImageOp	TokenNameIdentifier	 Buffered Image Op
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
filterRect	TokenNameIdentifier	 filter Rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return set of definitions referenced by the attribute * values created by the implementation since its * creation. The return value should never be null. * If no definition is needed, an empty set should be * returned. */	TokenNameCOMMENT_JAVADOC	 @return set of definitions referenced by the attribute values created by the implementation since its creation. The return value should never be null. If no definition is needed, an empty set should be returned. 
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

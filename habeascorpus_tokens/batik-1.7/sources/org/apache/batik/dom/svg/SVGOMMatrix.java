/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the {@link * org.w3c.dom.svg.SVGMatrix} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMMatrix.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.dom.svg.SVGMatrix} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMMatrix.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
extends	TokenNameextends	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
{	TokenNameLBRACE	
/** * The AffineTransform used to implement the matrix. */	TokenNameCOMMENT_JAVADOC	 The AffineTransform used to implement the matrix. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
/** * Creates a new SVGMatrix. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGMatrix. 
public	TokenNamepublic	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the associated AffineTransform. */	TokenNameCOMMENT_JAVADOC	 Returns the associated AffineTransform. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

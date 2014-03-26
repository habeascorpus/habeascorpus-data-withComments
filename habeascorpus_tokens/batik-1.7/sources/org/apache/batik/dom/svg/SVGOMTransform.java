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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
;	TokenNameSEMICOLON	
/** * This class is the implementation of the SVGTransform interface. * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: SVGOMTransform.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is the implementation of the SVGTransform interface. * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: SVGOMTransform.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
extends	TokenNameextends	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
{	TokenNameLBRACE	
/** * Creates a new SVGOMTransform. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMTransform. 
public	TokenNamepublic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new, modifiable SVGMatrix. */	TokenNameCOMMENT_JAVADOC	 Creates a new, modifiable SVGMatrix. 
protected	TokenNameprotected	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
createMatrix	TokenNameIdentifier	 create Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setA	TokenNameIdentifier	 set A
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setA	TokenNameIdentifier	 set A
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setB	TokenNameIdentifier	 set B
(	TokenNameLPAREN	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setB	TokenNameIdentifier	 set B
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setC	TokenNameIdentifier	 set C
(	TokenNameLPAREN	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setC	TokenNameIdentifier	 set C
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setD	TokenNameIdentifier	 set D
(	TokenNameLPAREN	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setD	TokenNameIdentifier	 set D
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setE	TokenNameIdentifier	 set E
(	TokenNameLPAREN	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setE	TokenNameIdentifier	 set E
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setF	TokenNameIdentifier	 set F
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setF	TokenNameIdentifier	 set F
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

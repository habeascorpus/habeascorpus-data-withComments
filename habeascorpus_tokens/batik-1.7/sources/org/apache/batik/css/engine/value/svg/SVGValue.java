/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
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
/** * This interface represents the values for properties like 'fill', * 'flood-color'... * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents the values for properties like 'fill', 'flood-color'... * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGValue	TokenNameIdentifier	 SVG Value
extends	TokenNameextends	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
/** * Returns the paint type, if this object represents a SVGPaint. */	TokenNameCOMMENT_JAVADOC	 Returns the paint type, if this object represents a SVGPaint. 
short	TokenNameshort	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Returns the URI of the paint, if this object represents a SVGPaint. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the paint, if this object represents a SVGPaint. 
String	TokenNameIdentifier	 String
getUri	TokenNameIdentifier	 get Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Returns the color type, if this object represents a SVGColor. */	TokenNameCOMMENT_JAVADOC	 Returns the color type, if this object represents a SVGColor. 
short	TokenNameshort	
getColorType	TokenNameIdentifier	 get Color Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Returns the color profile, if this object represents a SVGColor. */	TokenNameCOMMENT_JAVADOC	 Returns the color profile, if this object represents a SVGColor. 
String	TokenNameIdentifier	 String
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Returns the number of colors, if this object represents a SVGColor. */	TokenNameCOMMENT_JAVADOC	 Returns the number of colors, if this object represents a SVGColor. 
int	TokenNameint	
getNumberOfColors	TokenNameIdentifier	 get Number Of Colors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Returns the color at the given index, if this object represents * a SVGColor. */	TokenNameCOMMENT_JAVADOC	 Returns the color at the given index, if this object represents a SVGColor. 
float	TokenNamefloat	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

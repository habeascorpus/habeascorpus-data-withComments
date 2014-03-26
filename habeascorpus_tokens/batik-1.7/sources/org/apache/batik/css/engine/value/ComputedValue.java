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
/** * This class represents a computed property value. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ComputedValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a computed property value. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ComputedValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ComputedValue	TokenNameIdentifier	 Computed Value
implements	TokenNameimplements	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
/** * The cascaded value. */	TokenNameCOMMENT_JAVADOC	 The cascaded value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
cascadedValue	TokenNameIdentifier	 cascaded Value
;	TokenNameSEMICOLON	
/** * The computed value. */	TokenNameCOMMENT_JAVADOC	 The computed value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
computedValue	TokenNameIdentifier	 computed Value
;	TokenNameSEMICOLON	
/** * Creates a new ComputedValue object. * @param cv The cascaded value. */	TokenNameCOMMENT_JAVADOC	 Creates a new ComputedValue object. @param cv The cascaded value. 
public	TokenNamepublic	
ComputedValue	TokenNameIdentifier	 Computed Value
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
cv	TokenNameIdentifier	 cv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cascadedValue	TokenNameIdentifier	 cascaded Value
=	TokenNameEQUAL	
cv	TokenNameIdentifier	 cv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the computed value. */	TokenNameCOMMENT_JAVADOC	 Returns the computed value. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getComputedValue	TokenNameIdentifier	 get Computed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the cascaded value. */	TokenNameCOMMENT_JAVADOC	 Returns the cascaded value. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getCascadedValue	TokenNameIdentifier	 get Cascaded Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cascadedValue	TokenNameIdentifier	 cascaded Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the computed value. */	TokenNameCOMMENT_JAVADOC	 Sets the computed value. 
public	TokenNamepublic	
void	TokenNamevoid	
setComputedValue	TokenNameIdentifier	 set Computed Value
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
computedValue	TokenNameIdentifier	 computed Value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getCssText()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getCssText()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getCssValueType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getCssValueType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getPrimitiveType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getPrimitiveType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getFloatValue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getFloatValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getStringValue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getStringValue()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getRed()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getRed()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getGreen()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getGreen()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getBlue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getBlue()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getLength()}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#item(int)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#item(int)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getTop()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getTop()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getRight()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getRight()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getBottom()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getBottom()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getLeft()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getLeft()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getIdentifier()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getIdentifier()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIdentifier	TokenNameIdentifier	 get Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getIdentifier	TokenNameIdentifier	 get Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getListStyle()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getListStyle()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getListStyle	TokenNameIdentifier	 get List Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getListStyle	TokenNameIdentifier	 get List Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getSeparator()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getSeparator()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSeparator	TokenNameIdentifier	 get Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
computedValue	TokenNameIdentifier	 computed Value
.	TokenNameDOT	
getSeparator	TokenNameIdentifier	 get Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

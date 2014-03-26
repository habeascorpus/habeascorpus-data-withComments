/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
/** * Represents GDI Objects encountred in WMF Files. * * @version $Id: GdiObject.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Represents GDI Objects encountred in WMF Files. * @version $Id: GdiObject.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
GdiObject	TokenNameIdentifier	 Gdi Object
{	TokenNameLBRACE	
GdiObject	TokenNameIdentifier	 Gdi Object
(	TokenNameLPAREN	
int	TokenNameint	
_id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
_used	TokenNameIdentifier	 used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
_id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
=	TokenNameEQUAL	
_used	TokenNameIdentifier	 used
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
used	TokenNameIdentifier	 used
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Setup this Object, which means that it is used and associated with an Object. * <p>The Object can be any Java <i>Object</i> that is useful for an implementation of * {@link AbstractWMFPainter} that uses this GdiObject.</p> * <p>For example, if the painter paints in a Java <i>Graphics2D</i> :</p> * <ul> * <li>For a PEN or BRUSH GdiObject : the Object will be a <i>Color</i></li> * <li>For a FONT GdiObject : the Object can be a <i>Font</i> (in fact, the actual * {@link WMFPainter} implementation uses a more sophisticated kind of Object in order to keep * track of the associated charset)</li> * </ul> * @param _type the type of this object * @param _obj the associated Object */	TokenNameCOMMENT_JAVADOC	 Setup this Object, which means that it is used and associated with an Object. <p>The Object can be any Java <i>Object</i> that is useful for an implementation of {@link AbstractWMFPainter} that uses this GdiObject.</p> <p>For example, if the painter paints in a Java <i>Graphics2D</i> :</p> <ul> <li>For a PEN or BRUSH GdiObject : the Object will be a <i>Color</i></li> <li>For a FONT GdiObject : the Object can be a <i>Font</i> (in fact, the actual {@link WMFPainter} implementation uses a more sophisticated kind of Object in order to keep track of the associated charset)</li> </ul> @param _type the type of this object @param _obj the associated Object 
public	TokenNamepublic	
void	TokenNamevoid	
Setup	TokenNameIdentifier	 Setup
(	TokenNameLPAREN	
int	TokenNameint	
_type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
_obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
_obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return true if this GdiObject is used. */	TokenNameCOMMENT_JAVADOC	 Return true if this GdiObject is used. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isUsed	TokenNameIdentifier	 is Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
used	TokenNameIdentifier	 used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the type of this GdiObject. */	TokenNameCOMMENT_JAVADOC	 Return the type of this GdiObject. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the Object associated with this GdiObject. */	TokenNameCOMMENT_JAVADOC	 Return the Object associated with this GdiObject. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the identification of this GdiObject. */	TokenNameCOMMENT_JAVADOC	 Return the identification of this GdiObject. 
public	TokenNamepublic	
int	TokenNameint	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
used	TokenNameIdentifier	 used
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

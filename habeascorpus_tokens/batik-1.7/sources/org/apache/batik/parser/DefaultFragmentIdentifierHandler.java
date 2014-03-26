/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * This class provides an adapter for FragmentIdentifierHandler. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultFragmentIdentifierHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an adapter for FragmentIdentifierHandler. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultFragmentIdentifierHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultFragmentIdentifierHandler	TokenNameIdentifier	 Default Fragment Identifier Handler
extends	TokenNameextends	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
implements	TokenNameimplements	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultFragmentIdentifierHandler	TokenNameIdentifier	 Default Fragment Identifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultFragmentIdentifierHandler	TokenNameIdentifier	 Default Fragment Identifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link FragmentIdentifierHandler#startFragmentIdentifier()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link FragmentIdentifierHandler#startFragmentIdentifier()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startFragmentIdentifier	TokenNameIdentifier	 start Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when an ID has been parsed. * @param s The string that represents the parsed ID. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when an ID has been parsed. @param s The string that represents the parsed ID. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
idReference	TokenNameIdentifier	 id Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when 'viewBox(x,y,width,height)' has been parsed. * @param x the x coordinate of the viewbox. * @param y the y coordinate of the viewbox. * @param width the width of the viewbox. * @param height the height of the viewbox. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when 'viewBox(x,y,width,height)' has been parsed. @param x the x coordinate of the viewbox. @param y the y coordinate of the viewbox. @param width the width of the viewbox. @param height the height of the viewbox. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
viewBox	TokenNameIdentifier	 view Box
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a view target specification starts. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a view target specification starts. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
startViewTarget	TokenNameIdentifier	 start View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a view target component has been parsed. * @param name the target name. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a view target component has been parsed. @param name the target name. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
viewTarget	TokenNameIdentifier	 view Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a view target specification ends. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a view target specification ends. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
endViewTarget	TokenNameIdentifier	 end View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#startTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#startTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startTransformList	TokenNameIdentifier	 start Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link * TransformListHandler#matrix(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#matrix(float,float,float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewX(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewY(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#endTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#endTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endTransformList	TokenNameIdentifier	 end Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when a 'zoomAndPan' specification has been parsed. * @param magnify true if 'magnify' has been parsed. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a 'zoomAndPan' specification has been parsed. @param magnify true if 'magnify' has been parsed. @exception ParseException if an error occured while processing the fragment identifier 
public	TokenNamepublic	
void	TokenNamevoid	
zoomAndPan	TokenNameIdentifier	 zoom And Pan
(	TokenNameLPAREN	
boolean	TokenNameboolean	
magnify	TokenNameIdentifier	 magnify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link FragmentIdentifierHandler#endFragmentIdentifier()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link FragmentIdentifierHandler#endFragmentIdentifier()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endFragmentIdentifier	TokenNameIdentifier	 end Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

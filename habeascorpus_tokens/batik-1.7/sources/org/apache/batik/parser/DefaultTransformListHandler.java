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
/** * This class provides an adapter for TransformListHandler. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultTransformListHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an adapter for TransformListHandler. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultTransformListHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultTransformListHandler	TokenNameIdentifier	 Default Transform List Handler
implements	TokenNameimplements	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultTransformListHandler	TokenNameIdentifier	 Default Transform List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultTransformListHandler	TokenNameIdentifier	 Default Transform List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	

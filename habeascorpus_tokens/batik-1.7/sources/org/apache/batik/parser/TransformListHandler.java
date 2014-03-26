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
/** * This interface must be implemented and then registred as the * handler of a <code>TransformParser</code> instance in order to * be notified of parsing events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: TransformListHandler.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registred as the handler of a <code>TransformParser</code> instance in order to be notified of parsing events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: TransformListHandler.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
{	TokenNameLBRACE	
/** * Invoked when the tranform starts. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when the tranform starts. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
startTransformList	TokenNameIdentifier	 start Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'matrix(a, b, c, d, e, f)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'matrix(a, b, c, d, e, f)' has been parsed. * @exception ParseException if an error occured while processing the transform 
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
;	TokenNameSEMICOLON	
/** * Invoked when 'rotate(theta)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'rotate(theta)' has been parsed. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'rotate(theta, cx, cy)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'rotate(theta, cx, cy)' has been parsed. * @exception ParseException if an error occured while processing the transform 
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
;	TokenNameSEMICOLON	
/** * Invoked when 'translate(tx)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'translate(tx)' has been parsed. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'translate(tx, ty)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'translate(tx, ty)' has been parsed. * @exception ParseException if an error occured while processing the transform 
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
;	TokenNameSEMICOLON	
/** * Invoked when 'scale(sx)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'scale(sx)' has been parsed. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'scale(sx, sy)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'scale(sx, sy)' has been parsed. * @exception ParseException if an error occured while processing the transform 
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
;	TokenNameSEMICOLON	
/** * Invoked when 'skewX(skx)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'skewX(skx)' has been parsed. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'skewY(sky)' has been parsed. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'skewY(sky)' has been parsed. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the transform ends. * * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when the transform ends. * @exception ParseException if an error occured while processing the transform 
void	TokenNamevoid	
endTransformList	TokenNameIdentifier	 end Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

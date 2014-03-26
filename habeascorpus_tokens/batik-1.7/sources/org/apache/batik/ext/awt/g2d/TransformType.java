/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
;	TokenNameSEMICOLON	
/** * Enumeration for transformation types. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: TransformType.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Enumeration for transformation types. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: TransformType.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TransformType	TokenNameIdentifier	 Transform Type
{	TokenNameLBRACE	
/* * Transform type constants */	TokenNameCOMMENT_BLOCK	 Transform type constants 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFORM_SHEAR	TokenNameIdentifier	 TRANSFORM  SHEAR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFORM_GENERAL	TokenNameIdentifier	 TRANSFORM  GENERAL
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Strings describing the elementary transforms */	TokenNameCOMMENT_JAVADOC	 Strings describing the elementary transforms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLATE_STRING	TokenNameIdentifier	 TRANSLATE  STRING
=	TokenNameEQUAL	
"translate"	TokenNameStringLiteral	translate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROTATE_STRING	TokenNameIdentifier	 ROTATE  STRING
=	TokenNameEQUAL	
"rotate"	TokenNameStringLiteral	rotate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCALE_STRING	TokenNameIdentifier	 SCALE  STRING
=	TokenNameEQUAL	
"scale"	TokenNameStringLiteral	scale
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHEAR_STRING	TokenNameIdentifier	 SHEAR  STRING
=	TokenNameEQUAL	
"shear"	TokenNameStringLiteral	shear
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GENERAL_STRING	TokenNameIdentifier	 GENERAL  STRING
=	TokenNameEQUAL	
"general"	TokenNameStringLiteral	general
;	TokenNameSEMICOLON	
/** * TransformType values */	TokenNameCOMMENT_JAVADOC	 TransformType values 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformType	TokenNameIdentifier	 Transform Type
TRANSLATE	TokenNameIdentifier	 TRANSLATE
=	TokenNameEQUAL	
new	TokenNamenew	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
,	TokenNameCOMMA	
TRANSLATE_STRING	TokenNameIdentifier	 TRANSLATE  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformType	TokenNameIdentifier	 Transform Type
ROTATE	TokenNameIdentifier	 ROTATE
=	TokenNameEQUAL	
new	TokenNamenew	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
,	TokenNameCOMMA	
ROTATE_STRING	TokenNameIdentifier	 ROTATE  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformType	TokenNameIdentifier	 Transform Type
SCALE	TokenNameIdentifier	 SCALE
=	TokenNameEQUAL	
new	TokenNamenew	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
,	TokenNameCOMMA	
SCALE_STRING	TokenNameIdentifier	 SCALE  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformType	TokenNameIdentifier	 Transform Type
SHEAR	TokenNameIdentifier	 SHEAR
=	TokenNameEQUAL	
new	TokenNamenew	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
TRANSFORM_SHEAR	TokenNameIdentifier	 TRANSFORM  SHEAR
,	TokenNameCOMMA	
SHEAR_STRING	TokenNameIdentifier	 SHEAR  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TransformType	TokenNameIdentifier	 Transform Type
GENERAL	TokenNameIdentifier	 GENERAL
=	TokenNameEQUAL	
new	TokenNamenew	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
TRANSFORM_GENERAL	TokenNameIdentifier	 TRANSFORM  GENERAL
,	TokenNameCOMMA	
GENERAL_STRING	TokenNameIdentifier	 GENERAL  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
/** * Constructor is private so that no instances other than * the ones in the enumeration can be created. * @see #readResolve */	TokenNameCOMMENT_JAVADOC	 Constructor is private so that no instances other than the ones in the enumeration can be created. @see #readResolve 
private	TokenNameprivate	
TransformType	TokenNameIdentifier	 Transform Type
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return description */	TokenNameCOMMENT_JAVADOC	 @return description 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience for enumeration switching. * That is, * <pre> * switch(transformType.toInt()){ * case TransformType.TRANSFORM_TRANSLATE: * .... * case TransformType.TRANSFORM_ROTATE: * </pre> */	TokenNameCOMMENT_JAVADOC	 Convenience for enumeration switching. That is, <pre> switch(transformType.toInt()){ case TransformType.TRANSFORM_TRANSLATE: .... case TransformType.TRANSFORM_ROTATE: </pre> 
public	TokenNamepublic	
int	TokenNameint	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is called by the serialization code before it returns an unserialized * object. To provide for unicity of instances, the instance that was read * is replaced by its static equivalent */	TokenNameCOMMENT_JAVADOC	 This is called by the serialization code before it returns an unserialized object. To provide for unicity of instances, the instance that was read is replaced by its static equivalent 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
:	TokenNameCOLON	
return	TokenNamereturn	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSLATE	TokenNameIdentifier	 TRANSLATE
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
:	TokenNameCOLON	
return	TokenNamereturn	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
ROTATE	TokenNameIdentifier	 ROTATE
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
:	TokenNameCOLON	
return	TokenNamereturn	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
SCALE	TokenNameIdentifier	 SCALE
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFORM_SHEAR	TokenNameIdentifier	 TRANSFORM  SHEAR
:	TokenNameCOLON	
return	TokenNamereturn	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
SHEAR	TokenNameIdentifier	 SHEAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFORM_GENERAL	TokenNameIdentifier	 TRANSFORM  GENERAL
:	TokenNameCOLON	
return	TokenNamereturn	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
GENERAL	TokenNameIdentifier	 GENERAL
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Unknown TransformType value:"	TokenNameStringLiteral	Unknown TransformType value:
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

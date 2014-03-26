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
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Enumerated type for an ARGB Channel selector. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ARGBChannel.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Enumerated type for an ARGB Channel selector. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ARGBChannel.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Types. * */	TokenNameCOMMENT_JAVADOC	 Types. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANNEL_A	TokenNameIdentifier	 CHANNEL  A
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANNEL_R	TokenNameIdentifier	 CHANNEL  R
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANNEL_G	TokenNameIdentifier	 CHANNEL  G
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANNEL_B	TokenNameIdentifier	 CHANNEL  B
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Strings used to get a more readable output when * a value is displayed. */	TokenNameCOMMENT_JAVADOC	 Strings used to get a more readable output when a value is displayed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RED	TokenNameIdentifier	 RED
=	TokenNameEQUAL	
"Red"	TokenNameStringLiteral	Red
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GREEN	TokenNameIdentifier	 GREEN
=	TokenNameEQUAL	
"Green"	TokenNameStringLiteral	Green
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BLUE	TokenNameIdentifier	 BLUE
=	TokenNameEQUAL	
"Blue"	TokenNameStringLiteral	Blue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALPHA	TokenNameIdentifier	 ALPHA
=	TokenNameEQUAL	
"Alpha"	TokenNameStringLiteral	Alpha
;	TokenNameSEMICOLON	
/** * Channel values */	TokenNameCOMMENT_JAVADOC	 Channel values 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
R	TokenNameIdentifier	 R
=	TokenNameEQUAL	
new	TokenNamenew	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
(	TokenNameLPAREN	
CHANNEL_R	TokenNameIdentifier	 CHANNEL  R
,	TokenNameCOMMA	
RED	TokenNameIdentifier	 RED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
G	TokenNameIdentifier	 G
=	TokenNameEQUAL	
new	TokenNamenew	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
(	TokenNameLPAREN	
CHANNEL_G	TokenNameIdentifier	 CHANNEL  G
,	TokenNameCOMMA	
GREEN	TokenNameIdentifier	 GREEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
new	TokenNamenew	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
(	TokenNameLPAREN	
CHANNEL_B	TokenNameIdentifier	 CHANNEL  B
,	TokenNameCOMMA	
BLUE	TokenNameIdentifier	 BLUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
new	TokenNamenew	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
(	TokenNameLPAREN	
CHANNEL_A	TokenNameIdentifier	 CHANNEL  A
,	TokenNameCOMMA	
ALPHA	TokenNameIdentifier	 ALPHA
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
ARGBChannel	TokenNameIdentifier	 ARGB Channel
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
/** * Convenience for enumeration switching * @return value */	TokenNameCOMMENT_JAVADOC	 Convenience for enumeration switching @return value 
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
CHANNEL_R	TokenNameIdentifier	 CHANNEL  R
:	TokenNameCOLON	
return	TokenNamereturn	
R	TokenNameIdentifier	 R
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHANNEL_G	TokenNameIdentifier	 CHANNEL  G
:	TokenNameCOLON	
return	TokenNamereturn	
G	TokenNameIdentifier	 G
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHANNEL_B	TokenNameIdentifier	 CHANNEL  B
:	TokenNameCOLON	
return	TokenNamereturn	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHANNEL_A	TokenNameIdentifier	 CHANNEL  A
:	TokenNameCOLON	
return	TokenNamereturn	
A	TokenNameIdentifier	 A
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Unknown ARGBChannel value"	TokenNameStringLiteral	Unknown ARGBChannel value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

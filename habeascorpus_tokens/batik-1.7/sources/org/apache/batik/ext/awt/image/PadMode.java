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
/** * This is a typesafe enumeration of the standard Composite rules for * the CompositeRable operation. (over, in, out, atop, xor, arith) * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: PadMode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a typesafe enumeration of the standard Composite rules for the CompositeRable operation. (over, in, out, atop, xor, arith) * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: PadMode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PadMode	TokenNameIdentifier	 Pad Mode
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Pad edges with zeros */	TokenNameCOMMENT_JAVADOC	 Pad edges with zeros 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MODE_ZERO_PAD	TokenNameIdentifier	 MODE  ZERO  PAD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Pad edges by replicating edge pixels */	TokenNameCOMMENT_JAVADOC	 Pad edges by replicating edge pixels 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MODE_REPLICATE	TokenNameIdentifier	 MODE  REPLICATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Pad edges by wrapping around edge pixels */	TokenNameCOMMENT_JAVADOC	 Pad edges by wrapping around edge pixels 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MODE_WRAP	TokenNameIdentifier	 MODE  WRAP
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Pad edges with zeros */	TokenNameCOMMENT_JAVADOC	 Pad edges with zeros 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PadMode	TokenNameIdentifier	 Pad Mode
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
=	TokenNameEQUAL	
new	TokenNamenew	
PadMode	TokenNameIdentifier	 Pad Mode
(	TokenNameLPAREN	
MODE_ZERO_PAD	TokenNameIdentifier	 MODE  ZERO  PAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Pad edges by replicating edge pixels */	TokenNameCOMMENT_JAVADOC	 Pad edges by replicating edge pixels 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PadMode	TokenNameIdentifier	 Pad Mode
REPLICATE	TokenNameIdentifier	 REPLICATE
=	TokenNameEQUAL	
new	TokenNamenew	
PadMode	TokenNameIdentifier	 Pad Mode
(	TokenNameLPAREN	
MODE_REPLICATE	TokenNameIdentifier	 MODE  REPLICATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Pad edges by replicating edge pixels */	TokenNameCOMMENT_JAVADOC	 Pad edges by replicating edge pixels 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PadMode	TokenNameIdentifier	 Pad Mode
WRAP	TokenNameIdentifier	 WRAP
=	TokenNameEQUAL	
new	TokenNamenew	
PadMode	TokenNameIdentifier	 Pad Mode
(	TokenNameLPAREN	
MODE_WRAP	TokenNameIdentifier	 MODE  WRAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the mode of this pad mode. */	TokenNameCOMMENT_JAVADOC	 Returns the mode of this pad mode. 
public	TokenNamepublic	
int	TokenNameint	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The pad mode for this object. */	TokenNameCOMMENT_JAVADOC	 The pad mode for this object. 
private	TokenNameprivate	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PadMode	TokenNameIdentifier	 Pad Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is called by the serialization code before it returns * an unserialized object. To provide for unicity of * instances, the instance that was read is replaced by its * static equivalent. See the serialiazation specification for * further details on this method's logic. */	TokenNameCOMMENT_JAVADOC	 This is called by the serialization code before it returns an unserialized object. To provide for unicity of instances, the instance that was read is replaced by its static equivalent. See the serialiazation specification for further details on this method's logic. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MODE_ZERO_PAD	TokenNameIdentifier	 MODE  ZERO  PAD
:	TokenNameCOLON	
return	TokenNamereturn	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
;	TokenNameSEMICOLON	
case	TokenNamecase	
MODE_REPLICATE	TokenNameIdentifier	 MODE  REPLICATE
:	TokenNameCOLON	
return	TokenNamereturn	
REPLICATE	TokenNameIdentifier	 REPLICATE
;	TokenNameSEMICOLON	
case	TokenNamecase	
MODE_WRAP	TokenNameIdentifier	 MODE  WRAP
:	TokenNameCOLON	
return	TokenNamereturn	
WRAP	TokenNameIdentifier	 WRAP
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Unknown Pad Mode type"	TokenNameStringLiteral	Unknown Pad Mode type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

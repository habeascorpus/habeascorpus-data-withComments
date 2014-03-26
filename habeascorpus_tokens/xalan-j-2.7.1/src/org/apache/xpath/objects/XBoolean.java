/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XBoolean.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XBoolean.java 469368 2006-10-31 04:41:36Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
;	TokenNameSEMICOLON	
/** * This class represents an XPath boolean object, and is capable of * converting the boolean to other types, such as a string. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath boolean object, and is capable of converting the boolean to other types, such as a string. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
XBoolean	TokenNameIdentifier	 X Boolean
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2964933058866100881L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * A true boolean object so we don't have to keep creating them. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A true boolean object so we don't have to keep creating them. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XBoolean	TokenNameIdentifier	 X Boolean
S_TRUE	TokenNameIdentifier	 S  TRUE
=	TokenNameEQUAL	
new	TokenNamenew	
XBooleanStatic	TokenNameIdentifier	 X Boolean Static
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A true boolean object so we don't have to keep creating them. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A true boolean object so we don't have to keep creating them. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XBoolean	TokenNameIdentifier	 X Boolean
S_FALSE	TokenNameIdentifier	 S  FALSE
=	TokenNameEQUAL	
new	TokenNamenew	
XBooleanStatic	TokenNameIdentifier	 X Boolean Static
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value of the object. * @serial */	TokenNameCOMMENT_JAVADOC	 Value of the object. @serial 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
/** * Construct a XBoolean object. * * @param b Value of the boolean object */	TokenNameCOMMENT_JAVADOC	 Construct a XBoolean object. * @param b Value of the boolean object 
public	TokenNamepublic	
XBoolean	TokenNameIdentifier	 X Boolean
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XBoolean object. * * @param b Value of the boolean object */	TokenNameCOMMENT_JAVADOC	 Construct a XBoolean object. * @param b Value of the boolean object 
public	TokenNamepublic	
XBoolean	TokenNameIdentifier	 X Boolean
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell that this is a CLASS_BOOLEAN. * * @return type of CLASS_BOOLEAN */	TokenNameCOMMENT_JAVADOC	 Tell that this is a CLASS_BOOLEAN. * @return type of CLASS_BOOLEAN 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#BOOLEAN" */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#BOOLEAN" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#BOOLEAN"	TokenNameStringLiteral	#BOOLEAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number. * * @return numeric value of the object value */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return numeric value of the object value 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
?	TokenNameQUESTION	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. * * @return The object value as a boolean */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. * @return The object value as a boolean 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The object's value as a string */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The object's value as a string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
?	TokenNameQUESTION	
"true"	TokenNameStringLiteral	true
:	TokenNameCOLON	
"false"	TokenNameStringLiteral	false
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a java object that's closest to the representation * that should be handed to an extension. * * @return The object's value as a java object */	TokenNameCOMMENT_JAVADOC	 Return a java object that's closest to the representation that should be handed to an extension. * @return The object's value as a java object 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 Object to compare to this * * @return True if the two objects are equal * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 Object to compare to this * @return True if the two objects are equal * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

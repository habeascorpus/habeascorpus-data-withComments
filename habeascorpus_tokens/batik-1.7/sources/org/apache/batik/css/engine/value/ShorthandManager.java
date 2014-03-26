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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngine	TokenNameIdentifier	 CSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
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
/** * This interface represents the objects which provide support for * shorthand properties. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ShorthandManager.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface represents the objects which provide support for shorthand properties. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ShorthandManager.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
{	TokenNameLBRACE	
/** * Returns the name of the property handled. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the property handled. 
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the handled property can be animated. */	TokenNameCOMMENT_JAVADOC	 Whether the handled property can be animated. 
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the handled property can be additively animated. */	TokenNameCOMMENT_JAVADOC	 Whether the handled property can be additively animated. 
boolean	TokenNameboolean	
isAdditiveProperty	TokenNameIdentifier	 is Additive Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the properties which are affected by this shorthand * property. * @param eng The current CSSEngine. * @param ph The property handler to use. * @param lu The SAC lexical unit used to create the value. * @param imp The property priority. */	TokenNameCOMMENT_JAVADOC	 Sets the properties which are affected by this shorthand property. @param eng The current CSSEngine. @param ph The property handler to use. @param lu The SAC lexical unit used to create the value. @param imp The property priority. 
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
,	TokenNameCOMMA	
PropertyHandler	TokenNameIdentifier	 Property Handler
ph	TokenNameIdentifier	 ph
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
boolean	TokenNameboolean	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * To handle a property value created by a ShorthandManager. */	TokenNameCOMMENT_JAVADOC	 To handle a property value created by a ShorthandManager. 
interface	TokenNameinterface	
PropertyHandler	TokenNameIdentifier	 Property Handler
{	TokenNameLBRACE	
void	TokenNamevoid	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
important	TokenNameIdentifier	 important
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

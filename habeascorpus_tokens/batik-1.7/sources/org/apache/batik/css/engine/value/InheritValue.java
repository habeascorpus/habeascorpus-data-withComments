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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSValue	TokenNameIdentifier	 CSS Value
;	TokenNameSEMICOLON	
/** * This singleton class represents the 'inherit' value. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: InheritValue.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This singleton class represents the 'inherit' value. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: InheritValue.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
InheritValue	TokenNameIdentifier	 Inherit Value
extends	TokenNameextends	
AbstractValue	TokenNameIdentifier	 Abstract Value
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
InheritValue	TokenNameIdentifier	 Inherit Value
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
InheritValue	TokenNameIdentifier	 Inherit Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new InheritValue object. */	TokenNameCOMMENT_JAVADOC	 Creates a new InheritValue object. 
protected	TokenNameprotected	
InheritValue	TokenNameIdentifier	 Inherit Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * A string representation of the current value. */	TokenNameCOMMENT_JAVADOC	 A string representation of the current value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"inherit"	TokenNameStringLiteral	inherit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A code defining the type of the value. */	TokenNameCOMMENT_JAVADOC	 A code defining the type of the value. 
public	TokenNamepublic	
short	TokenNameshort	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_INHERIT	TokenNameIdentifier	 CSS  INHERIT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

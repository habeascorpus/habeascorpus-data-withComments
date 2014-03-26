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
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
FloatValue	TokenNameIdentifier	 Float Value
;	TokenNameSEMICOLON	
/** * This class represents line-height values. These are basically * FloatValues except that it may be 'font-size' relative. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LineHeightValue.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents line-height values. These are basically FloatValues except that it may be 'font-size' relative. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LineHeightValue.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LineHeightValue	TokenNameIdentifier	 Line Height Value
extends	TokenNameextends	
FloatValue	TokenNameIdentifier	 Float Value
{	TokenNameLBRACE	
/** * True if the line-height is relative to the font-size */	TokenNameCOMMENT_JAVADOC	 True if the line-height is relative to the font-size 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fontSizeRelative	TokenNameIdentifier	 font Size Relative
;	TokenNameSEMICOLON	
/** * Creates a new value. */	TokenNameCOMMENT_JAVADOC	 Creates a new value. 
public	TokenNamepublic	
LineHeightValue	TokenNameIdentifier	 Line Height Value
(	TokenNameLPAREN	
short	TokenNameshort	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
float	TokenNamefloat	
floatValue	TokenNameIdentifier	 float Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fontSizeRelative	TokenNameIdentifier	 font Size Relative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
floatValue	TokenNameIdentifier	 float Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontSizeRelative	TokenNameIdentifier	 font Size Relative
=	TokenNameEQUAL	
fontSizeRelative	TokenNameIdentifier	 font Size Relative
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The type of the value. */	TokenNameCOMMENT_JAVADOC	 The type of the value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFontSizeRelative	TokenNameIdentifier	 get Font Size Relative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontSizeRelative	TokenNameIdentifier	 font Size Relative
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
StringValue	TokenNameIdentifier	 String Value
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
Value	TokenNameIdentifier	 Value
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
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
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * This interface provides constants for SVG 1.2 values. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: SVG12ValueConstants.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface provides constants for SVG 1.2 values. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: SVG12ValueConstants.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVG12ValueConstants	TokenNameIdentifier	 SV G12 Value Constants
extends	TokenNameextends	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
{	TokenNameLBRACE	
/** The 'start' keyword. */	TokenNameCOMMENT_JAVADOC	 The 'start' keyword. 
Value	TokenNameIdentifier	 Value
START_VALUE	TokenNameIdentifier	 START  VALUE
=	TokenNameEQUAL	
new	TokenNamenew	
StringValue	TokenNameIdentifier	 String Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
,	TokenNameCOMMA	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
.	TokenNameDOT	
CSS_FULL_VALUE	TokenNameIdentifier	 CSS  FULL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The 'middle' keyword. */	TokenNameCOMMENT_JAVADOC	 The 'middle' keyword. 
Value	TokenNameIdentifier	 Value
MIDDLE_VALUE	TokenNameIdentifier	 MIDDLE  VALUE
=	TokenNameEQUAL	
new	TokenNamenew	
StringValue	TokenNameIdentifier	 String Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
,	TokenNameCOMMA	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
.	TokenNameDOT	
CSS_MIDDLE_VALUE	TokenNameIdentifier	 CSS  MIDDLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The 'end' keyword. */	TokenNameCOMMENT_JAVADOC	 The 'end' keyword. 
Value	TokenNameIdentifier	 Value
END_VALUE	TokenNameIdentifier	 END  VALUE
=	TokenNameEQUAL	
new	TokenNamenew	
StringValue	TokenNameIdentifier	 String Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
,	TokenNameCOMMA	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
.	TokenNameDOT	
CSS_END_VALUE	TokenNameIdentifier	 CSS  END  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The 'full' keyword. */	TokenNameCOMMENT_JAVADOC	 The 'full' keyword. 
Value	TokenNameIdentifier	 Value
FULL_VALUE	TokenNameIdentifier	 FULL  VALUE
=	TokenNameEQUAL	
new	TokenNamenew	
StringValue	TokenNameIdentifier	 String Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
,	TokenNameCOMMA	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
.	TokenNameDOT	
CSS_FULL_VALUE	TokenNameIdentifier	 CSS  FULL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The 'normal' keyword, for 'line-height'. */	TokenNameCOMMENT_JAVADOC	 The 'normal' keyword, for 'line-height'. 
Value	TokenNameIdentifier	 Value
NORMAL_VALUE	TokenNameIdentifier	 NORMAL  VALUE
=	TokenNameEQUAL	
new	TokenNamenew	
StringValue	TokenNameIdentifier	 String Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
,	TokenNameCOMMA	
SVG12CSSConstants	TokenNameIdentifier	 SV G12 CSS Constants
.	TokenNameDOT	
CSS_NORMAL_VALUE	TokenNameIdentifier	 CSS  NORMAL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

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
svg	TokenNameIdentifier	 svg
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CSSConstants	TokenNameIdentifier	 CSS Constants
;	TokenNameSEMICOLON	
/** * This class provides a manager for the 'color-interpolation' property values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ColorInterpolationFiltersManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the 'color-interpolation' property values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ColorInterpolationFiltersManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ColorInterpolationFiltersManager	TokenNameIdentifier	 Color Interpolation Filters Manager
extends	TokenNameextends	
ColorInterpolationManager	TokenNameIdentifier	 Color Interpolation Manager
{	TokenNameLBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_COLOR_INTERPOLATION_FILTERS_PROPERTY	TokenNameIdentifier	 CSS  COLOR  INTERPOLATION  FILTERS  PROPERTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
LINEARRGB_VALUE	TokenNameIdentifier	 LINEARRGB  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

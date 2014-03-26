/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
/** * This interface defines constants for the possible resource * origins. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: ResourceOrigin.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface defines constants for the possible resource origins. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: ResourceOrigin.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ResourceOrigin	TokenNameIdentifier	 Resource Origin
{	TokenNameLBRACE	
/** * Any origin */	TokenNameCOMMENT_JAVADOC	 Any origin 
int	TokenNameint	
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Same as document */	TokenNameCOMMENT_JAVADOC	 Same as document 
int	TokenNameint	
DOCUMENT	TokenNameIdentifier	 DOCUMENT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Embeded into the document */	TokenNameCOMMENT_JAVADOC	 Embeded into the document 
int	TokenNameint	
EMBEDED	TokenNameIdentifier	 EMBEDED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * No origin is ok */	TokenNameCOMMENT_JAVADOC	 No origin is ok 
int	TokenNameint	
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * This interface represents the Model Group Definition schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Model Group Definition schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSModelGroupDefinition	TokenNameIdentifier	 XS Model Group Definition
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * A model group. */	TokenNameCOMMENT_JAVADOC	 A model group. 
public	TokenNamepublic	
XSModelGroup	TokenNameIdentifier	 XS Model Group
getModelGroup	TokenNameIdentifier	 get Model Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An annotation if it exists, otherwise <code>null</code>. If not null * then the first [annotation] from the sequence of annotations. */	TokenNameCOMMENT_JAVADOC	 An annotation if it exists, otherwise <code>null</code>. If not null then the first [annotation] from the sequence of annotations. 
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A sequence of [annotations] or an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A sequence of [annotations] or an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

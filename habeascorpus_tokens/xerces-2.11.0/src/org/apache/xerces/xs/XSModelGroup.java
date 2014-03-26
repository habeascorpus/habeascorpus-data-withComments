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
/** * This interface represents the Model Group schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Model Group schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSModelGroup	TokenNameIdentifier	 XS Model Group
extends	TokenNameextends	
XSTerm	TokenNameIdentifier	 XS Term
{	TokenNameLBRACE	
// Content model compositors 	TokenNameCOMMENT_LINE	Content model compositors 
/** * This constant value signifies a sequence operator. */	TokenNameCOMMENT_JAVADOC	 This constant value signifies a sequence operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPOSITOR_SEQUENCE	TokenNameIdentifier	 COMPOSITOR  SEQUENCE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant value signifies a choice operator. */	TokenNameCOMMENT_JAVADOC	 This constant value signifies a choice operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPOSITOR_CHOICE	TokenNameIdentifier	 COMPOSITOR  CHOICE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This content model represents a simplified version of the SGML * &amp;-Connector and is limited to the top-level of any content model. * No element in the all content model may appear more than once. */	TokenNameCOMMENT_JAVADOC	 This content model represents a simplified version of the SGML &amp;-Connector and is limited to the top-level of any content model. No element in the all content model may appear more than once. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPOSITOR_ALL	TokenNameIdentifier	 COMPOSITOR  ALL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [compositor]: one of all, choice or sequence. The valid constant values * are: * <code>COMPOSITOR_SEQUENCE, COMPOSITOR_CHOICE, COMPOSITOR_ALL</code>. */	TokenNameCOMMENT_JAVADOC	 [compositor]: one of all, choice or sequence. The valid constant values are: <code>COMPOSITOR_SEQUENCE, COMPOSITOR_CHOICE, COMPOSITOR_ALL</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getCompositor	TokenNameIdentifier	 get Compositor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of [particles] if it exists, otherwise an empty * <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A list of [particles] if it exists, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getParticles	TokenNameIdentifier	 get Particles
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

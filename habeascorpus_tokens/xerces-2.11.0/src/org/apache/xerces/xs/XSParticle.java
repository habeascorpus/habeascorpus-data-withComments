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
/** * This interface represents the Particle schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Particle schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSParticle	TokenNameIdentifier	 XS Particle
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * [min occurs]: determines the minimum number of terms that can occur. */	TokenNameCOMMENT_JAVADOC	 [min occurs]: determines the minimum number of terms that can occur. 
public	TokenNamepublic	
int	TokenNameint	
getMinOccurs	TokenNameIdentifier	 get Min Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [max occurs]: determines the maximum number of terms that can occur. * To query for the value of unbounded use * <code>maxOccursUnbounded</code>. When the value of * <code>maxOccursUnbounded</code> is <code>true</code>, the value of * <code>maxOccurs</code> is unspecified. */	TokenNameCOMMENT_JAVADOC	 [max occurs]: determines the maximum number of terms that can occur. To query for the value of unbounded use <code>maxOccursUnbounded</code>. When the value of <code>maxOccursUnbounded</code> is <code>true</code>, the value of <code>maxOccurs</code> is unspecified. 
public	TokenNamepublic	
int	TokenNameint	
getMaxOccurs	TokenNameIdentifier	 get Max Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [max occurs]: whether the maxOccurs value is unbounded. */	TokenNameCOMMENT_JAVADOC	 [max occurs]: whether the maxOccurs value is unbounded. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMaxOccursUnbounded	TokenNameIdentifier	 get Max Occurs Unbounded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [term]: one of a model group, a wildcard, or an element declaration. */	TokenNameCOMMENT_JAVADOC	 [term]: one of a model group, a wildcard, or an element declaration. 
public	TokenNamepublic	
XSTerm	TokenNameIdentifier	 XS Term
getTerm	TokenNameIdentifier	 get Term
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

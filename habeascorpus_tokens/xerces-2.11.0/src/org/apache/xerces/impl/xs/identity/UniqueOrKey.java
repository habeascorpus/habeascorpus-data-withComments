/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
/** * Schema unique or key identity constraint. * These two kinds of identity constraint have been combined to save * the creation of a separate Vector object for any element that * has both. A short int is used to distinguish which this object is. * * @xerces.internal * * @author Andy Clark, IBM * @version $Id: UniqueOrKey.java 446732 2006-09-15 20:47:34Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Schema unique or key identity constraint. These two kinds of identity constraint have been combined to save the creation of a separate Vector object for any element that has both. A short int is used to distinguish which this object is. * @xerces.internal * @author Andy Clark, IBM @version $Id: UniqueOrKey.java 446732 2006-09-15 20:47:34Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
extends	TokenNameextends	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a unique or a key identity constraint. */	TokenNameCOMMENT_JAVADOC	 Constructs a unique or a key identity constraint. 
public	TokenNamepublic	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String) 	TokenNameCOMMENT_LINE	<init>(String,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
}	TokenNameRBRACE	
// class Unique 	TokenNameCOMMENT_LINE	class Unique 

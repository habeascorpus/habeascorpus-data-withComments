/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
;	TokenNameSEMICOLON	
/** * <p>Implementation of Schema for W3C XML Schemas.</p> * * @author Michael Glavassevich, IBM * @version $Id: XMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Implementation of Schema for W3C XML Schemas.</p> * @author Michael Glavassevich, IBM @version $Id: XMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
XMLSchema	TokenNameIdentifier	 XML Schema
extends	TokenNameextends	
AbstractXMLSchema	TokenNameIdentifier	 Abstract XML Schema
{	TokenNameLBRACE	
/** The grammar pool is immutable */	TokenNameCOMMENT_JAVADOC	 The grammar pool is immutable 
private	TokenNameprivate	
final	TokenNamefinal	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
/** Whether to consider this schema to be fully composed */	TokenNameCOMMENT_JAVADOC	 Whether to consider this schema to be fully composed 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fFullyComposed	TokenNameIdentifier	 f Fully Composed
;	TokenNameSEMICOLON	
/** Constructors */	TokenNameCOMMENT_JAVADOC	 Constructors 
public	TokenNamepublic	
XMLSchema	TokenNameIdentifier	 XML Schema
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLSchema	TokenNameIdentifier	 XML Schema
(	TokenNameLPAREN	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fullyComposed	TokenNameIdentifier	 fully Composed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
grammarPool	TokenNameIdentifier	 grammar Pool
;	TokenNameSEMICOLON	
fFullyComposed	TokenNameIdentifier	 f Fully Composed
=	TokenNameEQUAL	
fullyComposed	TokenNameIdentifier	 fully Composed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * XSGrammarPoolContainer methods */	TokenNameCOMMENT_BLOCK	 XSGrammarPoolContainer methods 
/** * <p>Returns the grammar pool contained inside the container.</p> * * @return the grammar pool contained inside the container */	TokenNameCOMMENT_JAVADOC	 <p>Returns the grammar pool contained inside the container.</p> * @return the grammar pool contained inside the container 
public	TokenNamepublic	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
getGrammarPool	TokenNameIdentifier	 get Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns whether the schema components contained in this object * can be considered to be a fully composed schema and should be * used to exclusion of other schema components which may be * present elsewhere.</p> * * @return whether the schema components contained in this object * can be considered to be a fully composed schema */	TokenNameCOMMENT_JAVADOC	 <p>Returns whether the schema components contained in this object can be considered to be a fully composed schema and should be used to exclusion of other schema components which may be present elsewhere.</p> * @return whether the schema components contained in this object can be considered to be a fully composed schema 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFullyComposed	TokenNameIdentifier	 is Fully Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fFullyComposed	TokenNameIdentifier	 f Fully Composed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XMLSchema 	TokenNameCOMMENT_LINE	XMLSchema 

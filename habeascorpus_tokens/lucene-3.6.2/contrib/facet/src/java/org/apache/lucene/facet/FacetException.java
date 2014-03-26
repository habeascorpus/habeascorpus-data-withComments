package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A parent class for exceptions thrown by the Facets code. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A parent class for exceptions thrown by the Facets code. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetException	TokenNameIdentifier	 Facet Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
FacetException	TokenNameIdentifier	 Facet Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetException	TokenNameIdentifier	 Facet Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetException	TokenNameIdentifier	 Facet Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetException	TokenNameIdentifier	 Facet Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

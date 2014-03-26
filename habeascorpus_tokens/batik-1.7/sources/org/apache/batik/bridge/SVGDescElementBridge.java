/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;desc&gt; element. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: SVGDescElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;desc&gt; element. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: SVGDescElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGDescElementBridge	TokenNameIdentifier	 SVG Desc Element Bridge
extends	TokenNameextends	
SVGDescriptiveElementBridge	TokenNameIdentifier	 SVG Descriptive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;desc&gt; element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;desc&gt; element. 
public	TokenNamepublic	
SVGDescElementBridge	TokenNameIdentifier	 SVG Desc Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'desc'. */	TokenNameCOMMENT_JAVADOC	 Returns 'desc'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_DESC_TAG	TokenNameIdentifier	 SVG  DESC  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new instance of this bridge. */	TokenNameCOMMENT_JAVADOC	 Returns a new instance of this bridge. 
public	TokenNamepublic	
Bridge	TokenNameIdentifier	 Bridge
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGDescElementBridge	TokenNameIdentifier	 SVG Desc Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

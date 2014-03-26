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
/** * Defines a viewport for a <tt>UserAgent</tt>. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: UserAgentViewport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Defines a viewport for a <tt>UserAgent</tt>. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: UserAgentViewport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
UserAgentViewport	TokenNameIdentifier	 User Agent Viewport
implements	TokenNameimplements	
Viewport	TokenNameIdentifier	 Viewport
{	TokenNameLBRACE	
private	TokenNameprivate	
UserAgent	TokenNameIdentifier	 User Agent
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
/** * Constructs a new viewport for the specified user agent. * @param userAgent the user agent that defines the viewport */	TokenNameCOMMENT_JAVADOC	 Constructs a new viewport for the specified user agent. @param userAgent the user agent that defines the viewport 
public	TokenNamepublic	
UserAgentViewport	TokenNameIdentifier	 User Agent Viewport
(	TokenNameLPAREN	
UserAgent	TokenNameIdentifier	 User Agent
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the width of this viewport. */	TokenNameCOMMENT_JAVADOC	 Returns the width of this viewport. 
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
getViewportSize	TokenNameIdentifier	 get Viewport Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the height of this viewport. */	TokenNameCOMMENT_JAVADOC	 Returns the height of this viewport. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
getViewportSize	TokenNameIdentifier	 get Viewport Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

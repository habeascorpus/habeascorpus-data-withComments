/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
/** * Implemented by logger repositories that support configurable * rendering of Throwables. * * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 Implemented by logger repositories that support configurable rendering of Throwables. * @since 1.2.16 
public	TokenNamepublic	
interface	TokenNameinterface	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
{	TokenNameLBRACE	
/** * Get throwable renderer. * @return throwable renderer, may be null. */	TokenNameCOMMENT_JAVADOC	 Get throwable renderer. @return throwable renderer, may be null. 
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
getThrowableRenderer	TokenNameIdentifier	 get Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set throwable renderer. * @param renderer renderer, may be null. */	TokenNameCOMMENT_JAVADOC	 Set throwable renderer. @param renderer renderer, may be null. 
void	TokenNamevoid	
setThrowableRenderer	TokenNameIdentifier	 set Throwable Renderer
(	TokenNameLPAREN	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

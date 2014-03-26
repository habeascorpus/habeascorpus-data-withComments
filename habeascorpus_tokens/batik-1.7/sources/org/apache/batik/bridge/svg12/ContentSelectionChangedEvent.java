/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
;	TokenNameSEMICOLON	
/** * An event to signify a change to the list of selected nodes for an * xbl;content element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: ContentSelectionChangedEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event to signify a change to the list of selected nodes for an xbl;content element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: ContentSelectionChangedEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ContentSelectionChangedEvent	TokenNameIdentifier	 Content Selection Changed Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * Creates a new ContentSelectionChangedEvent object. * @param c the xbl:content element whose selection is changing */	TokenNameCOMMENT_JAVADOC	 Creates a new ContentSelectionChangedEvent object. @param c the xbl:content element whose selection is changing 
public	TokenNamepublic	
ContentSelectionChangedEvent	TokenNameIdentifier	 Content Selection Changed Event
(	TokenNameLPAREN	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the xbl:content element where the event originated. */	TokenNameCOMMENT_JAVADOC	 Returns the xbl:content element where the event originated. 
public	TokenNamepublic	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
getContentElement	TokenNameIdentifier	 get Content Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

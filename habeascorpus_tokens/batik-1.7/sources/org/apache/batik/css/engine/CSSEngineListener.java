/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
/** * This class must be implemented in order to be notified of CSS events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSEngineListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class must be implemented in order to be notified of CSS events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSEngineListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSEngineListener	TokenNameIdentifier	 CSS Engine Listener
{	TokenNameLBRACE	
/** * Called when a set of properties has been modified. */	TokenNameCOMMENT_JAVADOC	 Called when a set of properties has been modified. 
void	TokenNamevoid	
propertiesChanged	TokenNameIdentifier	 properties Changed
(	TokenNameLPAREN	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

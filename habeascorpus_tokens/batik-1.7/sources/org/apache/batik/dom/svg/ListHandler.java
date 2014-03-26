/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
/** * Interface that defines the functionnality * of a list handler for the parser of * attributes that are list. * * The attribute parser should use this interface * in order to create the list representing * the values of the attribute. * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: ListHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface that defines the functionnality of a list handler for the parser of attributes that are list. * The attribute parser should use this interface in order to create the list representing the values of the attribute. * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: ListHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ListHandler	TokenNameIdentifier	 List Handler
{	TokenNameLBRACE	
/** * Indicates that the parser starts * generating the list */	TokenNameCOMMENT_JAVADOC	 Indicates that the parser starts generating the list 
void	TokenNamevoid	
startList	TokenNameIdentifier	 start List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates a new item to add to the list. * * @param item the new item to be added */	TokenNameCOMMENT_JAVADOC	 Indicates a new item to add to the list. * @param item the new item to be added 
void	TokenNamevoid	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates that the parser ends * generating the list */	TokenNameCOMMENT_JAVADOC	 Indicates that the parser ends generating the list 
void	TokenNamevoid	
endList	TokenNameIdentifier	 end List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

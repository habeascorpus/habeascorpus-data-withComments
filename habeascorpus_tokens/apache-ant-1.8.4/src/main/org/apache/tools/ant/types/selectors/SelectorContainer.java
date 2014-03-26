/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
.	TokenNameDOT	
ModifiedSelector	TokenNameIdentifier	 Modified Selector
;	TokenNameSEMICOLON	
/** * This is the interface for selectors that can contain other selectors. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This is the interface for selectors that can contain other selectors. * @since 1.5 
public	TokenNamepublic	
interface	TokenNameinterface	
SelectorContainer	TokenNameIdentifier	 Selector Container
{	TokenNameLBRACE	
/** * Indicates whether there are any selectors here. * * @return whether any selectors are in this container */	TokenNameCOMMENT_JAVADOC	 Indicates whether there are any selectors here. * @return whether any selectors are in this container 
boolean	TokenNameboolean	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gives the count of the number of selectors in this container * * @return the number of selectors in this container */	TokenNameCOMMENT_JAVADOC	 Gives the count of the number of selectors in this container * @return the number of selectors in this container 
int	TokenNameint	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the set of selectors as an array. * @param p the current project * @return an array of selectors in this container */	TokenNameCOMMENT_JAVADOC	 Returns the set of selectors as an array. @param p the current project @return an array of selectors in this container 
FileSelector	TokenNameIdentifier	 File Selector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSelectors	TokenNameIdentifier	 get Selectors
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an enumerator for accessing the set of selectors. * * @return an enumerator that goes through each of the selectors */	TokenNameCOMMENT_JAVADOC	 Returns an enumerator for accessing the set of selectors. * @return an enumerator that goes through each of the selectors 
Enumeration	TokenNameIdentifier	 Enumeration
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a new selector into this container. * * @param selector the new selector to add */	TokenNameCOMMENT_JAVADOC	 Add a new selector into this container. * @param selector the new selector to add 
void	TokenNamevoid	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Methods below all add specific selectors */	TokenNameCOMMENT_BLOCK	 Methods below all add specific selectors 
/** * add a "Select" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "Select" selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addSelector	TokenNameIdentifier	 add Selector
(	TokenNameLPAREN	
SelectSelector	TokenNameIdentifier	 Select Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add an "And" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an "And" selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addAnd	TokenNameIdentifier	 add And
(	TokenNameLPAREN	
AndSelector	TokenNameIdentifier	 And Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add an "Or" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an "Or" selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addOr	TokenNameIdentifier	 add Or
(	TokenNameLPAREN	
OrSelector	TokenNameIdentifier	 Or Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a "Not" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "Not" selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addNot	TokenNameIdentifier	 add Not
(	TokenNameLPAREN	
NotSelector	TokenNameIdentifier	 Not Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a "None" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "None" selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addNone	TokenNameIdentifier	 add None
(	TokenNameLPAREN	
NoneSelector	TokenNameIdentifier	 None Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a majority selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a majority selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addMajority	TokenNameIdentifier	 add Majority
(	TokenNameLPAREN	
MajoritySelector	TokenNameIdentifier	 Majority Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a selector date entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector date entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addDate	TokenNameIdentifier	 add Date
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a selector size entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector size entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addSize	TokenNameIdentifier	 add Size
(	TokenNameLPAREN	
SizeSelector	TokenNameIdentifier	 Size Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a selector filename entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector filename entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addFilename	TokenNameIdentifier	 add Filename
(	TokenNameLPAREN	
FilenameSelector	TokenNameIdentifier	 Filename Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add an extended selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an extended selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addCustom	TokenNameIdentifier	 add Custom
(	TokenNameLPAREN	
ExtendSelector	TokenNameIdentifier	 Extend Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a contains selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a contains selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addContains	TokenNameIdentifier	 add Contains
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a present selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a present selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addPresent	TokenNameIdentifier	 add Present
(	TokenNameLPAREN	
PresentSelector	TokenNameIdentifier	 Present Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a depth selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a depth selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addDepth	TokenNameIdentifier	 add Depth
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a depends selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a depends selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addDepend	TokenNameIdentifier	 add Depend
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add a regular expression selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a regular expression selector entry on the selector list @param selector the selector to add 
void	TokenNamevoid	
addContainsRegexp	TokenNameIdentifier	 add Contains Regexp
(	TokenNameLPAREN	
ContainsRegexpSelector	TokenNameIdentifier	 Contains Regexp Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add the type selector * @param selector the selector to add * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add the type selector @param selector the selector to add @since ant 1.6 
void	TokenNamevoid	
addType	TokenNameIdentifier	 add Type
(	TokenNameLPAREN	
TypeSelector	TokenNameIdentifier	 Type Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add the different selector * @param selector the selector to add * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add the different selector @param selector the selector to add @since ant 1.6 
void	TokenNamevoid	
addDifferent	TokenNameIdentifier	 add Different
(	TokenNameLPAREN	
DifferentSelector	TokenNameIdentifier	 Different Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add the modified selector * @param selector the selector to add * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add the modified selector @param selector the selector to add @since ant 1.6 
void	TokenNamevoid	
addModified	TokenNameIdentifier	 add Modified
(	TokenNameLPAREN	
ModifiedSelector	TokenNameIdentifier	 Modified Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * add an arbitary selector * @param selector the selector to add * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add an arbitary selector @param selector the selector to add @since Ant 1.6 
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

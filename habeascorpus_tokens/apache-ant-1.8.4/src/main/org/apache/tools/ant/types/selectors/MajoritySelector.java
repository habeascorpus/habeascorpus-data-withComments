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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * This selector is here just to shake up your thinking a bit. Don't get * too caught up in boolean, there are other ways you can evaluate a * collection of selectors. This one takes a vote of the selectors it * contains, and majority wins. You could also have an "all-but-one" * selector, a "weighted-average" selector, and so on. These are left * as exercises for the reader (as are the usecases where this would * be necessary). * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This selector is here just to shake up your thinking a bit. Don't get too caught up in boolean, there are other ways you can evaluate a collection of selectors. This one takes a vote of the selectors it contains, and majority wins. You could also have an "all-but-one" selector, a "weighted-average" selector, and so on. These are left as exercises for the reader (as are the usecases where this would be necessary). * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
MajoritySelector	TokenNameIdentifier	 Majority Selector
extends	TokenNameextends	
BaseSelectorContainer	TokenNameIdentifier	 Base Selector Container
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
allowtie	TokenNameIdentifier	 allowtie
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
MajoritySelector	TokenNameIdentifier	 Majority Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{majorityselect: "	TokenNameStringLiteral	{majorityselect: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A attribute to specify what will happen if number * of yes votes is the same as the number of no votes * defaults to true * * @param tiebreaker the value to give if there is a tie */	TokenNameCOMMENT_JAVADOC	 A attribute to specify what will happen if number of yes votes is the same as the number of no votes defaults to true * @param tiebreaker the value to give if there is a tie 
public	TokenNamepublic	
void	TokenNamevoid	
setAllowtie	TokenNameIdentifier	 set Allowtie
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tiebreaker	TokenNameIdentifier	 tiebreaker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allowtie	TokenNameIdentifier	 allowtie
=	TokenNameEQUAL	
tiebreaker	TokenNameIdentifier	 tiebreaker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true (the file is selected) if most of the other selectors * agree. In case of a tie, go by the allowtie setting. That defaults * to true, meaning in case of a tie, the file is selected. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object for the filename that the selector * can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 Returns true (the file is selected) if most of the other selectors agree. In case of a tie, go by the allowtie setting. That defaults to true, meaning in case of a tie, the file is selected. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object for the filename that the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yesvotes	TokenNameIdentifier	 yesvotes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
novotes	TokenNameIdentifier	 novotes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yesvotes	TokenNameIdentifier	 yesvotes
=	TokenNameEQUAL	
yesvotes	TokenNameIdentifier	 yesvotes
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
novotes	TokenNameIdentifier	 novotes
=	TokenNameEQUAL	
novotes	TokenNameIdentifier	 novotes
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yesvotes	TokenNameIdentifier	 yesvotes
>	TokenNameGREATER	
novotes	TokenNameIdentifier	 novotes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
novotes	TokenNameIdentifier	 novotes
>	TokenNameGREATER	
yesvotes	TokenNameIdentifier	 yesvotes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// At this point, we know we have a tie. 	TokenNameCOMMENT_LINE	At this point, we know we have a tie. 
return	TokenNamereturn	
allowtie	TokenNameIdentifier	 allowtie
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

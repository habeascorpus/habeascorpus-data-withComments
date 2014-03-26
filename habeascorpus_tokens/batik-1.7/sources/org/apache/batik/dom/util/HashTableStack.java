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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * This class represents a stack of HashTable objects. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: HashTableStack.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a stack of HashTable objects. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: HashTableStack.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
HashTableStack	TokenNameIdentifier	 Hash Table Stack
{	TokenNameLBRACE	
/** * The current link. */	TokenNameCOMMENT_JAVADOC	 The current link. 
protected	TokenNameprotected	
Link	TokenNameIdentifier	 Link
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new HashTableStack object. */	TokenNameCOMMENT_JAVADOC	 Creates a new HashTableStack object. 
public	TokenNamepublic	
HashTableStack	TokenNameIdentifier	 Hash Table Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Pushes a new table on the stack. */	TokenNameCOMMENT_JAVADOC	 Pushes a new table on the stack. 
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
pushCount	TokenNameIdentifier	 push Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the table on the top of the stack. */	TokenNameCOMMENT_JAVADOC	 Removes the table on the top of the stack. 
public	TokenNamepublic	
void	TokenNamevoid	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
pushCount	TokenNameIdentifier	 push Count
--	TokenNameMINUS_MINUS	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a mapping in the table on the top of the stack. */	TokenNameCOMMENT_JAVADOC	 Creates a mapping in the table on the top of the stack. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
pushCount	TokenNameIdentifier	 push Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
pushCount	TokenNameIdentifier	 push Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
defaultStr	TokenNameIdentifier	 default Str
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets an item in the table on the top of the stack. */	TokenNameCOMMENT_JAVADOC	 Gets an item in the table on the top of the stack. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
defaultStr	TokenNameIdentifier	 default Str
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To store the hashtables. */	TokenNameCOMMENT_JAVADOC	 To store the hashtables. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Link	TokenNameIdentifier	 Link
{	TokenNameLBRACE	
/** * The table. */	TokenNameCOMMENT_JAVADOC	 The table. 
public	TokenNamepublic	
HashTable	TokenNameIdentifier	 Hash Table
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** * The next link. */	TokenNameCOMMENT_JAVADOC	 The next link. 
public	TokenNamepublic	
Link	TokenNameIdentifier	 Link
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * The default namespace for this part of the stack. */	TokenNameCOMMENT_JAVADOC	 The default namespace for this part of the stack. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
defaultStr	TokenNameIdentifier	 default Str
;	TokenNameSEMICOLON	
/** * The count of pushes since this link was * added. */	TokenNameCOMMENT_JAVADOC	 The count of pushes since this link was added. 
public	TokenNamepublic	
int	TokenNameint	
pushCount	TokenNameIdentifier	 push Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new link. */	TokenNameCOMMENT_JAVADOC	 Creates a new link. 
public	TokenNamepublic	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defaultStr	TokenNameIdentifier	 default Str
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
defaultStr	TokenNameIdentifier	 default Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

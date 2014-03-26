package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Creates the same document each time {@link #getNextDocData(DocData)} is called. */	TokenNameCOMMENT_JAVADOC	 Creates the same document each time {@link #getNextDocData(DocData)} is called. 
public	TokenNamepublic	
class	TokenNameclass	
SingleDocSource	TokenNameIdentifier	 Single Doc Source
extends	TokenNameextends	
ContentSource	TokenNameIdentifier	 Content Source
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOC_TEXT	TokenNameIdentifier	 DOC  TEXT
=	TokenNameEQUAL	
"Well, this is just some plain text we use for creating the "	TokenNameStringLiteral	Well, this is just some plain text we use for creating the 
+	TokenNamePLUS	
"test documents. It used to be a text from an online collection "	TokenNameStringLiteral	test documents. It used to be a text from an online collection 
+	TokenNamePLUS	
"devoted to first aid, but if there was there an (online) lawyers "	TokenNameStringLiteral	devoted to first aid, but if there was there an (online) lawyers 
+	TokenNamePLUS	
"first aid collection with legal advices, "it" might have quite "	TokenNameStringLiteral	first aid collection with legal advices, "it" might have quite 
+	TokenNamePLUS	
"probably advised one not to include "it"'s text or the text of "	TokenNameStringLiteral	probably advised one not to include "it"'s text or the text of 
+	TokenNamePLUS	
"any other online collection in one's code, unless one has money "	TokenNameStringLiteral	any other online collection in one's code, unless one has money 
+	TokenNamePLUS	
"that one don't need and one is happy to donate for lawyers "	TokenNameStringLiteral	that one don't need and one is happy to donate for lawyers 
+	TokenNamePLUS	
"charity. Anyhow at some point, rechecking the usage of this text, "	TokenNameStringLiteral	charity. Anyhow at some point, rechecking the usage of this text, 
+	TokenNamePLUS	
"it became uncertain that this text is free to use, because "	TokenNameStringLiteral	it became uncertain that this text is free to use, because 
+	TokenNamePLUS	
"the web site in the disclaimer of he eBook containing that text "	TokenNameStringLiteral	the web site in the disclaimer of he eBook containing that text 
+	TokenNamePLUS	
"was not responding anymore, and at the same time, in projGut, "	TokenNameStringLiteral	was not responding anymore, and at the same time, in projGut, 
+	TokenNamePLUS	
"searching for first aid no longer found that eBook as well. "	TokenNameStringLiteral	searching for first aid no longer found that eBook as well. 
+	TokenNamePLUS	
"So here we are, with a perhaps much less interesting "	TokenNameStringLiteral	So here we are, with a perhaps much less interesting 
+	TokenNamePLUS	
"text for the test, but oh much much safer. "	TokenNameStringLiteral	text for the test, but oh much much safer. 
;	TokenNameSEMICOLON	
// return a new docid 	TokenNameCOMMENT_LINE	return a new docid 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
int	TokenNameint	
newdocid	TokenNameIdentifier	 newdocid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
forever	TokenNameIdentifier	 forever
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocData	TokenNameIdentifier	 Doc Data
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
{	TokenNameLBRACE	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
newdocid	TokenNameIdentifier	 newdocid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBytes	TokenNameIdentifier	 add Bytes
(	TokenNameLPAREN	
DOC_TEXT	TokenNameIdentifier	 DOC  TEXT
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"doc"	TokenNameStringLiteral	doc
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setBody	TokenNameIdentifier	 set Body
(	TokenNameLPAREN	
DOC_TEXT	TokenNameIdentifier	 DOC  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docData	TokenNameIdentifier	 doc Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

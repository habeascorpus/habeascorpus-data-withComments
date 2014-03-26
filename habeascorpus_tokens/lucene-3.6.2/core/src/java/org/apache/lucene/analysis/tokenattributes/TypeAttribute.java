package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * A Token's lexical type. The Default value is "word". */	TokenNameCOMMENT_JAVADOC	 A Token's lexical type. The Default value is "word". 
public	TokenNamepublic	
interface	TokenNameinterface	
TypeAttribute	TokenNameIdentifier	 Type Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** the default type */	TokenNameCOMMENT_JAVADOC	 the default type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
=	TokenNameEQUAL	
"word"	TokenNameStringLiteral	word
;	TokenNameSEMICOLON	
/** Returns this Token's lexical type. Defaults to "word". */	TokenNameCOMMENT_JAVADOC	 Returns this Token's lexical type. Defaults to "word". 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the lexical type. @see #type() */	TokenNameCOMMENT_JAVADOC	 Set the lexical type. @see #type() 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

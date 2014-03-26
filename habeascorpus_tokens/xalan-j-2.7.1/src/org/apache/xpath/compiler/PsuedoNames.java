/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: PsuedoNames.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: PsuedoNames.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
/** * This is used to represent names of nodes that may not be named, like a * comment node. */	TokenNameCOMMENT_JAVADOC	 This is used to represent names of nodes that may not be named, like a comment node. 
public	TokenNamepublic	
class	TokenNameclass	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
{	TokenNameLBRACE	
/** * Psuedo name for a wild card pattern ('*'). */	TokenNameCOMMENT_JAVADOC	 Psuedo name for a wild card pattern ('*'). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
/** * Psuedo name for the root node. */	TokenNameCOMMENT_JAVADOC	 Psuedo name for the root node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_ROOT	TokenNameIdentifier	 PSEUDONAME  ROOT
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
/** * Psuedo name for a text node. */	TokenNameCOMMENT_JAVADOC	 Psuedo name for a text node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_TEXT	TokenNameIdentifier	 PSEUDONAME  TEXT
=	TokenNameEQUAL	
"#text"	TokenNameStringLiteral	#text
;	TokenNameSEMICOLON	
/** * Psuedo name for a comment node. */	TokenNameCOMMENT_JAVADOC	 Psuedo name for a comment node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_COMMENT	TokenNameIdentifier	 PSEUDONAME  COMMENT
=	TokenNameEQUAL	
"#comment"	TokenNameStringLiteral	#comment
;	TokenNameSEMICOLON	
/** * Psuedo name for a processing instruction node. */	TokenNameCOMMENT_JAVADOC	 Psuedo name for a processing instruction node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_PI	TokenNameIdentifier	 PSEUDONAME  PI
=	TokenNameEQUAL	
"#pi"	TokenNameStringLiteral	#pi
;	TokenNameSEMICOLON	
/** * Psuedo name for an unknown type value. */	TokenNameCOMMENT_JAVADOC	 Psuedo name for an unknown type value. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSEUDONAME_OTHER	TokenNameIdentifier	 PSEUDONAME  OTHER
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

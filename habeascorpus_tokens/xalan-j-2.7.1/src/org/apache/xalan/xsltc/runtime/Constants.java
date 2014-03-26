/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Constants.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Constants.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
/** * This class defines constants used by both the compiler and the * runtime system. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 This class defines constants used by both the compiler and the runtime system. @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ROOT	TokenNameIdentifier	 ROOT
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ROOT_NODE	TokenNameIdentifier	 ROOT  NODE
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ELEMENT	TokenNameIdentifier	 ELEMENT
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
PROCESSING_INSTRUCTION	TokenNameIdentifier	 PROCESSING  INSTRUCTION
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLT_URI	TokenNameIdentifier	 XSLT  URI
=	TokenNameEQUAL	
"http://www.w3.org/1999/XSL/Transform"	TokenNameStringLiteral	http://www.w3.org/1999/XSL/Transform
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_FEATURE	TokenNameIdentifier	 NAMESPACE  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_PREFIX	TokenNameIdentifier	 XMLNS  PREFIX
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_STRING	TokenNameIdentifier	 XMLNS  STRING
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
=	TokenNameEQUAL	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

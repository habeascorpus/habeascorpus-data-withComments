/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Comment	TokenNameIdentifier	 Comment
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * * @version $Id: CommentImpl.java 730471 2008-12-31 20:45:32Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland * @version $Id: CommentImpl.java 730471 2008-12-31 20:45:32Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CommentImpl	TokenNameIdentifier	 Comment Impl
extends	TokenNameextends	
XMLEventImpl	TokenNameIdentifier	 XML Event Impl
implements	TokenNameimplements	
Comment	TokenNameIdentifier	 Comment
{	TokenNameLBRACE	
/** * The text of the comment. Will be the empty string if there's no * body text in the comment. */	TokenNameCOMMENT_JAVADOC	 The text of the comment. Will be the empty string if there's no body text in the comment. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fText	TokenNameIdentifier	 f Text
;	TokenNameSEMICOLON	
/** * @param location */	TokenNameCOMMENT_JAVADOC	 @param location 
public	TokenNamepublic	
CommentImpl	TokenNameIdentifier	 Comment Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
COMMENT	TokenNameIdentifier	 COMMENT
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fText	TokenNameIdentifier	 f Text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
text	TokenNameIdentifier	 text
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.Comment#getText() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.Comment#getText() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fText	TokenNameIdentifier	 f Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fText	TokenNameIdentifier	 f Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
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
/** * <p>An immutable StAX <code>Location</code>.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: ImmutableLocation.java 730445 2008-12-31 19:12:02Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An immutable StAX <code>Location</code>.</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: ImmutableLocation.java 730445 2008-12-31 19:12:02Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ImmutableLocation	TokenNameIdentifier	 Immutable Location
implements	TokenNameimplements	
Location	TokenNameIdentifier	 Location
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fCharacterOffset	TokenNameIdentifier	 f Character Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fColumnNumber	TokenNameIdentifier	 f Column Number
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fLineNumber	TokenNameIdentifier	 f Line Number
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fSystemId	TokenNameIdentifier	 f System Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ImmutableLocation	TokenNameIdentifier	 Immutable Location
(	TokenNameLPAREN	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ImmutableLocation	TokenNameIdentifier	 Immutable Location
(	TokenNameLPAREN	
int	TokenNameint	
characterOffset	TokenNameIdentifier	 character Offset
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharacterOffset	TokenNameIdentifier	 f Character Offset
=	TokenNameEQUAL	
characterOffset	TokenNameIdentifier	 character Offset
;	TokenNameSEMICOLON	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCharacterOffset	TokenNameIdentifier	 f Character Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fColumnNumber	TokenNameIdentifier	 f Column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLineNumber	TokenNameIdentifier	 f Line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSystemId	TokenNameIdentifier	 f System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

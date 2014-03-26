/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLTableColElement	TokenNameIdentifier	 HTML Table Col Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLTableColElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLTableColElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLTableColElementImpl	TokenNameIdentifier	 HTML Table Col Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLTableColElement	TokenNameIdentifier	 HTML Table Col Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6189626162811911792L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"align"	TokenNameStringLiteral	align
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAlign	TokenNameIdentifier	 set Align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"align"	TokenNameStringLiteral	align
,	TokenNameCOMMA	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCh	TokenNameIdentifier	 get Ch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
// Make sure that the access key is a single character. 	TokenNameCOMMENT_LINE	Make sure that the access key is a single character. 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"char"	TokenNameStringLiteral	char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCh	TokenNameIdentifier	 set Ch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure that the access key is a single character. 	TokenNameCOMMENT_LINE	Make sure that the access key is a single character. 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"char"	TokenNameStringLiteral	char
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getChOff	TokenNameIdentifier	 get Ch Off
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"charoff"	TokenNameStringLiteral	charoff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setChOff	TokenNameIdentifier	 set Ch Off
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chOff	TokenNameIdentifier	 ch Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"charoff"	TokenNameStringLiteral	charoff
,	TokenNameCOMMA	
chOff	TokenNameIdentifier	 ch Off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSpan	TokenNameIdentifier	 get Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"span"	TokenNameStringLiteral	span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSpan	TokenNameIdentifier	 set Span
(	TokenNameLPAREN	
int	TokenNameint	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"span"	TokenNameStringLiteral	span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVAlign	TokenNameIdentifier	 get V Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"valign"	TokenNameStringLiteral	valign
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVAlign	TokenNameIdentifier	 set V Align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
vAlign	TokenNameIdentifier	 v Align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"valign"	TokenNameStringLiteral	valign
,	TokenNameCOMMA	
vAlign	TokenNameIdentifier	 v Align
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"width"	TokenNameStringLiteral	width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"width"	TokenNameStringLiteral	width
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLTableColElementImpl	TokenNameIdentifier	 HTML Table Col Element Impl
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

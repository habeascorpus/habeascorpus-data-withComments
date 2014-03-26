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
Node	TokenNameIdentifier	 Node
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
HTMLTableCellElement	TokenNameIdentifier	 HTML Table Cell Element
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
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLTableCellElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLTableCellElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLTableCellElementImpl	TokenNameIdentifier	 HTML Table Cell Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLTableCellElement	TokenNameIdentifier	 HTML Table Cell Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2406518157464313922L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getCellIndex	TokenNameIdentifier	 get Cell Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
HTMLTableCellElement	TokenNameIdentifier	 HTML Table Cell Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCellIndex	TokenNameIdentifier	 set Cell Index
(	TokenNameLPAREN	
int	TokenNameint	
cellIndex	TokenNameIdentifier	 cell Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
HTMLTableCellElement	TokenNameIdentifier	 HTML Table Cell Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cellIndex	TokenNameIdentifier	 cell Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
cellIndex	TokenNameIdentifier	 cell Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAbbr	TokenNameIdentifier	 get Abbr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"abbr"	TokenNameStringLiteral	abbr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAbbr	TokenNameIdentifier	 set Abbr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
abbr	TokenNameIdentifier	 abbr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"abbr"	TokenNameStringLiteral	abbr
,	TokenNameCOMMA	
abbr	TokenNameIdentifier	 abbr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"axis"	TokenNameStringLiteral	axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAxis	TokenNameIdentifier	 set Axis
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"axis"	TokenNameStringLiteral	axis
,	TokenNameCOMMA	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBgColor	TokenNameIdentifier	 get Bg Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"bgcolor"	TokenNameStringLiteral	bgcolor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBgColor	TokenNameIdentifier	 set Bg Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bgColor	TokenNameIdentifier	 bg Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"bgcolor"	TokenNameStringLiteral	bgcolor
,	TokenNameCOMMA	
bgColor	TokenNameIdentifier	 bg Color
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
getColSpan	TokenNameIdentifier	 get Col Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"colspan"	TokenNameStringLiteral	colspan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setColSpan	TokenNameIdentifier	 set Col Span
(	TokenNameLPAREN	
int	TokenNameint	
colspan	TokenNameIdentifier	 colspan
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"colspan"	TokenNameStringLiteral	colspan
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
colspan	TokenNameIdentifier	 colspan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHeaders	TokenNameIdentifier	 get Headers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"headers"	TokenNameStringLiteral	headers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHeaders	TokenNameIdentifier	 set Headers
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
headers	TokenNameIdentifier	 headers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"headers"	TokenNameStringLiteral	headers
,	TokenNameCOMMA	
headers	TokenNameIdentifier	 headers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"height"	TokenNameStringLiteral	height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"height"	TokenNameStringLiteral	height
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getNoWrap	TokenNameIdentifier	 get No Wrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"nowrap"	TokenNameStringLiteral	nowrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNoWrap	TokenNameIdentifier	 set No Wrap
(	TokenNameLPAREN	
boolean	TokenNameboolean	
noWrap	TokenNameIdentifier	 no Wrap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"nowrap"	TokenNameStringLiteral	nowrap
,	TokenNameCOMMA	
noWrap	TokenNameIdentifier	 no Wrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRowSpan	TokenNameIdentifier	 get Row Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"rowspan"	TokenNameStringLiteral	rowspan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRowSpan	TokenNameIdentifier	 set Row Span
(	TokenNameLPAREN	
int	TokenNameint	
rowspan	TokenNameIdentifier	 rowspan
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"rowspan"	TokenNameStringLiteral	rowspan
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
rowspan	TokenNameIdentifier	 rowspan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"scope"	TokenNameStringLiteral	scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"scope"	TokenNameStringLiteral	scope
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
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
HTMLTableCellElementImpl	TokenNameIdentifier	 HTML Table Cell Element Impl
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

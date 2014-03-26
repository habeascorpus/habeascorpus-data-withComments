/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This class represents a @import CSS rule. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ImportRule.java 578680 2007-09-24 07:20:03Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a @import CSS rule. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ImportRule.java 578680 2007-09-24 07:20:03Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ImportRule	TokenNameIdentifier	 Import Rule
extends	TokenNameextends	
MediaRule	TokenNameIdentifier	 Media Rule
{	TokenNameLBRACE	
/** * The type constant. */	TokenNameCOMMENT_JAVADOC	 The type constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE	TokenNameIdentifier	 TYPE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The URI of the imported stylesheet. */	TokenNameCOMMENT_JAVADOC	 The URI of the imported stylesheet. 
protected	TokenNameprotected	
ParsedURL	TokenNameIdentifier	 Parsed URL
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * Returns a constant identifying the rule type. */	TokenNameCOMMENT_JAVADOC	 Returns a constant identifying the rule type. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TYPE	TokenNameIdentifier	 TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the URI of the imported stylesheet. */	TokenNameCOMMENT_JAVADOC	 Sets the URI of the imported stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of the imported stylesheet. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the imported stylesheet. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this import rule. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this import rule. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@import ""	TokenNameStringLiteral	@import "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mediaList	TokenNameIdentifier	 media List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mediaList	TokenNameIdentifier	 media List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mediaList	TokenNameIdentifier	 media List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

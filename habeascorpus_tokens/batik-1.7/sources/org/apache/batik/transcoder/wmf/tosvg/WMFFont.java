/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
/** * Represent a WMF Font, encountered in a Metafile. * * @version $Id: WMFFont.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Represent a WMF Font, encountered in a Metafile. * @version $Id: WMFFont.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
WMFFont	TokenNameIdentifier	 WMF Font
{	TokenNameLBRACE	
public	TokenNamepublic	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
underline	TokenNameIdentifier	 underline
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
strikeOut	TokenNameIdentifier	 strike Out
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
italic	TokenNameIdentifier	 italic
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
orientation	TokenNameIdentifier	 orientation
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
escape	TokenNameIdentifier	 escape
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WMFFont	TokenNameIdentifier	 WMF Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
int	TokenNameint	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WMFFont	TokenNameIdentifier	 WMF Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
int	TokenNameint	
charset	TokenNameIdentifier	 charset
,	TokenNameCOMMA	
int	TokenNameint	
underline	TokenNameIdentifier	 underline
,	TokenNameCOMMA	
int	TokenNameint	
strikeOut	TokenNameIdentifier	 strike Out
,	TokenNameCOMMA	
int	TokenNameint	
italic	TokenNameIdentifier	 italic
,	TokenNameCOMMA	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
orient	TokenNameIdentifier	 orient
,	TokenNameCOMMA	
int	TokenNameint	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underline	TokenNameIdentifier	 underline
=	TokenNameEQUAL	
underline	TokenNameIdentifier	 underline
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikeOut	TokenNameIdentifier	 strike Out
=	TokenNameEQUAL	
strikeOut	TokenNameIdentifier	 strike Out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
italic	TokenNameIdentifier	 italic
=	TokenNameEQUAL	
italic	TokenNameIdentifier	 italic
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
orientation	TokenNameIdentifier	 orientation
=	TokenNameEQUAL	
orient	TokenNameIdentifier	 orient
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
escape	TokenNameIdentifier	 escape
=	TokenNameEQUAL	
escape	TokenNameIdentifier	 escape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

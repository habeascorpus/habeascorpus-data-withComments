/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
rasterizer	TokenNameIdentifier	 rasterizer
;	TokenNameSEMICOLON	
/** * Describes an error condition in <tt>SVGConverter</tt> * * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: SVGConverterException.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Describes an error condition in <tt>SVGConverter</tt> * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: SVGConverterException.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/** * Error code */	TokenNameCOMMENT_JAVADOC	 Error code 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
;	TokenNameSEMICOLON	
/** * Additional information about the error condition */	TokenNameCOMMENT_JAVADOC	 Additional information about the error condition 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorInfo	TokenNameIdentifier	 error Info
;	TokenNameSEMICOLON	
/** * Defines whether or not this is a fatal error condition */	TokenNameCOMMENT_JAVADOC	 Defines whether or not this is a fatal error condition 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isFatal	TokenNameIdentifier	 is Fatal
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorInfo	TokenNameIdentifier	 error Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
errorInfo	TokenNameIdentifier	 error Info
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorInfo	TokenNameIdentifier	 error Info
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFatal	TokenNameIdentifier	 is Fatal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorCode	TokenNameIdentifier	 error Code
=	TokenNameEQUAL	
errorCode	TokenNameIdentifier	 error Code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
errorInfo	TokenNameIdentifier	 error Info
=	TokenNameEQUAL	
errorInfo	TokenNameIdentifier	 error Info
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isFatal	TokenNameIdentifier	 is Fatal
=	TokenNameEQUAL	
isFatal	TokenNameIdentifier	 is Fatal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFatal	TokenNameIdentifier	 is Fatal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
isFatal	TokenNameIdentifier	 is Fatal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFatal	TokenNameIdentifier	 is Fatal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isFatal	TokenNameIdentifier	 is Fatal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
errorInfo	TokenNameIdentifier	 error Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getErrorCode	TokenNameIdentifier	 get Error Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorCode	TokenNameIdentifier	 error Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

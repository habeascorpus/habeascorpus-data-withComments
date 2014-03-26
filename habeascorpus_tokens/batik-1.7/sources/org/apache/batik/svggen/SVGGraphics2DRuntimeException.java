/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
/** * Thrown when an SVG Generator method receives an illegal argument in parameter. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: SVGGraphics2DRuntimeException.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Thrown when an SVG Generator method receives an illegal argument in parameter. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: SVGGraphics2DRuntimeException.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** The enclosed exception. */	TokenNameCOMMENT_JAVADOC	 The enclosed exception. 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
embedded	TokenNameIdentifier	 embedded
;	TokenNameSEMICOLON	
/** * Constructs a new <code>SVGGraphics2DRuntimeException</code> with the * specified detail message. * @param s the detail message of this exception */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>SVGGraphics2DRuntimeException</code> with the specified detail message. @param s the detail message of this exception 
public	TokenNamepublic	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <code>SVGGraphics2DRuntimeException</code> with the * specified detail message. * @param ex the enclosed exception */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>SVGGraphics2DRuntimeException</code> with the specified detail message. @param ex the enclosed exception 
public	TokenNamepublic	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <code>SVGGraphics2DRuntimeException</code> with the * specified detail message. * @param s the detail message of this exception * @param ex the original exception */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>SVGGraphics2DRuntimeException</code> with the specified detail message. @param s the detail message of this exception @param ex the original exception 
public	TokenNamepublic	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
embedded	TokenNameIdentifier	 embedded
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the message of this exception. If an error message has * been specified, returns that one. Otherwise, return the error message * of enclosed exception or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the message of this exception. If an error message has been specified, returns that one. Otherwise, return the error message of enclosed exception or null if any. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
embedded	TokenNameIdentifier	 embedded
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
embedded	TokenNameIdentifier	 embedded
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the original enclosed exception or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the original enclosed exception or null if any. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
embedded	TokenNameIdentifier	 embedded
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

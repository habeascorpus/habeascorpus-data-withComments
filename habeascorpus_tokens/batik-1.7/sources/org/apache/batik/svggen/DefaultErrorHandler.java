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
/** * The <code>ErrorHandler</code> interface allows you to specialize * how the error will be set on an SVG <code>Element</code>. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: DefaultErrorHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 The <code>ErrorHandler</code> interface allows you to specialize how the error will be set on an SVG <code>Element</code>. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: DefaultErrorHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
/** * This method handles the <code>SVGGraphics2DIOException</code>. The default * implementation re-throws the exception. */	TokenNameCOMMENT_JAVADOC	 This method handles the <code>SVGGraphics2DIOException</code>. The default implementation re-throws the exception. 
public	TokenNamepublic	
void	TokenNamevoid	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method handles the <code>SVGGraphics2DRuntimeException</code>. * The default implementation print the exception message. */	TokenNameCOMMENT_JAVADOC	 This method handles the <code>SVGGraphics2DRuntimeException</code>. The default implementation print the exception message. 
public	TokenNamepublic	
void	TokenNamevoid	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

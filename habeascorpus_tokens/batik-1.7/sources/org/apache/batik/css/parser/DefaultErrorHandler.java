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
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
CSSParseException	TokenNameIdentifier	 CSS Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
/** * This class provides a default implementation of the * {@link ErrorHandler} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultErrorHandler.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a default implementation of the {@link ErrorHandler} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultErrorHandler.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
/** * The instance of this class. */	TokenNameCOMMENT_JAVADOC	 The instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ErrorHandler	TokenNameIdentifier	 Error Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {ErrorHandler#warning(CSSParseException)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {ErrorHandler#warning(CSSParseException)}. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
CSSParseException	TokenNameIdentifier	 CSS Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {ErrorHandler#error(CSSParseException)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {ErrorHandler#error(CSSParseException)}. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
CSSParseException	TokenNameIdentifier	 CSS Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {ErrorHandler#fatalError(CSSParseException)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {ErrorHandler#fatalError(CSSParseException)}. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
CSSParseException	TokenNameIdentifier	 CSS Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

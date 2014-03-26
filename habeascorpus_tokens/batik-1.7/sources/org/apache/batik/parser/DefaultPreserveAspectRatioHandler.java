/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * This class provides an adapter for PreserveAspectRatioHandler. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultPreserveAspectRatioHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an adapter for PreserveAspectRatioHandler. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultPreserveAspectRatioHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
implements	TokenNameimplements	
PreserveAspectRatioHandler	TokenNameIdentifier	 Preserve Aspect Ratio Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PreserveAspectRatioHandler	TokenNameIdentifier	 Preserve Aspect Ratio Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link * PreserveAspectRatioHandler#startPreserveAspectRatio()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#startPreserveAspectRatio()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPreserveAspectRatio	TokenNameIdentifier	 start Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#none()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#none()}. 
public	TokenNamepublic	
void	TokenNamevoid	
none	TokenNameIdentifier	 none
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMaxYMax()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMaxYMax()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMax	TokenNameIdentifier	 x Max Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMaxYMid()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMaxYMid()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMid	TokenNameIdentifier	 x Max Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMaxYMin()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMaxYMin()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMin	TokenNameIdentifier	 x Max Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMidYMax()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMidYMax()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMax	TokenNameIdentifier	 x Mid Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMidYMid()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMidYMid()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMid	TokenNameIdentifier	 x Mid Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMidYMin()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMidYMin()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMin	TokenNameIdentifier	 x Mid Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMinYMax()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMinYMax()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMax	TokenNameIdentifier	 x Min Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMinYMid()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMinYMid()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMid	TokenNameIdentifier	 x Min Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#xMinYMin()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#xMinYMin()}. 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMin	TokenNameIdentifier	 x Min Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#meet()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#meet()}. 
public	TokenNamepublic	
void	TokenNamevoid	
meet	TokenNameIdentifier	 meet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#slice()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#slice()}. 
public	TokenNamepublic	
void	TokenNamevoid	
slice	TokenNameIdentifier	 slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PreserveAspectRatioHandler#endPreserveAspectRatio()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PreserveAspectRatioHandler#endPreserveAspectRatio()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPreserveAspectRatio	TokenNameIdentifier	 end Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

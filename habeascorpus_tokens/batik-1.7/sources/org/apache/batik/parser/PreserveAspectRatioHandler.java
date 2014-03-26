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
/** * This interface must be implemented and then registred as the * handler of a <code>PreserveAspectRatioParser</code> instance in order to * be notified of parsing events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: PreserveAspectRatioHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registred as the handler of a <code>PreserveAspectRatioParser</code> instance in order to be notified of parsing events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: PreserveAspectRatioHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
PreserveAspectRatioHandler	TokenNameIdentifier	 Preserve Aspect Ratio Handler
{	TokenNameLBRACE	
/** * Invoked when the PreserveAspectRatio parsing starts. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when the PreserveAspectRatio parsing starts. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
startPreserveAspectRatio	TokenNameIdentifier	 start Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'none' been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'none' been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
none	TokenNameIdentifier	 none
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMaxYMax' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMax' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMaxYMax	TokenNameIdentifier	 x Max Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMaxYMid' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMid' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMaxYMid	TokenNameIdentifier	 x Max Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMaxYMin' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMin' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMaxYMin	TokenNameIdentifier	 x Max Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMidYMax' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMax' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMidYMax	TokenNameIdentifier	 x Mid Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMidYMid' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMid' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMidYMid	TokenNameIdentifier	 x Mid Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMidYMin' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMin' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMidYMin	TokenNameIdentifier	 x Mid Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMinYMax' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMax' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMinYMax	TokenNameIdentifier	 x Min Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMinYMid' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMid' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMinYMid	TokenNameIdentifier	 x Min Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'xMinYMin' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMin' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
xMinYMin	TokenNameIdentifier	 x Min Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'meet' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'meet' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
meet	TokenNameIdentifier	 meet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'slice' has been parsed. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when 'slice' has been parsed. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
slice	TokenNameIdentifier	 slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the PreserveAspectRatio parsing ends. * @exception ParseException if an error occured while processing * the PreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Invoked when the PreserveAspectRatio parsing ends. @exception ParseException if an error occured while processing the PreserveAspectRatio 
void	TokenNamevoid	
endPreserveAspectRatio	TokenNameIdentifier	 end Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

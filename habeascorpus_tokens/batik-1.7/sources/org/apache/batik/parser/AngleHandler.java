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
/** * This interface must be implemented and then registred as the * handler of a <code>AngleParser</code> instance in order to be * notified of parsing events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AngleHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registred as the handler of a <code>AngleParser</code> instance in order to be notified of parsing events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AngleHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
AngleHandler	TokenNameIdentifier	 Angle Handler
{	TokenNameLBRACE	
/** * Invoked when the angle attribute parsing starts. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when the angle attribute parsing starts. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
startAngle	TokenNameIdentifier	 start Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a float value has been parsed. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when a float value has been parsed. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
angleValue	TokenNameIdentifier	 angle Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'deg' has been parsed. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when 'deg' has been parsed. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
deg	TokenNameIdentifier	 deg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'grad' has been parsed. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when 'grad' has been parsed. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
grad	TokenNameIdentifier	 grad
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'rad' has been parsed. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when 'rad' has been parsed. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the angle attribute parsing ends. * @exception ParseException if an error occured while processing the angle */	TokenNameCOMMENT_JAVADOC	 Invoked when the angle attribute parsing ends. @exception ParseException if an error occured while processing the angle 
void	TokenNamevoid	
endAngle	TokenNameIdentifier	 end Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

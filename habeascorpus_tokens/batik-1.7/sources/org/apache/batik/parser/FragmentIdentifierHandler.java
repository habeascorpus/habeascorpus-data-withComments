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
/** * This interface must be implemented and then registred as the * handler of a <code>PreserveAspectRatioParser</code> instance * in order to be notified of parsing events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: FragmentIdentifierHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registred as the handler of a <code>PreserveAspectRatioParser</code> instance in order to be notified of parsing events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: FragmentIdentifierHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
extends	TokenNameextends	
PreserveAspectRatioHandler	TokenNameIdentifier	 Preserve Aspect Ratio Handler
,	TokenNameCOMMA	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
{	TokenNameLBRACE	
/** * Invoked when the fragment identifier starts. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when the fragment identifier starts. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
startFragmentIdentifier	TokenNameIdentifier	 start Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when an ID has been parsed. * @param s The string that represents the parsed ID. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when an ID has been parsed. @param s The string that represents the parsed ID. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
idReference	TokenNameIdentifier	 id Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when 'viewBox(x,y,width,height)' has been parsed. * @param x x coordinate of the viewbox * @param y y coordinate of the viewbox * @param width width of the viewbox * @param height height of the viewbox * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when 'viewBox(x,y,width,height)' has been parsed. @param x x coordinate of the viewbox @param y y coordinate of the viewbox @param width width of the viewbox @param height height of the viewbox @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
viewBox	TokenNameIdentifier	 view Box
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a view target specification starts. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a view target specification starts. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
startViewTarget	TokenNameIdentifier	 start View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a identifier has been parsed within a view target * specification. * @param name the target name. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a identifier has been parsed within a view target specification. @param name the target name. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
viewTarget	TokenNameIdentifier	 view Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a view target specification ends. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a view target specification ends. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
endViewTarget	TokenNameIdentifier	 end View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a 'zoomAndPan' specification has been parsed. * @param magnify true if 'magnify' has been parsed. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when a 'zoomAndPan' specification has been parsed. @param magnify true if 'magnify' has been parsed. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
zoomAndPan	TokenNameIdentifier	 zoom And Pan
(	TokenNameLPAREN	
boolean	TokenNameboolean	
magnify	TokenNameIdentifier	 magnify
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when the fragment identifier ends. * @exception ParseException if an error occured while processing the * fragment identifier */	TokenNameCOMMENT_JAVADOC	 Invoked when the fragment identifier ends. @exception ParseException if an error occured while processing the fragment identifier 
void	TokenNamevoid	
endFragmentIdentifier	TokenNameIdentifier	 end Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

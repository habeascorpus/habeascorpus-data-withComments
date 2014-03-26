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
/** * An handler interface for parsing NumberLists. * * @author tonny@kiyut.com * @version $Id: NumberListHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An handler interface for parsing NumberLists. * @author tonny@kiyut.com @version $Id: NumberListHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
NumberListHandler	TokenNameIdentifier	 Number List Handler
{	TokenNameLBRACE	
/** * Invoked when the number list attribute starts. * @exception ParseException if an error occures while processing the * number list. */	TokenNameCOMMENT_JAVADOC	 Invoked when the number list attribute starts. @exception ParseException if an error occures while processing the number list. 
void	TokenNamevoid	
startNumberList	TokenNameIdentifier	 start Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the number list attribute ends. * @exception ParseException if an error occures while processing the * number list. */	TokenNameCOMMENT_JAVADOC	 Invoked when the number list attribute ends. @exception ParseException if an error occures while processing the number list. 
void	TokenNamevoid	
endNumberList	TokenNameIdentifier	 end Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the number attribute starts. * @exception ParseException if an error occures while processing * the number */	TokenNameCOMMENT_JAVADOC	 Invoked when the number attribute starts. @exception ParseException if an error occures while processing the number 
void	TokenNamevoid	
startNumber	TokenNameIdentifier	 start Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when the number attribute ends. * @exception ParseException if an error occures while processing * the number */	TokenNameCOMMENT_JAVADOC	 Invoked when the number attribute ends. @exception ParseException if an error occures while processing the number 
void	TokenNamevoid	
endNumber	TokenNameIdentifier	 end Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Invoked when a float value has been parsed. * @exception ParseException if an error occures while processing * the number */	TokenNameCOMMENT_JAVADOC	 Invoked when a float value has been parsed. @exception ParseException if an error occures while processing the number 
void	TokenNamevoid	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

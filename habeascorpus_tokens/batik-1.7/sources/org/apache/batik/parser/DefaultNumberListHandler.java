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
/** * * @author tonny@kiyut.com * @version $Id: DefaultNumberListHandler.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @author tonny@kiyut.com @version $Id: DefaultNumberListHandler.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
implements	TokenNameimplements	
NumberListHandler	TokenNameIdentifier	 Number List Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
NumberListHandler	TokenNameIdentifier	 Number List Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#startNumberList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#startNumberList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startNumberList	TokenNameIdentifier	 start Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#endNumberList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#endNumberList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endNumberList	TokenNameIdentifier	 end Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#startNumber()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#startNumber()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startNumber	TokenNameIdentifier	 start Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#numberValue(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#numberValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#endNumber()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#endNumber()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endNumber	TokenNameIdentifier	 end Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

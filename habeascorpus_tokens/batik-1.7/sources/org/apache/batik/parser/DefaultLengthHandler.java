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
/** * This class provides an adapter for LengthHandler * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultLengthHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an adapter for LengthHandler * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultLengthHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultLengthHandler	TokenNameIdentifier	 Default Length Handler
implements	TokenNameimplements	
LengthHandler	TokenNameIdentifier	 Length Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LengthHandler	TokenNameIdentifier	 Length Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultLengthHandler	TokenNameIdentifier	 Default Length Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultLengthHandler	TokenNameIdentifier	 Default Length Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#startLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#startLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startLength	TokenNameIdentifier	 start Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#lengthValue(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#lengthValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
lengthValue	TokenNameIdentifier	 length Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#em()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#em()}. 
public	TokenNamepublic	
void	TokenNamevoid	
em	TokenNameIdentifier	 em
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#ex()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#ex()}. 
public	TokenNamepublic	
void	TokenNamevoid	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#in()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#in()}. 
public	TokenNamepublic	
void	TokenNamevoid	
in	TokenNameIdentifier	 in
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#cm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#cm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
cm	TokenNameIdentifier	 cm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#mm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#mm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
mm	TokenNameIdentifier	 mm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pc()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pc()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pc	TokenNameIdentifier	 pc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pt()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pt()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#px()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#px()}. 
public	TokenNamepublic	
void	TokenNamevoid	
px	TokenNameIdentifier	 px
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#percentage()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#percentage()}. 
public	TokenNamepublic	
void	TokenNamevoid	
percentage	TokenNameIdentifier	 percentage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#endLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#endLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endLength	TokenNameIdentifier	 end Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

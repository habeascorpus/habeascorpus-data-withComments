/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * The constant pool entry subclass used to represent double constant * values. * */	TokenNameCOMMENT_JAVADOC	 The constant pool entry subclass used to represent double constant values. 
public	TokenNamepublic	
class	TokenNameclass	
DoubleCPInfo	TokenNameIdentifier	 Double CP Info
extends	TokenNameextends	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
{	TokenNameLBRACE	
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
DoubleCPInfo	TokenNameIdentifier	 Double CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CONSTANT_DOUBLE	TokenNameIdentifier	 CONSTANT  DOUBLE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * read a constant pool entry from a class stream. * * @param cpStream the DataInputStream which contains the constant pool * entry to be read. * @exception IOException if there is a problem reading the entry from the * stream. */	TokenNameCOMMENT_JAVADOC	 read a constant pool entry from a class stream. * @param cpStream the DataInputStream which contains the constant pool entry to be read. @exception IOException if there is a problem reading the entry from the stream. 
public	TokenNamepublic	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
cpStream	TokenNameIdentifier	 cp Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
cpStream	TokenNameIdentifier	 cp Stream
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print a readable version of the constant pool entry. * * @return the string representation of this constant pool entry. */	TokenNameCOMMENT_JAVADOC	 Print a readable version of the constant pool entry. * @return the string representation of this constant pool entry. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Double Constant Pool Entry: "	TokenNameStringLiteral	Double Constant Pool Entry: 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

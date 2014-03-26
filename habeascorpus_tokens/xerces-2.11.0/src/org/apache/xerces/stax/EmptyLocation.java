/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
/** * <p>Location which always returns <code>-1</code> * and <code>null</code> from its methods.</p> * * @xerces.internal * * @version $Id: EmptyLocation.java 730444 2008-12-31 19:11:29Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Location which always returns <code>-1</code> and <code>null</code> from its methods.</p> * @xerces.internal * @version $Id: EmptyLocation.java 730444 2008-12-31 19:11:29Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
EmptyLocation	TokenNameIdentifier	 Empty Location
implements	TokenNameimplements	
Location	TokenNameIdentifier	 Location
{	TokenNameLBRACE	
/** * Singleton instance. */	TokenNameCOMMENT_JAVADOC	 Singleton instance. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EmptyLocation	TokenNameIdentifier	 Empty Location
EMPTY_LOCATION_INSTANCE	TokenNameIdentifier	 EMPTY  LOCATION  INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
EmptyLocation	TokenNameIdentifier	 Empty Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EmptyLocation	TokenNameIdentifier	 Empty Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Returns the one and only instance of this class. */	TokenNameCOMMENT_JAVADOC	 Returns the one and only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
EmptyLocation	TokenNameIdentifier	 Empty Location
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_LOCATION_INSTANCE	TokenNameIdentifier	 EMPTY  LOCATION  INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the line number where the current event ends, * returns -1 if none is available. * @return the current line number */	TokenNameCOMMENT_JAVADOC	 Return the line number where the current event ends, returns -1 if none is available. @return the current line number 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the column number where the current event ends, * returns -1 if none is available. * @return the current column number */	TokenNameCOMMENT_JAVADOC	 Return the column number where the current event ends, returns -1 if none is available. @return the current column number 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the byte or character offset into the input source this location * is pointing to. If the input source is a file or a byte stream then * this is the byte offset into that stream, but if the input source is * a character media then the offset is the character offset. * Returns -1 if there is no offset available. * @return the current offset */	TokenNameCOMMENT_JAVADOC	 Return the byte or character offset into the input source this location is pointing to. If the input source is a file or a byte stream then this is the byte offset into that stream, but if the input source is a character media then the offset is the character offset. Returns -1 if there is no offset available. @return the current offset 
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the public ID of the XML * @return the public ID, or null if not available */	TokenNameCOMMENT_JAVADOC	 Returns the public ID of the XML @return the public ID, or null if not available 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the system ID of the XML * @return the system ID, or null if not available */	TokenNameCOMMENT_JAVADOC	 Returns the system ID of the XML @return the system ID, or null if not available 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

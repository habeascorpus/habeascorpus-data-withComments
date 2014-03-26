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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Class that can be used to wrap <tt>System.in</tt> * without getting anxious about any client closing the stream. * * <p> * In code-language it means that it is not necessary to do: * <pre> * if (out != System.in) { * in.close(); * } * </pre> * </p> * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Class that can be used to wrap <tt>System.in</tt> without getting anxious about any client closing the stream. * <p> In code-language it means that it is not necessary to do: <pre> if (out != System.in) { in.close(); } </pre> </p> * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
KeepAliveInputStream	TokenNameIdentifier	 Keep Alive Input Stream
extends	TokenNameextends	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
{	TokenNameLBRACE	
/** * Constructor of KeepAliveInputStream. * * @param in an InputStream value, it should be standard input. */	TokenNameCOMMENT_JAVADOC	 Constructor of KeepAliveInputStream. * @param in an InputStream value, it should be standard input. 
public	TokenNamepublic	
KeepAliveInputStream	TokenNameIdentifier	 Keep Alive Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method does nothing. * @throws IOException as we are overridding FilterInputStream. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. @throws IOException as we are overridding FilterInputStream. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// do not close the stream 	TokenNameCOMMENT_LINE	do not close the stream 
}	TokenNameRBRACE	
/** * Convenience factory method that returns a non-closing * InputStream around System.in. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Convenience factory method that returns a non-closing InputStream around System.in. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
InputStream	TokenNameIdentifier	 Input Stream
wrapSystemIn	TokenNameIdentifier	 wrap System In
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeepAliveInputStream	TokenNameIdentifier	 Keep Alive Input Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

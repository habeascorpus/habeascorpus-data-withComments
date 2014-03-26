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
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
/** * Class that can be used to wrap <tt>System.out</tt> and <tt>System.err</tt> * without getting anxious about any client closing the stream. * * <p> * In code-language it means that it is not necessary to do: * <pre> * if (out != System.out && out!= System.err) { * out.close(); * } * </pre> * </p> * */	TokenNameCOMMENT_JAVADOC	 Class that can be used to wrap <tt>System.out</tt> and <tt>System.err</tt> without getting anxious about any client closing the stream. * <p> In code-language it means that it is not necessary to do: <pre> if (out != System.out && out!= System.err) { out.close(); } </pre> </p> 
public	TokenNamepublic	
class	TokenNameclass	
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
extends	TokenNameextends	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
{	TokenNameLBRACE	
/** * Constructor of KeepAliveOutputStream. * * @param out an OutputStream value, it shoudl be standard output. */	TokenNameCOMMENT_JAVADOC	 Constructor of KeepAliveOutputStream. * @param out an OutputStream value, it shoudl be standard output. 
public	TokenNamepublic	
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method does nothing. * @throws IOException as we are overridding FilterOutputStream. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. @throws IOException as we are overridding FilterOutputStream. 
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
/** * Convenience factory method that returns a non-closing * PrintStream around System.out. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Convenience factory method that returns a non-closing PrintStream around System.out. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
PrintStream	TokenNameIdentifier	 Print Stream
wrapSystemOut	TokenNameIdentifier	 wrap System Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience factory method that returns a non-closing * PrintStream around System.err. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Convenience factory method that returns a non-closing PrintStream around System.err. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
PrintStream	TokenNameIdentifier	 Print Stream
wrapSystemErr	TokenNameIdentifier	 wrap System Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.8.0 
private	TokenNameprivate	
static	TokenNamestatic	
PrintStream	TokenNameIdentifier	 Print Stream
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
